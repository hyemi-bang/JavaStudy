package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	  # 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	  
		1. 전달한 문자가 알파벳이면 true 반환, 아니면 false를 반환하는 함수 
	 	2. 전달한 숫자가 3의 배수이면 true 반환, 아니면 false를 반환하는 함수 
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다" 반환하는 함수 
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수 
	 	5. 전달한 정수가 소수(Prime)라면 true 반환, 아니면 false를 반환하는 함수
			※ 반환 = return해라! 
	 	6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하여 출력하는 함수
	 
	 */

	// 1
	public static String alphabet(char ch) {

		if (ch >= 'a' && ch <= 'z') {
			return "true";
		} else if (ch >= 'A' && ch <= 'Z') {
			return "true";
		} else {
			return "false";
		}
	}
	// 1 선생님 해설
	public static boolean isAlphabet(char ch) {
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
		// 한줄로 줄이면 return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}

	// 2
	public static String multiple(int number) {
		if (number != 0 && number % 3 == 0) {
			return "true";
		} else {
			return "false";
		}
		

	}
	 // 2 선생님 해설
	public static boolean isMul3(int num) {
		return num % 3 == 0 && num != 0; 
		// 비교연산의 결과값을 리턴
		// 0은 3의 배수인가?에 따라 답이 달라 질 수 있다. ( num != 0 쓰냐 마느냐)
	}
	

	// 3

	public static String checkNum(int num) {
		if (num != 0 && num % 2 == 0) {
			return "짝수입니다";
		} else  {
			return "홀수입니다";
		}
	}
	
	// 3 선생님 해설
	
	public static String chkEvenOdd (int num) {
		return num %2 ==0 ? "짝수입니다" : "홀수입니다";
	}

	// 4 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	// 해결 하지 못함

//	public static int[] submultiple(int number) { 
//		// 약수를 저장할 배열
//		int count = 0;
//		int[] count = new int[];
//
//		// 약수를 배열에 저장합니다.
//		int numindex = 0;
//		for (int i = 2; i <= number; i++) {
//			if (number % i == 0) {
//				count[numindex++] = i;
//			}
//		}
//		return count;
//	}
	
	// 4 선생님 해설
	
	public static int[] getDivisors(int num) {
		// 이 안에 들어가는 내용이 지역이라고 해서 지역변수라고도 부른다
		// 약수 : 1부터 num 까지 나누어 떨어지면 배열에 추가한다
		// 배열은 한번 만들면 크기 변경에 불가능하다
		// 약수의 개수를 세어 배열의 크기를 정해야한다
		int divisorCount = 0;
		
		for(int i = 1; i <= num; ++i) {
			if(num % 1 == 0) {
				++ divisorCount;
			}
		}
		int[] divisors = new int[divisorCount];
		int index = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				divisors[index++] = i;
			}
		}
		
		return divisors;
	}

	// 5 전달한 정수가 소수(Prime)라면 true 반환, 아니면 false를 반환하는 함수
	public static boolean prime(int number) {

		if (number <= 1) {
			return false; // 1 이하의 숫자는 소수 아님으로..
		}
		for (int i = 2; i <= number; ++i) {
			if (number % i == 0) {
				return false; // 약수임으로 소수 아님
			}
		}

		return true;
	}
	
	// 5 선생님 해설
	
	public static boolean isPrime(int num) {
		for(int i = 2 ; i <= Math.sqrt(num); ++i) {
			if(num % 1 == 0) {
				return false;
			}
		}
		return true;
	}

// 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하여 출력하는 함수
	public static void msgCount(String message, int count) {
		for (int i = 0; i < count; ++i) {
			System.out.println(message);
		}
	}
	
	// 6 선생님 해설
	public static void repeatMessage(String message, int repeat) {
		for (int i = 0; i < repeat; ++i) {
			System.out.printf("%s[%d time(s) repeated]\n", message, i);
		}
	}

	public static void main(String[] args) {
		// boolean 타입 함수는 만들어두면 조건 대신 사용할 수 있어 굉장히 유용하다
	
		if(isAlphabet('가')) {
			System.out.println("알파벳 이었습니다.");
		} else {
			System.out.println("알파벳아닙니다~");
		}
		System.out.println();
		System.out.printf("10은 %s\n", chkEvenOdd(10));
		
		System.out.println();
		for(int num = 100; num <= 200; num +=10 ) {
		System.out.printf("%d 약수들 : %s \n",
				num, Arrays.toString(getDivisors(num)));
		}
		
		
		System.out.println();
		repeatMessage("  /)/) \n" + " (  ..) \n" + " (  >$ \n", 3);
		
		// 함수를 어떻게 어디서 사용될것인지를 생각해야한다
		// 블로그에 있는게 진리가 아니다 비판적으로 바라볼 필요가 있
		
		
	}

}
