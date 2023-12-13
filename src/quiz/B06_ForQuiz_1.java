package quiz;

public class B06_ForQuiz_1 {
	public static void main(String[] args) {

		/*
 		 1. 1000부터 2000 사이의 8의 배수 모두 출력 
		 2. 100부터 300까지 총합 
		 3. 1000부터 2000까지의 10의 배수를 한줄에 5개씩 출력
		 
		 */
		// 중괄호를 벗어나면 {} 안에서 선언해 놓은 변수는 사라짐으로 또 같은 이름으로 선언이 가능하다.

		// 1. 1000부터 2000 사이의 8의 배수 모두 출력
		// A between B : A와 B를 모두 포함한다.
		for (int i = 1000; i <= 2000; ++i) {
			if (i % 8 == 0) { // 8의 배수만 출력문을 만날 수 있는 방법
				System.out.println(i);
			}
		}
		int i;
		for (i = 1000; i <= 2000; i += 8) {
			System.out.println(i);
		} // 이렇게 8씩 더해주는 것은, 시작을 1001로 하면 문제가 될 수 있다.
		System.out.println("반복문이 끝난 후의 i값 : " + i);

		// 2. 100부터 300까지 총합 (풀지못함, 아래 쓰앵님 해설)
		int total = 0; // int total; << 이렇게 초기화 없이 선언하면, 산술을 사용 할 수 없다.
		for (int num = 100; num <= 300; ++num) {
			total += num; // 100에서 계속 누적 연산을 하게 되고
		}
		System.out.println("다 더한 결과: " + total);

		// 3. 1000부터 2000까지의 10의 배수를 한줄에 5개씩 출력

		int count = 0;
		for (i = 1000; i <= 2000; ++i) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
				++count; // ( 한번 출력할때마다 하나씩 증가 )숫자를 출력하고 1증가 반복. 즉, 숫자를 출력한 횟수를 의미한다.
				// System.out.println(count + "번째 출력");>>> 1000 1번째 출력 이런식으로 출력됨
				if (count % 5 == 0) { // 숫자를 출력하는 횟수가 5의 배수라면 줄바꿈을 출력 
					System.out.println();
				}
			}
		}
	}

}


