package Day14;
/*
	에러: 컴퓨터 하드웨어의 고장으로 응용프로그램 실행 오류 발생
	예외: 에러 이외 예외라는 오류로, 잘못된 사용 또는 코딩으로 발생된 문제이다. (-> 경험 바탕으로 예측가능)
	코드의 잘못된 사용으로 발생되는 에러로, 예외처리를 통해 해결 가능하다는 점이 에러와 다른 점이다.
	일반 예외: 컴파일 전에 발생할 수 있는 예외 검사[자바 외부 통신(스트림)]
	실행 예외: 컴파일 후에 발생하는 예외
	
	예외클래스
	Exception 클래스: 모든 예외를 받을 수 있는 예외클래스 중 최상위 클래스
	
	문법
	try{
	
		예외 발생 가능 코드
	
	}catch(예외클래스 e){
	
		try{}에서 예외가 발생했을 때 실행되는 코드(예외발생했을 때 실행되는 코드)
	
	}finally{
	
		항상 실행되는 코드 (생략가능)
	}	
*/

public class Ex01_예외처리 {

	// 메소드 선언 (static 선언 이유는? 메인메소드에서 사용하기 위함.)
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		}
		catch( NullPointerException e ) {
			System.out.println( e.getMessage() );
		}
		finally {
			System.out.println("마무리 실행");
		}
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		printLength("ThisIsJava");
		printLength(null);
		printLength("ThisIsPython");
		// 예외발생: NullPointerException (원인: Cannot invoke "String.length()" because "data" is null)
		// 예외처리 실시
		System.out.println("프로그램 종료");
	}
}
