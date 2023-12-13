package quiz;

import java.util.Scanner;

public class C02_FunctionalUpdown {
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
	
	// 함수로 만들기 (함수를 어떻게 사용해야하는지 생각해보기~)
	
	/** 랜덤으로 정답을 하나 생성하여 받아오는 기능 */
	public static int getWinNum(int start, int end) {
		
		// (end - start + 1) : 범위 내의 숫자 개수
		// start  : 시작값
		
		return(int)(Math.random() * (end - start + 1) + start);
	}
	//** 사용자로부터 입력을 하나 받아오는 기능 */
	public static int getUserGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 맞춰보세요 :");
		return sc.nextInt();

	}
	/**
	 * 사용자가 추측한 값의 결과를 반환한다
	 * @param userGuss : 사용자가 추측한 번호
	 * @param winNum : 승리번호
	 * @return 0 : Up, 1 : Down, 2: Win
	 */
	public static int checkWin(int userGuss, int winNum) {
		if(userGuss == winNum) {
			return 2;
		} else if(userGuss > winNum) {
			return 1;
		} else if(userGuss < winNum) {
			return 0;
		} 
	return -1; // 잘못 입력하였다 알려줄 값
		
		
	}

	public static void main(String[] args) {
		int start = 1;
		int end =100;
		
		int winNum = getWinNum(start,end);
		int chance = 5;
		
		while(chance > 0) {
			int userGuess;
			while (true) {
				userGuess = getUserGuess();
				if(userGuess >= start && userGuess <= end ) {
					break;
				}
				System.out.printf("%d ~ %d 사이의 값을 입력해주세요. \n", start, end);
			}
			
			// up, down, correct 3가지 결과를 리턴할수 있는 결과값은 String(용량이큼), 숫자로 0,1,2로 하는게 죻
			int result = checkWin(userGuess, winNum);
			
			switch (result) {
				case 0 :
					System.out.printf("UP! (남은기회 : %d )\n", --chance);
					break;
				case 1 :
					System.out.printf("DOWN!(남은기회 : %d )\n", --chance);
					-- chance;
					break;
				case 2:
					System.out.println("정답입니다.");
					return; // break 대신 return을 하는 것은 메인 함수로 돌아가는 것임으로 프로그램 종료를 의미한다
				case -1:
					System.out.println("값 체크 도중 에러가 발생했습니다.");
					return;
				default:
					System.out.println("예측하지 못한 값이 발생했습니다.");
					return;
					
			}
		}
		System.out.printf("기회를 모두 사용하셨습니다. 정답은 %d이었습니다\n",winNum);

	}

}
