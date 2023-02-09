package Day07; // 배열 활용

import java.util.Scanner;

public class Ex01_회원시스템_배열 { // c S
	public static void main(String[] args) { // m S
		
		Scanner scanner = new Scanner(System.in);
		
		String[] memberList = new String[3];
		
		while(true) { // 무한루프 [종료 조건: 없음]
			
			// 배열 출력
			System.out.println("번호\t회원명\t전화번호");
			for( int i = 0; i < memberList.length; i++) {
				if(memberList[i] != null) {
					String[] divide = memberList[i].split(",");
					System.out.println( i + "\t" + divide[0] + "\t" + divide[1] );
				}
			}
			
			System.out.println("1.회원등록 2.회원삭제");
			int choice = scanner.nextInt();
			
			// 회원 등록
			if( choice == 1) {
				System.out.println("회원명: "); String name = scanner.next();
				System.out.println("전화번호: "); String phone = scanner.next();
				
				// 배열 내 빈공간 찾아 데이터 입력하기
				for( int i = 0; i < memberList.length; i++) {
					if( memberList[i] == null) {
						memberList[i] = name+","+phone;
						System.out.println("회원 등록이 완료되었습니다. 정보: " + memberList[i]);
						break; // 반복문 종료 (if문 수행 시, for문 탈출)
					}
				}
			}
			
			// 회원 삭제
			else if( choice == 2 ) {
				System.out.println("삭제할 번호/인덱스: " );
				
				// 배열 데이터 삭제
				int deleteNo = scanner.nextInt();
				memberList[deleteNo] = null;
				System.out.println(memberList[deleteNo]);
				
				// 삭제 후 빈자리 채우기 [삭제된 인덱스 뒤부터 한칸씩 당겨오기]
				// 실생활 활용: 음식점 웨이팅 시스템
				for(int i = deleteNo; i < memberList.length; i++) {
					if( i == memberList.length-1 ) { memberList[i] = null; break; }
					memberList[i] = memberList[i+1];
					if( memberList[i+1] == null ) { break; }
				}
			}
			
			// 이 외 번호 클릭 시
			else {
				
			}
		} // while E
		
	} // m E
} // c E
