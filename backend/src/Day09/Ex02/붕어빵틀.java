package Day09.Ex02;

import java.util.ArrayList;

/*	생성자: 객체를 생성할 때 초기화 담당
 	형태: new 생성자( )
 	특징:
 	1) 생성자 선언이 없을 경우, 기본생성자 자동 생성
 	2) 생성자 이름 클래스명과 동일
 	목적
 	1) 인수로 받은 데이터를 필드 초기화
 	2) 필터링 및 행위	
 	
 	메소드: 동작 담당
 	

*/

// JVM 메소드 영역
public class 붕어빵틀 {
	
	// 필드 영역
	String 재료1;
	String 재료2;
	
	// 생성자 영역
	// Empty 생성자 선언
	붕어빵틀(){
		
	}
	
	붕어빵틀( String 재료1 ){
		this.재료1 = 재료1;
	}
	
	// Full 생성자 선언
	붕어빵틀( String 재료1, String 재료2 ){
		this.재료1 = 재료1;
		this.재료2 = 재료2;
	}
	
	// 메소드 영역
	@Override
	public String toString() {
		return "붕어빵틀 [재료1=" + 재료1 + ", 재료2=" + 재료2 + "]";
	}
	
	// 메소드1 (기능: 붕어빵 굽기)
	void 굽기() {
		System.out.println("붕어빵을 굽습니다.");
	}
	
	// 메소드2 (기능: 붕어빵 속 변경)
	void 변경(String 재료1, String 재료2) {
		this.재료1 = 재료1;
		this.재료2 = 재료2;
		System.out.println("붕어빵 속이 변경되었습니다.");
	}
	
	// 메소드3 (기능: 붕어빵 판매)
	int 판매가() {
		return 3000;
	}
	
	// 메소드4 (기능: 붕어빵 판매)
	붕어빵틀 판매() {
		붕어빵틀 붕어빵 = new 붕어빵틀();
		return 붕어빵;
	}
	void 확인( 붕어빵틀 붕어빵 ) {
		System.out.println( 붕어빵 );
	}
	
	ArrayList<붕어빵틀> 여러개판매(int 개수){
		ArrayList<붕어빵틀> 붕어빵포장종이 = new ArrayList<>();
		
		for(int i = 1; i <= 개수; i++) {
			붕어빵포장종이.add(판매());
		}
		
		return 붕어빵포장종이;
	}
	
	
}
