package Day09.Ex08.package1;

public class B {
	
	A a;
	
	A a1 = new A(true);
	A a2 = new A(1);
	// A a3 = new A("문자열");
	// 오류 발생
	// 발생 원인: 접근이 private로 제한되어 있기 때문에, class B에서 접근 불가
	
	public static void main(String[] args) {
		
		A f1 = new A(true);
		f1.field1 = 10;
		f1.field2 = 10;
		// f1.field3 = 10;
		// 오류 발생
		// 발생 원인: 접근이 private로 제한되어 있기 때문에, class B에서 접근 불가 
		
	}
}
