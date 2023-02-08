package Day06;
/*	일자: 2023.02.08.
	주제: console 비회원게시판 생성
활용: 변수, 연산자, 반복문, 배열, 파일처리
예시:
- 저장 제목, 내용, 작성자, 비밀번호, 조회수
- 초기 메뉴
	-------------게시판-------------
	번호		제목		작성자	조회수
	0		안녕		유재석	5
	1		JAVA	강호동	1
	
	메뉴> -1: 쓰기, -2: 나가기
	
- 쓰기 페이지
	-------------게시물 작성-------------
	제목: 
	내용: 
	작성자: 
	비밀번호: 
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex06_비회원게시판 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner( System.in );
		
		while( true ){
			
			FileInputStream fin = new FileInputStream("c:/java/board.txt");
			// 해석: 파일입력 클래스 객체 생성 (파일경로)
			byte[] inbytes = new byte[ 1000 ];
			// 해석: 읽어온 바이트를 저장하기 위한 배열 공간 설정 (설정값: 1000바이트)
			
			int bytecount = fin.read( inbytes );
			// 해석1: fin.read( inbytes );를 이용하여 inbytes에 데이터 저장
			// 해석2: int bytecount = 를 이용하여 바이트 개수를 변수에 저장
			
			String boardlist = new String( inbytes, 0, bytecount );
			
			
			System.out.println("----------------게시판----------------");
			System.out.printf("%5s %10s %7s %7s", "번호", "제목", "작성자", "조회수" );
			System.out.println();
			
			String[] boards = boardlist.split("\n");
			// 해석: 행 자르기
			
			for( int i = 0; i < boards.length; i++) {
				String[] boardy = boards[i].split(",");
				System.out.printf("%5d %10s %7s %7d", i, boardy[0], boardy[2], i);
				System.out.println();
				
			}
			// 해석1: new String( 바이트배열, 시작 인덱스, 마지막 인덱스 )
			// 해석2: 바이트 배열을 boardlist에 저장 (범위: 시작 인덱스부터 마지막 인덱스까지)
			
			System.out.print("메뉴를 선택해주세요(-1: 쓰기, -2: 나가기): ");
			int select = scanner.nextInt();
	
			if( select == -1 ) {
				System.out.println("----------------게시물 작성----------------");
				System.out.print("제목: "); 		String title = scanner.next();
				System.out.print("내용: "); 		String content = scanner.next();
				System.out.print("작성자: "); 	String writer = scanner.next();
				System.out.print("비밀번호: "); 	String pw = scanner.next();
				
				String outStr = title+","+content+","+writer+","+pw+"\n";
				// 확인요소: 쉼표 사용하여 데이터 구분, \n 사용하여 행 구분
				
				FileOutputStream fout = new FileOutputStream("c:/java/board.txt", true);
				fout.write( outStr.getBytes() );				
			}
			else if( select == -2 ) {
				System.out.println("게시판에서 나갑니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
}
