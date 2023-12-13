package quiz;

import java.util.Arrays;
import myobj.GetUserInput;
import myobj.getWinRandomNum45;


public class C04_LottoGame {

	/*
		1. 당첨번호는 7개이고, 1등 당첨이 되면 다음 당첨번호로 넘어간다
		랜덤으로 로또 당첨번호 생성 (1~45의 중복없는 랜덤 숫자 7개, 마지막번호는 보너스 번호)
 		1~45숫자를 뽑고, 예전에 뽑은 숫자가 있다면 같은 숫자인지 확인한다. 중복이 있다고 판단되면 다시 뽑는다.

 		2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야한다
 			(자동기능사용가능)
 		
 		3. 1등 앞에 6자리 숫자 맞춤		 	: 10억원
 		   2등 6개의 숫자 (보너스번호가 포함된)	: 8천만원
 		   3등 5개의 숫자 (보너스 번호 미포함)	: 150만원
 		   4등 4개의 숫자 (보너스 번호 미포함)	: 5만원
 		   5등 3개의 숫자 (보너스 번호 미포함)	: 5천원
 		   
 		4. 자동구매 / 수동구매 / 이력확인이 가능하다 (Switch case 사용한건가 싶다)
 			1. 자동구매
 			2. 수동무개
 			3. 현재까지의 이력확인
 				(사용금액, 당첨 횟수, 손익 계산)
 			4. 게임종료
 		   
	 */
	
	// 클래스와 함수를 사용하여~
	
	// 함수 : 랜덤으로 정답을 하나 생성하여 받아오는 기능 + 중복이 없도록 설정

//	public static int[] getWinNum() {
//		int[] winNums = new int[7];
//		int i = 0;
//
//		while (i < winNums.length) {
//			winNums[i] = (int) (Math.random() * 45 + 1);
//			
//			int j = 0; 
//			boolean duplicate = false; 
//			while (j < i) {
//				if (winNums[j] == winNums[i]) {
//					duplicate = true;
//					break;
//				}
//				++j;
//			}
//			if (!duplicate) {
//				++i;
//			}
//		}
//		for (i = 0; i < winNums.length; ++i) {
//			return winNums;
//		}
//		return winNums;
//
//
//	}

	//클래스 : 사용자로부터 입력을 6개 받아오는 기능
	// C02FunctionalUpdown게임에 사용자로부터 입력 받아오는 기능적혀있음
	
	
	//함수 : 사용자가 자동기능 으로 랜덤 6자리 받아오는 기능

	public static int[] getRanNums() {
		int[] randomNums = new int[6];

		int i = 0;

		while (i < randomNums.length) {
			randomNums[i] = (int) (Math.random() * 45 + 1);

			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (randomNums[j] == randomNums[i]) {
					duplicate = true;
					break;
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}
		return randomNums;
	}
	
	public static int checkWin(int userGuss, int winNum) {
		if(userGuss == winNum) { // 정답일때 단, -보너스번호
			return 2;
		} 
		// 5개 + 보너스번호
		// 4개 -보너스번호
		// 3개 -보너스번호
		
	return -1; // 잘못 입력하였다 알려줄 값
		
		
	}
	public static void main(String[] args) {
		
		// 함수로 만든 로또번호 7자리 당첨숫자 
		int[] WinNums = getWinRandomNum45.getWinNum();
		// 확인용 : System.out.println(Arrays.toString((getWinNum())));

		//클래스로 만든 6자리 숫자 입력용
		int[] userNumbers = GetUserInput.getUserNums();
		System.out.println(Arrays.toString(userNumbers));
		
		// 사용자가 자동으로 6자리 출력 희망할때
		
		boolean choice = false;
		if(!choice) {
			System.out.println(Arrays.toString(getRanNums()));
		}
		
		// 당첨번호와 사용자가 희망한 번호 한자리씩 비교하기
		boolean trueNums = false;
		int winCount = 0;
		
		for (int userIndex = 0; userIndex < userNumbers.length; ++userIndex) {
			for(int winIndex = 0 ; winIndex < WinNums.length; ++winIndex) {
				if (userNumbers[userIndex] == WinNums[winIndex]) {
					if(winIndex == 6) {
						trueNums =true;
					}
					++winCount;
				}
			}
		}
		// 함수로 만든 랜덤 정답에 1등이 당첨되면 다시 랜덤만들게 설정 반복문
		
		// switch-case 기능을 사용해서 1등은 얼마 2등은 얼마 당첨되셨습니다~ 출력
	

	}
}

