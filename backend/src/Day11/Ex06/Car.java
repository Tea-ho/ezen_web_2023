package Day11.Ex06;

public class Car {
	
	public Tire tire;
	
	public void run() {
		tire.roll();
	}
	
	public Tire parking( Tire tire ) {
		tire.stop();
		return tire;
	}

	@Override
	public String toString() {
		return "Car [tire=" + tire + "]";
	}

}
