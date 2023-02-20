package Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex05_DB연동2 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		
		while(true) {
			
			try { // 예외 처리 적용
				System.out.println("1.DB연결 2.SQL구문 입력 3.매개변수 구문: ");
				int ch = scanner.nextInt();
				
				// DB 연결
				if( ch == 1 ) {
					System.out.print("연동할 DB명 입력:");
					String dbname = scanner.next();
					System.out.println(dbname + "에 연결합니다.");
					
					// 1. DB와 연결
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname, "root", "1234");
					
					System.out.println("[알림] 연결 성공");
				}
				
				// SQL 구문 입력
				else if( ch == 2 ) {
					System.out.println("SQL구문 입력: ");
					scanner.nextLine();
					String sql = scanner.nextLine();
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.execute();
				}
				
				// 매개변수 활용한 구문 입력
				else if( ch == 3 ) {
					System.out.print("번호: ");		int mno = scanner.nextInt();
					System.out.print("아이디: ");		String mid = scanner.next();
					System.out.print("비밀번호: ");		String mpw = scanner.next();
					
					// SQL구문 작성
					String sql = "insert into member values( ?, ?, ? );";
					// ? 의미: 변수가 들어가는 자리를 뜻함.
					
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setInt(1, mno);
					// 해석: sql 구문에서 1번 자리에 mno 데이터 입력
					ps.setString(2, mid);
					ps.setString(3, mpw);
					
					ps.executeUpdate();
				}
			}
			catch (Exception e) {
				System.out.println("[알림] 예외 발생: " + e);
				scanner = new Scanner(System.in);
			}
			
		}
	} // main E
} // class E
