package coding_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5597 {
	
	
	public static void main(String[] args) {
		/*
		30명 학생중 28명만 제출함, 제출 안한 2명 오름차순으로 나타내기
		*/
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] submitNums = new boolean[31];
		// 출석번호 1번부터 30번
		for(int  i =0; i <28; i++) {
			int numbers = sc.nextInt();
			submitNums[numbers] = true;
		}
		
		//누락된 번호
		List<Integer> missingNums = new ArrayList<>();
		for(int i = 1; i <= 30; i++) {
			if(!submitNums[i]) {
				missingNums.add(i);
			}
		}
		
		System.out.println(missingNums.get(0));
		System.out.println(missingNums.get(1));
	}

}
