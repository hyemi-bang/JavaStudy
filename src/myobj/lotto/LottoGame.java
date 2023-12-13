package myobj.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {
	Scanner sc = new Scanner(System.in);
	LottoNumber winNum = new LottoNumber(true);

	// (사용금액, 당첨 횟수, 손익 계산)
	// 당첨횟수는 int[]로 해야한다. 1등 ~ 5등 당첨안된거 까지의 여러개의 횟수가 나오니까
	int[] prizeCount = new int[6]; // 당첨횟수
	long[] prizeAmount = { 0, 5000L, 50000L, 1500000L, 80000000L, 1000000000L };

	public LottoNumber getLottoNumberManual() {
		int count = 0;
		int[] nums = new int[6]; // 사용자가 고르는 6개의 숫자

		while (count < 6) {
			// 배열이 0부터 시작하더라도, 사용자들은 1부터 시작하는게 보기 편하기 때문에 count +1로 진행하는 것
			System.out.printf("%d번째 숫자를 입력해주세요: ", count + 1);
			int num = sc.nextInt();

			if (num < 1 || num > 45) {
				System.out.println("1 ~ 45 사이의 숫자를 골라주세요.");
				continue;
			}

			boolean duplicate = false;
			for (int i = 0; i < count; ++i) {
				if (nums[i] == num) {
					System.out.println("중복되는 값이 있습니다. 다시 선택하세요.");
					duplicate = true;
					break; // 이 자리에서 continue 사용하면 for문에 사용되는것이지,
					// while문에 사용되는 것이 아니기 떄문에 boolean 타입을 만들어서 사용한다.
				}
			}
			if (duplicate) {
				continue;
			}

			// 올바를 순자를 잘 골라야 배열에 들어갈 수 있다.
			// 숫자 6개 잘 고르면 while문 탈출~
			// + 로또넘버로 감싸서 내보내야 하니까 ~
			// package myobj.lotto; 이 자바 파일에 LottoNumber라는 생성자 하나 더 만들러 간다!
			nums[count++] = num;
		}
		// 다 만든 1~45 사이의 중복값 없는 int[]을 전달해 인스턴스를 생성한 후 리턴을 한다
		return new LottoNumber(nums);
	}

	public void printGameinfo() {
		int spent = 0;
		long prize = 0;

//		prize += prizeCount[1] * 1000000000L;
//		prize += prizeCount[2] * 80000000L;
//		prize += prizeCount[3] * 1500000L;
//		prize += prizeCount[4] * 50000L;
//		prize += prizeCount[5] * 5000L;

		for (int i = 0; i < prizeCount.length; ++i) {
			spent += prizeCount[i] * 1000;
			prize += prizeCount[i] * prizeAmount[i];
		}
		System.out.printf("총 사용금액 : %d원\n", spent);
		System.out.printf("손익 : %d원\n", prize - spent);

		System.out.println("\n## 당첨이력 ##");
		for (int i = 1; i < prizeCount.length; ++i) {
			System.out.printf("%d등 : %d회\n", i, prizeCount[i]);
		}
		System.out.println("#########################\n");
	}

	public void play() {

		while (true) {
			System.out.println("1. 자동구매");
			System.out.println("2. 수동구매");
			System.out.println("3. 현재까지의 이력확인");
			System.out.println("4. 게임종료");
			System.out.print("> ");

			int userSelect = sc.nextInt();
			int result = -1;

			switch (userSelect) {
			case 1:
				result = new LottoNumber(false).check(winNum);
				break;
			case 2:
				result = getLottoNumberManual().check(winNum);
				// 메서드 만들기전에 어떻게 만들건지 생각하고 함수를 만들어야한다.
				// 또한 이 메서드의 리턴타입은 LottoNumber 타입이 될 것이다.
				break;
			case 3:
				printGameinfo();
				break;
			case 4:
				System.out.println("게임을 종료합니다.");
				return;
			default:
				break;
			}

			if (result != -1) {
				// 결과에 따라 소모한 금액과 당첨횟수 올려주기
				++prizeCount[result];

				System.out.println("디버깅용 당첨번호:" + Arrays.toString(winNum.numbers));

				if (result == 0) {
					System.out.println("당첨되지 않았습니다.");
				} else {
					System.out.printf("%d등 당첨 \n", result);
				}

			}
		}
	}
}
