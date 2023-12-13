package quiz;

import java.util.Scanner;

public class B06_ForQuiz_2 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이 존재하는 모든 5의 배수를 한줄에 10개씩 출력 음수를 입력하는 경우에도
		 * 프로그램이올바르게 동작할 것
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("아무 숫자나 입력해주세요 : ");
		int num = sc.nextInt();
		int count = 0;

		if (num >= 0) {
			for (int i = 0; i <= num; ++i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++count % 10 == 0) {
						System.out.println();
					}
				}
			}

		} else {
			for (int i = 0; i >= num; --i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++count % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
