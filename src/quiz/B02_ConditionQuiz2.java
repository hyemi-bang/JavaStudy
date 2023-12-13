package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	public static void main(String[] args) {

		//정수와 문자는 연산 가능하다. 
		System.out.println((char)('A'+1)); // B출력
		System.out.println('A'+1); // A-> 숫자로 바꿔서 더함 -> 66출력
		
		// #알맞은 조건식을 만들어보세요
		// char형 변수

		// 1.  a가 'q' 또는 'Q'일때 true
		 char a = 'q';
		 
		 System.out.println(a == 'q' || a == 'Q');
		 
		// 2.  b가 공백이나 탭이 아닐때 true
		 char b ='m';
		 System.out.println(b !=' ' && b !='\t');
		 System.out.println(!(b ==' ' || b =='\t'));

		// 3.  c가 '0~9' 일때 true
		 char c = '5';
		 System.out.println(c>='0' && c <= '9'); ///??? 문자 '0'~'9' 까지 이기 때문에 0~9 하면 안댄다잉~		
		 System.out.println(c>=48 && c <= 57); // 선생님 알려주심 // 아스키코드에서 보면 해당 숫자 이지만, 자동적으로 인식하니까 굳이 이걸 쓸 필요는 없다잉
		 
		// 4.  d가 영문자(대문자,소문자) 일때 true
		 char d = 'd';
		 System.out.println(d>= 'a'&& d <='z' || d>='A' && d<='Z');

		// 5.  e가 한글일때 true(한글범위 유니코드검색)
	    char e = '가';
	    System.out.println( e >= '가' || e <= '힣'); // 선생님풀이
		System.out.println( e >= 44032 || e <= 55023);  // 유니코드번호를 보고 코드값 계산기로 숫자변환!!
		 
		// 6.  사용자가 입력한 문자열이 quit 일때 true
		 Scanner sc = new Scanner(System.in);		 
		 System.out.println("입력하세요 'quit' > ");
		 String word = sc.next();
		 System.out.println(word.equals("quit"));	// 재활용 가능 
		 
		 System.out.println("정말 나가시겠습니까? (quit) > ");
		 System.out.println(new Scanner(System.in).next().equals("quit")); // 선생님풀이, 과정 줄이면 이렇게됨 단 일회성

	}

}
