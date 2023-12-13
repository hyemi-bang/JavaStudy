
public class B14_Array {
	
	/*
	 # 배열 (Array)
	 - 같은 타입 변수를 여러개 선언하고 싶을 때 사용하는 문법
	 - 배열을 선언할 때 선언과 동시에 배열의 크기를 정해야한다
	 - 배열은 한번 만들고 나면 크기 변경이 불가능하다.
	 - 배열은 각 변수를 방 번호(index)를 통해 구분한다
	 - 배열의 인덱스는 0번부터 길이-1번 까지 있다
	 - 배열은 변수와 다르게 각 방의 모든 값이 자동으로 초기화 되어있다.
	 	(정수 : 0, 실수 : 0.0, boolean: false, 참조형 : null)
	 	++) false = 0 , 그외 숫자는 true 라고 생각한다
	 
	 # 배열 선언 방식
	  1. 타입[] 변수명 = new 타입[크기]
	  2. 타입[] 변수명 = {값1, 값2, 값3...};
	  3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3...};
	 
	*/

	public static void main(String[] args) {
		
		// int형 변수 1000개 선언 (int형 배열선언)
		int[] numbers = new int[1000];

		// 배열의 한 방에 변수 저장하기
		numbers[0] = 10;
		numbers[399] = 8500;
		numbers[999] = -999;
		// 배열 방 번호의 범위를 벗어나는 실수는 컴파일러에서 감지하지 못한다.
		// 실행시 ArrayIndexOutOfBoundsException 문으로 에러문 발생
		// numbers[1000] = 1236;
		
		// 배열에 저장되어 있는 값을 꺼내 사용하기
		System.out.println(numbers[0] + numbers[999]);
		System.out.println(numbers[0] + numbers[399]);
		System.out.println(numbers[30]); // 값을 지정하지 않아 0출력
		
		// #배열 선언 방식
		double[] weights = new double[30];
		float[] heights = {123.123F, 99.9f, 80.22f, 33.345f}; // 배열크기 : 4개
		// 배열은 한번 만들고 나면 크기 변경이 불가능하다. 30개 짜리로 만들면 30개로 끝임
		boolean[] passExam = new boolean[] {true, false, true};
		
		// double avg;  변수는 초기화 하지 않은 상태로 사용 할 수 없다
		// System.out.println(avg);
		// 배열은 변수와 다르게 각 방의 모든 값이 자동으로 초기화 되어있다.
		System.out.println(weights[15]); // 16번째 몸무게를 주세요 
		System.out.println(passExam[0]);
		System.out.println(heights[2]);
		
		//참조형변수 
		// 대문자로 시작하는 타입들은 null로 초기화 되어있다.
		String[] schools = new String[13];
		System.out.println(schools[3]); // null 산출
		String[] names = {"김철수", "고길동", "박혁거세"};
		System.out.println(names[1]); // 고길동 산출
		
		// char[]은 하나의 문자열로 간주할 수 있다.
		char[] message = {'H','e','l','l','o','!',' '};
		System.out.println(message[3]); // l 산출
		
		// 반복문으로 배열의 모든 내용을 쉽게 사용 할 수 있다
		
		// 배열.length : 해당 배열의 길이 확인가능 ()사용 하면 안된다.
		// "".length() : 문자열 길이를 알때만 () 사용
		
		String[] fruits = {"apple","banana","orange","kiwi","melon","watermelon","grape"};
		for (int i = 0; i < fruits.length; ++i) {
			System.out.println(fruits[i]); // fruits의 문자열을 전부 산출함
		}
		
		
	}

}
















