package Day08.Ex04; // 메소드
/*	메소드 비교
	1. 선언
	JS: function 함수명(인수1, 인수2){}
	Java: 리턴타입 함수명(매개변수1, 매개변수2){}
	
	2. 호출
	Js: 함수명( 인수1, 인수2 ) 
	Java 내부호출: 함수명( 인수1, 인수2 )
	Java 외부호출: 객체명.함수명( 인수1, 인수2 )
*/

public class Calculator {

	// 필드 영역
	
	// 생성자 영역
	
	// 메소드 영역
	// 유형1: 매개변수 x , 반환 x
	void powerOn() { // void 선언: 반환값 없음
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 유형2: 매개변수 o , 반환 o
	int plus( int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide( int x, int y ) {
		double result = (double)x / (double)y;
		return result;
	}
	
	// 유형3: 매개변수 o , 반환 x
	void multiply( int x, int y ) {
		double result = (double)x * (double)y;
		System.out.println(result);
	}
	
	// 유형4: 매개변수 x , 반환 o
	String info() {
		return "TeO Calculator";
	}
	
	// 클래스 내부에서 메소드 호출
	void 함수호출() {
		powerOn();
	}
	
}
