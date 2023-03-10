package 과제.과제02_키오스크;

import java.util.Scanner;

/*	일시: 2023.02.06
 	주제: 키오스크 동작 시스템 구현 (작동: console)
	[요구사항]
	1. 제품가격
	1.콜라[300원]	2.사이다[400원] 3.환타[500원]
	2. 제품 초기재고
	3. 메뉴에서 제품 선택 시, 장바구니 담기
	4. 키오스크 메뉴[무한루프 활용]
	 1.콜라 2.사이다 3.환타 4.결제
	 (선택번호: 1~3)
	 재고가 있을 경우, 장바구니 담고 없으면 재고 부족 안내
	 
	 (선택번호: 4)
	 1) 장바구니 현황 표시 목록
	 ----------------------
	 제품명	수량		가격
	 사이다	1		400
	 환타		2		1000
	 총 가격: 1400
	 2) 결제 메뉴창 생성
	 1.결제 2.취소
	 [결제]
	 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화
	 만약 금액이 부족하면 결제 취소
	 [취소]
	 장바구니 초기화 및 재고 다시 되돌리기
*/

public class 과제01 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		
			int colaP = 300;	int colaC = 10;		int incolaC = 0;
			int ciderP = 400;	int ciderC = 8;		int inciderC = 0;
			int FantaP = 500;	int FantaC = 15;	int inFantaC = 0;
			
			while(true) {
				// System.out.println(colaC); -- 확인 완료
				
				System.out.println("1.콜라 2.사이다 3.환타 4.결제");
				System.out.print(">>메뉴 선택: ");
				int choice = scanner.nextInt();
				//----------------------------------------- 콜라 선택
				if( choice == 1 ) {
					System.out.print(">>콜라 구매 수량: ");
					incolaC = scanner.nextInt();
					
					if( colaC >	0 ) {
						colaC--; incolaC++;
						System.out.println(">>콜라를 담았습니다.");
					}
					else {
						System.out.println("재고 부족 // 현 재고:" + colaC);
					}
				}
				//----------------------------------------- 사이다 선택
				else if( choice == 2 ) {
					System.out.print(">>사이다 구매 수량: ");
					inciderC = scanner.nextInt();
					
					if( ciderC > 0 ) {
						ciderC--; inciderC++;
						System.out.println(">>사이다를 담았습니다.");
					}
					else {
						System.out.println("재고 부족 // 현 재고:" + ciderC);
					}
				}
				//----------------------------------------- 환타 선택
				else if( choice == 3 ) {
					System.out.print(">>환타 구매 수량: ");
					inFantaC = scanner.nextInt();
					
					if( FantaC > 0 ) {
						FantaC--; inFantaC++;
						System.out.println(">>환타를 담았습니다.");
					}
					else {
						System.out.println("재고 부족 // 현 재고:" + FantaC);
					}
				}
				//----------------------------------------- 결제 선택
				else if( choice == 4 ) {
					System.out.println("1.결제 2.취소");
					System.out.print(">>메뉴 선택: ");
					int lastChoice = scanner.nextInt();
					
					System.out.println("-------------결제 목록-------------");
					System.out.printf("%6s   %6s   %6s", "제품", "수량", "가격");
					System.out.println();
					if( incolaC > 0 ) {
						System.out.printf("%6s   %5d   %6d", "콜라", incolaC, colaP);
						System.out.println();
					}
					if( inciderC > 0 ) {
						System.out.printf("%6s   %5d   %6d", "사이다", inciderC, ciderP);
						System.out.println();
					}
					if( inFantaC > 0 ) {
						System.out.printf("%6s   %5d   %6d", "환타", inFantaC, FantaP);
						System.out.println();
					}
					int total = (incolaC*colaP) + (inciderC*ciderP) + (inFantaC*FantaP);
					System.out.println("총 결제 금액: " + total );
					
					//----------------------------------------- 결제 선택
					if( lastChoice == 1) {
						System.out.println(">>결제 금액: ");
						int inpay = scanner.nextInt();
						if( inpay >= total ) {
							System.out.println(">>결제 완료");
							System.out.println(">>잔돈: " + (inpay-total));
						}
						else {
							System.out.println(">>잔액 부족");
							colaC += incolaC;	ciderC += inciderC;		FantaC += inFantaC;
						}
					}
					//----------------------------------------- 취소 선택
					else if( lastChoice == 2 ) {
						colaC += incolaC;	ciderC += inciderC;		FantaC += inFantaC;
						
					}
					else {
						System.out.println("등록되지 않은 번호입니다. 다시 입력해주세요.");
					}
				}
				//----------------------------------------- 오류 옵션
				else {
					System.out.println("등록되지 않은 번호입니다. 다시 입력해주세요.");
				}
				
			} // while E
	} // m E
} // c E
