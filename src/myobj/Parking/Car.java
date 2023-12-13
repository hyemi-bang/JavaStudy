package myobj.Parking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {

	String carNum;
	String carType;
	LocalDateTime entryTime;
	LocalDateTime exitTime;
	// local date들은 simple date 들을 사용하지 않는다
	// SimpleDateFormat >> #java.util.Date 타입전용이다
	// private static SimpleDateFormat parkingTimeFormat = new SimpleDateFormat ("MM-DD(e)/ HH:mm");
	
	// DateTimeFormatter - java.time 패키지 전용 포맷
	private static DateTimeFormatter parkingTimeFormat =
			DateTimeFormatter.ofPattern("MM-DD(E)/ HH:mm");
	
	
	//public을 뺄 경우 직접만들수 없고, Cars를 통해서 메인에서 직접 인스턴스를 만들라고 하는 것이다.
	Car(String carNum, String carType,
			LocalDateTime entryTime, LocalDateTime exitTime) {
		this.carNum = carNum;
		this.carType = carType;
		this.entryTime = entryTime;
		this.exitTime  = exitTime;
		
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%s/%s/%s]", 
				carNum, carType, entryTime.format(parkingTimeFormat),exitTime.format(parkingTimeFormat));
	}
	
}
