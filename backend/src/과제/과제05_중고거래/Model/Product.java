package 과제.과제05_중고거래.Model;

public class Product {
	
	// 관계 필드 영역
	private int mno;
	// 용도: 참조용 FK로, 등록한 회원 정보 추적에 사용
	private int pno;
	// 용도: 식별용 PK로, 제품번호 로그에 사용
	
	// 일반 필드 영역
	private String title;
	private String content;
	private String price;
	private int View;
	private boolean state;
	
	// 생성자 영역
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int mno, int pno, String title, String content, String price, int view, boolean state) {
		super();
		this.mno = mno;
		this.pno = pno;
		this.title = title;
		this.content = content;
		this.price = price;
		View = view;
		this.state = state;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "Product [mno=" + mno + ", pno=" + pno + ", title=" + title + ", content=" + content + ", price=" + price
				+ ", View=" + View + ", state=" + state + "]";
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getView() {
		return View;
	}

	public void setView(int view) {
		View = view;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
}
