package Day17.Ex02;

import java.util.Calendar;
import java.util.Scanner;

public class MakingCalendar {
	public static void main(String[] args) {
	// static 멤버는 인스턴스 멤버 호출 불가
	// 1) 호출하고자 하는 멤버(메소드/필드)가 static 멤버인 경우, 직접 호출 가능
		run2();
	// 2) 호출하고자 하는 멤버(메소드/필드)가 인스턴스 멤버인 경우, 객체를 만들어서 메소드 호출
		MakingCalendar madeCal = new MakingCalendar();
		madeCal.run();
	}
	
	void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 현재 날짜
		Calendar cal = Calendar.getInstance();
		// 2. 현재 연도
		int year = cal.get(Calendar.YEAR);
		// 3. 현재 월
		int month = cal.get(Calendar.MONTH)+1;
		// 4. 현재 일
		int day =  cal.get(Calendar.DAY_OF_MONTH);
		
		while(true) {
			System.out.printf("====================== %d 년 %d월 ======================\n", year, month);
			System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");
			
			// 현재 월의 1일 날짜 요일 확인
			cal.set(year, month-1, 1);
			int sweek = cal.get(Calendar.DAY_OF_WEEK);
			// System.out.println(sweek);
			
			// 현재 월의 마지막 일 확인
			int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			for( int i = 1; i < sweek; i++) { System.out.print("\t"); }
		
			for(int i = 1; i <= eday; i++) {
				System.out.printf("%2d\t", i);
				if( sweek % 7 == 0 ) { System.out.println(); }
				sweek++;
			}
			
			System.out.println();
			System.out.println("=======================================================");
			System.out.print("1.이전달 2.다음달 3.검색: "); int ch = scanner.nextInt();
			if( ch == 1) {
				month--;
				if( month < 1 ) {	month = 12; year--; }
			}
			if( ch == 2) {
				month++;
				if( month > 12 ) {	month = 1; year++; }
			}
			if( ch == 3) {
				System.out.println("연도: ");	int inputY = scanner.nextInt();
				System.out.println("월: "); int inputM = scanner.nextInt();
				if( inputY >= 1900 && inputY <=9999 && inputM >=1 && inputM <=12) {
					year = inputY; month = inputM;
				}
				else {
					System.out.println("[알림] 출력할 수 없는 달력입니다.");
				}
			}
		}
	}
	
	static void run2() {
		
	}
	
}
