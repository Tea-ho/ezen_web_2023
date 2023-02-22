package Day15.Ex08.MVC패턴;

import java.util.ArrayList;
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
				update();
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
		
		System.out.println("--------------------------------------");
		System.out.printf("%2s \t %10s \t %10s \n", "no", "ID", "PW");
		
		ArrayList<MemberDTO> result = MemberController.getInstance().list();
		// 해석: Controller 클래스의 list 메소드의 결과값(DAO 메소드 결과값)을 View 클래스로 가져와서 저장
		
		for( int i = 0; i < result.size(); i ++) {
			System.out.printf( "%2d \t %10s \t %10s \n", 
					result.get(i).getmNo(), result.get(i).getmID(), result.get(i).getmPW() );
		}
		// 해석: 위에서 가져온 ArrayList, result의 필요한 데이터 전체 출력
	}
	
	public void update() {
		System.out.println("-------------------비밀번호 변경 페이지-------------------");
		System.out.println("회원번호: ");			int mNo = scanner.nextInt();
		System.out.println("새로운 비밀번호: ");		String mPW = scanner.next();
		
		boolean result = MemberController.getInstance().update(mNo, mPW);
		
		if( result ) {	System.out.println("[알림] 수정 성공"); }
		else {System.out.println("[알림] 수정 실패");}
	}
	
	public void delete() {
		System.out.println("-------------------회원 탈퇴 페이지-------------------");
		System.out.println("회원번호: ");		int mNo = scanner.nextInt();
		
		if( MemberController.getInstance().delete(mNo) ) {
			System.out.println("[알림] 회원 탈퇴 성공");
		}
		else {System.out.println("[알림] 회원 탈퇴 실패");}
	}
}
