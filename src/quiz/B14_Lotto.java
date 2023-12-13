package quiz;

import java.util.Arrays;

public class B14_Lotto {

	/*
		1. 랜덤으로 로또 당첨번호 생성 (1~45의 중복없는 랜덤 숫자 7개, 마지막번호는 보너스 번호) +)
 		1~45숫자를 뽑고, 예전에 뽑은 숫자가 있다면 같은 숫자인지 확인한다. 중복이 있다고 판단되면 다시 뽑는다.

 		2. 1등에 당첨될때까지 로또 번호를 자동으로 계속 생성하여 몇 번 만에 당첨되었는지 출력
 
		3. 1등에 당첨 될 때까지 뽑는 동안 2등에 당첨되는 번호들이 있다면 출력 2등은 : 1등 번호 5개 + a
		
		선생님 풀이 보고 다시 풀음.. ㅠ_ㅠ
	 */

	public static void main(String[] args) {

		// 1~45 번 방까지 숫자를 랜덤으로 채운다, 7개 출력한다
		// 중복이 없게
		int[] winNums = new int[7];

		int i = 0;
		int len = winNums.length;
		// 랜덤으로 로또 당첨번호 생성 (1~45의 랜덤 숫자 7개)
		while (i < len) {
			winNums[i] = (int) (Math.random() * 45 + 1);
			// 중복이 없는지 체크하기
			int j = 0; // 이전에 뽑은 랜덤 번호이고, i는 지금 뽑은 랜덤번호
			boolean duplicate = false; // 중복이 없다고 하고 시작한다
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true; // 중복을 하나 찾고 나면 while문에서 나간다
					break;
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}
		// 1등 당첨번호 출력하기
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums [%d 번] :  %d\n", i, winNums[i]);
		}

		// 2번 1등에 당첨될때까지 로또 번호를 자동으로 계속 생성하여 몇 번 만에 당첨되었는지 출력
		// 자동로또 번호 생성하기

		int[] tiketNums = new int[6];
		int buycount = 0;
		while (true) {
			i = 0;
			len = tiketNums.length;
			while (i < len) {
				tiketNums[i] = (int) (Math.random() * 45 + 1); // 자동로또 번호 6개 생성

				int j = 0; // 생성한 6개의 번호에 중복이 없는지 확인하기
				boolean duplicate = false;
				while (j < i) {
					if (tiketNums[j] == tiketNums[i]) {
						duplicate = true;
						break;
					}
					++j;
				}
				if (!duplicate) {
					++i;
				}
			}
			++buycount; // 자동로또 1등번호랑 같아질때까지 몇 번 생성하는지 체크

			// 당첨여부확인하기
			boolean hasBonusNum = false; // winNums의 마지막 번호는 보너스 번호임으로 boolean 타입 하나 만들음
			int winCount = 0;
			// 자동번호 하나씩 꺼내서 비교
			for (int tiketIndex = 0; tiketIndex < tiketNums.length; ++tiketIndex) {
				for (int winIndex = 0; winIndex < winNums.length; ++winIndex) {
					if (tiketNums[tiketIndex] == winNums[winIndex]) { // tiketNums의 인덱스들이랑 winNums의 인덱스들이랑 같니?
						if (winIndex == 6) {
							hasBonusNum = true;
						}
						++winCount;
					}
				}
			}
			// 당첨번호가 6개일때
			if (winCount == 6) {
				// 번호 출력하기,
				System.out.printf("%s vs %s\n", Arrays.toString(winNums), Arrays.toString(tiketNums));
				// 보너스 번호를 가지고 있으면 2등
				if (hasBonusNum) {
					System.out.println("2등 당첨 " + buycount + "회");
				}
				System.out.println(buycount + "회 만에 1등 당첨");
				break;
			}
			
		}
	}
}
// 1등에 당첨 될때까지 로또 번호 계속 생성
//
//		int[] tiketNum = new int[7];
//		int randomTry = 0;
//		int j = 0;
//
//		while (j < tiketNum.length) {
//			tiketNum[j] = (int) (Math.random() * 45 + 1);
//			boolean isDuplicate = false;
//
//			for (int k = 0; k < j; ++k) {
//				if (tiketNum[j] == tiketNum[k]) {
//					isDuplicate = true;
//					break;
//				}
//				
//			}
//			if (!isDuplicate) {
//				++j;
//			}
//			System.out.print(tiketNum[j] + " ");
//		}

//		int[] tiketnum = new int[7];
//
//int randomtry = 0;
//int tiketlen = tiketnum.length;
//
//
//while (i < tiketlen) {
//	tiketnum[i] = ((int) (Math.random() * 45 + 1));
//	int j = 0;
//	boolean duplicate = false;
//	while (j < i) {
//		if (tiketnum[j] == tiketnum[i]) {
//			duplicate = true;
//			break;
//		}
//		++j;
//	}
//	if (!duplicate) {
//		++i;
//	}
//}
//for (i = 0; i < tiketlen; ++i) {
//	System.out.printf("winNums[%d] : %d\n", i,tiketnum[i]);
//}
//for (i = 0; i < tiketlen; ++i) {
//	boolean dup = false;
//	if (tiketnum[i] != winningNum[i]) {
//		++randomtry;
//	} else if (tiketnum[i] == winningNum[i]) {
//		dup = true;	
//	}
//	
//	System.out.printf("당첨번호 :%d, 뽑은 번호 :%d, %d번 만에 당첨되었습니다."
//			, winningNum[i], tiketnum[i], randomtry);
//}