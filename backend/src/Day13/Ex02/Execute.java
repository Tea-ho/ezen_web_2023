package Day13.Ex02;

public class Execute {
	public static void main(String[] args) {
		
		// 구현 객체 생성
		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		sc.search("youtube");
		
		
	}
}
