package 과제.과제03_도서관관리시스템;

import java.util.ArrayList;
import java.util.Scanner;

/*	일시: 2023.02.09
 	주제: 도서관리 시스템 	
 */

public class Execute {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 해석: scanner 인스턴스 생성 (참조 클래스: Scanner)
		
		ArrayList<Book> bookList = new ArrayList<>();
		// 해석: ArrayList bookList 생성 (참조 클래스: Book)
		
		Book bookSetting1 = new Book();
		bookSetting1.bookName = "행복한 편의점";
		bookSetting1.bookRent = true;
		bookSetting1.bookGenre = "소설";
		
		bookList.add(bookSetting1);
		
		Book bookSetting2 = new Book();
		bookSetting2.bookName = "이것이 여행이다";
		bookSetting2.bookRent = false;
		bookSetting2.bookGenre = "에세이";
		bookSetting2.memberID = "hokeng92";
		
		bookList.add(bookSetting2);
		
		Book bookSetting3 = new Book();
		bookSetting3.bookName = "이것이 자바다";
		bookSetting3.bookRent = true;
		bookSetting3.bookGenre = "전문도서";
		
		bookList.add(bookSetting3);
		// 해석: 도서 초기 메뉴 세팅
		
		ArrayList<Book> memberList = new ArrayList<>();
		
		Book member1 = new Book();
		member1.memberID = "hokeng92";
		member1.memberPW = "1234";
		member1.memberName = "김태호";
		member1.memberPhone = "010-6706-9602";
		member1.memberRentList = null;
		
		memberList.add(member1);
			// System.out.println(memberList.get(0).memberID); // ---- 확인 완료
			// System.out.println(memberList.get(0).memberPW); // ---- 확인 완료
		
		while( true ){
			
			// 초기메뉴 선택
			System.out.println("---------------------Teo 도서관---------------------");
			System.out.println("초기 메뉴> 1.로그인 2.회원가입 ");
			int choice1 = scanner.nextInt();
			
			// 로그인
			if( choice1 == 1 ) {
				System.out.print("ID 입력: ");		String inputID = scanner.next();
				System.out.println("PW 입력: ");		String inputPW = scanner.next();
				
					// System.out.println(inputID); // ---- 확인 완료
					// System.out.println(inputPW); // ---- 확인 완료

				for( int i = 0; i < memberList.size(); i++) {
					
						// System.out.println(memberList.get(i).memberID); // ---- 확인 완료
						// System.out.println(memberList.get(i).memberPW); // ---- 확인 완료
						// System.out.println(inputID); // ---- 확인 완료
						// System.out.println(inputPW); // ---- 확인 완료
					
					if( memberList.get(i).memberID.equals(inputID) && memberList.get(i).memberPW.equals(inputPW) ) {
						// 피드백: 비교연산자로 비교 불가, equals 함수로 data값 자체 비교
	
						logout: while(true) { // (종료 조건: 로그아웃)
							// 도서 대여 현황 출력부 생성
							System.out.println("---------------------Teo 도서관 대여 현황---------------------");
							System.out.println("번호 \t 대여여부 \t 도서장르 \t 도서명 \t\t 대여자");
							for( int j = 0; j < bookList.size(); j++ ) {
								System.out.println( (j+1) + "\t" + bookList.get(j).bookRent + "\t" + bookList.get(j).bookGenre + "\t" + bookList.get(j).bookName + "\t" + bookList.get(j).memberID  );
							}
	
							System.out.println("메뉴 > 1.도서대여 2.도서반납 3.도서등록[관리자] 4.로그아웃");
							System.out.print("메뉴 선택: ");		int choice2 = scanner.nextInt();
							
							// 대여 기능
							if( choice2 == 1 ) {
								System.out.print("도서 번호 입력: ");		int bookNo_Out = scanner.nextInt();
								
								if( bookList.get(bookNo_Out-1).bookRent ) {
									System.out.println("정상적으로 대여되었습니다.");
									bookList.get(bookNo_Out-1).bookRent = false;
									bookList.get(bookNo_Out-1).memberID = inputID;
								}
								else {
									System.out.println("현재 대여중입니다.");
								}
							}
							
							// 반납 기능
							else if ( choice2 == 2 ) {
								System.out.println("도서 번호 입력: ");		int bookno_In = scanner.nextInt();
								
								if( !bookList.get(bookno_In-1).bookRent ) {
									System.out.println("정상적으로 반납되었습니다.");
									bookList.get(bookno_In-1).bookRent = true;
									bookList.get(bookno_In-1).memberID = null;
								}
								else {
									System.out.println("대여중인 도서가 아닙니다.");
								}
							}
							
							// 도서 등록
							else if ( choice2 == 3 ) {
								System.out.print("도서명 입력: "); 	String inputbookName = scanner.next();
								System.out.print("장르 입력: "); 		String inputbookGenre = scanner.next();
								
								Book bookAdd = new Book();
								bookAdd.bookName = inputbookName;
								bookAdd.bookGenre = inputbookGenre;
								bookAdd.bookRent = true;
								bookList.add(bookAdd);
								
							}
							
							else if ( choice2 == 4 ) {
								System.out.println("로그아웃 되었습니다.");
								break logout;
							}
							
							
							// 다른 번호 선택한 경우
							else {
								System.out.println("다시 입력해주세요.");
							}
						}
					}
					// ID,PW 불일치 한 경우
					else { System.out.println("아이디와 비밀번호가 일치하지 않습니다. 다시 확인해주세요."); }
			
				}
			}
			
			// 회원가입 (유효성 검사 생략)
			else if( choice1 == 2) { 
				System.out.print("ID 입력: ");		String newID = scanner.next();
				System.out.println("PW 입력: ");		String newPW = scanner.next();
				System.out.print("이름 입력: ");		String newName = scanner.next();
				System.out.println("전화번호 입력: ");	String newPhone = scanner.next();
				
				Book memberadd = new Book();
				memberadd.memberID = newID;
				memberadd.memberPW = newPW;
				memberadd.memberName = newName;
				memberadd.memberPhone = newPhone;
				memberList.add(memberadd);
			}
			
			else {
				System.out.println("다시 입력해주세요.");
			}
			
		}
	}

}
