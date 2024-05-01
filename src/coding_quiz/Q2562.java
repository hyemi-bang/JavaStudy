package coding_quiz;

import java.util.Scanner;

public class Q2562 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		
		for(int i =0; i < 9; i++) {
			array[i] = sc.nextInt();
		}
		
		int maxNum = array[0];
		int maxIndex = 0;
		
		for(int i = 0 ; i < 9; i++) {
			if(maxNum <= array[i]) {
				maxNum = array[i];
				maxIndex = i + 1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(maxIndex);
		
	}

}
