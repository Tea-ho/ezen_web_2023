package Day15.Ex05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerMethod {
	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍-박연수";
		String[] arr = data1.split("&|-");
		
		System.out.println( Arrays.toString(arr) );
		// 출력값: [홍길동, 이수홍, 박연수]
		// 해석: &이거나 -을 기준으로 자른다.(split한다.)
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		
		System.out.println(st);
		// 출력값: java.util.StringTokenizer@2e5c649
		System.out.println("조각수 =" + st.countTokens());
		// 출력값: 조각수=3
		// 해석: countTokens 메소드를 이용해 특정 기준값으로 조각된 숫자를 확인할 수 있음. 
		for( int i = 0; i < 3; i++ ) {
			System.out.println( st.nextToken() );
		}
		// 출력값: 홍길동, 이수홍, 박연수
		// 해석: nextToken 메소드를 이용하여 저장된 문자열을 가져올 수 있다.
		
	}
}
