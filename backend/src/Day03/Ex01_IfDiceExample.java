package Day03;

import java.util.Random;

public class Ex01_IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) +1;
		// 해석: Math클래스의 random메소드를 이용하여 난수 생성 (생성되는 난수 범위: 1~6)
		// 해석: random메소드 특성상 실수 형태로 난수가 생성되기 때문에 정수 형태로 강제 형변환
		
		if( num==1 ) {
			System.out.println("1번이 나왔습니다.");
		}
		else if( num==2 ) {
			System.out.println("2번이 나왔습니다.");
		}
		else if( num==3 ) {
			System.out.println("3번이 나왔습니다.");
		}
		else if( num==4 ) {
			System.out.println("4번이 나왔습니다.");
		}
		else if( num==5 ) {
			System.out.println("5번이 나왔습니다.");
		}
		else {
			System.out.println("6번이 나왔습니다.");
		}		
		
		// 난수 생성 심화
		// 방법1: Math 클래스 사용		Math.random()*개수) + 시작번호
		// 방법2: Random 클래스 사용	random.nextInt(개수) + 시작번호
		Random random = new Random();
		// 해석: Random 클래스의 인스턴스 random 생성
		System.out.println( random.nextInt() );
		System.out.println( random.nextInt(6)+1 );
		
		char c1 = (char)(random.nextInt(26)+97);	// 유니코드 기준 97 ~ 122 순서대로 a~z 저장
		// 해석: 문자형 변수 c1 생성 (초기 입력값: 난수를 char형태로 강제변환한 값, 범위:97~122 )
		System.out.println( c1 );
	}
}
