package myobj.omok2;

public class OmokBoard {

	final static int MAX_WIDTH = 15;
	final static int MAX_HEIGHT = 15; // 오목판 15*15임

	int[][] board = { 
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, 
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8 }

	}; // 보드 판 만들기
	
		
	// 숫자로된 인트형배열 좌표
	// A5, C13 => {0, 4}, {2, 12}로 변환해주는 메소드
	private int[] getCoordArray(String coordStr) {
		return new int[] {
				// length가 2라면 두 번째 결과가 값이다, 
				coordStr.length() == 2 ? 
						(coordStr.charAt(1) - '0') - 1 : 
							10 + (coordStr.charAt(2) - '0') - 1,
				coordStr.charAt(0) - 'A' };
	}

	
	// 판 만들고, 모양 넣었으니까 좌표를 넣으면 볼을 넣는 기능을 만들어야한다
	// 문자열이 들어오면 그 곳에 돌을 놓는 메서드
	public boolean put(String coordStr, boolean isBlack) { 
		// boolean : 돌을 제대로 놓았는지 성공여부를 반환해줘야한다. void로 해놓으면 안된다!!
//		
//		if(coord.length() == 2) { // 숫자 자리수 1개 A6
//			row = coord.charAt(1) - '0' - 1;
//		} else if (coord.length() == 3 ){ // 숫자 자리수 2개 C14 -> 10의 자리수가 1말고 다른 수가 들어올 수 없기때문에 10을 더한 것, 25 => 15로 입력하는 오류를 해결해야한다
//			int ten = coord.charAt(1) - '0'; // 10자리 추출
//			int one = coord.charAt(2) - '0'; // 1자리 추출
//			row = (ten * 10 + one) -1; // 두자리숫자 합치고 1빼기
//			// 사용자는 숫자를 1부터 사용하니까
//		} else {
//			System.out.println("[Error]좌표값의 길이가 이상합니다.");
//			return false;
//		}
		
		
		int[] coords = getCoordArray(coordStr);
		
		int row = coords[0];
		int col = coords[1];
		
		if (row >= MAX_HEIGHT || col >= MAX_WIDTH) {
			System.out.println("[Error]좌표값이 너무 큽니다.");
		} else if(board[row][col] == 9 || board[row][col] == 10) {
			System.out.println("[Error] 이미 돌이 놓아져 있는 곳입니다."); 
			// 이 내용이 없다면 놓여진 돌을 바꿔치기해서 놓을 수 있음으로..
			return false;
		}
		
		if (isBlack) {
			board[row][col] = 9; // 9번은 흑돌
		} else {
			board[row][col] = 10; // 10번은 백돌
		}
		return true;
		
	
		
	}


	// 승리여부체크
	// 방금 놓은 위치에서 부터 오목이 완성 되었는지 체크하는 메서드
	public boolean winCheck(String coordStr, boolean isBlack) {
		int[] coords = getCoordArray(coordStr);

		int row = coords[0];
		int col = coords[1];
		int color = isBlack ? 9 : 10;

		// 연속적으로 놓여진 같은 색 돌의 개수를 센다

		// 가로
		int horizontalCount = 0;

		// 1-1> 현재 위치에서 왼쪽으로 가면서 개수 세기 row 값은 같으면서 col 값이 -1 되는것
		for (int i = col - 1; i >= 0; --i) {
			// 현재 내 돌의 색에 따라서 보드에 몇 번이 있는지 확인 해야한다
			if (board[row][i] == color) {
				++horizontalCount;
			} else {
				break; // 같은색 없으면 세는거 멈춤
			}
		}

		// 1-2> 현재 위치에서 오른쪽으로 가면서 개수 세기
		// col을 포함하고 있는것, 현재 위치 포함해서 숫자를 세는 것이다.!
		for (int i = col; i < MAX_WIDTH; ++i) {
			if (board[row][i] == color) {
				++horizontalCount;
			} else {
				break; // 같은색 없으면 세는거 멈춤
			}

		}

		// 세로

		int verticalCount = 0;
		// 2-1> 현재 위치에서 위쪽으로 가면서 개수 세기 col 값은 같으면서 row 값이 -1 되는것

		for (int i = row - 1; i >= 0; --i) {
			// 현재 내 돌의 색에 따라서 보드에 몇 번이 있는지 확인 해야한다
			if (board[i][col] == color) {
				++verticalCount;
			} else {
				break; // 같은색 없으면 세는거 멈춤
			}
		}

		// 2-2> 현재 위치에서 아래쪽으로 가면서 개수 세기
		for (int i = row; i < MAX_HEIGHT; ++i) {
			if (board[i][col] == color) {
				++verticalCount;
			} else {
				break; // 같은색 없으면 세는거 멈춤
			}

		}

		int diagonal1Count = 0;
		// 왼쪽 위에서 오른쪽 아래로 대각선 (2,4 분면으로 가는 대각선)
		// 3-1> 왼쪽 위로 row 값 감소, col 감소

		for (int c = col - 1, r = row - 1; c >= 0 && r >= 0; --c, --r) {

			if (board[r][c] == color) {
				++diagonal1Count;
			} else {
				break;
			}
		}

		// 3-2> 현재위치에서 오른쪽 아래로 row 증가, col 증가 ,

		for (int c = col, r = row; c < MAX_WIDTH && r < MAX_HEIGHT; ++c, ++r) {

			if (board[r][c] == color) {
				++diagonal1Count;
			} else {
				break;
			}
		}

		int diagonal2Count = 0;
		// 왼쪽 아래에서 오른쪽 위로 대각선 (3,1)
		// 4-1> 왼쪽 아래로 row 증가, col 감소
		for (int c = col - 1, r = row + 1; c >= 0 && r < MAX_HEIGHT; --c, ++r) {

			if (board[r][c] == color) {
				++diagonal2Count;
			} else {
				break;
			}
		}
		// 4-2> 오른쪽 위로 row감소, col 증가

		for (int c = col, r = row; c < MAX_WIDTH && r >= 0; ++c, --r) {

			if (board[r][c] == color) {
				++diagonal2Count;
			} else {
				break;
			}
		}

		// 최종 승리조건
		return (horizontalCount == 5 || verticalCount == 5 || diagonal1Count == 5 || diagonal2Count == 5);
	}

	// 보드판 모양 넣기
	
	public void print() {
		// 맨 윗줄
		System.out.println("   A B C D E F G H I J K L M N O");
		for (int i = 0; i < MAX_HEIGHT; ++i) {
			
			// 각 줄의 첫 번째 부분에서 번호를 출력  
			System.out.printf("%-2d ", (i+1));
			for (int j = 0; j < MAX_WIDTH; ++j) {
				switch (board[i][j]) {
				case 0:
					System.out.print('┌');
					break;
				case 1:
					System.out.print('┬');
					break;
				case 2:
					System.out.print('┐');
					break;
				case 3:
					System.out.print('├');
					break;
				case 4:
					System.out.print('┼');
					break;
				case 5:
					System.out.print('┤');
					break;
				case 6:
					System.out.print('└');
					break;
				case 7:
					System.out.print('┴');
					break;
				case 8:
					System.out.print('┘');
					break;
				case 9 : 
					System.out.print('●');
					break;
				case 10: 
					System.out.print('○');
					break;

				}
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}

}
