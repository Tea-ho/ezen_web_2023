package Day06; // 자바 문자열 관련 함수
/*	.charAt(인덱스);					: 인덱스 위치의 문자 1개 추출
 	.length();						: 문자열 길이
 	.replace("기존문자", "새로운문자");	: 기존문자를 새로운문자로 치환/교체
 	.subString(인덱스);				: 0 ~ 인덱스까지 자르기
 	.subStinr( s인덱스, e인덱스 );		: s인덱스부터 e인덱스까지 지르기
 	.split("자를기준");				: 기준문자 기준으로 자르기		
 	.indexOf("찾을문자");				: 찾을 문자의 인덱스 번호 반환
 	.contains("찾을문자");				: 찾을 문자의 존재 확인 (있으면 true, 없으면 false)
*/

public class Ex02_StringMethod { // c S
	public static void main(String[] args) { // m S
		
		String ssn = "9506241230123";
		
		// 특정 문자 추출: charAt()
		char sex = ssn.charAt(6);
		
		if( sex == 1 || sex == 3) {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수 맞음");
		}
		else {
			System.out.println("주민등록번호 자릿수 다름");
		}
		// 해석: 길이: 13, 인덱스: 0~12
		
		// 문자 교체/치환: replace() - 필터링에 사용
		// ex> 홈페이지 게시판에서 "<" ">" 사용 못하도록 설정, 예측 범위 내 불미스런 단어를 ** or xx 등으로 치환
		String oldStr = "자바 문자열 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println( oldStr );
		System.out.println( newStr );
		if( oldStr == newStr ) {
			System.out.println("주소값 같음");
		}
		
		// 자르기: subString(인덱스) vs split(기준문자)
		String ssn2 = "950624-1230123";
		
		System.out.println( ssn2.substring(7)); // 출력값: 1230123
		// 해석: 인덱스 7 전까지 자르기 진행
		System.out.println( ssn2.substring(0, 6)); // 출력값: 950624
		// 해석: 인덱스 0부터 6 전까지 자르기 진행
		
		System.out.println( ssn2.split("-")); // 출력값: [Ljava.lang.String;@49e4cb85
		// 해석1: 주소값 반환
		System.out.println( ssn2.split("-")[0]);
		System.out.println( ssn2.split("-")[1]);
		// 해석2: split 특징으로, 특정 문자를 기준으롤 자르면, 2조각으로 배열을 생성하여 저장한다.
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,김태호";
		String[] tokens = board.split(",");
		System.out.println(tokens[3]); // 출력값: 김태호
		
		// 문자 찾기: indexOf vs contains
		String subject = "자바 프로그래밍";
		
		System.out.println( subject.indexOf("자바")); // 출력값: 0
		System.out.println( subject.indexOf(" ")); // 출력값: 2
		// 해석: 단어의 시작 index 번호 출력
		System.out.println( subject.indexOf("파이썬")); // 출력값: -1
		// 해석: 단어가 없으면 -1 출력
		
		System.out.println( subject.contains("자바")); // 출력값: true
		System.out.println( subject.contains("파이썬")); // 출력값: false
		// 해석: 찾는 문자가 있으면 true, 없으면 false 반환
		
	} // m E
} // c E
