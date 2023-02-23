package Day17.Ex01;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
		
		LocalDateTime 시작일 = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
		LocalDateTime 종료일 = LocalDateTime.of(2023, 12, 31, 0, 0, 0);
		
		System.out.println( "시작일이 종료일 이전?" + 시작일.isBefore(종료일) );
		System.out.println( "시작일이 종료일 이후?" + 시작일.isAfter(종료일) );
		System.out.println( "시작일과 종료일 동일?" + 시작일.isEqual(종료일) );
		
		System.out.println( "연도 차이: " + (시작일.until(종료일, ChronoUnit.YEARS)));
		System.out.println( "월수 차이: " + (시작일.until(종료일, ChronoUnit.MONTHS)));
		System.out.println( "일수 차이: " + (시작일.until(종료일, ChronoUnit.DAYS)));
		System.out.println( "시간 차이: " + (시작일.until(종료일, ChronoUnit.HOURS)));
		System.out.println( "분 차이: " + (시작일.until(종료일, ChronoUnit.MINUTES)));
		System.out.println( "초 차이: " + (시작일.until(종료일, ChronoUnit.SECONDS)));
		
		double num = 1234567.89;
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,##0원");
		System.out.println(df.format(num));
		
		// SimpleDateFormat( 패턴 )
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date));
		
		sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sdf2.format(date));
		
		sdf2 = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
		System.out.println(sdf2.format(date));
		
		sdf2 = new SimpleDateFormat("오늘은 E 요일");
		System.out.println(sdf2.format(date));
		
		sdf2 = new SimpleDateFormat("오늘은 D번째 날");
		System.out.println(sdf2.format(date));
		
		sdf2 = new SimpleDateFormat("오늘은 d번째 날");
		System.out.println(sdf2.format(date));
	}
}
