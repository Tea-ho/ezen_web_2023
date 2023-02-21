package Day15.Ex04;

import java.util.Properties;

public class SystemMethod {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		// 해석: 현재 시간 나노초로 표현하는 메소드		
		System.out.println(time1);

		int sum = 0;
		for( int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println( (time2 - time1) + "나노초가 소요되었습니다." );
		// 목적: for문 실행하는데 소요된 시간 확인
		
		System.out.println("--------------------------------------------");
		System.out.println("key:					value");
		
		Properties props = System.getProperties();
		
		for( Object obj : props.keySet() ) {
			System.out.println( (String)obj + "					" + System.getProperty((String)obj) );
		}
		
		
		
	}
}
