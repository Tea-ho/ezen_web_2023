package 과제.과제09_상속_인터페이스.인터페이스.컴퓨터;

public class LG implements 컴퓨터입출력장치{

	@Override
	public void connect() {
		System.out.println("LG 키보드 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("LG 키보드 해제");
	}

	
}
