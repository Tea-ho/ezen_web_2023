package Day20.gallery.View;

import java.util.Scanner;

import Day20.gallery.Controller.MController;

public class IndexView {

	private Scanner scanner = new Scanner(System.in);
	
	private static IndexView indexView = new IndexView();
	private IndexView() {}
	public static IndexView getInstance() { return indexView; }
	
	public void index() {
		while(true) {
			System.out.println("----------------------EZ 갤러리----------------------");
			System.out.println("[메뉴] 1.로그인 2.회원가입");
			try {
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					login();
				}
				if( ch == 2 ) {
					singup();
				}
			}
			catch(Exception e) {
				System.out.println("[알림] 잘못된 입력입니다.");
				System.out.println("예외 발생: " + e);
			}
		}
	}
	
	public void singup() throws Exception {
		System.out.println("----------------------회원가입----------------------");
		System.out.print("아이디: ");		String mid = scanner.next();
		System.out.print("비밀번호: ");		String mpw = scanner.next();
		System.out.print("이름: ");		String mname = scanner.next();
		System.out.print("전화번호: ");	String mphone = scanner.next();
		
		int result = MController.getInstance().signup(mid, mpw, mname, mphone);
		if( result == 1 ) { System.out.println("[알림] 회원가입 완료");}
		else if( result == 2 ) { System.out.println("[알림] 사용중인 아이디입니다.");}
		else if( result == 3 ) { System.out.println("[알림] 시스템 오류, 관리자 문의!");}
		
	}
	
	public void login() {
		System.out.println("----------------------로그인----------------------");
		System.out.print("아이디: ");		String mid = scanner.next();
		System.out.print("비밀번호: ");		String mpw = scanner.next();
		
		boolean result = MController.getInstance().login(mid,mpw);
		if( result ) { 
			System.out.println("[알림] 로그인 성공"); 
			BoardView.getInstance().index();
		}
		else { System.out.println("[알림] 로그인 실패"); }
		
		
	}
	
	
}

