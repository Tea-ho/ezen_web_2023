package Day09.Ex03;

public class Car {

	// 필드 영역
	int gas;
	
	// 생성자 영역
	// empty 생성자 선언
	Car(){
	
	}
	// Full 생성자 선언
	Car(int gas){
		this.gas = gas;
	}
	
	
	// 메소드 영역
	// gas 데이터 저장 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// gas 여부 확인 메소드
	boolean isLetfGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	// 동작 메소드
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas 잔량: " + gas +" )");
				gas--;
			}
			else {
				System.out.println("멈춥니다. (gas 잔량: " + gas +" )");
				return;
			}
		}
	}
}
