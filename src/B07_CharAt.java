
public class B07_CharAt {
	/*
	 # "문자열".charAt(index);
	 - 해당 문자열에서 원하는 위치(인덱스)의 문자를 char타입으로 꺼내는 메서드
	 - 시작 인덱스는 0이다.
	 - 마지막 인덱스는 해당문자열의 n(문자개수) - 1 이다.
	 
	 #"문자열".length();
	 - 해당 문자열의 길이(글자개수)를 알 수 있다.
	 
	 
	*/
	public static void main(String[] args) {

		char ch = "안녕하세요".charAt(0);

		System.out.println("안녕하세요".charAt(1)); // 출력 : 녕
		System.out.println("안녕하세요".charAt(2)); // 출력 : 하
		System.out.println("안녕하세요".charAt(3)); // 출력 : 세
		System.out.println("안녕하세요".charAt(4)); // 출력 : 요
		System.out.println();
		System.out.println();

		// length()를 이용하면 문자열의 마지막 글자를 쉽게 구할 수 있다.
		String str = "마지막 인덱스는 해당 문자열의 '문자 개수 -1'이다";
		System.out.println("마지막 글자 : " + str.charAt(str.length() - 1));
		System.out.println((str.length()+"개의 문자"));

		// for문을 사용하면 문자열을 쉽게 탐색할 수 있다. ( 변경도 가능 )
		String text = "다람쥐 다람이 도토리 좋아해";
		for (int i = 0; i < text.length(); ++i) {
			char c = text.charAt(i);
			System.out.printf("%d번째 문자: %c\n", i, c);
		}

		String text2 = "다람쥐 헌 쳇바퀴에 타고파";
		for (int i = 0; i < text2.length(); ++i) {
			char c = text2.charAt(i);
			System.out.printf("%d번째 문자: %c\n", i, c);
		}

		// 연습 Quiz :: 문자열 str을 거꾸로 출력해보세요 (1번과 2번 같은 풀이방법)
		//1번
		for (int index = str.length() - 1; index >= 0; --index) {
			System.out.print(str.charAt(index));
		}
		
		
		//2번
		System.out.println();
		for (int i = 0; i < str.length(); ++i) {
			System.out.print(str.charAt(str.length() - 1 - i));
		}
		// ------------------------------------------------------
		System.out.println();
		for(int index = text.length() -1 ; index >=0; --index) {
			System.out.print(text.charAt(index));
		}
		
		for (int i = 0; i< text2.length();++i) {
			char c = text2.charAt(i);
			System.out.print(text2.charAt(i));
		}
		
	}

}
