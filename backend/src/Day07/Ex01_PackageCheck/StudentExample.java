package Day07.Ex01_PackageCheck;
/*	클래스: 설계도[객체 설계도]
 	
 	객체를 어떻게 생성(생성자)하고,
 	객체가 가져야 할 데이터(필드)가 무엇이고,
 	객체의 동작(메소드)가 무엇인지 정의
 	
  	객체(object): 식별 가능한 형태 [ 상태 = 필드, 행동 = 메소드/함수 ]
 	객체지향프로그래밍(OOP): 부품[객체]를 먼저 만들고, 부품[객체]들을 조립하여 하나의 제품[프로그램]을 생성
 	
 	JVM 관점에서 객체, 변수, 인스턴스 구분하기
 	
 		Stack 영역				Heap 영역
		클래스명 변수명				new 생성자();
		String str				new String("김태호");
					<---주소---
		
*/


public class StudentExample {
	public static void main(String[] args) {
		
		// 클래스를 이용한 객체 만들기
		Student s1 = new Student();
		// 해석1: 클래스명 변수명 = new 생성자();
		// 해석2: 인스턴스화되어 힙영역에 메모리 생성한 후, 주소를 반환함
		// 해석3: Student() 객체 생성 시 사용되는 메소드
		System.out.println( s1 );
		
		Student s2 = new Student( );
		System.out.println( s2 );
	}
}
