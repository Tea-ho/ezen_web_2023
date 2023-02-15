package Day11.Ex02; // 오버라이딩
/*
	오버라이딩: 부모클래스의 메소드를 재정의/리모델링하는 행위
	=> 메소드 이름과 매개변수 타입, 매개변수 개수 모두 동일하게 설정해야한다.
	
	오버로딩: 메소드/생성자명이 동일할 때 식별하는 방법
	=> 매개변수 타입, 개수, 순서를 다르게하여 식별한다.	
	
*/

public class Execute {
	public static void main(String[] args) {
		
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println( calculator.areaCircle(r) );
		
		Computer computer = new Computer();
		System.out.println( computer.areaCircle(r) );
	}
	
}
