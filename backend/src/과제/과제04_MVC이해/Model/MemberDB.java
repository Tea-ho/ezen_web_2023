package 과제.과제04_MVC이해.Model;

// 클래스 기능: 데이터 모델링
public class MemberDB {

	// 필드 영역
	public String id;
	public String pw;
	public String name;
	public String phone;
	
	// 생성자 영역
	// Empty 생성자 생성
	public MemberDB() {
		// TODO Auto-generated constructor stub
	}
	
	// Full 생성자 생성
	public MemberDB( String id, String pw, String name, String phone ) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "MemberDB [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + "]";
	}
	

	
}
