import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D14_Time {
	/*
		#java.time 패키지
		
		- Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스들을 모아놓은 패키지
		- Calendar는 원본 인스턴스를 수정하여 사용하는 방식
		  Time 패키지의 클래스들은 새로운 인스턴스를 반환하는 방식
		  
		# java.time.LocalDate
		- 날짜만 다루는 클래스
		
		# java.time.LocalTime
		- 시간만 다루는 클래스
		
		# java.time.LocalDateTime
		- 날짜와 시간을 모두 다루는 클래스
	*/

	public static void main(String[] args) {
		
		//now() : 현재 시간으로 인스턴스를 생성한다
		LocalDate now = LocalDate.now();
		LocalDate nowAmericaNY = LocalDate.now(ZoneId.of("America/New_York"));		
		
		System.out.println("nowDate : " + now);
		//nowDate : 2023-10-20
		System.out.println("now New_York Date : " + nowAmericaNY);
		//now New_York Date : 2023-10-19
		
		LocalTime thisTime = LocalTime.now();
		LocalTime nyTime = LocalTime.now(ZoneId.of("America/New_York"));
				
		System.out.println("thisTime : "+thisTime);
		//thisTime : 09:49:24.432837900
		System.out.println("New_York Time : "+ nyTime);
		//New_York Time : 20:49:24.432837900
		
		LocalDateTime thisDateTime = LocalDateTime.now();
		LocalDateTime nyDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println("this Date Time : "+thisDateTime);
		//this Date Time : 2023-10-20T09:49:24.432837900
		System.out.println("New_York Date Time : "+ nyDateTime);
		// New_York Date Time : 2023-10-19T20:49:24.432837900 >>  .432837900  마이크로세컨드 sksh세컨드보다 더 정밀하게 나와있다 
		
		
		// of() : 원하는 시점의 인스턴스를 생성해준다. 캘린더에 없었던 기능
		LocalDate childrensDay = LocalDate.of(2002, 5, 5); // LocalDate.of((년,월,일) of F3 눌러보면 더 다양한 기능확인가넝~
		LocalTime myTime = LocalTime.of(9, 53, 30); // LocalTimeof(시, 분, 초)
		
		System.out.println(childrensDay); // 2002-05-05
		System.out.println(myTime); // 09:53:30
		
		LocalDateTime myDateTime = LocalDateTime.of(childrensDay, myTime); // 만든걸 합치는것도 가능하다
		LocalDateTime myDateTime2 = LocalDateTime.of(2010, 10, 10, 11, 50, 35, 9532414); // 처음부터 다 정하는 것도 가능하다
		
		System.out.println("만들어놓은 LocalDate+Time : " + myDateTime); 
		//만들어놓은 LocalDate+Time : 2002-05-05T09:53:30
		System.out.println("처음부터 만든 : " + myDateTime2);
		//처음부터 만든 : 2010-10-10T11:50:35.009532414
		
		
		// plus() : 오버로딩이 많아서 F3눌러보기, 해당 시간 인스턴스에 원하는 만큼을 더한 새 인스턴스를 반환한다
		// plusXXX()
		// minusXXX() :: 해당 시간 인스턴스에 원하는 만큼을 뺀 새 인스턴스를 반환한다
		
		// java.time 패키지 클래스들의 시간단위는 ChronoUnit에 상수로 정의되어 있다.
		LocalDate after3Months = childrensDay.plus(3, ChronoUnit.MONTHS);
		LocalDate after10Days = childrensDay.plusDays(10);
		
		System.out.println(childrensDay); // 2002-05-05
		System.out.println(after3Months); // 2002-08-05
		System.out.println(after10Days); // 2002-05-15
		
		LocalTime after8Hours = nyTime.plus(8, ChronoUnit.HOURS);
		System.out.println(after8Hours); // 05:15:15.339558400
		
		// getXX() :원하는 필드값을 꺼낼 수 있다.
		// 선택할 수 있는 모든 종류의 필드들은 ChronoField 클래스에 정의되어 있다.
//		after8Hours.getHour();
//		after8Hours.getMinute();
//		after8Hours.getLong(null); 나노세컨드까지 꺼낼 수 있기 때문에 Long타입으로 꺼내는 것 같다
//		after8Hours.getNano();
//		after8Hours.getSecond();
		
		// .MINUTE_OF_DAY : 오늘 시간 전체를 밀리세컨드로 변환한것
		System.out.println(after8Hours.getLong(ChronoField.MINUTE_OF_DAY)); // 315
		// .MILLI_OF_SECOND : 지금 밀리 세컨드를 반환
		System.out.println(after8Hours.get(ChronoField.MILLI_OF_SECOND)); // 339
		
		// DayOfWeek 요일다루기 - ChronoField중 하나
		DayOfWeek dow = now.getDayOfWeek();
		
		// 요일을 Calendar처럼 int로 다루는게 아니라 클래스로 다루는 이유
		System.out.println(dow); // FRIDAY
		
		// 요일의 이름은 언어별로 다르고(Locale) 길이도 다양하다 (TextStyle)
		// 요일 하나를 가지고 클래스화 해놓으니 굉장히 객체지향적으로 꺼낼 수 있다.
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH)); // Friday
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH)); // Fri
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN)); // 금

		// Month 클래스로 월다루기
		Month month = now.getMonth();
		
		System.out.println(month.getDisplayName(TextStyle.FULL, Locale.ENGLISH)); // October
		System.out.println(month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH)); // Oct

		// with() : 원하는 동작(ex> 이번달의 마지막날짜)으로 시간을 조정한 후 새 인스턴스 반환
		System.out.println(now); // 2023-10-20
		// 해당 필드의 값을 조정하기
		System.out.println(now.with(ChronoField.DAY_OF_MONTH, 3)); // 2023-10-03
		// 미리 정의되어 있는 동작 사용하기 (TemporalAdjuster) 인터페이스라고 보면 될거 같다~
		
		// TemporalAdjuster는 TemporalAdjusters에 모두 상수로 정의되어 있다. TemporalAdjusters.하고 보면 됨
		// 이번달의 마지막 날짜로 조정해주는 adjuster를 전달하여 날짜를 조정한다
		TemporalAdjuster adjuster = TemporalAdjusters.lastDayOfMonth();
		System.out.println(now.with(adjuster)); // 2023-10-31
		//다음달 첫 날로 전달하여 조정
		TemporalAdjuster adjuster2 = TemporalAdjusters.firstDayOfNextMonth();
		System.out.println(now.with(adjuster2)); // 2023-11-01
		
		// 미리 만들어져있는 매서드들이 있다.
		System.out.println(now.withYear(2012)); // 2012-10-20
		System.out.println(now.withMonth(8)); // 2023-08-20
		System.out.println(now.withDayOfMonth(17)); // 2023-10-17
		System.out.println(now.withDayOfYear(200)); // 2023-07-19
	}

}
