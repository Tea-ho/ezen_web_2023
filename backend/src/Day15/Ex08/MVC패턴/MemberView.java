package Day15.Ex08.MVC패턴;

import java.util.Scanner;

public class MemberView {

	Scanner scanner = new Scanner(System.in);
	
	// 싱글톤 적용
	private static MemberView view = new MemberView();
	private MemberView() {}
	public static MemberView getInstance() {
		return view;
	}
	
	public void index() {
		while(true) {
			System.out.print("[메뉴] 1.등록[C] 2.출력[R] 3.수정[U] 4.삭제[D]: ");
			int choice = scanner.nextInt();
			
			if( choice == 1 ) {
				signup();
			}
			else if( choice == 2) {
				list();
			}
			else if( choice == 3) {
				edit();
			}
			else if( choice == 4) {
				delete();
			}
			else {
				System.out.println("[알림] 번호를 다시 입력해주세요.");
			}
		}
	}
	
	public void signup() {
		System.out.println("-------------------회원가입 페이지-------------------");
		System.out.print("아이디: ");			String mID = scanner.next();
		System.out.print("비밀번호: ");			String mPW = scanner.next();
		
		boolean result = 
		MemberController.getInstance().signup(mID, mPW);
		
		if( result ) {
			System.out.println("[알림] 회원가입 성공");
		}
		else {
			System.out.println("[알림] 회원가입 실패");
		}
		
	}
	
	public void list() {
		
	}
	
	public void edit() {
		
	}
	public void delete() {
		
	}
	
}
