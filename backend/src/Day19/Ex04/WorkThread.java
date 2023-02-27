package Day19.Ex04;

public class WorkThread extends Thread {
	
	public boolean work = true;
	
	public WorkThread( String name ) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) { System.out.println( getName() + ": 작업처리"); }
			else { Thread.yield(); }
			// 해석: yield() 메소드를 이용하여 작업순서를 양보함으로써 스레드 실행 순서를 제어할 수 있다.
		}
	}

}
