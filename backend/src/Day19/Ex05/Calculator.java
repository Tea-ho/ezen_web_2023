package Day19.Ex05;

public class Calculator {
	private int memory;
	public int getMemory() {return memory;}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try { Thread.sleep(1000); }
		catch(Exception e) { System.out.println("예외발생: " + e);}
		
		System.out.println( Thread.currentThread().getName() + ":" + this.memory );
	}
}
