package quiz;

import java.util.Scanner;

public class B08_Numeric {
	/*
	 사용자가 입력한 문자열이 모두 숫자로 구성된 문자열인지 판별하는 프로그램을 만들어보세요
	 a1234 >> 모두 숫자인 문자열이 아닙니다
	 18732 >> 모두 숫자인 문자열입니다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("입력하세요 : ");
		String number = sc.nextLine();
		boolean numeric =true;
		
		for (int i = 0; i < number.length(); ++i) {
			char ch = number.charAt(i);

			if (ch >= '0' && ch <= '9') {
				numeric = false;
				break;
			}
		}
		if (numeric) {
			System.out.println("모두 숫자인 문자열이 아닙니다");
		} else {
			System.out.println("모두 숫자인 문자열입니다");
		}
	}

}
