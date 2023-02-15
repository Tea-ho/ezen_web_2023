package Day11.Ex02;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		System.out.println("자식 객체 Computer 재정의");
		return Math.PI * r * r;
	}
	
}
