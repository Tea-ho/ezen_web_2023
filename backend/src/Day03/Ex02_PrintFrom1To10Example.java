package Day03; // for 문

public class Ex02_PrintFrom1To10Example {
	public static void main(String[] args) {
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		
		// for문 이용하여 코드 단순화
		for( int i = 1; i <= 7; i++) {
			sum = sum + i;
		}
		
		// 1~100까지 누적 합계
		int total = 0;
		
		for( int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			total += i;
		}
		System.out.println();
		System.out.println("누적 합계: " + total);
	
		// 0.1 ~ 1.0 사이 실수 출력
		for( float x = 0.1f; x <= 1.0f; x +=0.1f) {
			System.out.print(x + " ");
		}
		
		System.out.println( 4%2 );
		System.out.println( 2%4 );
		
	}
}
