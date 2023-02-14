package 과제.과제05_중고거래.Model;

public class Memo {
	
	// 관계 필드 영역
	private int frommno;
	// 용도: 참조용 FK로, 쪽지를 보낸 회원 번호 추적에 사용
	private int pno;
	// 용도: 참조용 FK로, 받는사람과 현재 쪽지의 제품 정보 추적에 사용
	private int meno;
	// 용도: 식별용 PK로, 쪽지번호 로그에 사용
	
	// 일반 필드 영역
	String title;
	String content;
	
	// 생성자 영역
	public Memo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Memo(int frommno, int pno, int meno, String title, String content) {
		super();
		this.frommno = frommno;
		this.pno = pno;
		this.meno = meno;
		this.title = title;
		this.content = content;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "Memo [frommno=" + frommno + ", pno=" + pno + ", meno=" + meno + ", title=" + title + ", content="
				+ content + "]";
	}
	
	public int getFrommno() {
		return frommno;
	}
	public void setFrommno(int frommno) {
		this.frommno = frommno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getMeno() {
		return meno;
	}
	public void setMeno(int meno) {
		this.meno = meno;
	}
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
	
	
	
}
