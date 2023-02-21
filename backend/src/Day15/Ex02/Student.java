package Day15.Ex02; // Web 개발 시, id/pw 일치 여부 확인 시 자주 사용하는 문법

public class Student {

	// 필드 영역
	private int no;
	private String name;
	
	// 생성자 영역
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	// 메소드 영역
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	// hashCode 메소드 오버라이딩
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	// boolean equls 메소드 오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student target = (Student) obj;
			if( no == target.getNo() && name.equals(target.getName()) ) {
				return true;
			}
		}
		return false;
	}
	
	
}
