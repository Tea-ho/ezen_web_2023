package Day07.Ex02_Car;
// 클래스 사용 목적: 실행
public class CarExecute {
	public static void main(String[] args) {
		
		// 클래스 이용한 객체 생성
		CarBlueprint teOCar = new CarBlueprint();
		
		// 객체 필드 호출
		System.out.println("teOCar 모델명: " + teOCar.model);
		System.out.println("teOCar 시동여부: " + teOCar.start);
		System.out.println("teOCar 현재속도: " + teOCar.speed);
		
		CarBlueprint hunCar = new CarBlueprint();
		hunCar.model = "Damas";

		System.out.println("hunCar 모델명: " + hunCar.model);
		System.out.println("hunCar시동여부: " + hunCar.start);
		System.out.println("현재속도: " + hunCar.speed);
		
	}
	
}
