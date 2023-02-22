package Day13.Ex01;

public class Execute {
	public static void main(String[] args) {
		
		// 인터페이스 사용하는 객체 구현 방법
		// 특징: 인터페이스도 참조 타입으로, 변수처럼 사용이 가능하다.
		
		// 1. 참조하지 않고 있는 변수에 null 대입 가능
		RemoteControl control1 = null;
		
		// 2. 해당 인터페이스를 implements 선언한 객체 주소 대입 가능
		RemoteControl control2 = new Television();
		
		// 3. 해당 인터페이스를 implements 선언하지 않은 객체 주소 대입 불가
		// RemoteControl control3 = new Audio();
		
		RemoteControl rc;
		Television tv = new Television();
		Audio au = new Audio();	
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(100);
		rc.setVolume(0);
		rc.setVolume(-10);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(100);
		rc.setVolume(0);
		rc.setVolume(-10);
		rc.turnOff();
		
		RemoteControl.changeBattery(); // 정적 메소드 호출
		
		rc = tv;
		rc.turnOn();
		
		rc = au;
		rc.turnOn();

	}
}
