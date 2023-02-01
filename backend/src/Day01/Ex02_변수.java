package Day01; // 변수
/*	변수: 데이터 1개를 저장할 수 있는 메모리 공간
 	선언: 자료형, 변수명, 대입(=), 값
 	 ex1> int hour = 3;
 	 ex2> int hour; hour = 3;
 	호출: "변수명" 입력
	
*/

public class Ex02_변수 { // class S
	public static void main(String[] args) { // main S
		
		// int value
		// 변수 선언 (특징: 초기화되지 않은 변수는 사용이 불가능하다.)
		
		// System.out.println( value );
		
		// int result = value + 10;
		// System.out.println( result );
		
		// 변수 선언,호출 및 초기화
		int hour = 3;
		int min = 5;
		System.out.println(hour + "시간" + min + "분");
		
		int totalMin = (hour*60) + min;
		System.out.println("총" + totalMin + "분");
		
		// Swap: 두 변수의 값을 교환하기 위해서 변수 temp 활용 
		int x = 3;
		int y = 5;
		System.out.println( "x: " + x + ", y: " + y );
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println( "x: " + x + ", y: " + y );
		
	} // main E
	
} // class E
