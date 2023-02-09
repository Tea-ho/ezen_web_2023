package Day07.Ex03_객체사용예시;

import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디: ");	String id = scanner.next();
		System.out.println("비밀번호: ");	String pw = scanner.next();
		
		Member_BluePrint[] 배열 = new Member_BluePrint[3];
		
		Member_BluePrint m1 = new Member_BluePrint( );
		m1.id = id;
		m1.pw = pw;
		배열[0] = m1;
		
		System.out.println( 배열[0].id );
		
		
		
	}
}
