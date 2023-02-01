package Day01;

public class Ex03_자료형 { // class S
	public static void main(String[] args) { // main S
		
		// Java에서 진수 표현 방법
		// 2진수: 0b 또는 0B로 시작하고 0,1로 작성
		int var1 = 0b1011;
		System.out.println("2진수: " + var1 );
		
		// 8진수: 0으로 시작하고 0~7 숫자로 작성		
		int var2 = 013;
		System.out.println("8진수: " + var2 );
		
		// 10진수: 소수점 없는 0~9 숫자로 작성		
		int var3 = 163;
		System.out.println("10진수: " + var3 );
		
		// 16진수: 0x 또는 0X로 시작하고 0~9 숫자와 A~F 혹은 a~f로 작성	
		int var4 = 0xA3;
		System.out.println("16진수: " + var4 );
		
		// 자료형
		// byte 자료형 [저장되는 값 허용범위: -128~127]
		byte b1 = -128;
		System.out.println( "byte자료형: " + b1 );
		
		byte b2 = 127;
		System.out.println( "byte자료형: " + b2 );
		
		// byte b3 = 128; //--- 오류발생: 범위 벗어난 데이터
		
		// int 자료형 [저장되는 값 허용범위: -2,147,483,648 ~ 2,147,483,647]
		int i1 = 2100000000;
		System.out.println( "int자료형: " + i1 );
		
		// long 자료형 [ int 범위 초과한 경우, 컴파일러에서 int로 간주하기 때문에 데이터 뒤에 L 기입해야함]
		long l1 = 10;
		System.out.println( "long자료형: " + l1 );
		
		// long l2 = 2200000000; //--- 오류발생: 컴파일러에서 int로 간주
		
		long l3 = 2200000000L;
		System.out.println( "long자료형: " + l3 );
		
		// char 자료형
		char c1 = 'A';
		System.out.println( "char자료형: " + c1 );
		
		char c2 = 65;
		System.out.println( "char자료형: " + c2 );
		// 유니코드 기반이기 때문에, 유니코드 넘버 65에 저장되어 있는 문자값 출력
		
		char c3 = '가';
		System.out.println( "char자료형: " + c3 );
		
		char c4 = 44032;
		System.out.println( "char자료형: " + c4 );
		// 유니코드 기반이기 때문에, 유니코드 넘버 44032에 저장되어 있는 문자값 출력
		
		// String 클래스 [ 문자 여러개(문자열) 저장 ]
		String str1 = "Hello, World!";
		System.out.println( "String클래스: " + str1 );
		
		// float 자료형 [컴파일러에서 double로 간주하기 때문에 데이터 뒤에 f 기입해야함, 소수점 8자리까지 표현 가능]
		// float f1 = 0.123456789123456789; //--- 오류발생: 컴파일러에서 double로 간주
		float f2 = 0.123456789123456789f;
		System.out.println( "float자료형: " + f2 );
		
		// double 자료형 [소수점 17자리까지 표현 가능]
		double d1 = 0.123456789123456789;
		System.out.println( "double자료형: " + d1 );
		
		// boolean 자료형 [ true , false ]
		boolean bool1 = true;
		System.out.println( "boolean자료형: " + bool1 );
		// boolean bool2 = 1; //--- 오류발생: true, false만 저장 가능
		
	} // main E
} // class E
