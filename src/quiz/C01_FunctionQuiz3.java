package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz3 {
	// 실행하면 1~45의 중복없는 7개의 숫자로 이루어진 int[]로 반환하는 함수 만들기

	public static int[] randomNumber() {
		int[] num = new int[7]; // 필요한거 7개

		for (int i = 0; i < 7; ++i) {
			num[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; ++j) { // 중복된 애들 빼기
				if (num[i] == num[j]) {
					--i;
					break;
				}
			}

		}
		return num;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(randomNumber()));

	}

}
