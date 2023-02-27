package Day19.Ex02; 

public class Execute {
	public static void main(String[] args) {
		// ------------------------------------------ 멀티 스레드(Multi Thread) 예제3
		
		Runnable runnable = new Sound();
		Thread thread3 = new Thread(runnable);
				
		thread3.start();
				
		for( int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch(Exception e){System.out.println("예외 발생:" + e);}		
		}
	}
}
