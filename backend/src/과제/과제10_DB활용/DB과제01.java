package 과제.과제10_DB활용;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DB과제01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Connection con = null;
		
		
		while(true) {
			
			try {
				System.out.print("[메뉴] 1.DB 연결 2.SQL 구문작성 3.매개변수 작성: ");
				int choice = scanner.nextInt();
				
				if( choice == 1 ) {
					System.out.println("[요청] 연결할 DB 이름 입력:");
					String nameDB = scanner.next();
					
					System.out.println("[알림] DB 연결");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB과제1", "root", "1234");
					System.out.println("[알림] DB 연결 성공");					
				}
				
				else if( choice == 2 ) {
					System.out.println("[요청] SQL 구문 작성: ");
					scanner.nextLine();
					String sql = scanner.nextLine();
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.execute();
					
				}
				
				else if( choice == 3 ) {
					
					System.out.println("[요청] 아래 항목 입력");
					System.out.print("제품번호: ");		int 제품번호 = scanner.nextInt();
					System.out.print("제품명: ");		String 제품명 = scanner.next();
					System.out.print("제품설명: ");		String 제품내용 = scanner.next();
					System.out.print("제품가격: ");		int 제품가격 = scanner.nextInt();
					
					String sql = "insert into 제품테이블 values( ?, ?, ?, ? );";
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setInt(1, 제품번호);
					ps.setString(2, 제품명);
					ps.setString(3, 제품내용);
					ps.setInt(4, 제품가격);
					
					ps.executeUpdate();
					System.out.println("[알림] 데이터 입력 완료");
				}
			}
			catch ( InputMismatchException e) {
				System.out.println("[알림]예외 발생, 원인: " + e);
				scanner = new Scanner(System.in);
			 }
			catch ( SQLException e ) {
				 System.out.println("[알림]예외 발생, 원인: " + e);
			 }
			catch( Exception e ) {
				System.out.println("[알림]예외 발생, 원인: " + e);
			}
			
		}
		
		
	}
}
