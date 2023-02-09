package Day07.Ex04_객체사용예시2;

import java.util.Scanner;

public class 회원시스템_객체 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		
		Member[] memberList = new Member[3];
		// 해석1: Member 객체 3개를 저장할 수 있는 배열 선언
		// 해석2: Member 객체는 String 변수 2개를 저장할 수 있음

		while(true) {
			
			System.out.println("번호\t회원명\t전화번호");
			for( int i = 0; i < memberList.length; i++) {
				if( memberList[i] != null) {
					System.out.println(i+"\t"+memberList[i].name+"\t"+memberList[i].phone);;
				}
			}
			
			System.out.print("1.회원등록 2.회원삭제: ");
			int choice = scanner.nextInt();
			
			// 회원 등록
			if( choice == 1) {
				System.out.println("회원명: "); String inputname = scanner.next();
				System.out.println("전화번호: "); String inputphone = scanner.next();
				
				for( int i = 0; i < memberList.length; i++) {
					Member member = new Member();
					member.name = inputname;	member.phone = inputphone;
					memberList[i] = member;
				}			
			}
			
			// 회원 삭제
			else if( choice == 2 ) {
				System.out.println("삭제할 번호/인덱스: " );
				
		
			}
			
			// 이 외 번호 클릭 시
			else {
				
			}
		} //
		
		
	} // main E
} // class E
