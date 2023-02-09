package Day07.Ex06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Day07.Ex04_객체사용예시2.Member;

public class 회원시스템_컬렉션프레임워크 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Member> memberList =new ArrayList<>();
		
		int index = 0;
		
		while(true) {
			
			
			// 람다식 foreach
			memberList.forEach( (o) -> {
				System.out.println( index + "\t" + o.name + "\t" + o.phone);

			});
			
			// 배열명.length: 배열 길기 [ 고정 길이 ]
			// 리스트명.size(): 리스트 내 요소들의 개수 [ 가변길이 ]
			for( int i = 0; i <memberList.size(); i++) {
				System.out.println(i + "\t" + memberList.get(i).name + "\t" + memberList.get(i).phone );
			}
			
			System.out.print("1.회원등록 2.회원삭제: ");
			int choice = scanner.nextInt();
			
			// 회원 등록
			if( choice == 1) {
				System.out.println("회원명: "); String inputname = scanner.next();
				System.out.println("전화번호: "); String inputphone = scanner.next();
				
				Member member = new Member();
				member.name = inputname;
				member.phone = inputphone;
				memberList.add(member);
	
			}
			
			// 회원 삭제
			else if( choice == 2 ) {
				System.out.println("삭제할 번호/인덱스: " );
				int no = scanner.nextInt();
				memberList.remove(no);
		
			}
			
			// 이 외 번호 클릭 시
			else {
				
			}

		}
	}
}
