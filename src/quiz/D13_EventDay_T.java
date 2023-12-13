package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_EventDay_T {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar target = Calendar.getInstance();
		
		target.add(Calendar.YEAR, 1);
		
		SimpleDateFormat eventDayFormat = new SimpleDateFormat("yyyy-MM-dd (EEEE)");
				
		while(today.before(target)) { 
			int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
			int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
			int dayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			
			if(dayOfMonth == 18 && dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[%s]\n",eventDayFormat.format(today.getTime()));
				System.out.println("[Notice] 1+1 이벤트, 20%할인 이벤트 모두 하는날~");
			} else if(dayOfMonth == 18) {
				System.out.printf("[%s]\n",eventDayFormat.format(today.getTime()));
				System.out.println("[Notice] 1+1 이벤트 하는날~");
			} else if(dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[%s]\n",eventDayFormat.format(today.getTime()));
				System.out.println("[Notice] 20% 할인 이벤트 하는날~");
			}
			
			
			today.add(Calendar.DATE,1); // 날짜 하루씩 변한다
		}

	}
}
