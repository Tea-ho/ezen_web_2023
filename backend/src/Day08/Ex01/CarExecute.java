package Day08.Ex01;

public class CarExecute {
	public static void main(String[] args) {
		
		CarBlueprint teoCar1 = new CarBlueprint();
		teoCar1.model = "그랜저"; teoCar1.color = "노랑";
		System.out.println( teoCar1.toString() );
		
		CarBlueprint teoCar2 = new CarBlueprint("K5", "White", 250);
		System.out.println( teoCar2.toString() );
		
		CarBlueprint teoCar3 = new CarBlueprint("K5", "White");
		System.out.println( teoCar3.toString() );
	}
}
