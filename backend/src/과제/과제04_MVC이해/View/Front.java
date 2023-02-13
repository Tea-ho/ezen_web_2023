package 과제.과제04_MVC이해.View;


import java.util.Scanner;
import 과제.과제04_MVC이해.Controller.MController;

// 클래스 기능: 입출력 담당
public class Front {

	// 필드 영역
	Scanner scanner = new Scanner(System.in);
	MController mc = new MController();
	
	// 변수 선언
	int no;
	int view;
	String writer;
	String title;
	int logcheck;
	
	// 생성자 영역
	// Empty 생성자 생성
	public Front() {
		// TODO Auto-generated constructor stub
	}
	
	public Front(int no, int view, String writer, String title) {
		this.no = no;
		this.view = view;
		this.writer = writer;
		this.title = title;
	}
	
	
	// Full 생성자 생성
	public Front(int no, int view, String writer, String title, int logcheck ) {
		this.no = no;
		this.view = view;
		this.writer = writer;
		this.title = title;
		this.logcheck = logcheck;
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
			logcheck = result;
			board(logcheck); // 로그 추적
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
		logout: while(true) {
			System.out.println("--------------커뮤니티--------------");
			
			System.out.println("메뉴> 1.글쓰기, 2.글보기, 3.로그아웃");
			int choice = scanner.nextInt();
			if( choice == 1 ) {
				System.out.println("글쓰기 선택");
				write( logcheck );
			}
			
			else if( choice == 2) {
				System.out.println("글보기 선택");
				System.out.println("번호\t조휘수\t작성자\t제목");
				boardList( no, view, writer, title );
				System.out.println("[상세보기] 게시물 번호 입력: ");
				
				int choiceBoardLi = scanner.nextInt();
				
				detailVeiw( choiceBoardLi );
			}
			
			else if( choice == 3) {
				System.out.println("로그아웃 완료");
				break logout;
			}
			else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
		
	}
	
	// 글쓰기 메뉴 출력 메소드 생성
	void write( int logcheck ) {
		System.out.println("--------------글쓰기--------------");
		System.out.println("제목: ");		String title = scanner.next();
		System.out.println("내용: ");		String content = scanner.next();
		
		int result = mc.write( logcheck, title, content );
		
		if( result == 0 ) {
			System.out.println("글쓰기 성공");
			board(logcheck);
			// 글쓰기 내용 출력해야함
		}
		else if( result == 1 ) {
			System.out.println("제목을 입력해주세요.");
		}
		else if( result == 2 ) {
			System.out.println("내용을 입력해주세요.");
		}
	}
	
	// 게시판 리스트 출력 메소드 생성
	public void boardList( int no, int view, String writer, String title ) {
		
		this.no = no;	this.view = view; this.writer = writer; this.title = title;
		
		int result = mc.boardList();
		if( result > 0 ) {
			for( int i = 0; i < result; i++) {
				
				System.out.println(no +"\t"+ view +"\t"+ writer +"\t"+ title);
			}
		}
		
	}
	
	// 글 보기 출력 메소드 생성
	void detailVeiw( int choiceBoardLi ) {
		
		System.out.println("제목: " + mc.detailTitle(choiceBoardLi) ); 
		System.out.print("작성자: " + mc.detailWriter(choiceBoardLi));
		System.out.println("조회수: " + mc.detailView(choiceBoardLi));
		System.out.println("내용: " + mc.detailContent(choiceBoardLi));
		
		System.out.println("메뉴> 1.글삭제 2.글수정 3.뒤로가기");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			delete(choiceBoardLi);
		}
		else if(choice == 2) {
			editPrint(choiceBoardLi);
		}
		else if(choice == 3) {
			board(logcheck);
		}
		else {
			System.out.println("번호를 다시 입력해주세요.");
		}
		
	}
	
	void editPrint( int choiceBoardLi) {
		System.out.println("1.제목수정, 2.내용수정");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.print("수정할 제목 입력: ");
			String titleValue = scanner.next();
			mc.editTitle(choiceBoardLi, titleValue);
			System.out.println("수정이 완료되었습니다.");
		}
		else if( choice == 2 ) {
			System.out.print("수정할 내용 입력: ");
			String contentValue = scanner.next();
			mc.editContent(choiceBoardLi, contentValue);
			System.out.println("수정이 완료되었습니다.");
		}
		else {
			System.out.println("번호를 다시 입력해주세요.");
		}
		
	}
	
	void delete( int choiceBoardLi ) {
		mc.delete(choiceBoardLi);
		System.out.println("해당 게시글이 정상 삭제되었습니다.");
	}

	
}
