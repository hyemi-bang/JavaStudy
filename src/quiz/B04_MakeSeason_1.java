package quiz;

import java.util.Scanner;

public class B04_MakeSeason_1 {

	/*
	 * 사용자가 몇 월인지 입력하면 해당 하는 계절이 무엇인지 출력하기 1. switch문 2. if문
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요 (1-12) >");
		int month = sc.nextInt();


		switch (month) {
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("봄");
			break;
		case 7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;

		}

		if (month < 1 || month > 12) {
			System.out.println("잘못 입력하셨습니다.");
		}

		if (month >= 3 && month < 7) {
			System.out.println("봄");
		} else if (month >= 7 && month < 9) {
			System.out.println("여름");
		} else if (month >= 9 && month < 12) {
			System.out.println("가을");
		}  else if (month == 12 || month >= 1 && month < 3) {
			System.out.println("겨울");
		}
		
		/// System.out.println(month+"월은"+season+"입니다."); 이걸 출력받고 싶은데 String season을 못만들음..;_;
	}
}
