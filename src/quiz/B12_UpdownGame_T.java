package quiz;

import java.util.Scanner;

public class B12_UpdownGame_T {
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
	 
	※While문으로 많이 만든다.
	
	*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int MAX_CHANCE = 5;
		int chance = MAX_CHANCE;

		int answer = (int) (Math.random() * 100 + 1);
		boolean userWin = false;

		// System.out.println("정답 (테스트용) : " + answer);

		while (chance > 0) {
			System.out.print("숫자를 고르세요 (1 ~ 100) : ");
			int select = sc.nextInt();

			if (select > 100 || select < 1) {
				System.out.println("숫자의 범위를 올바르게 입력해주세요.");
				continue;
			}
			--chance;

			if (select > answer) {
				System.out.println("DOWN!");
			} else if (select < answer) {
				System.out.println("UP!");
			} else {
				System.out.println("정답입니다.");
				userWin = true;
				break;
			}

			System.out.println("남은 기회 : " + chance);
			
		}
		
		if (userWin) {
			System.out.printf("%d번 만에 맟추셨습니다.\n", (MAX_CHANCE - chance));
		} else {
			System.out.printf("패배하셨습니다... 정답은 %d 이었습니다.", answer);
		}
	}

}
