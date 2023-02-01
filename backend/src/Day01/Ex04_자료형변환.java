package Day01; // 자료형 변환

public class Ex04_자료형변환 { // class S
	public static void main(String[] args) { // main S
		
		// [자동 타입 변환]
		byte b1 = 10;		int i1 = b1;	// byte -> int로 변환 가능
		char c1 = '가'; 		i1 = c1;		// char -> int로 변환 가능
		int i2 = 50;		long l1 = i2; 	// int -> long로 변환 가능
		long l2 = 100;		float f1 = l2; 	// long -> float로 변환 가능
		float f2 = 100.5f;	double d1 = f2;	// float -> double로 변환 가능
		
		// [강제 타입 변환]
		int i3 = 10;		byte b2 = (byte)i3;
		System.out.println( b2 );
		
		int i4 = 30000;		byte b3 = (byte)i4;
		System.out.println( b3 );	// 출력값: 48 --- 허용범위 초과된 데이터를 강제로 변환하여 손실 발생
		
		long l3 = 300;		int i5 = (int)l3;
		int i6 = 65;		char c2 = (char)i6;
		double d2 = 3.14;	int i7 = (int)d2;
		System.out.println( i7 );	// 출력값: 3 --- 허용범위 초과된 데이터를 강제로 변환하여 손실 발생
		
		// [문자열 타입 변환] -- 조건: 문자열로된 숫자만 변환 대상
		String str1 = "10";
		byte ch1 = Byte.parseByte(str1);		// String -> byte로 변환
		short ch2 = Short.parseShort(str1);		// String -> short로 변환
		int ch3 = Integer.parseInt(str1);		// String -> int로 변환
		long ch4 = Long.parseLong(str1);		// String -> long로 변환
		float ch5 = Float.parseFloat(str1);		// String -> float로 변환
		double ch6 = Double.parseDouble(str1);	// String -> double로 변환
		
		String str2 = "안녕";		//--- 변경 불가
		
		
	} // main E
} // class E
