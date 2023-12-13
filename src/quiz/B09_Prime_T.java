package quiz;

import java.util.Scanner;
/*
	 사용자가 정수를 입력하면 1부터 입력한 정수 사이에 있는 모든 소수를 출력
	 
	 소수 (prime) : 나누어 떨어지는 수가 1과 자기 자신 밖에 없는 수
	 1,2,3,5,7,11,13,17,19,23,29.....
	 
	 사용자가 10 입력하면 > 10과 1사이의 소수 2,3,5,7 이 나오도록
*/
public class B09_Prime_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 >");
		int num = sc.nextInt();

		for (int i = 2; i <= num; ++i) {
			boolean isPrime = true;
			
			//1> count 이용, 약수가 2개인지 검사하기
			//2> boolean 이용 2부터 i-1에 약수가 존재하면 소수가 아님
			//3> 2부터 루트i까지 약수가 존재하면 소수가 아님 -> B09_Prime 
			
			
			// int count = 0;

			// 이번숫자 i에 대한 약수 개수 검사
//			for (int chk = 1; chk <= i; ++chk) {
			
			for (int chk = 2; chk < i; ++chk) {
				if (i % chk == 0) { // 이건 약수
					isPrime = false;
					break;
					//++count;
					// System.out.printf("%d는 %d로 나누어 떨어집니다.+" + "[약수의 개수: %d개]\n", i, chk, count);

				}
			}
			// 검사가 끝났을때 약수가 2개라면 소수
			// System.out.printf("%d는 소수인가요? %s\n", i, count == 2);
			
			// if (count ==2 ) {
			if (isPrime) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}

}
