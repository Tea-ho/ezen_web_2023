package Day08.Ex03;

public class CarExecute {
	public static void main(String[] args) {
		
		CarBlueprint car1 = new CarBlueprint();
		System.out.println( car1.toString());
		
		
		CarBlueprint car2 = new CarBlueprint("모닝");
		System.out.println( car2.toString());
		
		CarBlueprint car3 = new CarBlueprint("캐스퍼","카키");
		System.out.println( car3.toString());
		
		CarBlueprint car4 = new CarBlueprint("K5","흰색","250");
		System.out.println( car4.toString());
		
	}
}
