package Day09.Ex01;

public class Member {
	
	// 필드
	String name;
	int num;
	double num2;
	boolean check;
	String[] array = new String[3];
	
	// 생성자
	
	//메소드
	void setName() {
		String inputName;
		System.out.println( name );
		// System.out.println( inputName );
		// 오류 발생: 로컬 변수는 초기화가 자동으로 설정되지 않음.
		
	}
}
