package quiz;

import myobj.clap.ClapGame;

public class C04_369Game {

	/*
	  
	  컴퓨터와 번갈아 가며 진행하는 369게임만들기 
	  1> 컴퓨터와 사용자의 1대1 대결로 진행 
	  2> 먼저 하는 사람은 랜덤으로 결정된다 
	  3>사용자는 3,6,9가 포함된 숫자마다 "짝" 또는 "ㅉ" 입력해야한다 
	  4> 컴퓨터는 자기 차례가 되면 75% 확률로 정답을 말하고 25% 확률로 오답을 말한다 
	  5>오답을 말하는 쪽이 패배하고 게임이 끝난다
	
	  ++)추가적으로 이후에 게임을 만들때 박수 치는 숫자를 랜덤으로 만들어주는 게임도 만들어보시오 이건 수업 이후에~
	 
	 
	 ** 게임 진행 클래스 1개
	 ** 입력이 맞는지 기능 체크하는 파일 1개 해서 게임진행쪽에 출력
	 */

	public static void main(String[] args) {
		

		ClapGame game1 = new ClapGame();
		
		// ClapGame game1 = new ClapGame(new int[] {1,5,8});
		
		game1.play();
		
		
	


	}

}
