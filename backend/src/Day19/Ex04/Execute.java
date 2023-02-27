package Day19.Ex04;

import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Execute {
	public static void main(String[] args) {
		
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {System.out.println("예외 발생: " + e);}
		}
		
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			System.out.println( sdf.format(date));
			try { Thread.sleep(1000);}
			catch (Exception e) {
				System.out.println("예외 발생: " + e);
			}
		}
		*/
		
		/*
		SumThread sumThread = new SumThread();
		sumThread.start();
		try { sumThread.join(); }
		catch(Exception e) { System.out.println("예외발생: " + e ); }
		System.out.println( sumThread.getsum() );
		// 해석1: join() 메소드를 사용하지 않으면, 결과값이 0으로 출력됨.
		// 해석2: join() 메소드를 이용하여 스레드 실행 제어 가능함.
		*/
		
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(5000); } catch(Exception e) { System.out.println("예외발생: " + e);}
		workThreadA.work = false;
		
		try { Thread.sleep(5000); } catch(Exception e) { System.out.println("예외발생: " + e);}
		workThreadA.work = true;
		
	}
}
