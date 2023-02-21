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
	public static MemberDAO getInstance() {
		return dao;
	}
	
	// 3. SQL 처리 메소드
	// 1. 회원가입 메소드 [인수: 아이디, 비번 반환: true, false]
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
	
	// 4. 모든 회원 출력하는 메소드 [인수: x, 반환: 여러명[ArrayList]의 회원[Member]]
	public ArrayList<MemberDAO> list() {
		return null;
	}
	
}
