package Day15.Ex08.MVC패턴;
// DAO: Data Access Object (데이터 접근 객체)
// 목적: 실제 데이터(DB, File)에 접근할 때 사용되는 객체
// 특징: 싱글톤 적용(프로그램 내 DB 연동은 1회 실시하기 때문)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {

	// 1. 필드 영역
	// DB구현 객체를 가지고 있는 인터페이스
	private Connection conn;
	// 연결된 SQL 조작
	private PreparedStatement ps;
	// 실행된 SQL 결과 적용
	private ResultSet rs;
	
	// 2. 싱글톤 적용
	private static MemberDAO dao = new MemberDAO();
	private MemberDAO() { // 생성자에 연동코드 작성(이유: 객체 생성시 바로 연동되도록 설계)
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/day15", "root", "1234");
			 System.out.println("[알림] 연동 성공");
		}
		catch(Exception e) {
			System.out.println( "예외 발생: " + e );
		}
	}
	public static MemberDAO getInstance() { return dao; }
	
	// 3. SQL 처리 메소드
	// 1) 회원가입 메소드 [인수: 아이디, 비번 반환: true, false]
	public boolean signup( MemberDTO dto ) {
		
		// 1-1. SQL 작성 [MySQL에서 작성하여 붙여넣기 실시]
		String sql = "insert into member ( mID, mPW) values ( ?, ? )";
		
		try {
			// 1-2. 연동 DB에 sql 전송
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getmID());
			ps.setString(2, dto.getmPW());
			
			ps.executeUpdate();
			return true;
		}
		catch(Exception e){
			System.out.println("예외 발생: " + e);
		}
		return false;
		
	}
	
	// 2) 모든 회원 출력하는 메소드 [인수: x, 반환: 여러명[ArrayList]의 회원[Member]]
	public ArrayList<MemberDTO> list() {
		
		ArrayList<MemberDTO> list = new ArrayList<>();
		// ArrayList, list 생성 이유: 여러명의 회원 DTO 객체를 저장하기 위함.
		
		// 2-1. SQL 작성
		String sql = "select * from member";
		
		try {
			// 2-2. 작성한 SQL 연결된 DB에 전달
			ps = conn.prepareStatement(sql);
			// 해석: 위에 작성한 sql을 DB에 전달하고 ps에 저장
			
			// 2-3. SQL 조작(없음)
			
			// 2-4. SQL 실행
			rs = ps.executeQuery();
			// 해석1: ps를 실행한 결과를 인터페이스 rs에 저장
			// 해석2: executeQuery() 메소드를 이용하여, DB에서 select 구문 수행 결과를 저장
			
			// 2-5. SQL 결과
			while( rs.next() ) {
				// 해석: next() 메소드는 다음 행의 데이터가 있으면 true, 없으면 false 반환함
				MemberDTO dto = new MemberDTO( rs.getInt(1), rs.getString(2), rs.getString(3) );
				// 해석1: MemberDTO 객체(인스턴스) dto 생성
				// 해석2: 입력값 rs에 저장되어 있는 1번 열, 2번 열, 3번 열의 데이터
				// 해석3: DB에 저장된 레코드 타입과 맞춰야 함 (getInt, getString, .....)
				
				// System.out.println("회원마다: " + dto );
				// 모든 객체 데이터 출력 확인 완료
				
				list.add(dto);
				// 해석: ArrayList, list에 생성한 dto 값 저장
			}
			// System.out.println("회원 목록: " + list.toString());
			// ArrayList, list 전체 값 확인 완료
			
			return list;
			// ArrayList, list 반환
			
		}
		catch(Exception e) {
			System.out.println("예외 발생: " + e);
		}
		return null;
	}
	
	// 3) 비밀번호 수정 메소드 [인수: mNo(primary key), 신규 비밀번호, 반환: true, false]
	public boolean update( int mNo, String mPW) {
		
		// 3-1. SQL 작성
		String sql = "update member set mPW = ? where mNo = ?";
		
		try {
			// 3-2. 작성한 SQL 연결 DB에 전달
			ps = conn.prepareStatement(sql);
			
			// 3-3. SQL 조작
			ps.setString(1, mPW);
			ps.setInt(2, mNo);
			
			// 3-4. SQL 실행
			ps.executeUpdate();
			
			// 3-5. SQL 결과
			return true;
		}
		catch(Exception e) {
			System.out.println( "예외 발생: " + e );
		}		
		return false;
	}
	
	// 4) 회원 삭제 [인수: mNo(primary key), 반환: true, false]
	public boolean delete( int mNo ) {
		
		// 4-1. SQL 작성
		String sql = "delete from member where mNo = ?";
		
		try {
			// 4-2. 작성한 SQL 연결 DB에 전달
			ps = conn.prepareStatement(sql);
			// 4-3. SQL 조작
			ps.setInt(1, mNo);			
			// 4-4. SQL 실행
			ps.executeUpdate();
			// 4-5. SQL 결과
			return true;
		}
		catch(Exception e) {
			System.out.println("에러 발생: " + e);
		}
		return false;
	}	
}
