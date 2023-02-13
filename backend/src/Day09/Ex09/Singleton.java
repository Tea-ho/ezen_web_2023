package Day09.Ex09; // 싱글톤 패턴
/*
	Singleton Pattern
	목적: 애플리케이션 전체에서 단 한 개의 객체만 생성하여 사용하고 싶을 때, 싱글톤 패턴 사용
	특징: 생성자를 private 접근자로 제한하여, 외부에서 new 연산자로 생성자를 호출할 수 없도록 제한
	형태:
	public class 클래스{
		
		private static 클래스 singleton = new 클래스();
		// private 접근 권한을 갖는 정적 필드 선언 및 초기화
		
		private 클래스() {}
		// private 접근 권한을 갖는 생성자 선언
		
		public static 클래스 getInstance(){
		// public 접근 권한을 갖는 정적 메소드 선언
			return singleton;
		}
	}
*/

public class Singleton {
	
	private static Singleton single = new Singleton();
	
	private Singleton() { }
	// 해석1: 생성자 private로 접근 제한
	// 해석2: 다른 클래스에서 인스턴스화 불가
	
	public static Singleton getInstance() {
		return single;
	}
	// 해석: 메소드 static으로 선언하여, 모든 곳에서 접근 가능
	
}
