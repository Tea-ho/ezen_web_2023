package Day08.Ex05;

public class Member {

	// 필드 영역
	String name;
	String phone;
	
	// 생성자 영역
	// Empty 생성자 생성
	public Member() {
		// TODO Auto-generated constructor stub
	}
	// Full 생성자 생성
	public Member( String name, String phone ) {
		this.name = name;
		this.phone = phone;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "Ex01_Member [name=" + name + ", phone=" + phone + "]";
	}
}
