package quiz;

public class B10_Gugudan2_while {
	
	
	/*
	구구단 출력 (while문 활용하여)
	
	1. 가로로 출력해보세요
	
	2단 : 2X1=2 2X2=4 .... // 한줄이 내용이 몇번 바뀌느냐, 맨 앞이 바깥쪽 반복문, 오른쪽이 안쪽반복문
	3단 : ..
	
	2. 세로로 출력해보세요
	2단    3단   ... // 줄이 바뀌면서 곱하기가 바뀌기 때문에, 바깥쪽 반복문이 곱이 되는것,
	2X1=2 3X1=3
	2X2=4 3X2=6
	.	  .
	.	  .
	
	
	*/

	public static void main(String[] args) {

		int line = 0;

		while (line < 8) {
			int row = line + 2;
			System.out.printf("%d단:", row);
			int mul = 1;
			while (mul < 9) {
				++mul;
				System.out.printf(" %dX%d=%-2d ", row, mul, row * mul);
			}
			System.out.println();
			++line;
		}
		System.out.println("================================");

		line = 0;
		while (line < 8) {
			int row = line + 2;
			System.out.printf("%d단\t", row);
			++line;
			int mul = 1;
			while (mul <= 9) {
				System.out.printf("%dX%d=%d\t", row, mul, row * mul);
				++mul;
			}
			System.out.println();

		}
		
		System.out.println("================================");
		
		
		int dan =2;
		while (dan <=9) {
			System.out.printf("%d단\t", dan++);
		}
		System.out.println();
		
		int gop = 1;
		
		while (gop<=9) {
			dan =2;
			while (dan <=9) {
				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
				++dan;
				
			}
			System.out.println();
			++gop;

			
		}
	}
}
