package quiz;

import java.util.Scanner;

public class B07_Palindrome_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요 >");
		String word = sc.nextLine();
		int len = word.length();
		int incorrectCount = 0;
		// 3 boolean 타입
		boolean paindrome = true;

		for (int i = 0, half = len / 2; i <= half; ++i) {
			// 항상 동일할 예정인 계산은 조건쪽에서 하면 낭비가 될 수 있음으로 초기값에 설정
			char frontCh = word.charAt(i);
			char behindCh = word.charAt(len - 1 - i);

			// &=을 이용해 false가 한번만 발생해도 false가 되도록 만들 수 있다.
			paindrome &= frontCh == behindCh;

		}
		if (incorrectCount > 0) {
			System.out.println("(3) 좌우대칭이 아닙니다");
		} else {
			System.out.println("(3) 좌우대칭입니다.");
		}

		// 1> 맨 앞부터 글자를 하나씩 비교해 나간다(절반까지만)
		// 단어의 맨 앞 인덱스 부터 절반 인덱스까지만 검사
		for (int i = 0, half = len / 2; i <= half; ++i) {
			// 항상 동일할 예정인 계산은 조건쪽에서 하면 낭비가 될 수 있음으로 초기값에 설정
			char frontCh = word.charAt(i);
			char behindCh = word.charAt(len - 1 - i);

			// 앞쪽 문자와 뒤쪽 문자가 일치하지 않을 때마다 불일치 카운트 1증가
			if (frontCh != behindCh) {
				++incorrectCount;
			}

		}
		if (incorrectCount > 0) {
			System.out.println("(1) 좌우대칭이 아닙니다");
		} else {
			System.out.println("(1) 좌우대칭입니다.");
		}
		
		// 1'> 맨 앞부터 글자를 하나씩 비교해 나간다(절반까지만)
		for (int i = 0, half = len / 2; incorrectCount == 0 && i < half; ++i) {
			// 항상 동일할 예정인 계산은 조건쪽에서 하면 낭비가 될 수 있음으로 초기값에 설정
			char frontCh = word.charAt(i);
			char behindCh = word.charAt(len - 1 - i);

			// 앞쪽 문자와 뒤쪽 문자가 일치하지 않을 때마다 불일치 카운트 1증가
			if (frontCh != behindCh) {
				++incorrectCount;
			}

		}
		if (incorrectCount > 0) {
			System.out.println("(1') 좌우대칭이 아닙니다");
		} else {
			System.out.println("(1') 좌우대칭입니다.");
		}

		// 풀이법 2> 단어를 뒤집고 비교해서 똑같으면 좌우대칭이다

		String reversed = " ";

		for (int i = 0; i < word.length(); ++i) {
			reversed += word.charAt(word.length() - 1 - i);
			// 비워있는 문자열을 만들고 하나씩 누적 연산하면 새로운 문자열을 만들어 낼 수 있다.
		}
		System.out.printf("(2) 원본:%s, 뒤집:%s\n", word, reversed);

		if (word.equals(reversed)) {
			System.out.println("(2) 좌우대칭입니다.");
		} else {
			System.out.println("(2) 좌우대칭이아닙니다.");
		} // equals > conditionQuiz파일

	}

}
