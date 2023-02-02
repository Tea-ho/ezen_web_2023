package Day02;
/*	자바 특징
	1) class 단위로 작동
 	2) 100% 객체지향 언어
 	3) 클래스 기반으로 메모리를 할당 (객체)
 	*클래스: 객체 설계도
 */
public class Ex01_출력 {
	// main함수 특징: main 스레드
	public static void main(String[] args) {
		
		// print 함수: () 데이터 출력
		System.out.print("Chat");
		System.out.print("GPT");
		
		// println 함수: () 데이터 출력 후 줄바꿈 처리
		System.out.println("Chat");
		System.out.println("GPT");
		
		// printf 함수: 형식에 맞추어 () 데이터 출력
		int value = 123;
		System.out.printf("상품가격: %d원 " , value);
		System.out.println();
		
		System.out.printf("상품가격: %6d원 " , value);
		System.out.println();
		
		System.out.printf("상품가격: %-6d원 " , value);
		System.out.println();
		
		System.out.printf("상품가격: %06d원 " , value);
		System.out.println();
		
		System.out.printf("상품가격: %4d원 " , value);
		System.out.println();
		
		System.out.printf("상품가격: %9d원 " , value);
		System.out.println();
		
		System.out.println("상품가격: " + value + "원");
		
		// 이스케이프 문자
		// \n: 줄바꿈
		// \t: 들여쓰기
		// \": " 출력
		// \': ' 출력
		
	}
}
