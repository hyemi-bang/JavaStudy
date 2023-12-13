package quiz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import myobj.Parking.Cars;
import myobj.Parking.ParkingRegulations;

public class D14_ParkingSystem {
	
	/*
	2018년 9월 1일부터 끝 번호 차량 출입제한
	출입제한 끝번호 > 월 1,6 화 2,7 수 3,8 목 4,9 금 5,0. 공휴일 적용제외 
	장애인, 유아동승, 경차 제외
	주차요금 : 최초 30분 무료 / 30분 초과  10분마다 200원 / 1시간 초과 10분마다 300원
		  : 1일 주차 24시간 8,000원
		  : 1개월 정기주차 70,000원
	
	들어오는 시간 확인하고, 나가는 시간 확인 해서 시간 별 요금부과
	들어오는 차량이 끝 번호 출입하면 안되는 날이면 출입 할 수 없는 날이라 알려주고
	정기권 차량이면 요금 부과하지 않고 내보내고 
	차량에 장애인, 유아동승 차량이다 하면 출입제한 없이 입출차 가능
	
	*/
	private static DateTimeFormatter parkingTimeFormat =
				DateTimeFormatter.ofPattern("MM-dd(E)/ HH:mm");
	
	public static void main(String[] args) {

		// 차량이 주차장에 입,출차 날짜와 시간
		 
		 
		LocalDateTime entrance = LocalDateTime.of(2023, 10, 22, 10, 0);
		String formattedEntrance = entrance.format(parkingTimeFormat);
		System.out.println("Entrance Time: " + formattedEntrance);
		
		LocalDateTime exitTime = LocalDateTime.of(2023, 10, 22, 16, 0);
		String formattedExitTime = exitTime.format(parkingTimeFormat);
		 System.out.println("Exit Time: " + formattedExitTime);
		

		// 차량종류
		String vehicleType = " "; // "경차", "유아동승차량", "장애인차량"
		// 차량번호
		int carDigit = 2455;
		String cardName = " "; // "1개월정기주차권차량", "1일권차량"

		boolean isAllowed = ParkingRegulations.isVehicleAllowed
				(entrance, vehicleType, carDigit);
		if (isAllowed) {
			ParkingRegulations.calculateParkingFee
			(entrance, exitTime, cardName);
		}
	
		System.out.println(Cars.getRandomCar());
		// myobj.Parking.Car@62043840

		
	}

}
