package Day06; // 배열
/*	1. 배열 선언
 	1) 타입[] 변수;
 	2) 타입 변수[];
 	
 	2. 배열 초기화
 	타입[] 변수 = {   };
 	
 	3. 배열 특징
	1) 같은 타입의 값만 관리한다.
 	2) 길이를 늘리거나 줄일 수 없다.
*/

public class Ex04_Array {
	public static void main(String[] args) {
		
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		// 해석: 배열 변수 season 선언 및 초기화
		
		System.out.println("season[0]: " + season[0]); // 출력값: Spring
		System.out.println("season[1]: " + season[1]); // 출력값: Summer
		System.out.println("season[2]: " + season[2]); // 출력값: Fall
		System.out.println("season[3]: " + season[3]); // 출력값: Winter
		// 해석: index값 이용하여 배열 내 데이터 호출
		
		season[1] = "여름";
		System.out.println("season[1]: " + season[1]); // 출력값: 여름
		// 해석: 배열 index 1번 데이터 초기화
		
		System.out.println();
		
		int[] scores = { 83, 90, 87};
		// 해석: 배열 변수 scores 선언 및 초기화
		int sum = 0;
		// 해석: 변수 sum 선언 및 초기화
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균:" + avg);
	}
}
