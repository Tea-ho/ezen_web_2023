package Day15.Ex01;

public class Execute {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
			System.out.println(obj1);
		Member obj2 = new Member("blue");
			System.out.println(obj2);
		Member obj3 = new Member("red");
			System.out.println(obj3);
		
			System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
	}
}
