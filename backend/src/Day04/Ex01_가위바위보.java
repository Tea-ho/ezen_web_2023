package Day04;

import java.util.Random;
import java.util.Scanner;

public class Ex01_가위바위보 {		// class S
	public static void main(String[] args) {	// main S
	
		Scanner scanner = new Scanner( System.in );
		
		int p = 0;	int c = 0;	int play = 0;
		
		while(true) {	// 무한루프
			System.out.println( " 가위(0) 바위(1) 보(2) 종료(3) " );
			
			byte player = scanner.nextByte();
			System.out.println(" >> player 값: " + player);
			// 변수 player 선언 (초기값: scanner 입력 데이터)
			
			if( player == 3 ) {	// 무한루프 종료조건
				System.out.println("종료");
				
				// 최종 결과 판단
				if( p > c ) { System.out.println(" 최종 결과: player 승!! " + p +"win / " + play + "경기수"); }
				else if( p == c ) { System.out.println(" 최종 결과: draw~~ " + p +"win / " + c +"win"); }
				else { System.out.println(" 최종 결과: computer 승!! " + c +"win / " + play + "경기수"); }
				
				break;
			}
			
			Random random = new Random();
			int computer = random.nextInt(3);
			System.out.println(" >> computer 값: " + computer);
			
			if(( player == 0 && computer == 2) || ( player == 1 && computer == 0) || (player == 2 && computer == 1)) {
				System.out.println(" result -->> player win ");
				p++;
			}
			else if ( player == computer ) {
				System.out.println(" result -->>draw ");
			}
			else{ 
				System.out.println(" result -->> computer win ");
				c++;
			}
			play++;
		
		}	// while E
		
	}	// main E
}	// class E
