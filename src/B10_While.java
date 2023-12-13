
public class B10_While {
	/*
	 #While
	 
	 - for문과 사용법이 약간 다른 반복문
	 - 초기값과 증감값의 위치가 정해져 있지 않아 for문보다는 자유롭다
	 - ()안의 내용이 true라면 {}안의 내용을 계속 반복한다.
	 - 증감값의 위치에 따라 결과가 달라지는 것에 주의
	 - 한글자씩 인덱스 볼 수 있다. (charAt();,length(); 사용해서)
	*/
	public static void main (String[]args) {
		
		int i=0;
		while (i<10) {
		
			System.out.println("hi!" +i);
			++i; // 0~9까지 출력
		}
		System.out.println("===========");
		i = 0;
		while (i<10) {
			System.out.println(++i); // 1~10 까지 출력
		}
		System.out.println("===========");
		i=0;
		while (i<10) {
			i++; // 1~10 까지 출력
			System.out.println("hi!" + i);
		}
		System.out.println("===========");
		i=0;
		while (i ++ <10) { // 1~10 까지 출력
			System.out.println("hi!" + i);
		}
		System.out.println("===========");
		i=0;
		while (++ i <10) { // 10이라고 적었지만 1~9 까지 출력 => 9개출력, 직관적이지 않아서 거의 사용 하지 않는다
			System.out.println("hi!" + i);
		}
		
		//while문으로 문자열 탐색해보기
		
		String str = "전국철도노동조합(철도노조)이 오늘(14일) 오전 9시부터 다음주 월요일 오전 9시까지 총파업에 들어가요."
					+"철도노조는 공공철도 확대와 교대근무 개선 등을 요구하는데요.+"
					+ " 파업에 따라 KTX, 서울 1·3·4호선 등 일부 열차의 운행이 감축되면서 +"
					+ "교통·물류에 불편이 생길 걸로 보여요.+"
					+ " 정부는 대체 인력 등을 활용해 운행률을 평소의 70% 수준으로 유지하겠다고 했어요.";
		
		int len = str.length();
		int index=0;
		
		while (index <len) {
			char ch = str.charAt(index);
			System.out.printf("[%d:] %c\n",index, ch);
			++index;
			//System.out.printf("[%d:] %c\n",index, str.charAt(index++)); 위에 3줄을 1줄로 줄인것.
		}
			
	}
}
