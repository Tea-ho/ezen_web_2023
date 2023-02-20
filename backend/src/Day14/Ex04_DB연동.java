package Day14; // DB연동

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*	JDBC(Java DataBase Connect): 자바와 DB 연결 드라이브
	1. 연결 인터페이스
	Connection 변수명 = DriverManager.getConnection("주소", "ID", "PW");
	2. 예외처리 필수
*/

public class Ex04_DB연동 {
	public static void main(String[] args) {
		
		try {
			// 1. Connection: DB 연결 인터페이스
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");
			// 주의사항: Java에서 DB생성은 불가능하기 때문에, DB를 생성한 후 실행해야 함.
			
			System.out.println("[DB연동 성공]");
			
			//2. table 생성하는 SQL 구문 작성 후, 문자열 변수에 저장 작업
			String sql = "create table member(mno int, mid varchar(20), mpw varchar(20))";
			// 해석: table 생성하는 sql구문을 문자열 변수에 저장
			
			// 3. PreparedStatement: DML, DDL 조작 인터페이스
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 4. SQL 실행
			ps.execute();
		}
		catch (Exception e) {
			System.out.println("[DB 연동 실패 ] 사유: " + e);
		}
	}
}
