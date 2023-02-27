package Day19.Ex05;

public class User1 extends Thread {

	private Calculator calculator;
	public User1() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
