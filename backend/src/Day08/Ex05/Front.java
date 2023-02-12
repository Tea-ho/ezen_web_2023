package Day08.Ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class Front {

	// 필드 영역 [ 변수, 객체, 배열, array 등등 ] 
	Scanner scanner = new Scanner(System.in);
	// 해석: 인스턴스 scanner 생성 (참조 클래스: Scanner)
	ArrayList<Member> memberList = new ArrayList<>();
	// 해석: memberList Array 생성
	
	// 생성자 영역
	// Empty 생성자
	public Front(int no, int view, String writer, String title) {
		// TODO Auto-generated constructor stub
	}
	
	// 메소드 영역
	// 메인 페이지 메소드 생성
	void index() {
		
		while(true) {
			print();
			
			System.out.println("1.회원등록 2.회원삭제 : ");
			int choice = scanner.nextInt();
			
			if( choice == 1 ) {
				signup();
			}
			
			else if( choice == 2 ) {
				delete();
			}
			
			else {
				
			}
		}
	} // index() E
	
	// 회원 등록 페이지 메소드 생성
	void signup() {
		System.out.println("회원명: "); 	String name = scanner.next();
		System.out.println("전화번호: "); 	String phone = scanner.next();
		
		Member member = new Member( name, phone );
		// 인스턴스 member 생성 (참조 클래스: Member, 입력값: scanner 통해 입력받은 name, phone data)
		
		memberList.add(member);
		// 해석: 리스트에 인스턴스 member에 입력받은 데이터 저장
	}
	
	// 회원 삭제 페이지 메소드 생성
	void delete() {
		System.out.println("삭제할 번호(인덱스): "); int no = scanner.nextInt();
		memberList.remove(no);
	}
	
	// 회원 출력 메소드 생성
	void print() {
		System.out.println("번호\t회원\t전화번호");
		for( int i = 0 ; i < memberList.size(); i++ ) {
			System.out.println( i + "\t" + memberList.get(i).name + "\t" + memberList.get(i).phone);
		}
	}

	public void boardList(int no, int view, String writer, String title) {
		// TODO Auto-generated method stub
		
	}
	
	
} // class E
