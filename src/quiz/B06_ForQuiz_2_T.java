package quiz;

import java.util.Scanner;

public class B06_ForQuiz_2_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력 :");
		int lastNum = sc.nextInt(); // lastnumber를 받고 있다라는 표시

		if (lastNum >= 0) { // 양수
			for (int i = 0, cnt = 0; i <= lastNum; ++i) { // count 줄임 cnt
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}

		} else { // 음수
			for (int i = 0, cnt = 0; i >= lastNum; --i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}


//package quiz;
//
//public class B06_ForQuiz_T_02 {
//	// B06_ForQuiz_2_T 하나로 만들어보기
//	public static void main(String[] args) {
//	
//		int lastNum =-80; // 입력을 받았다고 가정
//		
//		boolean isMinus = lastNum <0 ; // 비교연산은 boolean 타입으로 담아놓고 사용
//		lastNum = Math.abs(lastNum); // 절대값으로 만들어라
//		
//		for(int i =0, cnt=0; i<= lastNum;++i) {
//			if(i%5==0) {
//				if(isMinus) {
//					System.out.printf("-%d",i); 
//				}else {
//					System.out.print(i+" ");
//				}
//				
//				if(++cnt %10==0) {
//					System.out.println();
//				}
//			}
//		}
//
//	}
//
//}

