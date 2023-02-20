package Day14; // 예외 던지기
// 메소드 내부에서 예외발생할 경우, 메소드 호출했던 곳으로 예외 넘기기
// 장점: 메소드마다 예외처리 할 경우, 코드가 길어지기 때문에 던지기 통해서 코드 간략화시킬 수 있음.
// 관련 키워드: throws

public class Ex03_예외던지기 {

	public static void findClass() throws Exception {
		Class.forName("java.lang.String2");
	}
	
	public static void main(String[] args) {
		try {
			findClass();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("확인");
	}
}
