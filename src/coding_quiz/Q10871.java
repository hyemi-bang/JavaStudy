package coding_quiz;

import java.util.Scanner;

public class Q10871 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N과 X 입력 받기
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		// 수열 A
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		//	printNumMinusN(a, x);
		
		for(int i = 0 ; i < n; i++) {
			if(a[i] < x) {
				System.out.print(a[i] + "");
			}
		}
		
	}
	/*
		public static void printNumMinusN(int[] a, int x) {
		StringBuilder sb = new StringBuilder();
		
		for(int num : a) {
			if(num < x) {
				sb.append(num).append(" ");
			}
		}
		System.out.println(sb.toString());
		
	}
	*/

}
