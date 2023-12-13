package quiz;

import java.util.Random;

public class C01_FunctionQuiz2 {
	// 1. 실행하면 영어 대문자 4자리로 이루어진 임시 비밀번호를 생성하여 반환해주는 함수
	// retrun 타입이 String이면 반드시 문자열을 string 타입으로 리턴해줘야해
	// if만 사용한 조건문이 있다면 결과 값이 무엇이던 간에 if문이 실행 안될 수도 있기 때문에 에러가 생긴다
	// for문도 조건이 처음부터 false가 나오면 return 을 확인 할 수 없기 때문에 에러가 생긴다.
	// return을 반드시 하는 방법 : 조건문/반복문 밖에서 쓴다. if-else로 조건문을 완성하여 사용한다
	
	public static String randomPassword() { // ()에 매게변수 없이도 만들수 있다
		String pwd = "";
		for (int i = 0; i < 4 ; ++i) {
			pwd += (char)(Math.random() * 26 + 65); 
			// pwd =(char)(Math.random() * 26 + 65); 로 해서 계산이 안됨
			// ~~~ random() * ('Z' - 'A') + 'A'
	}
		return pwd;
	
		
	}
	

	// 2. 문자열을 전달하면 해당 문자열을 마구 뒤섞은 문자열을 반환해주는 함수
	// 문자열 전달이라 String 사용 했어야 함
	public static char[] randomMessage(String str) {
		char[] chs = new char[str.length()];

		for (int i = 0; i < str.length(); ++i) {
			chs[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); ++i) {
			int ranIndex = (int) (Math.random() * (chs.length - 1) + 1);

			char temp = chs[0];
			chs[0] = chs[ranIndex];
			chs[ranIndex] = temp;
		}
		return chs;

	}

	// 3. 문자열을 전달하면 해당 문자열의 대소문자를 반전시킨 문자열을 반환해주는 함수
	// 밖으로 나오는 것도 문자열이고, 내가 입력하는 것도 문자열이다~

	public static String sentence(String text) {
		String result = "";
		for (int i = 0; i < text.length(); ++i) { // 전달받은 텍스트를 한글자 씩 보면서 변환시키기
			char ch = text.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				result += (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				result += (char) (ch + 32);
			} else {
				result += ch;
			}
		}
		return result;

	}

	// 4. 문자열을 전달하면 해당 문자열이 숫자로만 이루어져있는지 여부를 알려주는 함수
	
	public static String chkAllDigit (String inputWord) {
		int countNumber = 0 ;
		
		
		for (int i = 0; i < inputWord.length(); ++i) {
			char ch = inputWord.charAt(i);
			if (ch >= '0' && ch <= '9') {
				++countNumber;
			}
		}
		
		if (inputWord.length() == countNumber) {
			return "모두 숫자 입니다";
		} else {
			return "모두 숫자가 아닙니다";
		}
	}
	

	public static void main(String[] args) {

		// 1. 실행하면 4자리 임시 비밀번호를 생성하여 변환해주는 함수
		for (int i = 0 ; i < 5; ++i) {
		System.out.println(randomPassword());
		}
		// 2. 문자열을 전달하면 해당 문자열을 마구 뒤섞은 문자열을 반환해주는 함수
		System.out.println(randomMessage("rollPlying"));
		
		// 3. 문자열을 전달하면 해당 문자열의 대소문자를 반전시킨 문자열을 반환해주는 함수
		System.out.println(sentence("BaaBaa"));

		// 4. 문자열을 전달하면 해당 문자열이 숫자로만 이루어져있는지 여부를 알려주는 함수
		System.out.println(chkAllDigit("Oh happy day 0921"));
	}

}
