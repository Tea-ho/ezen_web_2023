package Day15.Ex05;

public class StringBuilderMethod {
	public static void main(String[] args) {
		
		String data = "ABC";
			System.out.println(data);
			System.out.println( data.hashCode() );
			
		data += "DEF";
			System.out.println(data);
			System.out.println( data.hashCode() );
		// 해석: data 값이 변경된 것으로 보이지만, 새로운 참조를 할당 됨.
		

		

		String data2 = new StringBuilder()
				.append( "DEF" )
				.insert( 0, "ABC" )
				.delete( 3, 4)
				.toString();
		
		System.out.println( data2 );
		
		StringBuilder data3 = new StringBuilder();
			System.out.println( data3.hashCode() );
		data3.append("ABC");
			System.out.println( data3.hashCode() );
		data3.append("DEF");
			System.out.println( data3.hashCode() );
		//해석: 내부 버퍼에 문자열을 저장하고, 그 안에서 추가/수정/삭제 작업을 하기 때문에 새로운 주소가 생성되지 않음.	
		
	}
}
