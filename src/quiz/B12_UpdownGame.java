package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_UpdownGame {
	/*
	 #updown 게임 만들기
	 
	 1. 게임이 시작되면 1~100 사이 랜덤 숫자를 정답으로 입력 (사용자에게는 비밀)
	 2. 사용자가 숫자를 입력하면 up, down, 정답인지 알려주기
	 3. 정답이 입력한 숫자보다 크면 up
	 	정답이 입력한 숫자보다 작다면 down
	 	정답이 입력한 숫자와 일치하면 정답
	 4. 정답이 입력한 숫자와 일치하면 정답이라고 알려준 후 플레이어 승리
	 	정답을 맞추면 몇 번만에 맞췄는지 알려주고 프로그램 종료
	 5. 5번안에 못맞추면 정답을 알려주고, 플레이어의 패배
	 6.	정답을 맞추면 몇 번만에 맞췄는지 알려주고 프로그램 종료
	 7. 사용자가 1~100 범위를 벗어나는 숫자를 입력하면 다시 입력하게 해준다 (기회소진 되지 않고)
	 

	*/

	public static void main(String[] args) {
		Random ran = new Random();
		int number = ran.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		for (int count = 1; count < 6; ++count) {

			if (count == 6) {
				System.out.println("실패 하셨습니다.");
				break;
			}

			System.out.print("1 ~ 100 사이 숫자 입력 > ");
			int usernum = sc.nextInt();

			if (usernum < 1 || usernum > 100) {
				System.out.println("잘못 입력하셨습니다, 다시 입력하세요");
				count--;
				continue;
			}

			if (number >= 1 && number <= 100) {
				if (usernum < number) {
					System.out.println("up / 입력하세요 > ");
				} else if (usernum > number) {
					System.out.println("down / 입력하세요 > ");
				} else {
					System.out.println("정답입니다.※ 경 축 ※");
					break;
				}
			}
			System.out.printf("남은 기회: %d\n", 5 - count);
		}
		System.out.printf("정답은 %d 입니다 ", number);
		
	
	}

}
