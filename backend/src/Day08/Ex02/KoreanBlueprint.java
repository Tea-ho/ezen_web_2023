package Day08.Ex02;

public class KoreanBlueprint {
	
	// 필드 영역
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 영역
	// 1. 빈 생성자
	public KoreanBlueprint() {
		// TODO Auto-generated constructor stub
	}
	// 2. 생성자 선언
	public KoreanBlueprint( String name, String ssn ) {
		this.name = name;
		this.ssn = ssn;	
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "KoreanBlueprint [nation=" + nation + ", name=" + name + ", ssn=" + ssn + "]";
	}
	

	

}
