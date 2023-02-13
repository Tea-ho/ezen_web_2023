package Day09.Ex07; // final 필드와 상수
/*
	final 필드
	목적: 값을 변경하는 것을 막고 읽기만 허용해야하는 경우, final 필드 사용 (수정 불가)
	특징: 반드시 초기값이 있어야 함.
	형태:
	1) final 타입 필드 = 초기값; (필드 선언 시 초기값 입력)
	2) final 타입 필드; (생성자 이용하여 초기값 입력 필요!)
	초기값 입력 방법:
	1) 필드 선언 시 초기값 입력
	2) 생성자 이용하여 초기값 입력
	
	static final 필드 [상수]
	목적: 불변의 값을 저장하는 필드 사용
	특징
	1) 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에 static이면서 final인 특성을 가진다.
	2) 상수 이름은 모두 대문자로 작성하는 것이 관례 (서로 다른 언어가 혼합된 이름인 경우, 언더바를 이용하여 단어 연결)
	형태:
	1) static final 타입 상수 = 초기값; (필드 선언 시 초기값 입력)
	2) static final 타입 상수;
	   static{
	   		상수 = 초기값;
	   }
	
*/

public class Korean {
	
	// 필드 영역
	// final 필드 예시
	final String nation = "대한민국";
	final String ssn;
	
	// 상수 필드 예시
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { // 상수 EARTH_SURFACE_AREA static 블록 사용하여 초기화
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
	String name;
	// 생성자 영역
	public Korean(String ssn, String name) { 
		this.ssn = ssn; // final 변수 ssn 생성자 이용하여 초기화
		this.name = name;
	}
	
	// 메소드 영역
}
