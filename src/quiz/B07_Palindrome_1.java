package quiz;

import java.util.Scanner;

public class B07_Palindrome_1 {
	/*
	Palindrome(회문(回文))
	사용자가 단어를 입력하면 해당 단어가 좌우대칭인지 판별해주는 프로그램을 만들어보세요.
	
	해결방법
	1> 맨 앞부터 글자를 하나씩 비교해 나간다(절반까지만)
	2> 단어를 뒤집고 비교해서 똑같으면 좌우대칭이다
	
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요 >");
		String word = sc.nextLine();
	
		
		for (int i=0; i <word.length();++i) {
			if(word.charAt(i) == word.charAt(word.length()-1-i)) {
				System.out.println("좌우대칭입니다.");				
			} else {
				System.out.println("좌우대칭이 아닙니다.");
			}
		}
		// break는 쓰지 말것, 개수를 1번만 세도록 설정하라 (length를 말한걸까?)

		System.out.println();
		for (int i=0 ; i <word.length();++i) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		for (int i = 0; i< word.length();++i) {
			System.out.print(word.charAt(word.length()-1-i));
		}
		

//		String reverse = word(word.charAt(word.length() - 1 - word.length())); // >> word에 에러뜸
//		
//		if(word == reverse) {
//			System.out.println("회문입니다.");
//		} else {
//			System.out.println("회문이 아닙니다");
//		}


		
/*
		거꾸로 :
		System.out.println();
		for (int i = 0; i < str.length(); ++i) {
			System.out.print(str.charAt(str.length() - 1 - i));
		}
		
		제대로:
		
		for (int i = 0; i< text2.length();++i) {
			char c = text2.charAt(i);
			System.out.print(text2.charAt(i));
		}
			
		이 두  for 문이 같다면 "좌우대칭입니다." 다르다면 "좌우대칭이 아닙니다."	

*/

		

	}


}
