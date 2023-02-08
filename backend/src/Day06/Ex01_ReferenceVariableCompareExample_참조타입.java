package Day06;

public class Ex01_ReferenceVariableCompareExample_참조타입 { // c S
	public static void main(String[] args) { // m S
		
		int [] arr1;
		int [] arr2;
		int [] arr3;
		// 해석: int형 배열 선언 (Stack 영역에 변수 생성)
		
		arr1 = new int[] { 1, 2, 3};
		arr2 = new int[] { 1, 2, 3};
		// 해석1: heap 영역에 '1', '2', '3' 메모리 3개 저장
		// 해석2: 배열은 첫번째 메모리 주소를 스택영역에 대입함.
		arr3 = arr2;
		// 해석: arr2가 가지고 있던 메모리 주소를 arr3에 대입
		
		System.out.println( arr1.length );
		
		System.out.println( arr1 == arr2 );
		// 결과값: false
		
		System.out.println( arr2 == arr3 );
		// 결과값: true
		
		System.out.println( arr1 == arr3 );
		// 결과값: false
		
		// NullPointerException
		int[] intArray = null;
		// System.out.println( intArray[0] );
		// intArray[0] = 10;
		// 결과값: NullPointerException 오류 발생
		// 해석: Heap영역에 생성된 데이터가 없기 때문에, 오류발생
		
		String str = null;
		// System.out.println( str.length() );
		// 결과값: NullPointerException 오류 발생
		// 해석: Heap 영역에 생성된 데이터가 없기 때문에, 길이 확인 불가
		
		// GarbageObject
		String hobby = "여행";
		hobby = null;
		System.out.println(hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);
		// 출력값: 자동차
		// 해석1: "자동차"에 해당되는 String 객체가 삭제되는 것이 아니다.
		// 해석2: Stack 영역에서 생성된 변수는 Heap영역에 생성된 객체값의 주소를 참조한다.
		
		
	} // m E
} // c E
