package quiz;

import java.util.Scanner;

public class B09_Prime {
	
	/*
	 사용자가 정수를 입력하면 1부터 입력한 정수 사이에 있는 모든 소수를 출력
	 
	 소수 (prime) : 나누어 떨어지는 수가 1과 자기 자신 밖에 없는 수
	 1,2,3,5,7,11,13,17,19,23,29.....
	 
	 사용자가 10 입력하면 > 10과 1사이의 소수 2,3,5,7 이 나오도록
	 1부터 다 나눠서 나눠지는 약수의 개수가 1과 자기 자신뿐이도록 계산
	 
	 자연수 n이 소수인지 아닌지를 판정하려면, 소수 본문 이미지 1인 범위에 있는 모든 소수 p로 n을 나누어 보아, 
	 나누어 떨어지지 않으면 소수이고, 나누어 떨어지면 합성수이다. (네이버 지식백과)
	 >> 해서 Math.sqrt(a) 메서드를 사용 하고 싶었는데, 길을 잃었다.
	 >> 아래 선생님 풀이 !!
	 
	*/
	
	// 2부터 루트i까지 약수가 존재하면 소수가 아님

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >");
		
		int num = sc.nextInt();

		for (int i = 2; i <= num; ++i) {
			boolean isPrime = true;
			
			for (int chk = 2; chk <= Math.sqrt(i); ++chk) {
				if (i % chk == 0) { 
					isPrime = false;
					break;
				}
			}
					if (isPrime) {
						System.out.print(i+ " ");
					}
				}
				System.out.println();
			}

	
}
