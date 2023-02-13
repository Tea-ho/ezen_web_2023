package Day09.Ex07; 

public class Execute {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("123456-1234567", "전요셉");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// k1.nation = "미국";
		// 해석: final 필드로 변경 불가!
		
	}
}
