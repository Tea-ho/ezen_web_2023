package Day09.Ex10_게시판.model;
// Board 클래스 역할: 게시물 모델링
// Model Class 권장사항
// 필드 설정: 모든 필드는 private로 접근 제한
// 생성자 생성: Empty, Full 생성자 생성
// 메소드 기본 세팅: toString(), getter,setter 메소드

import java.util.Date;

public class Board {
	
	// 필드 영역 (사용 변수: 제목, 내용, 작성자, 일자, 조회수)
	private String title;	
	private String content;
	private String writer;
	private Date date;
	private int view;
	
	// 생성자 영역
	// 기본 생성자1. Empty
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 기본 생성자2. Full
	public Board(String title, String content, String writer, Date date, int view) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.view = view;
	}

	// 메소드 영역
	// 기본 메소드1. toString 생성 (특이점: 출력하고자 하는 데이터와 형태에 맞춰 변경해도 무방)
	@Override
	public String toString() {
		return title + "\t" + writer + "\t"
				+ view + "\t" + date;
	}

	// 기본 메소드2. Getter, Setter 생성 (get/set 메소드 이용하여 필드 접근)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}	
	
}
