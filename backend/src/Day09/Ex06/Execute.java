package Day09.Ex06;

public class Execute {
	public static void main(String[] args) {
		
		// 인스턴스 멤버 호출
		Calculator myCal = new Calculator();
		System.out.println( myCal.no );
		myCal.no = 10;
		System.out.println( myCal.getNo() );
		
		// 정적 멤버 호출
		double result1 = 10*10*Calculator.pi;
		System.out.println(result1);
		
		System.out.println( myCal.pi );
		// 해석: 접근 가능하지만, 일반적으로 인스턴스 통해서 접근하지 않고 클래스명을 이용하여 접근함.
		
		Calculator.multi(10,5);
		Calculator.plus(10,5);
		Calculator.minus(10,5);	
	}
}
