package quiz;
import java.util.Scanner;

public class D08_isPhoneNumber {

	/*
	 * 사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요 핸드폰 번호 : 010-xxxx-xxxx 의 형식
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-포함한 13자리 번호를 입력하세요 >> ");
		String phoneNumber = sc.nextLine();

		boolean isValueNumbers = isPhoneNumber(phoneNumber);

		if (isValueNumbers) {
			System.out.println("유효한 전화번호 입니다");
		} else {
			System.out.println("유효하지 않은 전화번호 입니다");
		}

	}

	// "".contains(CharSeq) : 해당문자열에 전달한 문자열이 포함되어 있는지 확인한다
	// "".startsWith(CharSeq) : 해당 문자열이 전달한 문자열로 시작하는지 검사한다
	// 핸드폰번호는 010으로 시작하고 총 11자인데 - 포함 총 13자
	// 010 제외한 나머지의 길이가 10자리 인지 + - 중간에 2개 포함되어있는지 확인하면 되는것 아닌가?
	// 숫자만 추출해서 , 전부 숫자인지 확인하기

	public static boolean isPhoneNumber(String phoneNumber) {
		if (phoneNumber.startsWith("010") && phoneNumber.length() == 13) {
			int hyphenIndex1 = phoneNumber.indexOf("-", 3); // 010-xxxx-xxxx - 은 3번째,8번째 위치
			int hyphenIndex2 = phoneNumber.indexOf("-", 8);

			if (hyphenIndex1 == 3 && hyphenIndex2 == 8) {
				// 하이푼 두개가 각각 재위치에 있다면 return
				// 숫자 자리 추출
				String firstNumbers = phoneNumber.substring(4, 8);
				String secondNumbers = phoneNumber.substring(9);

				// 추출한 범위가 숫자인지 확인
				if (isNumeric(firstNumbers) && isNumeric(secondNumbers)) {
					return true;
				}
			}
		}
		return false; // 유효하지 않은 핸드폰 번호
	}

	// 문자열이 숫자로만 이루어져 있는지 확인하는 메서드
	public static boolean isNumeric(String str) {
		for(int i =0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				return true; // 숫자면 true
			}			
		}
		return false; // 숫자가 아니면 false;		
	}
}
