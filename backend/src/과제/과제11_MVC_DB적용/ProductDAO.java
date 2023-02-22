package 과제.과제11_MVC_DB적용;
//싱글톤 적용

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	
	// 필드 영역
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	// 싱글톤 적용
	private static ProductDAO dao = new ProductDAO();
	
	private ProductDAO() { // 기능: DB 연동	
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw_product", "root", "1234");
			 System.out.println("[알림] 연동 성공");
		}
		catch(Exception e) { System.out.println("예외 발생: " + e); }
	}
	public static ProductDAO getInstance() { return dao; }
	
	// 메소드 영역
	// 1. 제품 등록 메소드
	public boolean register( ProductDTO dto  ) {
		
		// 1-1. SQL 작성
		String sql = "insert into product ( pName, pPrice, pStock) values ( ?, ?, ? )";
		
		try {
			// 1-2. DB에 전송
			ps = con.prepareStatement(sql);
					
			// 1-3. SQL 조작
			ps.setString(1, dto.getpName());
			ps.setInt(2, dto.getpPrice());
			ps.setInt(3, dto.getpStock());
			
			// 1-4. SQL 실행
			ps.executeUpdate();
			
			// 1-5. SQL 결과
			return true;
		}
		catch(Exception e) { System.out.println("예외 발생: " + e); }
		
		return false;	
	}
	
	// 2. 제품 리스트 출력 메소드
	public ArrayList<ProductDTO> list(){
		// 2-1. SQL 작성
		String sql = "select * from product";
		
		ArrayList<ProductDTO> list = new ArrayList<>();
		// 용도: DB에서 가져온 객체 저장소
		
		try {
			// 2-2. DB에 전송
			ps = con.prepareStatement(sql);
			// 2-3. SQL 조작 (없음)
			
			// 2-4. SQL 실행
			rs = ps.executeQuery();
			
			// 2-5. SQL 결과
			while(rs.next()) {
				ProductDTO dto = new ProductDTO( rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4) );
				list.add(dto);
			}
			return list;
		}
		catch(Exception e) { System.out.println("예외 발생: " + e);}
		return null;
	}
	
	// 3. 제품 정보 수정 메소드
	public boolean updateInfo( int pNo, String pName, int pPrice ) {
		// 3-1. SQL 작성
		String sql = "update product set pName = ?, pPrice = ? where pNo = ?";
		try {
			// 3-2. DB에 전송
			ps = con.prepareStatement(sql);
			// 3-3. SQL 조작
			ps.setString(1, pName);
			ps.setInt(2, pPrice);
			ps.setInt(3, pNo);
			// 3-4. SQL 실행
			ps.executeUpdate();
			// 3-5. SQL 결과
			return true;
		}
		catch(Exception e) { System.out.println("예외 발생: " + e);	}
		return false;
	}
		
	// 4. 제품 재고 변경 메소드
	public boolean updateStock( int pNo, int pStock ) {
		// 4-1. SQL 작성
		String sql = "update product set pStock = ? where pNo = ?";
		try {
			// 4-2. DB에 전송
			ps = con.prepareStatement(sql);
			// 4-3. SQL 조작
			ps.setInt(1, pStock);
			ps.setInt(2, pNo);		
			// 4-4. SQL 실행
			ps.executeUpdate();
			// 4-5. SQL 결과
			return true;
		}
		catch(Exception e) { System.out.println("예외 발생: " + e);	}
		return false;
	}
	
	// 5. 제품 삭제 메소드
	public boolean delete( int pNo ) {
		// 5-1. SQL 작성
		String sql = "delete from product where pNo = ?";
		try {
			// 5-2. DB에 전송
			ps = con.prepareStatement(sql);
			// 5-3. SQL 조작
			ps.setInt(1, pNo);
			// 5-4. SQL 실행
			int result = ps.executeUpdate();
			// 5-5. SQL 결과
			if( result == 1) { return true; }
			else { return false; }
		}
		catch(Exception e) { System.out.println("예외 발생: " + e);	}
		return false;
	}	
}
