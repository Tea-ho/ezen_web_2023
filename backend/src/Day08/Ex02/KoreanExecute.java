package Day08.Ex02;

public class KoreanExecute {
	public static void main(String[] args) {
		
		// 객체 생성
		KoreanBlueprint k1 = new KoreanBlueprint();
		System.out.println(k1.toString());
		// 목적: 객체 정보 확인
		
		// 객체 호출
		System.out.println( k1.nation );
		System.out.println( k1.name );
		System.out.println( k1.ssn );
		
		KoreanBlueprint k2 = new KoreanBlueprint("김태호", "921005-1000000");
		System.out.println(k2.toString());
		// 목적: 객체 정보 확인
		
		// 객체 호출
		System.out.println( k2.nation );
		System.out.println( k2.name );
		System.out.println( k2.ssn );
		
	}
}
