package quiz;

import java.util.Scanner;

public class D08_isPhoneNumber_T {

	public static boolean isValidPhoneNumber(String phoneNumber) {
		// 가장 먼저 맨 앞에 3자리가 010인가? 010으로 시작하지 않으면 false
		if(!phoneNumber.startsWith("010")) {
			System.out.printf("[INFO] %s 는 010으로 시작하지 않습니다. \n", phoneNumber);
			return false;
		}
		// 하이푼은 다 없애겠다~ / 원본에서는 하이픈을 제거한것이 아니다~
		String hyponRemovedNumber = phoneNumber.replace("-", "");
		// 폰넘버에 숫자가 아닌게 들어있나? -를 제거했는데 숫자가 아닌게 남아있으면 false
		for(int i =0 , len = hyponRemovedNumber.length(); i <len; ++i) {			
			if(!Character.isDigit(hyponRemovedNumber.charAt(i))) {
				System.out.printf("[INFO] %s 는 숫자가 아닌것이 포함되어 있습니다. \n", phoneNumber);
				return false;
			}
		}
		
		if(	hyponRemovedNumber.length() != 11){
			System.out.println("[INFO] 숫자의 길이가 11개가 아닙니다.");
			return false;
		}
		
		// 하이픈의 위치가 제 위치에 있는지
		// 헨드폰 자리숫자가 -제외 11자리, -포함13자리인지
		int len = phoneNumber.length();
		if(!(len == 11 || len ==13)) {
			System.out.println("[INFO] 번호길이가 잘못 되었습니다.");
			return false;
		}
		
		
		// 길이가 13일때 체크해야할것 : 하이픈의 개수와 하이픈이 제위치에 있는지
		//010-1111-1111
		// 하이픈 제 위치
		if(len == 13) {
			if(phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-') {
				System.out.println("[INFO] -이 없거나 위치가 올바르지 않습니다.");
				return false;
			}
			// 하이픈 개수 반복문 돌려서 개수 세어본 다음에, 2개가 아니면 false
			int hyponCount = 0;
			for(int i = 0; i <len ; ++i) {
				if(phoneNumber.charAt(i) == '-') {
					++hyponCount;
				}
			}
			if(hyponCount != 2) {
				System.out.println("[INFO] - 개수가 올바르지 않습니다.");
				return false;
			}			
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요 >> ");
		String phoneNumber = sc.nextLine();

		boolean isValueNumbers = isValidPhoneNumber(phoneNumber);

		if (isValueNumbers) {
			System.out.println("유효한 전화번호 입니다");
		} else {
			System.out.println("유효하지 않은 전화번호 입니다");
		}

	}

}
