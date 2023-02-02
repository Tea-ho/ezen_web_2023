package 과제.과제01_연산자문제;

import java.util.Scanner;

public class 과제01 { // c S
	public static void main(String[] args) { // m S
		
		Scanner scanner = new Scanner( System.in );
		// 문제1
		System.out.println("|￦_/|");
		System.out.println("|q p|  /}");
		System.out.println("( O )\"\"\"￦");
		System.out.println("|\"^\"`   |");
		System.out.println("||_/=￦￦__|");
		
		// 문제2
		System.out.println("순번:"); int no = scanner.nextInt();
		System.out.println("작성자:"  ); String name = scanner.next();
		scanner.nextLine();	
		System.out.println("내용:" ); String content = scanner.nextLine();
		System.out.println("날짜:" ); String day = scanner.next();
		
		System.out.println("-----------방명록-----------");
		System.out.printf("%3s | %6s | %15s | %6s |", "번호", "작성자", "내용", "날짜" );
		System.out.println();
		System.out.printf("%3d | %6s | %15s | %6s |", no, name, content, day );

		// 문제3
		int basePay = 2000000;
		int extraPay = 300000;
		int realPay = (int)((basePay + extraPay) - (basePay * 0.1));
		System.out.println(realPay);
		
		// 문제4
		int cPay = 356789;
		System.out.println("십만원: " + cPay/100000);
		System.out.println("만원: " + cPay/10000%10);
		System.out.println("천원: " + cPay/1000%10);
		System.out.println("백원: " + cPay/100%10);
		System.out.println("십원: " + cPay/10%10);
		
		// 문제5~8
		System.out.println("홀짝 및 7배수 판단 숫자 입력:"); int no2 = scanner.nextInt();
		String result1 = no2 % 7 == 0 ? "7배수 O" : "7배수 X";
		String result2 = no2 % 2 == 1 ? "홀수 O" : "홀수 X";
		String result3 = no2 % 7 == 0 && no2 % 2 == 0? "7배수+짝수 O" : "7배수+짝수 X";
		String result4 = no2 % 7 == 0 || no2 % 2 == 1? "7배수 혹은 홀수 O" : "7배수 혹은 홀수 X";
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		// 문제9
		System.out.println("첫번째 정수 입력:"); int no3 = scanner.nextInt();
		System.out.println("두번째 정수 입력:");  int no4 = scanner.nextInt();
		int result5 = no3 >= no4 ? no3 : no4;
		System.out.println( result5 );
		
		// 문제10
		System.out.println("반지름 입력:"); double no5 = scanner.nextInt();
		double area1 =  no5 * no5 * 3.14;
		System.out.println( area1 );

		
		// 문제11
		System.out.println("첫번째 정수 입력: "); int no6 = scanner.nextInt();
		System.out.println("두번째 정수 입력: "); int no7 = scanner.nextInt();
		double percent = (no6*100)/no7;
		System.out.println("결과: " + percent + "%");

		// 문제12
		System.out.println("밑변 입력: "); int row = scanner.nextInt();
		System.out.println("높이 입력: "); int he = scanner.nextInt();
		double area2 = (row * he)/2;
		System.out.println( area2 );
		
		// 문제13~14
		System.out.println("키 입력: "); int height = scanner.nextInt();
		System.out.println("몸무게 입력: "); int weight = scanner.nextInt();
		double 표준체중 = (height-100)*0.9;
		double BMI = weight / ((height/100) * (height/100));
		System.out.println("표준체중: " + 표준체중);
		System.out.println("BMI: " + BMI);
		
		// 문제15
		System.out.println("inch 입력: "); double 길이 = scanner.nextDouble();
		double 길이변환 = 길이*2.54;
		System.out.println("입력값: " + 길이 +"inch");
		System.out.println("변환값: " + 길이변환 +"cm");
		
		// 문제16
		System.out.println("중간고사 점수: "); int 중간고사 = scanner.nextInt();
		System.out.println("기말고사 점수: "); int 기말고사 = scanner.nextInt();
		System.out.println("수행평가 점수: "); int 수행평가 = scanner.nextInt();
		double 점수합산 = (중간고사*0.3)+(기말고사*0.3)+(수행평가*0.4);
		System.out.printf("합산점수: %5.2f",점수합산);
		System.out.println();
		
		// 문제17
		// 예측값 x:8  y: 23
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
		System.out.println();
		
		// 문제18
		System.out.println("나이 입력: "); int age = scanner.nextInt();
		String 연령대 = age >= 10 && age <20 ? "학생" : age >=20 && age <40 ? "성인" : age >= 40 ? "중년" : "기타";
		System.out.println(연령대);
		
		// 문제19
		System.out.println("국어 점수: "); int 국어 = scanner.nextInt();
		System.out.println("영어 점수: "); int 영어 = scanner.nextInt();
		System.out.println("수학 점수: "); int 수학 = scanner.nextInt();
		int sum = 국어 + 영어 + 수학;
		double ave = sum/3;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ave);
		System.out.println();
		
		// 문제20
		System.out.println("id:"); 	String id = scanner.next();
		System.out.println("pw:"); 	String pw = scanner.next();
		String 적부판단 = id.equals("admin") && pw.equals("1234") ? "로그인 성공" : "로그인 실패";
		System.out.println(적부판단);
	
		// 문제21
		System.out.println("첫번째 정수 입력:"); int no8 = scanner.nextInt();
		System.out.println("두번째 정수 입력:"); int no9 = scanner.nextInt();
		System.out.println("세번째 정수 입력:"); int no10 = scanner.nextInt();
		int temp = no8;
		
		temp = no8 > no9 ? no8 : no9;
		temp = temp > no10 ? temp : no10;
		System.out.println("가장 큰 수:" + temp);
		
		// 문제22
		int player1 = scanner.nextInt();		
		int player2 = scanner.nextInt();
		
		if(player1 == 0) {
			if(player2 == 0) { System.out.println("무승부");}
			else if(player2 == 1) { System.out.println("player2 win"); }
			else if(player2 == 2){ System.out.println("player1 win");}
		}
		else if(player1 == 1 ) {
			if(player2 == 0) { System.out.println("player1 win");}
			else if(player2 == 1) { System.out.println("무승부"); }
			else if(player2 == 2){ System.out.println("player2 win");}
		}
		else if(player2 == 2) {
			if(player2 == 0) { System.out.println("player2 win");}
			else if(player2 == 1) { System.out.println("player1 win"); }
			else if(player2 == 2){ System.out.println("무승부");}
		}
		
	} // m E
} // c E
