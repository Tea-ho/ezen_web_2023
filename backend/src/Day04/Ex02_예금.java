package Day04;

import java.util.Scanner;

public class Ex02_예금 {	// c S
	public static void main(String[] args) {	// m S
		
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		// 변수 balance 선언 (초기값: 0, 예금액 누적에 사용) 
		
		String account = "123-1234";
		// 변수 account 선언 (계좌번호 용도)
		
		short pw = 1234;
		// 변수 pw 선언 (비밀번호  용도)
		
		while(true) {	// 무한루프
			System.out.println("--------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4. 종료: ");
			System.out.println("--------------------------");
			System.out.print(">> 선택: " );
			
			int choice = scanner.nextInt();
			
			//-------------------------------------------------- 1.예금 제어
			if( choice == 1 ) {
				System.out.print(">>> 예금할 계좌번호:");
				String inaccount = scanner.next();
				
				if( account.equals(inaccount) ) {
				// 내용: 계좌 일치 여부 확인 및 예금 동작
					System.out.print(">>> 예금할 금액: ");
					balance += scanner.nextInt();
					System.out.println(">>> 예금 후 금액: " + balance);
				}
				else {
					System.out.println(">>> 없는 계좌번호 입니다.");
				}
			}
			
			//-------------------------------------------------- 2.출금 제어
			else if( choice == 2 ) {
				System.out.print(">>> 출금할 계좌번호: ");
				String inaccount = scanner.next();
				
				if ( account.equals(inaccount) ) {
				// 내용: 계좌 일치 여부 확인
					System.out.print(">>> 비밀번호: ");
					short inpw = scanner.nextShort();
					
					if( pw == inpw) {
					// 내용: 비밀번호 일치 여부 확인
						System.out.print(">>> 출금할 금액: ");
						int pay = scanner.nextInt();
						
						if( balance >= pay ) {
						// 내용: 유효성 검사 (출금 희망 액수가 잔고보다 클 경우, 동작 X)
							balance -= pay;
							System.out.println(">>> 출금 후 금액: " + balance);
						}
						else {
							System.out.println(">>> 잔액 부족: " + balance);
						}
					}
					else {
						System.out.println(">>> 해당 계좌의 비밀번호가 다릅니다.");
					}
				}
				else {
					System.out.println(">>> 없는 계좌번호 입니다.");
				}
			}
			
			//-------------------------------------------------- 3.잔액 제어
			else if( choice == 3 ) {
				System.out.println(">>> 예금 잔액: " + balance);
			}
			
			//-------------------------------------------------- 4.종료 제어(무한루프 종료 조건)
			else if( choice == 4 ) {
				break;
			}
			
			//-------------------------------------------------- 이 외 번호 입력되었을 경우의 수 설정
			else {
				System.out.println(">> 알 수 없는 번호입니다. [다시 입력]");
			}
			
		}	// w E
	} // c E
} // m E
