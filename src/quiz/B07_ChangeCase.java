package quiz;

import java.util.Scanner;

public class B07_ChangeCase {

	/*
	 * 사용자가 문장을 입력하면 대문자 <-> 소문자 바꾸어 출력하기 (영어가 아닌 문자는 그대로 출력되도록) 아스키코드
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문장을 입력해주세요 : ");
		String sentence = sc.nextLine();

		int len = sentence.length();
		String reversed = " ";
		
		/* Palindrome_2번 보고 문자열 비워놓고 넣었던 것 생각했음..
			for (int i = 0; i < word.length(); ++i) {
			reversed += word.charAt(word.length() - 1 - i); 
			// 비워있는 문자열을 만들고 하나씩 누적 연산하면 새로운 문자열을 만들어 낼 수 있다.
		*/

		for (int i = 0; i < len; ++i) {
			char currentS = sentence.charAt(i);

			if (currentS >= 'A' && currentS <= 'Z') {
				reversed += (char) (currentS + 32); // char ch = "A"+32 => "a"출력
			} else if (currentS >= 'a' && currentS <= 'z') {
				reversed += (char) (currentS - 32);
			} else {
				reversed += currentS;
			}

		}
		System.out.printf("변경된 문자 :%s 입니다.", reversed);

	}

}
