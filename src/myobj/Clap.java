package myobj;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clap {


	public static void startGame(Random ran) {
		System.out.println("369게임을 시작하겠습니다 >");
		currentPlayer = (ran.nextDouble() < 0.5) ? "user" : "computer";
		System.out.println(currentPlayer + " 차례입니다.");

//			boolean userTurn = random.nextBoolean();

//			switch (gameTurn) {
//			case "user" :
//				break;
//			case "computer" :
//				break;
//			default:
//			break;
//			} // 굳이 필요없나????
	}
	
	
	static String currentPlayer;

	public static void userInput() {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		boolean gameOver = true;

		startGame(ran);
		while (!gameOver) {

			if (currentPlayer.equals("user")) {// 사용자 차례일때
				System.out.println("입력하세요 : ");
				int userNumber = sc.nextInt();
				String numStr = "" + userNumber;
				// number에 3, 6, 9가 포함되어 있으면 "짝" 입력하고 차례 변경
			

			} else { // 컴퓨터 차례 0~ 3번미만 까지는 짝하고, 나머지 한번은 random 해서 틀림 출력, 게임종료
				int randomNumber = ran.nextInt(4); // 75%는 100분의 3
				if (randomNumber < 3) {
					System.out.println("짝");
				} else {
					System.out.println("? ");
					gameOver = true;
					System.out.println("컴퓨터가 패배했습니다!");
				}
				currentPlayer = "user";
			}

			System.out.println("게임이 종료되었습니다.");
		}

	}




}
