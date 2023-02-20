package Day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_예외처리 {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스 존재");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스 존재");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String[] array = {"100", "1oo"};
		for( int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
			}
			/*
			 * catch( NumberFormatException e ) { System.out.println("숫자 반환 불가: " + e ); }
			 * catch( ArrayIndexOutOfBoundsException e ) { System.out.println("인덱스 초과: " + e
			 * ); }
			 */
			catch( Exception e ) {
				System.out.println("예외 발생: " + e );
			}
		}
		// 예외 발생1: NumberFormatException (원인: For input string: "1oo")
		// 예외 발생2: ArrayIndexOutOfBoundsException (원인: Index 2 out of bounds for length 2)

		 while(true) {
			 try {
				 Scanner scanner = new Scanner(System.in);
				 int cn = scanner.nextInt();
			 }
			 catch( InputMismatchException e ) {
				 System.out.println("잘못된 입력입니다.");
				 System.out.println("예외 발생: " + e);
			 }
		 }
		 // 예외 발생: InputMismatchException
	}
}
