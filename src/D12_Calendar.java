import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D12_Calendar {

	/*
	 #java.util.Calendar
	 
	 - 달력을 구현한 클래스
	 - 날짜 및 시간을 손쉽게 계산할 수 있는 기능들이 많이 있다.
	 - 생성자를 사용할 수 없고 getInstance()라는 스태틱 메서드로 현재 시간의 인스턴스를 받아올 수 있다.
	 - 추상클래스 이기 떄문에 생성자를 사용할 수 없다.
	 날짜는 모두 같지만, 캘린더는 나라마다 바꾸어 쓸 수 있기 때문
	 
	*/
	
	public static void main(String[] args) {
		
		//Calendar now = new Calendar();
		// Cannot instantiate the type Calendar 
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		// java.util.GregorianCalendar[time=1697692203221,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=292,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=3,MILLISECOND=221,ZONE_OFFSET=32400000,DST_OFFSET=0]

		// get(fieldNumber) : 해당 캘린더 인스턴스로부터 원하는 항목의 값을 가져온다
		
		// 필드에 해당하는 번호는 캘린더 클래스의 상수로 지정되어 있다
		
		System.out.println(now.get(Calendar.YEAR)); //2023		
		System.out.println(now.get(Calendar.HOUR)); //2
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); //14
		System.out.println(now.get(Calendar.MILLISECOND)); // 312
		
		//MONTH는 1감소된 값으로 나오므로 주의해야한다
		System.out.println(now.get(Calendar.MONTH)); //9
		//MONTH 상수가 1씩 감소되어 있다 (1월이 0)
		System.out.println(Calendar.JANUARY); // 0
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 5
		
		// 요일 관련 상수들 (일요일 1 ~ 토요일 7)
		System.out.println(Calendar.SUNDAY); // 1
		System.out.println(Calendar.SATURDAY); // 7
		System.out.println(Calendar.MONDAY); // 2
				
		// cal.getTime() : Calendar 에서 Date 타입 인스턴스 꺼내서 사용
		Date date = now.getTime();
		System.out.println(date); // Thu Oct 19 14:20:37 KST 2023
		
		// cal.set(fieldNumber, value) : 캘린더 인스턴스 시간 변경하기
		now.set(Calendar.HOUR, 5);
		System.out.println(now.getTime()); // Thu Oct 19 17:22:51 KST 2023
		
		// cal.add(fieldNumber, value) : 캘린더 인스턴스 시간을 추가하기
		// add로 변경해주면 요일 달 모두 동기화 되어 바뀐다.
		now.add(Calendar.HOUR, 3);
		System.out.println(now.getTime()); // Thu Oct 19 20:23:44 KST 2023
		
		now.add(Calendar.HOUR, 300);
		System.out.println(now.getTime()); // Wed Nov 01 08:25:14 KST 2023
		
		// 현재시간으로 변경
		now = Calendar.getInstance();
		// 캘린더의 필드들 (모든것을 볼 수는 없고 그때그때 필요한건 찾아 쓰기)
		System.out.println("년: " + now.get(Calendar.YEAR));
		System.out.println("월: " + (now.get(Calendar.MONTH)+1));
		System.out.println("일: " + now.get(Calendar.DATE));
		System.out.println("이번달의 며칠인가: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("이번달의 몇 번째 요일인가: " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("이번년의 며칠인가: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("이번주의 며칠인가(요일): " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("이번달의 몇 주인가: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("오전/오후: " + now.get(Calendar.AM_PM)); // 오전 0, 오후 1반환
		System.out.println("시: " + now.get(Calendar.HOUR));
		System.out.println("시(24시): " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: " + now.get(Calendar.MINUTE));
		System.out.println("초: " + now.get(Calendar.SECOND));
		System.out.println("밀리초: " + now.get(Calendar.MILLISECOND));
		
		
		// 다른나라 시간 뽑아보기위해 어떤 id를 가지고 있는지 보기
		for(String id : TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}
		String targetTimeZoneID = "America/New_York";
		Calendar targetCalendar = Calendar.getInstance(TimeZone.getTimeZone(targetTimeZoneID));

		// 특정 국가 또는 도시의 현재 시간 출력
        System.out.println("현재 시간 (" + targetTimeZoneID + "): " + targetCalendar.getTime());
        //현재 시간 (America/New_York): Thu Oct 19 15:19:06 KST 2023

        System.out.println(targetCalendar.get(Calendar.DATE)); // 19
		
	}
	
	
	
	
	
	
	
}
