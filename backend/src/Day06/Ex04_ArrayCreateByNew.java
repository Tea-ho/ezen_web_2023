package Day06;

public class Ex04_ArrayCreateByNew {
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		// 해석: 배열 변수 arr3 선언 및 길이 설정
		for( int i = 0; i < arr1.length; i++) { System.out.println( arr1[i]); } // 출력값: 0, 0, 0
		// 해석: 초기값 확인
		
		arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
		// 해석: 배열 인덱스 별 초기화
		for( int i = 0; i < arr1.length; i++) { System.out.println( arr1[i]); } // 출력값: 10, 20, 30
		// 해석: 초기화 확인
		
		double[] arr2 = new double[3];
		
		// for each문
		for( double value : arr2) { System.out.println( value ); } // 출력값: 0.0, 0.0, 0.0
		
		String[] arr3 = new String[3];
		
		// for each문
		for( String value : arr3) { System.out.println( value ); } // 출력값: null, null, null
		arr3[0] = "1월"; arr3[1] = "2월"; arr3[2] = "3월";
		for( String value : arr3) { System.out.println( value ); } // 출력값: 1월, 2월, 3월
	}
}
