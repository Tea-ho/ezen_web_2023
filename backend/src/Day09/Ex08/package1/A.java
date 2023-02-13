package Day09.Ex08.package1; // 접근 제한자
/*
 	접근제한자: 클래스, 필드, 생성자, 메소드 접근 대상을 설정하는 키워드
 	목적: 중요한 필드와 메소드가 외부로 노출되지 않도록 하여 객체의 무결성을 유지하기 위함
 	종류 별 접근 설정 범위:
 		접근 제한자		제한대상					제한 범위
 	1) public		클래스, 필드, 생성자, 메소드		없음
 	2) protected	필드, 생성자, 메소드			같은 패키지에 속하거나 자식 객체인 경우 접근 가능
 	3) default		클래스, 필드, 생성자, 메소드		같은 패키지에 속하면 접근 가능
 	4) private		필드, 생성자, 메소드			객체 내부에서만 접근 가능

*/



public class A {
	
	// 필드 영역
	public int field1;	
	int field2;
	private int field3;

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자 영역
	// 생성자 선언 (접근 설정: public)
	public A(boolean b) {
		
	}
	
	// 생성자 선언 (접근 설정: default)
	A(int b ){
		
	}
	
	// 생성자 선언 (접근 설정: private)
	private A(String s) {
		
	}
}
