package Day11.Ex03;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		super.speedUp();
	}
	
	// @Override
	// public void stop() {
	//	super.stop();
	// }
	
	// 오버라이딩 불가 (이유: 부모 클래스에서 해당 메소드를 final로 선언하여 자식 클래스에서 사용 불가)
	
}
