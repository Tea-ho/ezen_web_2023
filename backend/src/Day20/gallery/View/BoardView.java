package Day20.gallery.View;

import java.util.ArrayList;
import java.util.Scanner;

import Day20.gallery.Controller.BController;
import Day20.gallery.Controller.MController;
import Day20.gallery.Model.DTO.BoardDTO;
import Day20.gallery.Model.DTO.CategoryDTO;

public class BoardView {
	private Scanner scanner = new Scanner(System.in);
	
	private static BoardView boardView = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() { return boardView; }
	
	// 모든 게시물 출력
	public void index() {
		while(true) {
			System.out.println("----------------------로그인 성공----------------------");
			boardPrintRecent();
			categoryPrint();
			
			// 최신 게시물 3개 출력
			System.out.println("[메뉴] -1: 로그아웃 / 0: 갤러리추가 / 이동할 갤러리 번호 선택: ");
			int ch = scanner.nextInt();
			
			if( ch == -1) {
				MController.getInstance().setLoginSession(0);
				System.out.println("[알림] 로그아웃");
				break;
			}
			else if( ch == 0) { categoryAdd(); }
			else if( ch > 0) { boardPrint(ch); }
		}
	}
	
	// 기능1: 카테고리 추가
	public void categoryAdd() {
		System.out.println("----------------------갤러리 추가----------------------");
		System.out.print("추가할 갤러리 이름: ");
		scanner.nextLine();
		String cName = scanner.nextLine();
		
		boolean result = BController.getInstance().categoryAdd( cName );
		if( result ) { System.out.println("[알림: 등록성공] 갤러리가 추가 되었습니다."); }
		else { System.out.println("[알림: 등록실패] 관리자에게 문의!"); }
	}
	
	// 기능2: 카테고리 호출
	public void categoryPrint() {
		
		ArrayList<CategoryDTO> clist = BController.getInstance().categoryPrint();
		/*
		 * for( int i = 0; i < clist.size(); i++) { System.out.println(
		 * clist.get(i).getCno() + " - " + clist.get(i).getCname() ); }
		 */
		
		int count = 0;
		for( CategoryDTO dto : clist ) {
			System.out.println( dto.getCno() + " - " + dto.getCname() );
			count++;
			if( count % 4 == 0 ) { System.out.println(); }
		}
	}
	
	// 기능3: 게시물 등록
	public void boardAdd( int cno ) {
		System.out.println("----------------------게시물 쓰기----------------------");
		System.out.print("제목: ");		String btitle = scanner.next();
		System.out.print("내용: ");		String bcon = scanner.next();
		
		boolean result = BController.getInstance().boardAdd(btitle, bcon, MController.getInstance().getLoginSession(), cno);
		if( result ) { System.out.println("[알림] 글 등록 성공"); }
		else { System.out.println("[알림] 글 등록 실패"); }
	}
		
	// 기능4: 최근 게시물 3개 출력
	public void boardPrintRecent() {
		System.out.println("----------------------최근 게시물----------------------");
		ArrayList<BoardDTO> blist = BController.getInstance().boardPrintRecent();
		System.out.printf(" %10s\t %10s\t %10s\t %10s\t %10s\t %10s " , "번호", "제목", "작성자", "작성일", "카테고리", "조회수");
		
		for( BoardDTO dto : blist ) {
			System.out.printf(" %10s\t %10s\t %10s\t %10s\t %10s\t %10s " ,
					dto.getBno(), dto.getBtitle(), dto.getMid(), dto.getBdate(), dto.getCname(), dto.getBview()
					);
		}
		
	}

	// 기능5: 해당 카테고리의 모든 게시물 출력
	public void boardPrint( int cno ) {
		System.out.println("----------------------카테고리 게시물 출력----------------------");
		ArrayList<BoardDTO> blist = BController.getInstance().boardPrint(cno);
		System.out.printf(" %10s\t %10s\t %10s\t %10s\t %10s\t %10s " , "번호", "제목", "작성자", "작성일", "카테고리", "조회수");
		
		for( BoardDTO dto : blist ) {
			System.out.printf(" %10s\t %10s\t %10s\t %10s\t %10s\t %10s " ,
					dto.getBno(), dto.getBtitle(), dto.getMid(), dto.getBdate(), dto.getCname(), dto.getBview() );
		}
		
		while(true) {
			System.out.print("[메뉴] 1.뒤로가기, 2.게시물쓰기, 3.게시물보기: ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { break; }
			else if( ch == 2 ) { boardAdd(ch); }
			else if( ch == 3 ) { }
		}
		
	}
}
