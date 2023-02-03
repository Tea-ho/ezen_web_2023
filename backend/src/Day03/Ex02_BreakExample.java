package Day03; // break 문

public class Ex02_BreakExample { // c S

	public static void main(String[] args) { // m S
		
		while(true) { // while S
		// 해석: true인 경우 while 문 반복 (무한루프)
			
			int num = (int)(Math.random()*6) + 1;
			// 해석: 변수 num 선언 (입력값: 난수, 범위: 1~6)
			System.out.println(num);
			
			if(num==6) { // if S
				break;
			// 해석: 변수 num 값이 6인 경우, while 문 탈출
				
			} // if E
		} // while E
		System.out.println("프로그램 종료");
		
		
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') { break; }
				// 특징: 가장 가까운 반복문 탈출
			}
		}
		System.out.println("프로그램 실행 종료");
		
		// 중첩 반복문 제어
		Outter: for(char upper='A'; upper<='Z'; upper++) {
		// break name 선언 (탈출하고자 하는 for 문 앞에 선언)
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') { break Outter; }
				// 선언한 break명으로 가서 탈출 (활용: 반복문 제어)
			}
		}
		System.out.println("프로그램 실행 종료");
		
		
		
	} // m E
} // c E
