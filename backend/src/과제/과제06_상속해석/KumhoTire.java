package 과제.과제06_상속해석;

public class KumhoTire extends Tire {
	
	// 2. 생성자 영역
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	// 3. 메소드 영역
	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		
		if( accumulatedRotation < maxRotation ) { 
			System.out.println( location + " KumhoTire 수명 : " 
				+ (maxRotation-accumulatedRotation) + "회");
			return true; 
		}
		else {
			System.out.println("*** " + location +" KumhoTire 펑크 ***");
			return false; 
		}
	}
}
