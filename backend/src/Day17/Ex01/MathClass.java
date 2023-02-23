package Day17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MathClass {
	public static void main(String[] args) {
		
		double v1 = Math.ceil(5.3);
		System.out.println(v1);
		// 출력값: 6.0
		
		double v2 = Math.floor(5.3);
		System.out.println(v2);
		// 출력값: 5.0
		
		long v3 = Math.max(3, 7);
		System.out.println(v3);
		// 출력값: 7
		
		long v4 = Math.min(3, 7);
		System.out.println(v4);
		// 출력값: 3
		
		double v5 = Math.round(5.357);
		System.out.println(v5);
		// 출력값: 5.0
		
		double v6 = 12.3456;
		double temp1 = v6 * 100;
		long temp2 = Math.round(temp1);
		double v7 = temp2/100.0;
		System.out.println(v7);
		System.out.println((Math.round(12.3456*100.0))/100.0);
		
		
		int[] selectNumber = new int[6];
		// int형 변수 6개를 저장할 수 있는 배열 (길이 6개 선언)
		ArrayList<Integer> selectNumber2 = new ArrayList<>(6);
		// int형 변수를 6개를 저장할 수 있는 ArrayList (길이 6개 선언)
		
		Random random1 = new Random();
		System.out.print("선택번호: ");
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random1.nextInt(45)+1;
			System.out.print( selectNumber[i] + ",");
		}
		System.out.println();
		
		// ArrayList는 기본적으로 10개를 저장 할 수 있는 저장소로 설정되어 있음.
		// 10개의 길이를 넘게 저장하게 될 경우, size 1개씩 추가되도록 API 설정되어 있음.
		
		int[] winningNumber = new int[6];
		Random random2 = new Random();
		System.out.print("선택번호: ");
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random2.nextInt(45)+1;
			System.out.print( winningNumber[i] + ",");
		}
		System.out.println();
		
		// 배열에 정렬
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {System.out.println("1등 O ");}
		else {	System.out.println("1등 당첨 X"); }
		
	}
}
