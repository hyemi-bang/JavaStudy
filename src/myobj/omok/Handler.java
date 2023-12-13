package myobj.omok;

import java.util.Scanner;

public class Handler {
	private Players player1;
	private Players player2;
	private Board board;
	private Scanner sc;

	public Handler(Board board, Players player1,Players player2 ) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play () {
		sc = new Scanner(System.in);
		boolean finishedGame = false;
				
		while(!finishedGame) {
			board.info();
			System.out.println(player1.getstoneSymbol()+"플레이어의 차례입니다");
			String input = getPlayerInput(player1);
			// 유효성 검사 (제자리에 돌을 잘 놨니? 중복되지는 않니?)
			
			
			// 게임 승리조건 ( 돌 5개 한 줄)
			
			board.info();
			System.out.println(player2.getstoneSymbol()+"플레이어의 차례입니다");
			input = getPlayerInput(player2);
			
		}
		
		
	}
	
	
	String getPlayerInput(Players player) {
		String input;
		boolean isInput = false;
		
		while(true) {
			System.out.println("돌을 놓을 자리를 입력하세요 (ex> A C)");
			input = sc.nextLine();
			
			if(input.equals("무르기")) {
				// 무르기 입력
				// 사용자 > 무르기입력시 > false -> true로 변경하고 --돌놓은것
				// 기회를 다시 주어진다
			} else {
				// 돌 놓기
				isInput = true;
			}
		} 
		
	}
	
//	boolean checkWin(OmokBoard board, String stoneSymbol) {
		// 가로세로대각선 방향 5개 같은색 돌이 있는지 확인
		// 하나의 클래스로 만들어서 값만 반환시키게
		// 위 내용이 맞다면 true 반환
		// board.length 는 어떻게 처리해야할까?
		
//		for(int row = 0 ; row < board.length; row++) {
//			for(int column = 0 ; column <= board.length - 5; column++) {
//				boolean win = true;
//				for(int i =0 ; i <5 ;i++) {
//					if(!board[row][column+i].equls(stoneSymbol)) {
//						win = false;
//						break;
//					}
//				}
//			}
//		}
		
//	}


}
