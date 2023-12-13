package quiz;

import java.util.Scanner;

public class B07_Count_E {

	public static void main(String[] args) {
		/*
		 * 사용자가 단어를 입력했을때 해당 단어에 알파벳 e가 몇개나 포함되어 있는지 여부를 체크하는 프로그램 대/소문자 모두 세어야 함
		 */
		
		String str = "프로그램을 만들어보세요~";
		int len = str.length();
		for (int i=0 ;i<len;++i) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요>");
		String word = sc.nextLine();
		int countE = 0; 
		
		// 문장전체를 반복하면서
		for (int i = 0; i < word.length(); ++i) {
			// 문자를 하나 꺼내고
			char ch = word.charAt(i);
			//해당문자가 'E', 'e'일때만 개수 증가
			if (ch == 'E' || ch == 'e') {
				++countE;
			}
		}
		System.out.print("단어에 e가 포함된 개수 : " + countE);
	}

}
