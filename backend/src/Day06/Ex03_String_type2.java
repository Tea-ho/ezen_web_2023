package Day06; // 문자열 심화: 파일로 생성하여 영구저장

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex03_String_type2 {
	public static void main(String[] args) throws Exception {
		
		// 입력 클래스: Scanner
		Scanner scanner = new Scanner( System.in );
		// 해석: 입력 객체 생성
		System.out.print("문자열 입력해주세요: ");
		
		String input = scanner.nextLine() + "\n";
		// 해석1: 입력받은 문자열을 변수에 저장
		// 해석2: \n 이용하여 밑에서 생성된 파일에서 데이터를 구분하기 위함
		
		System.out.println(input);
		
		// 파일 생성 클래스: FileOutputStream("파일경로", "이어쓰기 여부(true or false)"), 이어쓰기 여부 생략 시 자동 false 처리 
		FileOutputStream fout = new FileOutputStream("c:/java/test.txt" , true);
		fout.write( input.getBytes() );
		// 해석1: write함수를 이용하여 input으로 받은 데이터를 파일화 가능
		// 해석2: byte단위로 변환 why? 자바 외 키보드/파일/네트워크 등등 무조건 바이트 단위로 통신함.
		// 해석3: 보조기억장치를 이용하여 영구 저장화 가능
	}
}
