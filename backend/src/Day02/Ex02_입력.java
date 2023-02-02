package Day02; // 키보드 입력 데이터를 변수에 저장

import java.util.Scanner;
// Scanner클래스를 사용하기 위해, Scanner클래스 가져오기

public class Ex02_입력 {
	public static void main(String[] args) {
		
		// 입력 객체 생성: Scanner 변수명 = new Scanner( System.in );
		// 단축키: scan + 자동완성
		Scanner scanner = new Scanner( System.in );
		
		// 입력 메소드 종류
		// 1. 문자열 입력받는 함수 (띄어쓰기 X)
		String 문자열1 = scanner.next();			System.out.println("문자열1: " + 문자열1);
		// 2. 문자열 입력받는 함수 (띄어쓰기 O), 특징: 앞에 next() 함수가 선언되면, 하나로 취급 (해결방안: temp용 nextLine()을 앞에 입력) 
		scanner.nextLine();					
		String 문자열2 = scanner.nextLine();		System.out.println("문자열2: " + 문자열2);		
		// 3. 첫글자만 입력받는 함수
		char 문자 = scanner.next().charAt(0);		System.out.println("문자: " + 문자);
		// 4. 논리 입력받는 함수
		boolean 논리 = scanner.nextBoolean();		System.out.println("논리: " + 논리);
		// 5. 정수형 입력받기 (Byte)
		byte b1 = scanner.nextByte();			System.out.println("byte: " + b1);
		// 6. 정수형 입력받기 (Short)
		short s1 = scanner.nextShort();			System.out.println("short: " + s1);
		// 7. 정수형 입력받기 (Int)
		int i1 = scanner.nextInt();				System.out.println("int: " + i1);
		// 8. 정수형 입력받기 (Long)
		long l1 = scanner.nextLong();			System.out.println("long: " + l1);
		// 9. 실수형 입력받기 (Float)
		float f1 = scanner.nextFloat();			System.out.println("float: " + f1);
		// 10. 실수형 입력받기 (Double)
		double d1 = scanner.nextDouble();		System.out.println("double: " + d1);
		
		System.out.print(" x 값 입력: ");
		String strX = scanner.nextLine();
		System.out.println(strX);
	}
}
