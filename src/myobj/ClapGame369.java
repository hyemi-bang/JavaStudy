package myobj;

import java.util.Scanner;

public class ClapGame369 {

	public static boolean is369Number(int number) {
		while (number > 0) {
			int digit = number % 10;
			if (digit == 3 || digit == 6 || digit == 9) {
				return true;
			}
			number /= 10;
		}
		return false;
	} // => System.out.println("패배");
		// break;

	public static void Game369UserInput(int num) {

		Scanner sc = new Scanner(System.in);
		int number = 1;

		while (true) {
			System.out.println("현재 숫자: " + number);
			String userInput = sc.nextLine();

			if (is369Number(number) && (userInput.equals("짝") || userInput.equals("ㅉ"))) {
				
			} else if (!is369Number(number) && (!userInput.equals("짝") && !userInput.equals("ㅉ"))) {
				
			} else {
				System.out.println("틀렸습니다!");
			}

			number++;
		}

	}
}
