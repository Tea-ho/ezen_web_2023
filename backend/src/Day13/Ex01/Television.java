package Day13.Ex01;

public class Television implements RemoteControl {
// implements(구현) 키워드를 이용하여, 구현하고자하 나는 인터페이스를 선언한다.
// 인터페이스는 상속과 달리, 클래스를 확정시켜 다양하게 이용하는데 중점을 둔다.
	private int volume;
	private int memoryVolume;
	
	// 인터페이스 추상메소드 구현
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	// 해석1: 인터페이스 추상메소드를 구체적으로 구현하는 메소드이다.
	// 해석2: 인터페이스에서 해당 메소드의 접근지시자가 public abstract이므로, 자식 클래스에서는 반드시 제어자를 public으로 설정해야 한다.
	
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if( volume>RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("최대 볼륨보다 커질 수 없습니다.");
		}
		else if( volume<RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("최소 볼륨보다 커질 수 없습니다.");
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	@Override
	public void setMute( boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else { 
			System.out.println("무음 해제합니다.");
			setVolume( this.memoryVolume );
		}
	}
	
	
	
}
