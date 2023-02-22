package Day13.Ex01; // 인터페이스
// class 키워드: 클래스 선언
// extends: 상속

// intergace 키워드: 인터페이스 선언
// implement: 구현

// 인터페이스 멤버
// 1. 필드 영역: only 상수 public static fainal (변수 사용 x)
// 2. 생성자 영역: X
// 3. 메소드 영역: 추상 메소드만 다를 수 있음 public abstract
// 4. 특징 public static final과 public abstract 생략 가능

public interface RemoteControl {
	
	public static int MAX_VOLUME = 50; // public static final 생략 가능
	int MIN_VOLUME = 0;
	
	// 1. public abstract Method
	// 특징1) 리턴타입, 메소드명, 매개변수만 선언
	// 특징2) public abstract 생략 가능
	// 특징3) 클래스에서 해당 interface를 implement 할 경우, 오버라이딩 필수!
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 2. public default Method
	// 특징1) 클래스에서 사용하는 메소드와 동일한 형태로, 메소드 선언 후 메소드를 정의함
	// 특징2) 선언부 앞에 default 선언
	// 특징3) 클래스에서 해당 interface를 implement 할 경우, 오버라이딩 선택!
	default void setMute( boolean mute ) {
		if( mute ) {
			System.out.println("무음 처리합니다.");
			setVolume( MIN_VOLUME );
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 3. public static Method
	// 특징1) 구현 객체가 필요없음. implements없이 사용 가능한 메소드
	// 특징2) 선언부 앞에 static 선언
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
