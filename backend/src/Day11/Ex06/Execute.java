package Day11.Ex06;

public class Execute {
	public static void main(String[] args) {
		
		Tire tire1 = new Tire();
		HankookTire tire2 = new HankookTire();
		KumhoTire tire3 = new KumhoTire();
		// 해석: tire 객체 생성(참조 클래스: Tire, HankookTire, KumhoTire)
		
		Car myCar = new Car();
		// 해석: 인스턴스 myCar 생성 (참조 클래스: Car)
		
		myCar.tire = new Tire();
		// 해석1: 인스턴스 myCar 필드 영역의 객체 tire에 접근
		// 해석2: new Tire()로 초기화 (참조 클래스: Tire)
		myCar.run();
		Tire result1 = myCar.parking(tire1);
		// 해석: 변수 result1 생성 (자료형: Tire, 입력값: myCar.parking(tire1)의 return값) 
		
		
		myCar.tire = new HankookTire();
		// 해석: new HankookTire()로 초기화 (참조 클래스: HankookTire)
		myCar.run();
		Tire result2 = myCar.parking(tire2);
		HankookTire result3 = (HankookTire)myCar.parking(tire2);
		// 해석1: 변수 result3 생성 (자료형: HankookTire, 입력값: myCar.parking(tire2)의 return값)
		// 해석2: 
		
		System.out.println( result3 instanceof Tire);
		System.out.println( result3 instanceof Object);
		// instanceof 연산자
		// 해석1: result3이 Tire 클래스의 인스턴스를 참조하면 true 반환, 아니면 false 반환
		// 해석2: result3이 Tire를 상속하는 클래스의 인스턴스이면 true 반환, 아니면 false 반환
		
		myCar.tire = new KumhoTire();
		// 해석: new KumhoTire()로 초기화 (참조 클래스: KumhoTire)
		myCar.run();
		KumhoTire result4 = (KumhoTire)myCar.parking(tire3);
		
		System.out.println(myCar.toString());
		
	}
}
