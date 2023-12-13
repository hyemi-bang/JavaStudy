import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D13_SimpleDateFormat {
	/*
	#Simple Date Format
	#import java.text.SimpleDateFormat;
	- Date 타입 인스턴스를 서식을 사용해 문자열로 변환하여 출력할 수 있는 클래스
	- y : 년
	- M : 월
	- d : 일
	- h : 12시
	- H : 24시
	- m : 분
	- s : 초
	- S : 밀리초
	- E : 요일 (짧게 목)
	- EEEE : 요일 (길게 목요일)
	- a : 오전/오후
	- z : 타임존
	
	*/
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.SSS EEEE z");
		String result = sdf.format(new Date());
		System.out.println(result);
		// 2023-10-19 오후 03:08:56.226 목요일 KST
		
	
	}

}
