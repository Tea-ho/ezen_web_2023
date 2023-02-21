package Day15.Ex04;

public class SystemClass {
	public static void main(String[] args) {
		
		System.out.println("출력");
		System.out.println("에러");
		
		int value = 100;
		// int value2 = "100";
		// 오류 내용: Type mismatch: cannot convert from String to int
		
		int value3 = Integer.parseInt("100");
		
		try {
			int value4 = Integer.parseInt("1xx");
		}
		catch(Exception e) {
			System.out.println("예외 발생: " + e);
		}
		
	}
}
