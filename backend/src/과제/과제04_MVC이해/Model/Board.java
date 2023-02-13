package 과제.과제04_MVC이해.Model;

public class Board {
	
	// 필드 영역 
	public int view;
	public String writer;
	public String title;
	public String content;

	
	// 생성자 영역
	// Empty 생성자 생성
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board( String writer, String title, String content ) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	
	// Full 생성자 생성
	public Board( int view, String writer, String title, String content) {
		this.view = view;
		this.writer = writer;
		this.title = title;
		this.content = content;
		}
	
	public void view( int viewValue ) {
		this.view += viewValue;
	}
	
	public void title(String titleValue) {
		this.title = titleValue;
	}
	public void content(String contentValue) {
		this.content = contentValue;
	}
	
	
	

	@Override
	public String toString() {
		return "Board [view=" + view + ", writer=" + writer + ", title=" + title + ", content=" + content + "]";
	}

	
}
