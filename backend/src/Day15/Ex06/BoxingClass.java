package Day15.Ex06; // 포장 클래스
/*	포장클래스 사용 목적
	1) API 중 객체만 지원이 되는 경우가 있기 때문에, 해당 API를 사용하기 위함
	2) 다양한 메소드를 사용하기 위함.
*/

import java.util.ArrayList;

public class BoxingClass {
	public static void main(String[] args) {
		
		// 포장클래스 사용 예제1>
		// ArrayList< int > list1 = new ArrayList<>();
		// 에러발생: Syntax error, insert "Dimensions" to complete ReferenceType
		
		ArrayList< Integer > list2 = new ArrayList<>();
		
		// 포장클래스 사용 예제2>
		int a = 10;
		// System.out.println( a.toString() );
		// 에러발생: Cannot invoke toString() on the primitive type int
		
		Integer b = 10;
		System.out.println( b.toString() );
		
		// 포장클래스 박싱, 언박싱 확인
		// 박싱
		Integer obj = 100;
		System.out.println( obj );
		System.out.println( obj.intValue() );
		
		// 언박싱
		int value = obj;
		System.out.println( value );
		
		int result = obj + 100;
		System.out.println( result );
		// 해석: 박싱 객체를 연산할 때, 언박싱으로 자동변환 후 진행
		
		
	}
}
