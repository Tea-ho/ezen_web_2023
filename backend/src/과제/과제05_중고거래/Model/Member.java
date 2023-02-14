package 과제.과제05_중고거래.Model;

public class Member {
	
	// 관계 필드
	private int mno;
	// 용도: 식병욜 PK로, 쪽지 보낸 회원 번호 로그에 사용
	
	// 일반 필드 영역
	private String id;
	private String pw;
	private String confirmPW;
	private String name;
	private String phone;
	
	// 생성자 영역
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int mno, String id, String pw, String confirmPW, String name, String phone) {
		super();
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.confirmPW = confirmPW;
		this.name = name;
		this.phone = phone;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", id=" + id + ", pw=" + pw + ", confirmPW=" + confirmPW + ", name=" + name
				+ ", phone=" + phone + "]";
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getConfirmPW() {
		return confirmPW;
	}

	public void setConfirmPW(String confirmPW) {
		this.confirmPW = confirmPW;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
