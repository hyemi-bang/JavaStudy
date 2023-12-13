package myobj.Parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cars {
	
	final private static String[] carTypes = {
		"장애인", "유아동승", "일반", "화물차", "경차", "중형", "대형", "소형"	
	};
	
	final private static String symbols = "가나다라마바사아자하호허";
	
	private static LocalDateTime getRandomExitTime() {
		return LocalDateTime.now().plus((int)(Math.random() * 1000), ChronoUnit.MINUTES);
	}
	
	private static String getrandomCarType() {
		return carTypes[(int)(Math.random() * carTypes.length)];
	}
	
	private static String getrandomCarNumber() {
		StringBuilder carNum = new StringBuilder();
		// 1~999
		carNum.append(String.format("02d",(int)(Math.random() * 999 + 1 )));
		carNum.append(symbols.charAt((int)(Math.random() * symbols.length())));
		// 101~9999
		carNum.append(String.format("%04d",(int)(Math.random() * 9899 + 101)));
		
		return carNum.toString();
	}
	
	// 이렇게 랜덤한 자동차의 정보를 얻을 수 있게 되었다..
	public static Car getRandomCar() {
		return new Car(getrandomCarNumber(), getrandomCarType(), LocalDateTime.now(), getRandomExitTime() );
	}

}
