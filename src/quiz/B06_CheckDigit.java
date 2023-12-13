package quiz;

import java.util.Scanner;

public class B06_CheckDigit {

	public static void main(String[] args) {
		//사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요. 		

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요 : ");

		int digit =0;
		
		// 입력받은 숫자를 10씩 나눠서 몇번 나눴는지 구하기
		
		for(int number = sc.nextInt(); number>0; number/=10) {
			System.out.printf("%d번째 나누기 : %d\n", digit++, number);
				}
		System.out.println(digit+"자리 숫자입니다.");
		
		
		
//		//숫자를 10배씩 크게 만들면서 10을 몇번 곱했는지 세어 알아내기
//			int number = sc.nextInt();
//			int digit = 0;
//			for (int compare = 1; compare <= number; compare*=10) {
//				System.out.println("compare"+ compare);
//						++digit;
//			}		
//		System.out.println("입력한 숫자는" + digit + "자리수 입니다.");		
	}
}
