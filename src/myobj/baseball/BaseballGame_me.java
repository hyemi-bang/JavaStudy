package myobj.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame_me {

	int[] answerArr; //
	int attemptCount = 9; // 남은 시도 횟수 9부터 시작해서 -- 해나갈 예정, 최종적으로 얼마나 기회가 남았는지 보기 위함

	public BaseballGame_me() {
		answerArr = makeAnswerArr(10);
	}

	public BaseballGame_me(int size) {
		answerArr = makeAnswerArr(size);
	}

	// 0~9까지의 숫자 중에 4개를 중복없는 랜덤으로 만들기

	public int[] makeAnswerArr(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < size; ++i) {
			arr[i] = -1;
		}

		return random(arr);
	}

	public int[] random(int[] arr) {

		for (int i = 0; i < 4; ++i) {
			arr[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; ++j) { // 중복된 애들 빼기
				if (arr[i] == arr[j]) {
					--i;
					break;
				}
			}

		}
		return arr;
	}

//	public int stab(int num) {
//		int index = num - 1;
//
//		if (index < 0 || index >= answerArr.length) {
//			return -1;
//		}
//		int answer = answerArr[index];
//
//		if (answer == 0) {
//			answerArr[index] = 2;
//		}
//		return answer;
//	}

	// 스트라이크 1, 볼 2, 없으면 0
	// 플레이어가 입력한 숫자의 번호와 위치가 맞으면 스트라이크
	// 플레이어가 입력한 숫자의 번호만 맞고 위치는 다르면 볼
	// 9번의 기회안에 4개 숫자 맞추면 사용자 승리
	public void print(int[] player) {

		for (int i = 0; i < answerArr.length; ++i) {
			int strike = 0;
			int ball = 0;

			if (answerArr[i] == player[i]) {
				strike++;
			} else if (check(player[i])) {
				ball++;
			}

			if (strike == 4) {
				System.out.println("축하합니다! 정답을 맞추셨습니다. 시도 횟수: " + (9 - attemptCount));
			} else {
				System.out.println(strike + "스트라이크 " + ball + "볼");
				attemptCount--;
			}
		}
	}

	public boolean check(int num) {
		for (int digit : answerArr) {
			if (digit == num) {
				return true;
			}
		}
		return false;
	}

	// 9번동안 반복할 수 있고 모든 기회 소진시 플레이어 패배
	public void play() {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 야구 게임을 시작합니다. 4자리 숫자를 맞춰보세요~~ ");

		while (attemptCount > 0) {

			System.out.print("입력: ");
			String input = sc.nextLine(); //  int로 바꿔 아니면 한글자씩 꺼내서 int로 비교
			
			// 무언갈 생성해가지구~ print 메소드랑 비교할 수 있게 하고 싶음
//			int[] guess = new int
			
			// 숫자를 받아 스트라이크랑 볼을 비교해서 출력해 (print 메서드를 가져와서 출력해?)
		
			if (attemptCount == 0) {
				System.out.println("모든 기회를 소진했습니다. 정답은 " + Arrays.toString(answerArr) + "입니다.");
				break;
			}
		}

	}

}
