package Day13.Ex03;

public class Execute {
	public static void main(String[] args) {
		
		// 구현객체 생성
		Implement imp = new Implement();
		
		// 인터페이스 변수에 구현객체 대입
		A ia = imp;
		ia.methodA();
		
		B ib = imp;
		ib.methodB();
		
		C ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
	}
}
