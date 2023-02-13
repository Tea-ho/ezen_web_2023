package Day09.Ex10_게시판.view;
// Front 클래스 역할: 사용자로부터 입출력 받기

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Day09.Ex10_게시판.controller.BController;
import Day09.Ex10_게시판.model.Board;

public class Front {
	
	// 필드 영역
	// 1. 싱글톤 객체 생성
	// 싱글톤으로 생성한 이유: 1개 객체를 생성하여 다른 클래스에서 공유하는 방식으로 설계가 가능하기 때문에 불필요한 객체 생성을 방지하여 메모리 효율성을 높이기 위함
	private static Front front = new Front();
	
	private Front() {}
	
	public static Front getInstance() {
		return front;
	}
	
	// 2. 입력 객체 생성 (private 선언 이유: Front 클래스 안에서만 접근가능하게 하여 안전성을 높이기 위함)
	private Scanner scanner = new Scanner(System.in);
	
	// 생성자 영역
	
	// 메소드 영역
	// 1. index 메소드 생성 (pulic 선언 이유: start 클래스에서 접근 허용하기 위함)
	public void index() {
		while( true ) {
			printPage();
			System.out.print("[메뉴 선택] 1. 쓰기 2. 상세보기: ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				writePage();
			}
			else if( ch == 2 ) {
				viewPage();
			}
		}
	}
	
	// 2. 기능별 메소드 생성 (private 선언 이유: Front 클래스 안에서만 접근가능하게 하여 안전성을 높이기 위함)
	private void writePage() {
		System.err.println("----------------글 쓰기 페이지----------------");
		System.out.println("제목: ");		String title = scanner.next();
		System.out.println("내용: ");		String content = scanner.next();
		System.out.println("작성자: ");	String writer = scanner.next();
		System.out.println("비밀번호: ");	String pw = scanner.next();
		Date date = new Date();			
		int view = 0;
		
		boolean result = BController.getInstance().write(title, content, writer, pw, date, view);
		if(result) {
			System.out.println("[알림] 글쓰기 성공");
		}
		else {
			System.out.println("[알림] 글쓰기 실패");
		}
	}
	
	private void printPage() {
		ArrayList<Board> result = BController.getInstance().print();
		// 특이점: BController 클래스에서 print 메소드의 리턴값이 ArrayList이기 때문에, 자료형 일치화시킴.
		// => 위의 형태로 코드 작성이 가능하다는 점 숙지!
		
		System.out.println("번호\t제목\t작성자\t조회수\t작성일");
		
		for( int i = 0; i < result.size(); i++) {
			System.out.println( (i+1) + "\t" + result.get(i).toString());
		}
		
	}
	
	private void viewPage() {
		System.out.print("게시물 번호: ");
		int bno = scanner.nextInt();
		
		Board result = BController.getInstance().view(bno-1);
		System.out.println("제목: " + result.getTitle());
		System.out.println("작성자: " + result.getWriter() + "\t작성일: " + result.getDate() + "\t조회수: " + result.getView());
		System.out.println("내용: " + result.getContent());
		
		System.out.println("[메뉴 선택] 1.뒤로가기 2.삭제 3.수정");
		int ch2 = scanner.nextInt();
		if(ch2==1) {
			return;
		}
		else if(ch2==2) {
			
		}
		else if(ch2==3) {
			
		}
		else {
			System.out.println("번호를 다시 입력해주세요.");
		}
	}
	
}
