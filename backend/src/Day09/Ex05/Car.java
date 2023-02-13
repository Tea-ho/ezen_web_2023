package Day09.Ex05;

public class Car {
	
	// 필드 영역
	String model;
	int speed;
	
	// 생성자 영역
	// Empty 생성자 선언
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	// Full 생성자 선언
	Car(String model, int speed){
		
	}
	
	// 메소드 영역
	// 세터 메소드 생성
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
	}
	
}
