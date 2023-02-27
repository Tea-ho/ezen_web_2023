package Day19.Ex03;

public class Execute {
	public static void main(String[] args) {
		
		// 1. Thread 자식 클래스로 멀티스레드 구현
		A a = new A();
		a.start();
		
		// 2. Thread 자식 클래스의 익명 객체로 멀티스레드 구현
		Thread thread = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("-상속 익명객체 스레드 실행중: " + Thread.currentThread());
					try { Thread.sleep(1000); }
					catch(Exception e) { System.out.println("예외 발생: " + e); }
				}
			}
		};
		thread.start();
		
		// 3. Thread 인터페이스 구현객체로 멀티스레드 구현
		Runnable runnable = new B();
		Thread thread2 = new Thread(runnable);
		thread2.start();		
		
		// 4. Thread 인터페이스의 익명 객체로 멀티스레드 구현
		Runnable runnalbe2 = new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println("-인터페이스 익명객체 스레드 실행중: " + Thread.currentThread());
					try { Thread.sleep(1000); }
					catch(Exception e) { System.out.println("예외 발생: " + e); }
				}
			}
		};
		Thread thread3 = new Thread(runnalbe2);
		thread3.start();
		
		
		// 5. main 스레드 실행
		while(true) {
			System.out.println("-main 스레드 실행중: " + Thread.currentThread());
			try { Thread.sleep(1000); }
			catch(Exception e) { System.out.println("예외 발생: " + e); }
		}
	}
}
