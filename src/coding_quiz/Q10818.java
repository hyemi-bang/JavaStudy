package coding_quiz;

import java.util.Scanner;

public class Q10818 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 숫자 개수
		int[] numbers = new int[num];
		
		// 정수를 배열에 저장
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 최솟값과 최댓값을 저장할 변수 초기화
        int maxnum = numbers[0];
        int minnum = numbers[0];
        
        for(int i = 1; i < num; i++) {
        	 maxnum = Math.max(maxnum, numbers[i]);
             minnum = Math.min(minnum, numbers[i]);
        }
        
        // 최솟값과 최댓값 출력
        System.out.println(minnum + " " + maxnum);
	}

}
