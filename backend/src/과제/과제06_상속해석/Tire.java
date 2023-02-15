package 과제.과제06_상속해석;

public class Tire {
	
	// 1. 필드 영역
	public int maxRotation;
	public int accumulatedRotation; 
	public String location;
	// 해석: 변수 선언
	
	// 2. 생성자 영역
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	// 해석: 필드 내 변수 생성자 통하여 초기화
	
	// 3. 메소드 영역
	public boolean roll() {
		
		++accumulatedRotation;
		
		if( accumulatedRotation < maxRotation ) {
			System.out.println( location + " Tire 수명 : " 
				+ (maxRotation-accumulatedRotation) + "회");
			return true; 
		}
		else {
			System.out.println("*** " + location +" Tire 펑크 ***");
			return false; 
		}
	}
	// 해석1: accumulatedRotation 선위 증가 실행
	// 해석2: 조건식 실행 후 true, false 반환
}
