package Day19.Ex03;

public class B implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("-인터페이스 활용 스레드 실행중: " + Thread.currentThread());
			try { Thread.sleep(1000); }
			catch(Exception e) { System.out.println("예외 발생: " + e); }
		}
	}
}
