package quiz;

import java.util.Scanner;

public class B07_IncludeUppercase {

	/*
	 * 사용자가 단어를 입력했을때 해당 단어에 대문자가 포함되어 있는지 여부를 체크하는 프로그램 
	 * 대문자가 포함되어있다 = 한글자씩 확인하면서 대문자가 있을때 표시한다.
	 */

	public static void main(String[] args) {

		System.out.println("단어를 입력하세요 > ");
		String word = new Scanner(System.in).next();

		boolean includupper = false;

		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				includupper = true;
				break;
			} 
		}
		System.out.println("대문자가 있습니까?" +includupper );

	}

}
