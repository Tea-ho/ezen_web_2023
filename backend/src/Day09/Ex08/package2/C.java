package Day09.Ex08.package2;

import Day09.Ex08.package1.A;

public class C {
	
	A a;
	// 해석1: class A가 pulbic으로 설정되어 있으면, import하여 필드 접근 가능
	// 해석2: public 설정이 아니면, 필드 접근 불가 (default: 같은 패키지에서만 접근 가능)
	
	A a1 = new A(true);
	// A a2 = new A(1);
	// 오류 발생
	// 발생 원인: 접근이 default로 설정되어 있기 때문에, 다른 패키지에서 접근 불가
	
	// A a3 = new A("문자열");
	// 오류 발생
	// 발생 원인: 접근이 private로 설정되어 있기 때문에, 다른 패키지/클래스에서 접근 불가
	
	public static void main(String[] args) {
		
		A f1 = new A(true);
		f1.field1 = 10;
		
		// f1.field2 = 10;
		// 오류 발생
		// 발생 원인: 접근이 default로 설정되어 있기 때문에, 다른 패키지에서 접근 불가
		
		// f1.field3 = 10;
		// 오류 발생
		// 발생 원인: 접근이 private로 설정되어 있기 때문에, 다른 패키지/클래스에서 접근 불가
	}
}
