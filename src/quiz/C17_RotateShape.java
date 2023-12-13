package quiz;

public class C17_RotateShape {
	
	/*
	2차원 배열로 이루어진 어떤 모양이 있을때
	해당 모양을 오른쪽으로 90도 회전시키는 프로그램을 만들어보세요
	
	□ ■ ■ □
	□ □ ■ □
	□ □ ■ □
	□ □ □ □
	
	□ □ □ □
	□ □ □ ■
	□ ■ ■ ■
	□ □ □ □

	
	*/

	public static void main(String[] args) {
		
		final int MAX_WIDTH = 4;
		final int MAX_HEIGHT = 4 ;
	
		int[][] orignalArray = { 
				{0,1,1,0},
				{0,0,1,0},
				{0,0,1,1},
				{0,0,0,0}
		};
		
		System.out.println("Original Array" );
		print(orignalArray,MAX_WIDTH,MAX_HEIGHT);
	
		
		int[][] rotateArr = rotateArray(orignalArray,MAX_WIDTH,MAX_HEIGHT);
		
		System.out.println("rotated Array");
		print(rotateArr,MAX_WIDTH,MAX_HEIGHT);
		
		System.out.println("rotated Array2");
		int[][] rotateArr1 = rotateArray(rotateArr,MAX_WIDTH,MAX_HEIGHT);
		print(rotateArr1,MAX_WIDTH,MAX_HEIGHT);
		
		System.out.println("rotated Array3");
		int[][] rotateArr2 = rotateArray(rotateArr1,MAX_WIDTH,MAX_HEIGHT);
		print(rotateArr2,MAX_WIDTH,MAX_HEIGHT);
		
		System.out.println("Original Array");
		int[][] rotateArr3 = rotateArray(rotateArr2,MAX_WIDTH,MAX_HEIGHT);
		print(rotateArr3,MAX_WIDTH,MAX_HEIGHT);
		
//		for(int i = 0 ; i < rotateArr.length; ++i) {
//			for(int j =0; j < rotateArr[i].length; ++j) {
//				System.out.print(rotateArr[i][j]);
//			}
//			System.out.println();
//		}

	}

	public static int[][] rotateArray(int[][] arrays, int row, int col) {
		// TODO Auto-generated method stub
		
		int[][] rotated = new int[col][row];
		
		for(int i = 0; i < row; ++i) {
			for(int j =0; j < col ; ++j) {
				int temp = arrays[i][j];
				rotated[j][row -1 -i] = temp;
			}
		}
		return rotated;
		
	}
	
	public static void print(int[][] array, int row, int col) {
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < col; ++j) {
				
				switch (array[i][j]) {
				case 0:
					System.out.print('□' + " ");
					break;
				case 1:
					System.out.print('■'+ " ");
					break;
				}
			}
			System.out.println();
		}
	}

}
