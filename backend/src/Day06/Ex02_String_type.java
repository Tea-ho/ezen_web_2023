package Day06; // 자바 문자열 사용 방법
/*	1. 사용 방법
 	배열, 클래스, 문자리터럴을 이용하여 문자열을 사용할 수 있으나, 대개 클래스 혹은 문자 리터럴을 이용한다.
  	2. 클래스 특징
  	동일한 문자열이더라도, 새로운 객체로 다루기 때문에 Heap 영역에서 각각 새로운 객체를 생성하여 데이터를 다룬다.
  	String 문자열1 = new String("안녕");
  	String 문자열2 = new String("안녕");
  	
  	문자열1 == 문자열2;			 [ X ] // 비교연산자: 스택 영역 비교
  	문자열1.equals( 문자열2 );	 [ O ] // equals : 힙 영역 비교
  	3. 문자리터럴 특징
  	동일한 문자열인 경우, Heap 영역의 주소값을 참조하는 방식으로 데이터를 다룬다. 
  	String 문자열1 = "안녕";
  	String 문자열2 = "안녕";
  	문자열1 == 문자열2;			 [ O ] // 비교연산자: 스택 영역 비교
  	문자열1.equals( 문자열2 );	 [ O ] // equals : 힙 영역 비교
*/


public class Ex02_String_type {
	public static void main(String[] args) {
		
		// 자바 문자열 사용방법
		// 1. 자바 문자열 사용 방법
		char[] 문자열1 = new char[] { '안' , '녕' };
		// 2. 클래스 [객체] 사용
		String 문자열2 = new String("안녕");
		// 3. 문자 리터럴 사용: " "
		String 문자열3 = "안녕";
		
		// 클래스 vs 문자 리터럴 비교
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if( strVar1 == strVar2 ) {
			System.out.println("strVar1과 strVar2는 참조가 같다.");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같다.");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if( strVar3 == strVar4 ) {
			System.out.println("strVar3과 strVar4는 참조가 같다.");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다르다.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같다.");
		}
		
		// " " vs null 비교
		String hobby1 = "";
		if(hobby1.equals("")) {
			System.out.println("hobby1변수가 참조하는 String 객체는 빈 문자열");
		}
		
		String hobby2 = null;
		/* if(hobby2.equals(null)) {
			System.out.println("hobby2변수가 참조하는 String 객체는 null 객체");
		}
		결과값: NullPointerException 오류발생 */
		
		if(hobby2 == null) {
			System.out.println("hobby2변수가 참조하는 String 객체는 null 주소 확인");
		}
	}
}
