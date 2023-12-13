package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D13_EventDay {
	
	/*
		실행하면 오늘로부터 앞으로 1년간의 모든 이벤트 날짜를 출력하는 프로그램
		
		1+1 이벤트 : 매월 18일
		20% 할인 이벤트 : 홀수번째 금요일에
		
		※ 이벤트 날짜가 겹치는 날에는 둘 모두 적용됨을 알려줘야한다.
		
	*/


	public static void main(String[] args) {
		
		// 현재 날짜 
		Calendar currentDate = Calendar.getInstance();
		// 1년을 더한 날짜 
		// 여기서 1년을 더한걸 같은 코드로 사용해서 내년 10월 이후로만 출력이 된 것 같다!!
		currentDate.add(Calendar.YEAR, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE");
		
		// Calendar now = Calendar.getInstance();
		// get(fieldNumber) : 해당 캘린더 인스턴스로부터 원하는 항목의 값을 가져온다
		// 2024년 오늘날짜 될때까지 while문 돌리면서  매월18일과 홀수번째 금요일을 찾는다
		while(currentDate.get(Calendar.YEAR) == 2024) {
			if(currentDate.get(Calendar.DAY_OF_MONTH) == 18){
				String result = sdf.format(currentDate.getTime());
				// cal.getTime() : Calendar 에서 Date 타입 인스턴스 꺼내서 사용
				System.out.println("1+1 이벤트 하는날~ "+ result);
			}
			if(currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
					&& currentDate.get(Calendar.DAY_OF_MONTH) % 2 == 1) {
				String result = sdf.format(currentDate.getTime());
				System.out.println("20% 할인하는날~" + result);
			}
			// 한 번하고 또 돌지를 않는거 같다.. 그래서 출력이 안되는듯????
			currentDate.add(Calendar.DATE, 1);		
		}
	}
}
