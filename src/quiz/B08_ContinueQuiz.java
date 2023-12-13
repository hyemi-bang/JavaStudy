package quiz;

public class B08_ContinueQuiz {
	
	//1. 600 ~800사이의 7의 배수를 모두 출력하기
	//2. 1~200 까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자 모두 출력
	//3. 출력한 모든 숫자의 합을 출력하기 

	public static void main(String[] args) {
		int sum = 0;
		//1. 600 ~800사이의 7의 배수를 모두 출력하기
		for (int i = 600; i <= 800; ++i) {
			if (i % 7 != 0) {
				continue;
			}
			sum += i;
			System.out.print(i + " ");
		}

		System.out.println();
		//2. 1~200 까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자 모두 출력
		for (int i = 1; i <= 200; ++i) {
			if (i % 2 == 0 || i % 3 == 0) { // 2의 배수와 3의 배수를 만나면 다음반복으로 넘어가기때문
				continue;
			}
			sum += i;
			System.out.print(i + " ");
		}

		System.out.println();
		//3. 출력한 모든 숫자의 합을 출력하기
		System.out.println("모든 숫자의 합 :" + sum);
	}

}
