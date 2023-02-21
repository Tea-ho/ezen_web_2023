package Day15.Ex07;
// DB 연동에 필요한 정보
// 1. DB 서버주소 [ localhost vs AWS vs 개인IP ]
// 2. 해당 DB 서버의 계쩡
// 3. 해당 계정의 비밀번호

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB연동 {
// DB연동: DAO(Data Access Object) 데이터에 접근하는 객체
	
		// java.sql 패키지 사용
		private Connection conn;
		// 역할: DB에 연결된 구현객체를 받아서, 다양한 메소드를 제공함
		private PreparedStatement ps;
		// 역할: 연결된 DB에 SQL 조작할 수 있는 메소드 제공
		private ResultSet rs;
		// 역할: SQL 결과를 조작할 수 있는 메소드 제공
		
		public DB연동() {
			try {
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/java", "root", "1234");
				 System.out.println("[알림] 연동 성공");
			}
			catch(Exception e) {
				System.out.println( "예외 발생: " + e );
			}
		}
		
		public static void main(String[] args) {
			DB연동 db연동 = new DB연동();
		}
		

}
