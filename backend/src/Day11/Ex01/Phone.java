package Day11.Ex01; // 상속

public class Phone {

	// 필드 영역
	public String model;
	public String color;
	
	// 생성자 영역
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("---부모클래스 생성자 실행---");
	}
	
	public Phone( String modle, String color) {
		System.out.println("---부모클래스 생성자 실행---");
	}

	// 메소드 영역
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
		
	}
	
}
