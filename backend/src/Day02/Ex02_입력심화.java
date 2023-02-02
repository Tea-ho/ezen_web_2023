package Day02;

public class Ex02_입력심화 {
	public static void main(String[] args) {
		// 기본 자료형(byte, short, int, long, float, double, boolean) 값이 동일한지 비교할 때, 비교연산자 == 사용
		int pw = 1234;
		System.out.println( pw == 1234 );
		// 예상 출력값: true
		
		// String 타입 값이 동일한지 비교할 때는 equal() 메소드 사용
		String id = "qwe";
		System.out.println( id.equals("qwe") );
		// 예상 출력값: true
	}
}
