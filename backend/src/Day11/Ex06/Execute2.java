package Day11.Ex06;

import java.util.ArrayList;

public class Execute2 {
	public static void main(String[] args) {
		
		Tire tire = new Tire();
		KumhoTire kumhoTire = new KumhoTire();
		HankookTire hankookTire = new HankookTire();
		
		// 타입 변환 - 변수에 적용
		// 참조타입의 자동타입 변환 예제
		Tire temp = tire;
			Tire temp2 = kumhoTire;
			Tire temp3 = hankookTire;
			Object temp4 = temp3;
		
		// 강제타입 변환 예제
		Tire tire2 = (Tire) temp4;
			KumhoTire kumhoTire2 = (KumhoTire)tire2;
			HankookTire hankookTire2 = (HankookTire)tire2;
		
			
		// 타입 변환 - 매개변수, 리턴타입에 적용
		Tire result1 = 함수1(kumhoTire2);
		KumhoTire result2 = (KumhoTire)함수2((KumhoTire)tire);
		
		// 타입 변환 - ArrayList에 활용
		ArrayList<KumhoTire> kumhoList = new ArrayList<>();
		kumhoList.add(kumhoTire);
		// kumhoList.add(hankookTire); 	// 데이터 추가 불가능
		// kumhoList.add(tire);			// 데이터 추가 불가능
		
		ArrayList<Tire> tireList = new ArrayList<>();
		tireList.add(kumhoTire);
		tireList.add(hankookTire);
		tireList.add(tire);
			
	}
	
	public static KumhoTire 함수1(Tire tire) {
		return new KumhoTire();
	}
	
	public static Tire 함수2( KumhoTire kumhoTire ) {
		return new Tire();
	}
	
	
	
}
