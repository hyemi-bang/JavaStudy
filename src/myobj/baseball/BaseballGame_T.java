package myobj.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame_T {
	
	Scanner sc = new Scanner(System.in);
	
	int[] answers;
	int chance = 9; // 기회 9번
	
	boolean DEBUG_MODE = true; // paly()메서드에 if문으로 넣어서 디버그모드가 true 일때만 정답 나오도록 설정한것
	
	public BaseballGame_T() {
		answers = new int[4]; // initAnswer()메서드 만들어서 정답 4개는 찰것이다.
	
		
		initAnswer(); // 정답넣을 자리
	}
	
	public void initAnswer() {
		for(int i = 0 ; i < answers.length; ++i) {
			answers[i] = (int)(Math.random()*10); // 0~9까지의 랜덤 숫자
			
			for(int j=0 ; j< i; ++j) { // 중복을 제거해라
				if(answers[i] == answers[j]) {
					--i;
				}
			}
		}
	}
	
	public void play() { // 만들어진 게임을 플레이 할 적에 기회가 9번 주어진다
		while (chance > 0) { 
			if (DEBUG_MODE) { // 디버그모드 =>> boolean 타입
			System.out.println(Arrays.toString(answers));
			}
			
			System.out.println("남은기회 : " + chance);
			System.out.print(">> ");
			String userGuess = sc.next(); // 문자로 받을 건지 숫자로 받을 건지 고민을 좀 한 후에 String or int 결정
			
			
			// 사용자가 입력한 userGuess와 현재 정답인 answers를 비교한 결과를 받아와야한다
			// 스트라이크도 받고 볼도 받고 다 맞았는지, 아예 못맞췄는지 뭐 그런거 필요한것 같다.
			
			PitchResult result = checkPitch(userGuess); // 공하나 던지는 것을 체크하려는 것
			
			System.out.printf("%s : %ds %db\n",
					result.getGuess(), result.getStrike(), result.getBall()); // 메서드로 해서 누군가 건드리지 못하게 만드는 방법
			
			if(result.strike == 4) {
				System.out.println("승리!!");
				break;
			}
			
			-- chance;
		}
	}
	// 체크결과 리턴해야 하는 값이 여러개인 경우
	// 데이터를 클래스로 묶어서 전달하는 방식을 고려하여, 아래와 같은 방식이 나온것이다~
	public PitchResult checkPitch(String userGuess) {
		char[] guess = userGuess.toCharArray();
		
		int strike =0;
		int ball =0;
		
		for (int i =0 ; i < answers.length; ++i) { // answers 0번에 j반복문 다 체크하고 
			
			for(int j = 0 ; j< guess.length;++j) {
				if(answers[i] == (guess[j]- '0' )) {
					if(i == j) {				// 비교해서 i랑 j랑 위치 까지 같으면 스트라이크다~
						++strike;
					} else {
						++ball;
					}
					break;
				}
			}
		}
		
		// 결과로 하나의 인스턴스를 샐성해서 리턴해준다.
		// 결과로 나오는게 많아질수록 이런식으로 클래스 하나 만들어서 진행 하는게 좋다.
		PitchResult result = new PitchResult(userGuess,strike,ball);
		return result;
	}

}
