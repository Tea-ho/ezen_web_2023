package Day13.Ex01;

public class Audio implements RemoteControl {
	
	private int volume;private int memoryVolume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("최대 볼륨보다 커질 수 없습니다.");
		}
		else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("최소 볼륨보다 커질 수 없습니다.");
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
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
