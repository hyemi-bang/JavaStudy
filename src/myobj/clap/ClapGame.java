package myobj.clap;

import java.util.Arrays;
import java.util.Scanner;

public class ClapGame {

	final int[] CLAP_NUMBERS;

//	String[] players = {"플레이어", "컴퓨터"}; 이렇게 사용하지 않고, 아래처럼 사용하겠다. ClapGamePlayer 배열을 만들고 그 아래 인스턴스들을 넣어놓을 수 있다.
	ClapGamePlayer[] players = { // String 보다 좋은 점은 우리가 만들어 놓은 기능들을 사용할 수 있다는 것
			new ClapGamePlayer("플레이어"), new ClapGamePlayer("컴퓨터") };

	public ClapGame() { 
		// 후에 번호를 바꾸게 된다면 메인에서 ClapGame game1 = new int[]{번호들} & game1.play() 로 번호를 설정하면 된다~
		CLAP_NUMBERS = new int[] { 3, 6, 9 };
	}

	// 내가 직접 인트형 배열을 전달해서 박수 번호를 바꿀 수 있다 이런게 생성자다~
	// ... 매개변수는 생성자에 사용할 수 없다
	public ClapGame(int[] clapNums) {
		CLAP_NUMBERS = clapNums;
	}

	// 숫자 정답을 받으면 문자열 369 정답을 리턴하는 메서드
	// 이걸 활용하여 play에서 사용되고 있는 것이다
	public String getAnswerString(int answer) {
		// 숫자가 들어오면 정답인지 알아보기 위한 함수

		// 일단 이 숫자가 박수를 몇번 쳐야하는지 새
		String answerStr = "";
		int original = answer;

		while (answer > 0) {
			int digit = answer % 10;
			for(int i = 0; i <CLAP_NUMBERS.length; ++i) { 
				if(digit == CLAP_NUMBERS[i]) { // CLAP_NUMBERS의 배열을 하나씩 꺼낸다음에 겹치면 짝 출력
					answerStr += '짝';
					break;
				} /// 369가 아닌 다른 번호들로 게임을 하게 되었을때도 유용하기 위해서 CLAP_NUMBERS를 사용한다.
			}
//			if (digit != 0 && digit % 3 == 0) { // digit !=0 안해놓으면 10도 ㅉ으로 인식한다.
//				answerStr += "ㅉ";
//			}
			answer /= 10; // 한자리씩 캐면서 해당자리에 CLAP_NUMBERS가 있는지
		}

		if (answerStr.length() == 0) { // 짝이 하나도 안나오는 녀석이 있을 수 있으니까
			answerStr += original; // 그러면 숫자를 그대로 내놓으면 된다!
		}

		return answerStr;

	}

	// 정답 문자열과 사용자가 입력한 문자열을 비교하여 정답인지 알려주는 메서드
	public boolean checkAnswer(String answerStr, String userAnswer) {
		// 2 가지의 답을 받을껀데, answerStr는 번호를 가지고 만들어놓은 정답이 들어올것

		// 첫번째 문자가 숫자냐 문자냐
		boolean isClapAnswer = answerStr.charAt(0) > '9';
		// ch가 9보다 크면 박수치는 정답이다 첫번째 글자에서 ㅉ이 들어오면 9보다 크니까 박수치는 정답이 들어오겠지

		if(isClapAnswer) { // 길이가 다르면 나가겠다. 짝을 두번 입력해도 인식하고 통과시켜주기 때문에
			if(userAnswer.length() != answerStr.length()) {
				return false;
			}
		}
		// 두번째 한글자 씩 보면서 글자냐 숫자냐 일때
		if (isClapAnswer) {
			for (int i = 0; i < answerStr.length(); ++i) {
				char ch = userAnswer.charAt(i);
				if (ch != 'ㅉ' && ch != '짝') {
					return false; // ㅉ, 짝 이 들어오면 false 되서 빠져나가
				}
			}
			return true;
		} else { // else일때는 숫자임 userAnswer랑 answerStr이 숫자면 통과다
			return userAnswer.equals(answerStr);
		}

	}

	public void play() {

		System.out.printf("%s에 박수를 쳐야하는 게임입니다. \n", Arrays.toString(CLAP_NUMBERS));

		int turn = (int) (Math.random() * 2);
		System.out.printf("'%s'가 시작합니다.\n", players[turn].getName());
		// getName을 사용한 이유는 우리가 name으로 꺼내서 쓰면은 여러 문제가 생길 수 있다.
		// players[turn].name = "바보"; 이런식으로 누군가 수정할 수 있는 길이 열린다
		// 즉! public class ClapGamePlayer의 .getName() 메서드로 만들어 놓은 것이기때문에 읽기전용의 느낌으로 아무나
		// 수정할 수 없다.

		Scanner sc = new Scanner(System.in);

		int answer = 1;
		// 1(숫자)를 보냈을때 했을때 뭐가 369 정답인지 알려주는 함수가 있으면 좋을것 같다.

		while (true) { // 반복하면서 배열에서 한명씩 계속 나오도록 설정
			ClapGamePlayer player = players[turn];

			String answerStr = getAnswerString(answer++); // 정답을 하나씩 받아올 수 있게 되었다.
			String userAnswer; // 이제 유저의 답이 정답인지 체크를 해야한다
			// System.out.printf("이번정답 '%s' \n",answerStr); 정답을 알기위해 만들어놓은것

			String name = player.getName();
			System.out.printf("%s -> ", name);

			if (name.equals("플레이어")) {
				userAnswer = player.manual(sc);
			} else {
				userAnswer = player.auto(answerStr); // answerStr 가지고 확률적으로 만들어주세여
				System.out.println(userAnswer); // 컴퓨터가 입력하는 걸 확인하기
			}

			// 결과적으로 answerStr == userAnswer 같은지 확인을 해야한다
			// ㅉ, 짝 모두 정답이다

			boolean correct = checkAnswer(answerStr, userAnswer);
			if (!correct) {
				System.out.printf("'%s'의 패배 \n", player.getName());
				break;
			}
			turn = (turn + 1) % players.length;
		}

	}

}
