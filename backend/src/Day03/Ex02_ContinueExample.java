package Day03; // continue 문

public class Ex02_ContinueExample { // c S
	public static void main(String[] args) { // m S
		
		for(int i = 1; i<=10; i++) {
			if( i%2 != 0) {
				continue;
				// 해석: 2로 나눈 값이 0이 아닌 경우, continue 실행
				// continue 특징1: 가장 가까운 반복문[증감식]으로 이동
				// continue 특징2: break문과 동일하게 반복문이 중첩에서 제어가 필요한 경우 continue 이름 선언하여 희망하는 for문으로 연결 가능
			}
			
			System.out.print( i + " ");
		}
	} // m E
} // c E
