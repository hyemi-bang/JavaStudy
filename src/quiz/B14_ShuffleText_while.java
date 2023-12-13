package quiz;

import java.util.Scanner;

public class B14_ShuffleText_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하시오 > ");
		String word = sc.nextLine();

		// 중복없이 랜덤 만들기

		int[] ranIndex = new int[word.length()];

		int i = 0;
		while (i < word.length()) {
			ranIndex[i] = (int)(Math.random() * word.length());

			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (ranIndex[i] == ranIndex[j]) {
					duplicate = true;
					break;
				}	++j;
			}
			if (!duplicate) {
				++i;
			}
		}

		for (i = 0; i < ranIndex.length; ++i) {
			System.out.print(word.charAt(ranIndex[i]));
		}
	}

}
