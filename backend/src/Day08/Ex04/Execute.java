package Day08.Ex04;

public class Execute {
	public static void main(String[] args) {
		
		// 클래스 외부에서 메소드 호출 (객체 필요)
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);		
		
		myCalc.multiply(6, 9);
		
		myCalc.powerOff();
		
		System.out.println( myCalc.info() );
	}
}
