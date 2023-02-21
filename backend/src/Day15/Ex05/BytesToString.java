package Day15.Ex05; // 문자 -> 바이트로 변환, 문자 <- 바이트로 변환

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String data = "자바";
		// String 클래스: 문자열 저장하고 조작하는 클래스
		
		byte[] arr1 = data.getBytes();
		// getBytes() 메소드: 문자를 바이트로 변환
		
		System.out.println( arr1 );
		// 출력값: [B@3d012ddd
		// 해석: 배열의 주소값 출력
		
		System.out.println( Arrays.toString(arr1));
		// 출력값: [-20, -98, -112, -21, -80, -108]
		// 해석1: 배열 내 데이터 출력
		// 해석2: "자바"라는 단어가 위와 같은 형태로 byte 배열에 저장된다.
		// 해석3: toString( ) 메소드로 바이트 정보를 문자로 변환
		
		String str1 = new String( arr1 );
		System.out.println( str1 );
		
		byte[] arr2 = data.getBytes("EUC-KR");
		// 해석: EUC-KR로 설정
		
		System.out.println(arr2);
		// 출력값: [B@5a42bbf4
		// 해석: 배열의 주소값 출력
		
		System.out.println(Arrays.toString(arr2));
		// 출력값: [-64, -38, -71, -39]
		// 해석1: 배열 내 데이터 출력
		// 해석2: "자바"라는 단어가 위와 같은 형태로 byte 배열에 저장된다.
		// 해석3: toString( ) 메소드로 바이트 정보를 문자로 변환
		// 해석4: UTF-8보다 메모리를 적게 사용한다.
		
	}
}
