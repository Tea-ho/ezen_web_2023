package Day01;

/*	[자바 관련 지식]
	자바: 100% 객체지향언어
	- 클래스: 객체 생성을 위해 미리 정의된 틀/설계도
	- 객체: 클래스 기반으로 만들어진 식별가능한 메모리/변수
	- 객체지향(OOP): 객체들을 모아서 만든 프로그램 
*/

public class Ex01 {	// class S

/*	public: 사용범위 정의 [public 선언 시, 프로젝트 내 모든 곳에서 사용 가능]
 	type: public, protected, private, default
	class: 클래스 선언 시 사용되는 워드
	Ex01: 클래스명으로 관용적으로 클래스명의 첫글자는 대문자 사용
	{ }: 클래스의 시작과 끝 표기
*/	
	
	public static void main(String[] args) {	// main S
	// main함수 특징: 메인스레드를 가지고 있음, JVM에서 main을 찾아 실행시키기 때문에 main함수 안에 실행 코드를 입력해야 실행됨
	// 스레드 what? 프로세스(process) 내에서 실제로 작업을 수행하는 주체
	// 생성 단축키: m + ctrl + 스페이스바
		
		System.out.println("Hello World!");
		// System.out.println(); 생성 단축키: syso + ctrl + 스페이스바
		// 세미클론(;) 기능: 명령어 끝마침으로, 명령어 처리를 요구함
		
	} // main E
} // class E

