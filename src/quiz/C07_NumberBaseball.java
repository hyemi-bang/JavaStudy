package quiz;

import myobj.baseball.BaseballGame_T;
import myobj.baseball.BaseballGame_me;

/*
	#숫자 야구게임
	
	1. 게임이 시작되면 정답이 랜덤으로 생성된다
	2. 정답은 랜덤 4자리의 중복없는 숫자
	3. 플레이어에게 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다
	4. 플레이어가 중복되는 숫자를 입력하는 경우 다시 입력하게 한다
	5. 플레이어가 입력한 숫자의 번호와 위치가 맞으면 스트라이크
	6. 플레이어가 입력한 숫자의 번호만 맞고 위치는 다르면 볼
	7. 플레이어가 9번의 기회 안에 모든 숫자와 위치를 맞추면 사용자의 승리
	8. 모든 기회 소진시 플레이어 패배
	
	최대한 객체지향 적으로 만들기~

*/

public class C07_NumberBaseball {
	
	public static void main(String[] args) {
		
//		BaseballGame_me g1 = new BaseballGame_me();
//		g1.play();
		
		new BaseballGame_T().play();
	}


}
