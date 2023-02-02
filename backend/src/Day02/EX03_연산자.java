package Day02;

public class EX03_연산자 {
	public static void main(String[] args) {
		
		int x = +10;
		int y = -10;
		System.out.println( " x: " + x );
		System.out.println( " y: " + y );
		
		// 후위, 선위 증감연산
		System.out.println( " x++: "+ (x++) );
		System.out.println( " x: " + x );
		System.out.println( " ++x: "+ (++x));
		
		System.out.println( " y--: " + (y--) );
		System.out.println( " y: " + (y) );
		System.out.println( " --y: " + (--y) );
		
		// 산술연산자
		System.out.println(" x+y " + (x+y));
		System.out.println(" x-y " + (x-y));
		System.out.println(" x*y " + (x*y));
		System.out.println(" x/y " + (x/y));
		System.out.println(" x%y " + (x%y));
		
		// 비교연산자
		System.out.println(" x == y " + ( x == y ));
		System.out.println(" x != y " + ( x != y ));
		System.out.println(" x > y " + ( x > y ));
		System.out.println(" x >= y " + ( x >= y ));
		System.out.println(" x < y " + ( x < y ));
		System.out.println(" x <= y " + ( x <= y ));

		System.out.println(" str1.equlas(str2): " + ("유재석".equals("유재석")));
		System.out.println(" str1.equlas(str2): " + (!"유재석".equals("유재석")));
		
		// 논리연산자
		System.out.println(" 0<x<20: " + (x>0 && x<20));
		System.out.println(" 0<x<10: " + (x>0 && x<10));
		System.out.println(" 0<=x x>=10: " + (x<=0 || x>=10));
		System.out.println(" !(x==y): " + ( !(x==y)));
		
		// 대입연산자
		int z = 30;
		z += x;
		System.out.println(" z += x :" + z );
		
		// 삼항연산자
		String result = (x >= 20) ? "합격" : "불합격";
		System.out.println( "결과: " + result );
		
		// 연결연산자
		System.out.println( "문자열A" + "문자열B");
	}
}
