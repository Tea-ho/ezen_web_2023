package 과제.과제06_상속해석;

public class Car {
	// 1. 필드 영역 [ 변수 , 객체 , 상수 , 배열, 리스트 등 = 메모리 ]
	Tire frontLeftTire = new Tire( 6 , "앞왼쪽");
	Tire frontRightTire = new Tire( 2 , "앞오른쪽");
	Tire backLeftTire =  new Tire( 3 , "뒤왼쪽");
	Tire backRightTire =  new Tire( 4 , "뒤오른쪽");
	// 해석: 객체(인스턴스) 4개 생성 및 초기화 (참조 클래스: Tire, 초기값: 괄호 안 데이터, 매개변수: int maxRotation, String location)
	
	// 3. 메소드 영역 
	int run() {
		
		System.out.println("[자동차가 달립니다.]");
		
		if( frontLeftTire.roll() == false ) { stop(); 	return 1; }
		if( frontRightTire.roll() == false ){ stop(); 	return 2; }
		if( backLeftTire.roll() == false ) 	{ stop(); 	return 3; }
		if( backRightTire.roll() == false ) { stop(); 	return 4; }
		
		return 0;
	}
	
	void stop() { System.out.println("[자동차가 멈춥니다.]"); }
}
