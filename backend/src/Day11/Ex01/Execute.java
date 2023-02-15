package Day11.Ex01;

public class Execute {
	public static void main(String[] args) {
		
		// Phone 인스턴스 생성
		Phone phone = new Phone();
		
		phone.color = "red";
		System.out.println( phone.color );
		phone.bell();
		phone.sendVoice("안녕하세요");
		
		// phone.wifi;
		// 결과: 오류 발생 (이유: 필드에 정의되지 않은 멤버)
		// 해석: 부모 클래스는 자식 클래스의 멤버를 호출 할 수 없다.
		
		// SmartPhone 인스턴스 생성
		SmartPhone smartphone = new SmartPhone();

		smartphone.color = "black";
		System.out.println( smartphone.color );
		smartphone.bell();
		smartphone.sendVoice("안녕하세요");
		
		SmartPhone myPhone = new SmartPhone("ipone_SE2", "Black");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		if( myPhone.wifi ) {
			System.out.println("와이파이 상태: On");
		}
		else {
			System.out.println("와이파이 상태: Off");
		}
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 전요셉인데요!");
		myPhone.sendVoice("아 네 말씀하세요~");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
	}
}
