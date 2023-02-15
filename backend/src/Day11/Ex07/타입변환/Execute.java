package Day11.Ex07.타입변환;
// 다형성: 상속과 타입변환을 활용하여 같은 형태의 메소드를 동작시켰을 때, 다른 결과값을 얻을 수 있다.
/*	[타입 종류]
	1. 기본 타입: 스택에 저장
	boolean, char, byte, short, int, long, float, double
	
	2. 참조 타입: 힙에 저장(힙 주소를 스택에 저장)
	배열, 클래스(String), 인터페이스
	
	[타입 변환]
	1. 자동타입 변환
	큰 허용범위 타입에 작은 허용범위 타입을 저장할 때, 자동으로 타입을 변환하여 저장함
	
	큰 허용범위 타입 = 작은 허용범위 타입
	자식 클래스 = 부모 클래스
	
	2. 강제타입 변환
	작은 허용범위 타입에 큰 허용범위 타입을 저장하기 위해서는, 강제타입 변환 절차 필요
	
	작은 허용범위 타입 = (작은 허용범위 타입) 큰 허용범위 타입
	부모 클래스 = (부모 클래스)자식 클래스
	
	Tip> 메소드 매개변수와 리턴값 타입 관리 시에도, 자동타입 변환 및 강제타입 변환 특성 동일 적용
	
*/

public class Execute {
	public static void main(String[] args) {
		
		// 필드 타입 변환	
		byte value1 = 10;
			short value2 = value1;
			int value3 = value1;
			long value4 = value1;
			float value5 = value1;
			double value6 = value1;
			
		double value7 = 10.1111111;
			float value8 = (float)value7;
			long value9 = (long)value7;
			int value10 = (int)value7;
			short value11 = (short)value7;
			byte value12 = (byte)value7;
			
		// 메소드 타입 변환(매개변수, 리턴타입)
		double result1 = method1(value1);
		byte result2 = (byte)method2( (byte)value3);
		
		// 배열, ArrayList
		double[]배열 = new double[3];
		배열[0] = 3.3; 배열[1] = 3;
	}
	
	// 메소드 선언
	public static int method1( double x ) {
		return 3;
	}
	
	public static double method2( byte x ) {
		return 3;
	}
	
}
