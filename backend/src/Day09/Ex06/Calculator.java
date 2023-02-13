package Day09.Ex06; // 정적 멤버

/*
 	정적 멤버 특징
 	1) 선언 방법: static 키워드를 사용하여 정적 멤버 선언
 	2) 저장 위치: JVM 메소드 영역에 저장
 	3) 객체 없이 사용 가능 (클래스명.정적멤버)
 	4) 필드 선언과 동시에 초기값을 주는 것이 일반적
 	5) 복잡한 초기화 작업이 필요한 경우, 정적 블록(static block)을 이용한다. (형태: static{})
 	6) 정적 필드는 객체 생성 없이도 사용 가능하기 때문에, 생성자에서 초기화 작업을 하지 않음.
 	7) JVM 메소드 영역에 저장되기 때문에, 프로그램 시작 시 생성되고 프로그램 종료될 때 초기화된다.
 	   => 모든 클래스에서 공통으로 사용이 필요한 경우, 정적 멤버를 사용하면 효율성이 좋다.
 	   => 프로그램 시작 시 메모리에 할당되기 때문에, 공동 사용(공유 사용)하지 않을 경우 메모리 효율성이 떨이질 수 있다.
 	
*/

public class Calculator {

	// 필드 영역
	int no; // 인스턴스 멤버
	
	static double pi = 3.14159; // 정적 멤버

	// 생성자 영역
	
	// 메소드 영역
	// 인스턴스 멤버
	int getNo() {
		return no;
	}
	
	// 정적 멤버
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
	static int multi(int x, int y) {
		return x * y;
	}
	
	static double info;
	
	// 정적 블록
	static {
		info = pi * pi;
	}
}
