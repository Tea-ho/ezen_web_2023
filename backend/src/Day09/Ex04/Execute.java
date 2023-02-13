package Day09.Ex04;

public class Execute {
	public static void main(String[] args) {
		Calculator mycal = new Calculator();
		
		double result1 = mycal.areaRectangle(10);
		double result2 = mycal.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
