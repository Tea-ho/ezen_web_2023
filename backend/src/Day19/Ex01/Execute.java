package Day19.Ex01; 

import java.awt.Toolkit;

public class Execute { // class S
	public static void main(String[] args) { // main S
		
		// ------------------------------------------ 단일 스레드(Single Thread)
		// 소리 코드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0; i < 5; i++ ) {
			toolkit.beep();
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}
		}
		
		// 출력 코드
		for( int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}		
		}
		// 해석: 소리 코드 발생 이후에 출력 코드가 실행됨
		
		// ------------------------------------------ 멀티 스레드(Multi Thread) 예제1
		Thread thread = new Thread( new Runnable() {
			
			@Override // run 메소드 오버라이딩
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				// 소리 코드
				for( int i = 0; i < 5; i++ ) {
					toolkit.beep();
					try { Thread.sleep(500); } 
					catch(Exception e){System.out.println("예외 발생:" + e);}
				}
			}
		});
		
		thread.start();
		
		// 출력 코드
		for( int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}		
		}
		// 해석: 멀티스레드를 이용하면, 소리 코드와 출력 코드가 동시 실행됨
		
		// ------------------------------------------ 멀티 스레드(Multi Thread) 예제2
		
		Thread thread2 = new Sound();
		thread.start();
		
		for( int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}		
		}

	} // main E
} // class E
