package coding_quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		sc.nextLine();

		Set<String> wordsSet = new HashSet<>(); // 단어 저장할 HashSet<>, 중복 제거

		// 입력된 단어들을 HashSet<>에 저장
		for (int i = 0; i < numbers; i++) {
			wordsSet.add(sc.nextLine());
		}

		// 저장한 단어를 배열로 변환
		String[] wordArray = wordsSet.toArray(new String[0]);

		// 배열정렬 Arrays.sort()
		// Comparator 사용해서 정렬 기준을 지정한다
		Arrays.sort(wordArray, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// 길이가 같을때 사전순 정렬, 단어 길이가 다를경우 길이순 정렬
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return Integer.compare(o1.length(), o2.length());
				}
			}

		});
		for (String word : wordArray) {
			System.out.println(word);
		}
	}

}
