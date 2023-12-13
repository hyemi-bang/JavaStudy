package quiz;

import java.util.Scanner;

public class B03_If_AppleQuiz {
	public static void main(String[] args) {
		
		/*
		 사과를 10개씩 담을 수 있는 바구니가 있을때
		 사용자가 사과의 개수를 입력하면
		 사과를 모두 담기 위해 바구니가 총 몇 개 필요한지 알려주는 프로그램 만들어보세요.
		*/
		
		// 2차> 풀리긴하지만, - 개수의 사과에 대해서는 대처할 수 없음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력해 주세요. :");
		int apple = sc.nextInt();
		int basket= apple/10;
		if(apple%10!=0.0) { 
			System.out.printf("%d개의 바구니가 필요합니다.\n", basket+1);		
		} else {
			System.out.printf("%d 개의 바구니가 필요합니다.\n", basket);
		}
		
	}
}

/* 1차> 
  		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력해 주세요. :");
		int apple = sc.nextInt();
 	
		if(apple<=10) {
			System.out.println("바구니가 1개 필요합니다.");
		} else if( 0<apple && apple>10 && apple<=20) {
			System.out.println("바구니가 2개 필요합니다.");
			} else if(apple>20 && apple<=30) {
				System.out.println("바구니가 3개 필요합니다.");
				} else if(apple>30 && apple<=40) {
					System.out.println("바구니가 4개 필요합니다.");
					} else if(apple>40 && apple<=50) {
						System.out.println("바구니가 5개 필요합니다.");
					} 
				else {
					System.out.println("더 이상 주문 불가능합니다. 50개 이하로 입력해주세요.");		
					}
					
 */

