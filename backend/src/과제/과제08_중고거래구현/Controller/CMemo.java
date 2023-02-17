package 과제.과제08_중고거래구현.Controller;

import java.util.ArrayList;

import 과제.과제08_중고거래구현.Model.MMemo;

public class CMemo {

	// 필드 영역
	private ArrayList<MMemo> memoDB = new ArrayList<>();
	
	// 생성자 영역
	// 싱글톤 적용
	private static CMemo memo = new CMemo();
	private CMemo() {}
	public static CMemo getInstance() { return memo; }
	
	// 메소드 영역
	// 1. 메시지 작성 메소드 (기능: 로그인 유무 체크)
	
	// 2. 메시지 발송 처리 메소드 (기능: DB 저장)
	
	// 3. 메시지 출력 메소드 (기능: MMemo tostring 출력)
	
	// 4. 메시지 상세보기 메소드 (기능: 
	
}
