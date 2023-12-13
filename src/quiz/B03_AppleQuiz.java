package quiz;

import java.util.Scanner;

public class B03_AppleQuiz { /// 선생님 풀이

	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있을때 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 바구니가 총 몇 개 필요한지 알려주는
	 * 프로그램 만들어보세요.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int basket_size = 10;

		System.out.print("사과의 개수를 입력해 주세요. :");
		int appleCount = sc.nextInt();

		if (appleCount < 0) {
			System.out.println("사과의 개수가 이상해 프로그램을 실행할 수 없습니다.");

		} else {
			int basketCount = (int) Math.ceil(appleCount / 10.0);
//			int basketCount = appleCount/basket_size;
//			int remain = appleCount%basket_size;
//			
//			if(remain>0) {
//				basketCount = basketCount+1;
//			} 
			System.out.printf("필요한 바구니 개수는 %d개 입니다\n", basketCount);
		}
	}

}
