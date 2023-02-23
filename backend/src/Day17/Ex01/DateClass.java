package Day17.Ex01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateClass {
	public static void main(String[] args) {
		
		// Date 클래스
		Date now = new Date();
		System.out.println(now);
		
		// SimpleDateFormat 클래스
		SimpleDateFormat sdf = 
				new SimpleDateFormat(" y M d H:m:s");
		// SimpleDateFormat 클래스 특징
		// y: 연도, M: 월, d: 일, H: 시, m: 분, s: ch
		
		SimpleDateFormat asd = 
				new SimpleDateFormat(" yyyy.MM.dd, HH:mm:ss");
		
		
		System.out.println(sdf.format(now));
		System.out.println(asd.format(now));
		
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get( Calendar.YEAR ));
		System.out.println(cal.get( Calendar.MONTH )+1);
		System.out.println(cal.get( Calendar.DATE ));
		
		System.out.println( cal.get( Calendar.YEAR ) + "년" + (cal.get( Calendar.MONTH )+1) + "월" + cal.get( Calendar.DATE ) + "일"  );
		
		// 요일 확인 방법
		int week = cal.get( Calendar.DAY_OF_WEEK );
		System.out.println(week);
		if( week == Calendar.SUNDAY) { System.out.println("일요일");}
		if( week == Calendar.MONDAY) { System.out.println("월요일");}
		if( week == 3) { System.out.println("화요일");}
		if( week == 4) { System.out.println("수요일");}
		if( week == Calendar.THURSDAY) { System.out.println("목요일");}
		if( week == Calendar.FRIDAY) { System.out.println("금요일");}
		if( week == 6) { System.out.println("토요일");}
		
		// 오전,오후 확인 방법
		System.out.println("현재 오전/오후:" + ((cal.get(Calendar.AM_PM)==0)?"오전":"오후") );
		
		// 분 초 시 확인 방법
		System.out.println("현재 시: " + cal.get(Calendar.HOUR));
		System.out.println("현재 분: " + cal.get(Calendar.MINUTE));
		System.out.println("현재 초: " + cal.get(Calendar.SECOND));
		
		// 각 국의 표준시 ID코드 확인 방법
		for( String timeId : TimeZone.getAvailableIDs() ) {
			System.out.println(timeId);
		}
		
		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd a HH:mm:ss");
		System.out.println(dtf.format(dateTime));
		
		System.out.println("1년 후: " + dateTime.plusYears(1));
		System.out.println("2개월 전: " + dateTime.minusMinutes(2));
		System.out.println("7일 후: " + dateTime.plusDays(7));
		
		
	}
}
