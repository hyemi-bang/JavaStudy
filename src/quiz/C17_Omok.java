package quiz;

import java.util.Scanner;

import myobj.omok2.OmokBoard;

public class C17_Omok {
	/*
	 이것을 활용하여 오목을 만들어 보세요
	 
	 한 명씩 번갈아 가며 돌을 놓는다
	 >> 몇열, 몇행을 입력받아야한다.
	 
	 한 게임에 각 플레이어 당 한번씩 무르기 기능이 있다. (무르기하면 그 사람이 돌을 놓기 전으로 돌아간다. 기회는 1번 소진되면 사용할 수 없다)
	 -> if(sc.nextLine에 무르기를 입력하면)
	 -> (println(한 수 무르시겠습니까? (Y/N)) -> Y 누르면 돌 누르기 이전으로 돌아가기)
	 돌이 놓인 자리에는 놓을 수 없다
	 같은 색상의 돌이 5개 연속으로 한줄 (가로,세로,대각선) 되면 해당 색상의 이기는 게임 (단 6개가 한 줄 되면 승리가 아니다)
	 -> print("흑 승리!" or "백 승리!")
	 3*3은 막아야 한다 (예시에 검은 돌 있는 곳 들이 3개로 물리는 곳에 돌을 올리지 못하게 경고가 나와야 한다) ==> 할 수 있으면 하고, 
	 
	 
	 게임 보드를 관리하는 클래스, > OmokBoard 
	 사용자 입력 처리를 위한 클래스,  > InputHandler
	 이러한 클래스를 조정하는 메인 클래스로 나누어 생각
	 
	 
	 연속으로 5개
	 돌을 놓기 시작하면 체크를 시작한다 그 놓은 자리에 왼쪽으로는 -1 , 오른쪽으로는 +1 해서 연속으로 같은 값이 있는지
	 대각선은 char[-1][+1] 이런식으로 가야 대각선으로 올라갈 수 있다
	 
	 무르기는 전의 전의 상태를 기억해두었다가 돌리면 된다.
	 좌표를 기억해 놓았다가 
	 
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OmokBoard omok1 = new OmokBoard();
		boolean isBlack = true; // 검은돌이 먼저 시작한다
		int turn = 0;
		
		// 무한반복 돌린다.
		while (true) {
			System.out.printf("<%d수>\n", (turn+1));
			omok1.print();
			
			System.out.printf("'%s'의 차례입니다.", isBlack ? "흑" : "백");
			System.out.println("좌표 입력 >> ");
			
			String coord = sc.next();
			
			
			if(omok1.put(coord, isBlack)) {
				
				if(omok1.winCheck(coord, isBlack)) {
					System.out.println((isBlack ? "흑돌" : "백돌") + "이 이겼습니다.");
					break;
				}
				isBlack = !isBlack;
				++turn;
			}
		}
		omok1.print();
		

		// 핀 그리는 방법
//		for (int i = 0; i < 15; ++i) {
//			for (int j = 0; j < 15; ++j) {
//				System.out.print("┿ ");
//			}
//			System.out.println();
//		}
//
//		// 돌 놓는 방법
//		char[][] omok = { { '┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '●', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '●', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '●', '●', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '├', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┿', '┤' },
//				{ '└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘' }, };
//
//		omok[3][6] = '●';
//		omok[2][8] = '○';
//		for (int i = 0; i < omok.length; ++i) {
//			for (int j = 0; j < omok[i].length; ++j) {
//				System.out.printf("%c", omok[i][j]);
//			}
//			System.out.println();
//		}
//
//		String[][] omok2 = { // A3 C4 로 입력받으면 해당 자리에 해당 사용자 돌 올리기
//				{ "  ", "A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J ", "K ", "L ", "M ", "N ", "O " },
//				{ "A", "┌ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┐" },
//				{ "B", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "C", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "D", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "E", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "F", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "G", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "H", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "I", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "J", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "K", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "L", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "M", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "N", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
//				{ "O", "└ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┘" }, };
//
//		for (int i = 0; i < omok2.length; ++i) {
//			for (int j = 0; j < omok2[i].length; ++j) {
//				System.out.printf("%s", omok2[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		
	}

}
