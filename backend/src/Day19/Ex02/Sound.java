package Day19.Ex02; // 멀티 스레드(Multi Thread) 인터페이스 활용

import java.awt.Toolkit;

public class Sound implements Runnable {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 소리 코드
		for( int i = 0; i < 5; i++ ) {
			toolkit.beep();
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}
		}
	}
}
