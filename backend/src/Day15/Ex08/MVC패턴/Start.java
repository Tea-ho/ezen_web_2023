package Day15.Ex08.MVC패턴;

/* 	MVC 디자인패턴
	
		실행 클래스	------->	View 클래스	------->	Controller 클래스	-------> BoardDTO 클래스	------->	BoardDAO 클래스
회원가입						1. 회원정보 입력				2. 검사 후 객체화											3. 객체 저장
																										SQL 처리
							6. 리턴된 결과출력				5. SQL결과 리턴											4. SQL 결과
*/

public class Start {
	public static void main(String[] args) {
		
		MemberView.getInstance().index();
		
	}
}
