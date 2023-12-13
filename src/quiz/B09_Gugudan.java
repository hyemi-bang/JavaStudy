package quiz;

public class B09_Gugudan {
	
	/*
	구구단 출력
	
	1. 가로로 출력해보세요
	
	2단 : 2X1=2 2X2=4 .... // 한줄이 내용이 몇번 바뀌느냐, 맨 앞이 바깥for문, 오른쪽이 안쪽for문
	3단 : ..
	
	2. 세로로 출력해보세요
	2단    3단   ... // 줄이 바뀌면서 곱하기가 바뀌기 때문에, 바깥쪽 반복문이 곱이 되는것,
	2X1=2 3X1=3
	2X2=4 3X2=6
	.	  .
	.	  .
	
	
	*/

	public static void main(String[] args) {

		for (int line = 0; line < 8; ++line) { // 한줄의 시작, 몇 번째 줄인지를 의미
			int step = line + 2; //
			System.out.printf("%d단: ", step);
			for (int mul = 1; mul <= 9; ++mul) {
				System.out.printf("%dX%d=%-2d ", step, mul, step * mul);
			} // %--숫자d : 숫자만큼 자리수를 확보하면서 오른쪽 빈자리 공백 (123- - -)

			System.out.println(); // 한 줄의 시작

		}
		System.out.println();
		int dan, gop;
		for (dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단\t", dan);
		}
		System.out.println();
		for (gop = 1; gop <= 9; ++gop) {
			for (dan = 2; dan <= 9; ++dan) {
				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println(); // 선생님 풀이
		for (int line = 0; line < 10; ++line) {
			int mul = line;
			for (int step = 2; step <= 9; ++step) {
				if (line == 0) {
					System.out.printf("%d단\t\t", step);
				} else {
					System.out.printf("%d X %d = %d\t",
							step, mul, step * mul);
				}
			}
			System.out.println();
		}

	}

}
