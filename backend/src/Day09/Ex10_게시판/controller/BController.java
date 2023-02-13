package Day09.Ex10_게시판.controller;
// BController 클래스 역할: front 클래스에 기능 및 데이터 전송

import java.util.ArrayList;
import java.util.Date;

import Day09.Ex10_게시판.model.Board;

public class BController {

	// 싱글톤 객체 생성
	private static BController bc = new BController();
	
	private BController() {}
	
	public static BController getInstance() {
		return bc;
	}
	
	// ArrayList 생성
	private ArrayList<Board> boardDB = new ArrayList<>();
	
	// 생성자 영역
	
	// 메소드 영역
	// 1. 쓰기 메소드
	public boolean write( String title, String content, String writer, String pw, Date date, int view ) {
		
		Board board = new Board(title, content, writer, date, view);
		boardDB.add(board);
		return true;
	}
	
	// 2. 모든 게시물 출력 메소드 (특이점: ArrayList를 내보내기 때문에, 자료형 ArrayList로 선언)
	public ArrayList<Board> print() {
		return boardDB;
	}
	
	// 3. 선택된 게시물 출력 메소드 (특이점: ArrayList 중 1개만 내보내기 때문에, 자료형 객체로 선언)
	public Board view(int bno) {
		
		// 기능: 조회수 올리기
		boardDB.get(bno).setView( boardDB.get(bno).getView()+1 );
		// 구조 해석: arrayList boardDB의 bno번째 데이터를 setView 메소드를 통해 접근
		// 작동 해석: setView 메소드에 매개변수를 arrayList boardDB의 bno번째 데이터에 +1하여 전달
		// 리턴 해석: getview 메소드 통하여 변경된 view 데이터 반환
		// 영향 받는 곳: toString 메소드에 연결되어 있는 데이터와 getview 메소드에 연결되어 있는 데이터에 반영
		
		return boardDB.get(bno);
	}
}
