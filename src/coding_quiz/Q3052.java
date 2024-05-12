package coding_quiz;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		/*
		 * 두 자연수 A와 B가 있을 때, 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지
		 * 출력하는 프로그램을 작성
		 */

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int differentNum = 0;

		// 10개 수 입력받고, 각 42로 나눈 나머지 값 도출
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			arr[i] %= 42;
		}

		// 중복 확인
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					if (arr[i] != -1) {
						differentNum++;
						arr[j] = -1;
					}
				}
			}
		}
		System.out.println(10 - differentNum);
	}
	
	/*
	  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] remainders = new int[42]; // 나머지를 저장할 배열 초기화

        // 10개의 수 입력 받고 각각을 42로 나눈 나머지를 배열에 누적
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int remainder = num % 42;
            remainders[remainder]++;
        }

        int differentRemainders = 0;
        // 배열에서 0 이상의 값을 가지는 요소의 개수를 세어 서로 다른 나머지 개수 구하기
        for (int count : remainders) {
            if (count > 0) {
                differentRemainders++;
            }
        }

        System.out.println(differentRemainders);
    }
	*/

}
