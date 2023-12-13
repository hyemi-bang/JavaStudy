package myobj.omok;

public class Board {
	
	private String[][] board;
	
	
	public Board( String[][] initBoard) {
		board = initBoard;
	}
	
	
	public void info() {
		

	     for (int i = 0; i < board.length; ++i) {
	            for (int j = 0; j < board[i].length; ++j) {
	                System.out.printf("%s", board[i][j]);
	            }
	            System.out.println();
	        }
		
	}
	
	//돌 올려놓는 메서드
	public void palceStone (int row, int column, String stoneSymbol) {
		board[row][column] = stoneSymbol;
	}

	// 돌의 위치를 반환
	public String getPost(int row, int column) {
		return board[row][column];
	}
}
