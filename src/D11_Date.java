import java.util.Date;

public class D11_Date {
	/*
		#Date
		# java.util.date
		- 시간 및 날짜 정보를 저장할 수 있는 클래스
		- 오래된 클래스 이기 떄문에 데이터를 보관하는 용도로만 사용하고 메서드는 잘 사용하지 않는다.
		
	*/

	public static void main(String[] args) {
		
		// 새 인스턴스를 생성하면 현재 시간이 인스턴스로 저장된다.
		Date now = new Date();
		System.out.println(now);
		
		
		//long타입으로 Unix타임을 넣어서 시간을 생성할 수도 있다.
		Date time1 = new Date(10L); // Thu Jan 01 09:00:00 KST 1970
		//10L = 0.01초? 정도 지난 시점
		Date time2 = new Date(1000000000L); // Mon Jan 12 22:46:40 KST 1970
		
		System.out.println(time1);
		System.out.println(time2);
		
		/*
		 # System.currentTimeMillis()
		 - 시스템으로부터 현재 유닉스타임을 받아오는 메서드
		 - Unix Time - 1970년 1월 1일 00:00:00 GMT 이후로 경과한 시간을 밀리초(milliseconds) 단위로 반환
		
		*/
		System.out.println(System.currentTimeMillis());
		// System 은 os에 접근하는 객체
		// 1697691616897 => 1697691623611 시간이 지날 때마다 숫자가 바뀐다.
		
		// date1.after(date2) : date1이 date2 보다 뒤의 시간인지 검사한다
		// date1.before(date2) : date1이 date2 보다 전의 시간인지 검사한다
		System.out.println("time1이 time보다 더 뒤 인가요? >> " + time1.after(time2));
		//time1이 time보다 더 뒤 인가요? >> false
		System.out.println("time1이 time보다 더 전 인가요? >> " + time1.before(time2));
		//time1이 time보다 더 전 인가요? >> true
		
	}
}
