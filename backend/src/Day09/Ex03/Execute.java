package Day09.Ex03;

// 객체 생성 how?
// 객체의 필드를 초기화 하는 방법: 1)직접 변수에 접근, 2) 생성자 이용, 3) 메소드 이용

public class Execute {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		// 1) 직접 변수에 접근하여 객체(인스턴스) 필드 초기화
		myCar.gas = 5;
		
		// 2) 생성자 이용하여 객체(인스턴스) 필드 초기화
		Car yourCar = new Car(5);
		
		// 3) 메소드 이용하여 객체(인스턴스) 필드 초기화
		myCar.setGas(5);
		
		if( myCar.isLetfGas() ) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("gas를 주입하세요");
		
		
		
		
	}
}
