package Day11.Ex01; // 상속
// 자식클래스명 extends 부모클래스
// 부모클래스의 멤버들을 자식클래스가 사용할 수 있음.
// 관련 키워드: super, this, 오버라이딩
// 상속 제한 방법: final 클래스 및 final 메소드 선언

public class SmartPhone extends Phone {
	
	// 필드 영역
	public boolean wifi;
	
	// 생성자 영역
	public SmartPhone() {
		super();
		// 부모 클래스에 기본 생성자(Empty)가 있는 경우, 생략가능! (컴파일 시 자동으로 추가됨)
		// TODO Auto-generated constructor stub
		System.out.println("---자식클래스 생성자 실행---");
	}
	
	public SmartPhone(String model, String color) {
		super( model, color );
		this.model = model;
		this.color = color;
		System.out.println("---자식클래스 생성자 실행---");
	}
	
	// 메소드 영역
	public void setWifi( boolean wifi ) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");		
	}
}
