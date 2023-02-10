package 과제.과제04_MVC이해.View;

import java.util.Scanner;
import 과제.과제04_MVC이해.Controller.MController;

// 클래스 기능: 입출력 담당
public class Front {

	// 필드 영역
	Scanner scanner = new Scanner(System.in);
	MController mc = new MController();
	
	int no;
	int view;
	String writer;
	String title;
	
	// 생성자 영역
	// Empty 생성자 생성
	public Front() {
		// TODO Auto-generated constructor stub
	}
	
	// Full 생성자 생성
	public Front(int no, int view, String writer, String title ) {
		this.no = no;
		this.view = view;
		this.writer = writer;
		this.title = title;
	}
	
	
	
	// 메소드 영역
	// 1. 메인 페이지 출력 메소드 생성
	public void index() {
		while(true) {
			System.out.println("1.회원가입, 2.로그인, 3.아이디 찾기, 4.비밀번호 찾기");
			int choice = scanner.nextInt();
			if( choice == 1 ) {
				signup();
			}
			else if( choice == 2 ) {
				login();
			}
			else if( choice == 3 ) {
				findId();
			}
			else if( choice == 4 ) {
				findPassword();
			}
			else {
				
			}
		}
	}
	
	// 2. 회원가입 페이지 출력 메소드 생성
	void signup() {
		System.out.println("아이디: ");
		String id = scanner.next();
		System.out.println("비밀번호: ");
		String pw = scanner.next();
		System.out.println("비밀번호 확인: ");
		String pwConfirm = scanner.next();
		System.out.println("이름: ");
		String name = scanner.next();
		System.out.println("전화번호: ");
		String phone = scanner.next();
		
		int result = mc.signup( id, pw, pwConfirm, name, phone );
		if( result == 1 ) {
			System.out.println("회원가입 실패(비밀번호 불일치)");
		}
		else if( result == 0 ) {
			System.out.println("회원가입 성공");
		}
		
	}
	// 3. 로그인 페이지 출력 메소드 생성
	void login() {
		System.out.println("아이디: ");
		String id = scanner.next();
		System.out.println("비밀번호: ");
		String pw = scanner.next();
		
		int result = mc.login(id, pw);
		
		if( result >= 0 ) {
			System.out.println("로그인 성공");
			board(result); // 로그 추적
		}
		else if( result == -1 ) {
			System.out.println("로그인 실패 (비밀번호를 확인해주세요.)");
		}
		else {
			System.out.println("로그인 실패 (등록되지 않은 아이디입니다.)");
		}
		
	}
	// 4. 아이디 찾기 페이지 출력 메소드 생성
	void findId() {
		
		System.out.println("이름: ");
		String name = scanner.next();
		System.out.println("전화번호: ");
		String phone = scanner.next();
		
		int result = mc.findId(name, phone);
		
		if( result >= 0 ) {
			String searchedID = mc.returnId(result);
			System.out.println(searchedID);
		}
		else if( result == -1 ) {
			System.out.println("등록된 번호와 일치하지 않습니다.");
		}
		else if( result == -2) {
			System.out.println("입력하신 이름과 일치하는 데이터가 존재하지 않습니다.");
		}
		
	}
	// 5. 비밀번호 찾기 페이지 출력 메소드 생성
	void findPassword() {
		System.out.println("아이디: ");
		String id = scanner.next();
		System.out.println("이름: ");
		String name = scanner.next();
		System.out.println("전화번호: ");
		String phone = scanner.next();
		
		int result = mc.findPassword(id, name, phone);
		
		if( result >= 0 ) {
			String searchedPW = mc.returnPw(result);
			System.out.println(searchedPW);
		}
		else if( result == -1 ) {
			System.out.println("입력하신 아이디와 일치하는 데이터가 존재하지 않습니다..");
		}
		else if( result == -2) {
			System.out.println("등록된 이름과 일치하지 않습니다.");
		}
		else if( result == -3) {
			System.out.println("등록된 번호와 일치하지 않습니다.");
		}
	}
	
	// 6. 게시판 출력 메소드 생성
	void board( int logcheck ) {
		System.out.println("--------------커뮤니티--------------");
		System.out.println("번호\t조휘수\t작성자\t제목");
		
		System.out.println("메뉴> 1.글쓰기, 2.글보기, 3.로그아웃");
		int choice = scanner.nextInt();
		if( choice == 1 ) {
			System.out.println("글쓰기 선택");
			write( logcheck );
		}
		
		else if( choice == 2) {
			System.out.println("글보기 선택");
			detailVeiw( logcheck );
		}
		
		else if( choice == 3) {
			System.out.println("로그아웃 완료");
			index();
		}
		else {
			System.out.println("번호를 다시 입력해주세요.");
		}
	}
	
	// 글쓰기 메뉴 출력 메소드 생성
	void write( int logcheck ) {
		System.out.println("--------------글쓰기--------------");
		System.out.println("제목: ");		String title = scanner.next();
		System.out.println("내용: ");		String content = scanner.next();
		
		mc.write( logcheck, title, content );
		
	}
	public void boardList( int no, int view, String writer, String title ) {
		
		
	}
	
	
	// 
	void detailVeiw( int logcheck ) {
		
	}

	
}
