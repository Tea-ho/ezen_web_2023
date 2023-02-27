package Day19.Ex05;

public class Execute {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		// 해석: 인스턴스 calculator 생성 (참조 클래스: Calculator, 초기값: x)
		
		User1 user1Thread = new User1();
		// 해석: 인스턴스 user1Thread 생성 (참조 클래스: User1, 초기값: x)
		user1Thread.setCalculator(calculator);
		// 해석: user1Thread 클래스의 setCalculator 메서드 호출 (매개변수: 인스턴스 calculator)
		user1Thread.start();
		
		
		User2 user2Thread = new User2();
		// 해석: 인스턴스 user2Thread 생성 (참조 클래스: User2, 초기값: x)
		user2Thread.setCalculator(calculator);
		// 해석: user2Thread 클래스의 setCalculator 메서드 호출 (매개변수: 인스턴스 calculator)
		user2Thread.start();
	}
}

