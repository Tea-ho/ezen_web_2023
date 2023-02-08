package Day06;

import java.util.Random;
import java.util.Scanner;

public class Ex05_틱택토 { // c S
	public static void main(String[] args) { // m S
		
		// 입력 객체 선언
		Scanner scanner = new Scanner( System.in );
		
		Random random = new Random();
		
		
		// 배열 선언
		String[] 게임판 = { 
				"[  ]", "[  ]", "[  ]", 
				"[  ]", "[  ]", "[  ]", 
				"[  ]", "[  ]", "[  ]"
		};
		
		int count = 0;
		// boolean result = false; // 상태변수로 흐름제어(승리 판단 됐을 경우, 게임 종료하기 위해 선언)
		
		// 알두기
		game: while(true) {
			// 게임판 출력
			for( int i = 0; i < 게임판.length; i++) {
				System.out.print(게임판[i]);
				if( (i+1) % 3 == 0) {
					System.out.println();
				}
			}
			
			// 사용자 알두기
			re: while(true) {
				System.out.println("위치[0~8] 선택: " );
				int 위치 = scanner.nextInt();
				
				if( 위치 < 0 || 위치 > 8 ) { 
					System.out.println("[알림] 허용 범위 내 입력해주세요.");
					continue re;
				}
				if( !게임판[위치].equals("[  ]")) {
					System.out.println("[알림] 이미 둔 자리입니다. 다시 입력해주세요.");
					continue re;
				}
				게임판[위치] = "[O]";
				count++;
				break re;
			}
			
			// if ( result ) { break; } // 3)게임 종료하기 위한 옵션
			
			// computer 알두기
			com: while(true) {	
				int com = random.nextInt(9);
				
				if(!게임판[com].equals("[  ]")) {
					continue com;
				}
				게임판[com] = "[X]";
				count++;
				break com;
			}
			
			// 승리 판단
			for( int i = 0; i <= 6; i+=3) {
				if( 게임판[i] != "[  ]" && 게임판[i] == 게임판[i+1] && 게임판[i] == 게임판[i+2] ) {
					System.out.println("승리자: " + 게임판[i]);
					break game;
					// return; 으로, 나갈 수 있음
					// result = true; 3선언하여 위의 3) 루트 통해 종료
				}
			}
			for( int i = 0; i <= 2; i++ ) {
				if( 게임판[i] != "[  ]" && 게임판[i] == 게임판[i+3] && 게임판[i] == 게임판[i+6] ) {
					System.out.println("승리자: " + 게임판[i]);
					break game;
				}
			}
			if(게임판[0] != "[  ]" && 게임판[0] == 게임판[4] && 게임판[0] == 게임판[8]) {
				System.out.println("승리자: " + 게임판[0]);
				break game;
			}
			else if(게임판[2] != "[  ]" && 게임판[2] == 게임판[4] && 게임판[2] == 게임판[6]) {
				System.out.println("승리자: " + 게임판[2]);
				break game;
			}
			else if( count == 9) {
				System.out.println("무승부");
				break game;
			}
		}
	} // m E
} // c E
