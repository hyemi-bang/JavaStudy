package quiz;

import java.util.Scanner;

public class B07_ChangeCase_t {
	public static void main(String[] args) {

		// 문장을 입력받고
		System.out.print("문장을 입력해주세요>");
		String text = new Scanner(System.in).nextLine();

		String result = "";
		// 한글자씩 검사한다.
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				result += (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				result += (char) (ch + 32);
			} else {
				result += ch;
			}
		}
		System.out.println("원본:" + text);
		System.out.println("변경:" + result);
	}

}
