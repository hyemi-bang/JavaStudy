package quiz;

import java.util.Arrays;

public class B14_Lotto_T {

	public static void main(String[] args) {

		int[] winNums = new int[7];

		int i = 0;
		int len = winNums.length;

		// 값 넣기
		while (i < len) {
			winNums[i] = (int) (Math.random() * 45 + 1); // i는 현재 뽑은 숫자의 개수이다

			// 여태까지 뽑은 숫자 모두 검사
			int j = 0; // j는 여태까지 뽑았던 숫자들의 인덱스
			boolean duplicate = false; // 일단은 중복이 없다 하고 시작
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break; // 중복을 하나 찾고 나면 while문에서 나간다
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}

		// 출력하기
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums[%d] : %d\n", i, winNums[i]);
		}

		// 자동 로또 돌리기
		int[] userNums = new int[6];
		int buyCount = 0;
		// 무한으로 반복
		while (true) {
			i = 0;
			len = userNums.length;
			while (i < len) {
				userNums[i] = (int) (Math.random() * 45 + 1);

				int j = 0;
				boolean duplicate = false;
				while (j < i) {
					if (userNums[j] == userNums[i]) {
						duplicate = true;
						break;
					}
					++j;
				}
				if (!duplicate) {
					++i;
				}
			}
			++buyCount;

			// 당첨여부 확인
			// 당첨번호 7와 자동번호 6개 비교
			boolean hasBonusNum = false;
			int winCount = 0;
			// 자동번호 하나마다 모든 당첨번호를 검사한다
			for (int userIndex = 0; userIndex < userNums.length; ++userIndex) {
				for (int winIndex = 0; winIndex < winNums.length; ++winIndex) {
					if (userNums[userIndex] == winNums[winIndex]) { 
						// 해당 번호가 당첨번호의 마지막 번호 (보너스 번호)인 경우
						if (winIndex == 6) {
							hasBonusNum = true;
						}
						++winCount;

					}
				}
			}
			// 당첨번호가 6개일때
			if (winCount == 6) {
				// 번호 출력하기, 배열을 문자열로 변환하여 출력하는 방법 "Arrays.toString(arr)" & import
				// java.util.Arrays 필요하다.
				// System.out.printf("%s vs %s\n", winNums, userNums); 이상한 문자가 출력이되기때문에 ( 아마 이 이상한 문자는 주소인듯 하다 )
				System.out.printf("%s vs %s\n", Arrays.toString(winNums), Arrays.toString(userNums));

				// 보너스 번호를 가지고 있으면 2등
				if (hasBonusNum) {
					System.out.println("2등 당첨 " + buyCount + "회");
				}
				System.out.println(buyCount + "회 만에 1등 당첨");
				break;
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}

}
