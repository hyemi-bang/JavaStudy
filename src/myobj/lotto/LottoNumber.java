package myobj.lotto;

import java.util.Arrays;

public class LottoNumber {

	// 당첨번호는 7개, 뽑는 번호는 6개 그래서 그때그떄 마다 길이가 달라지지만, 클래스를 따로 파기에는 아깝다
	int[] numbers;
	
	// 내가고른 int[]를 전달하면 인스턴스가 생성됨
	public LottoNumber(int[] numbers) {
		this.numbers = numbers;
	}

	// 당첨 번호인지 자동번호인지 선택하면 자동번호가 들어간 인스턴스가 생성됨
	public LottoNumber(boolean winNum) {
		if (winNum) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}
		generate();

	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 45 + 1);
	}

	// 현재 인스턴스의 넘버스 배열을 중복없는 랜덤번호로 가득 채울 예정
	// 리턴되는 것은 없지만
	public void generate() {
		int len = numbers.length;
		for (int i = 0; i < len; ++i) {
			numbers[i] = getRandomNumber();

			for (int j = 0; j < i; ++j) {
				if (numbers[i] == numbers[j]) {
					--i;
					break;
				}
			}
		}
	}

	// 당첨번호 인스턴스를 전달 받으면 등수값을 리턴는 메서드
	public int check(LottoNumber winNum) {

		int winLen = winNum.numbers.length;
		int guessLen = this.numbers.length;

		int winCount = 0;
		boolean hasBonus = false;

		if (winLen != 7) {
			return -1; // -1을 에러라고 지정을 하자~!
		}

		for (int i = 0; i < guessLen; ++i) {
			for (int j = 0; j < winLen; ++j) {
				if (this.numbers[i] == winNum.numbers[j]) {
					++winCount;

					// 당첨번호의 마지막 번호와 일치하면 bonus번호를 맞춘 것
					// bonus가 있네? 그러면 패스하고 지나가는
					if (!hasBonus && j == winLen - 1) {
						hasBonus = true;
					} // winLen - 1 -> 마지막번호를 의미

					break;

				}
			}
		}

		if (winCount == 6) {
			if (hasBonus) {
				return 2;
			} else {
				return 1; // 2등과 1등 찾기
			}
		}

		// 보너스 번호를 가지고 있다면 맞춘 번호를 1 뺀다
		// 왜냐면 3등부터는 보너스 번호를 가지고 있어도 점수에 반영이 안되니까
		winCount = hasBonus ? winCount - 1 : winCount;

		if (winCount == 5) {
			return 3; // 3등
		} else if (winCount == 4) {
			return 4; // 4등
		} else if (winCount == 3) {
			return 5; // 5등
		} else {
			return 0; // 당첨안됨
		}
	}

	public void print() {
		System.out.println(Arrays.toString(numbers));
	}

}
