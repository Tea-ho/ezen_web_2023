package Day03; // for 문 중첩 (구구단)

public class Ex02_MultiplicationTableExample { // c S
	public static void main(String[] args) { // m S
		
		for( int m = 2; m <= 9; m++) { // for1 S
			System.out.println("*** " + m + "단 ***");
			for( int n = 1; n <= 9; n++) { // for2 S
				System.out.println(m + " X " + n + " = " + (m*n));
			} // for2 E
		} // for1 E
		
	} // m E
} // c E
