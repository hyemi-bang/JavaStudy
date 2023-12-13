package myobj.Parking;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingRegulations {

	// 들어온 시간, 차량타입, 차량 끝번호
	public static boolean isVehicleAllowed(LocalDateTime entranceTime, String vehicleType, int vehicleEndDigit) {
		// 월 1,6 화 2,7 수 3,8 목 4,9 금 5,0, 공휴일 등에 대한 검사
		// 공휴일은 하지 못함.. (토. 일은 출입가능 )

//		// 2018년 9월 1일 이전이면 모든 차량 허용 이건 너무 헛갈려서 뺌 @_@
//        LocalDateTime restrictionStart = LocalDateTime.of(2018, 9, 1, 0, 0);
//
//        if (entryTime.isBefore(today)) {
//            System.out.println("모든 차량이 출입 가능합니다.");
//            return true;
//        }
		String cardName[] = { "경차", "유아동승차량", "장애인차량" };

		if (vehicleType.equals(cardName[0]) || vehicleType.equals(cardName[1]) || vehicleType.equals(cardName[2])) {
			System.out.println("출입 제한받지 않는 차량입니다. 입/출차 가능합니다.");
			return true;
		} else {
			  DayOfWeek dayOfWeek = entranceTime.getDayOfWeek();
		        int carOfEndNumber = vehicleEndDigit % 10;
		        
			if (!(dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY))
					&&( (dayOfWeek.equals(DayOfWeek.MONDAY) && (carOfEndNumber == 1 || carOfEndNumber == 6))
				    || (dayOfWeek.equals(DayOfWeek.TUESDAY) && (carOfEndNumber == 2 || carOfEndNumber == 7))
				    || (dayOfWeek.equals(DayOfWeek.WEDNESDAY) && (carOfEndNumber == 3 || carOfEndNumber == 8))
				    || (dayOfWeek.equals(DayOfWeek.THURSDAY) && (carOfEndNumber == 4 || carOfEndNumber == 9))
				    || (dayOfWeek.equals(DayOfWeek.FRIDAY) && (carOfEndNumber == 5 || carOfEndNumber == 0)))) {
				    System.out.println("오늘은 차량 끝자리 " + carOfEndNumber + " 출입할 수 없습니다.");
				    return false;
				
			} else {
                System.out.println("어서요세요.");
                return true;
            }
		}
	}

	public static int calculateParkingFee(LocalDateTime entranceTime, LocalDateTime exitTime, String cardType) {
		int freeMinutes = 30; // 최초 30분 무료
		int totalMinutes = (int) entranceTime.until(exitTime, ChronoUnit.MINUTES);
		// .until() : 지정된 단위로 다른 날짜-시간까지의 시간을 계산
		// TemporalAccessor를 사용하여 LocalDateTime으로 변환
		// 예를 들어 두 날짜-시간 사이의 일수는 startDateTime.until(endDateTime, DAYS)을 사용하여 계산할 수
		// 있습니다.

		// 10분마다를 어떻게 나타내지?
		// (totalMinutes - freeMinutes)/10
		// 60 - 30 = 30분 / 10 * 200원 +  30분 / 10 = 3분 * 300원
		// 13시 - 10시 = 5시간 (300분) /10 * 300원 =

		String cardName[] = { "1개월정기주차권차량", "1일권차량" };
		System.out.println("안녕히가세요.");
		if (cardType.equals(cardName[0])) {
			System.out.println("1개월 정기주차권 차량");
			// 정기주차 차량 유효기간이 지난거면 일반 요금 부과
			// 정기주차권에 유효기간이 적혀있어야한다 LocalDateTime.of(); ~ LocalDateTime.of() 까지 어려움
			
		} else if (cardType.equals(cardName[1])) {
			System.out.println("1일권 차량");
			System.out.println("요금은 8,000원 입니다");
		} else {
			System.out.println("총 주차 시간: " + totalMinutes + " 분");
			if (totalMinutes <= freeMinutes) {
				System.out.println("무료회차");
			} else if (totalMinutes > freeMinutes) {
				int addFee = (totalMinutes /10) * 200;
				System.out.println("총 요금은 : " + addFee + " 원입니다.");
			} else if (totalMinutes > 60) {
				// 30분까지는 200원 더하고, 그후 초과시간은 300원더하기
				int addFee = (freeMinutes / 10 ) * 200;
				int extraFee = ((totalMinutes - freeMinutes) / 10) * 300;
				int totalFee = addFee + extraFee;
				System.out.println("총 요금은 : " + totalFee + " 원입니다.");
			}
			return 0;
		}

		return 0;
	}

}