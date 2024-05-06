package coding_quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10813 {
	
	public static void main(String[] args) {
		/*
		 바구니는 총 1~N개
		 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
		 M번 공을 바꿀텐데, 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환
		 M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성
		 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)
		 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법
		 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
		*/
		
		Scanner sc = new Scanner(System.in);
		// 바구니의 개수 N과 공을 교환할 횟수 M을 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 바구니와 공의 상태를 저장할 맵 생성
		Map<Integer, Integer> baskets = new HashMap<>();
		for(int i = 1; i <=n ; i++) {
			baskets.put(i, i); // 초기에는 각 바구니에 해당하는 공의 번호가 바구니 번호와 같음
		}
		
		//공 교환
		for(int ball =0; ball < m ; ball++ ) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = baskets.get(i);
			System.out.println("debug temp" + temp );
			baskets.put(i, baskets.get(j));
			System.out.println("debug i" + i );
			System.out.println("debug baskets.get(j)" + baskets.get(j) );
			baskets.put(j, temp);
			System.out.println("debug j" + j );
			System.out.println("debug temp" + temp );
		}
		
		for(int i = 1; i <=n; i++) {
			System.out.print(baskets.get(i) + " ");
		}
		
	}

}
