package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {
	

	public static void main(String[] args) {
	
		
		int[][] myArr = {
				{1,1,1,1,1,1}, // → 0행 row
				{1,1,1,1,},
				{1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1},
			  //↓ 0열 column
		};

		// 1. myArr의 모든 값을 1~500 사이의 랜덤 값으로 바꾸기
		System.out.println("============================");
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int) (Math.random() * 500 + 1);
			}
		}
		// 2번 합을 계산하고, myArr[i]의 개수를 count해서 평균구할때 쓰기
		int sum = 0;
		int count = 0;
		for (int i = 0; i < myArr.length; ++i) {
			count+= myArr[i].length; // 각 배열의 길이를 더하여 총 개수를 구할 수 있다.1	ㅂㅁ
			for (int j = 0; j < myArr[i].length; ++j) {
				sum += myArr[i][j];
				
				System.out.print(myArr[i][j] + " "); // 랜덤값으로 변경한 부분
			}
			System.out.println();
		}

		System.out.println("============================");

		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균 구하기
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / (double)count);

		System.out.println("============================");

		// 3. myArr의 각 행의 합을 구해서 출력하기
		int[] rowSum = new int[myArr.length]; // 행의 합은 myArr.length만큼 필요

		
		for (int row = 0; row < myArr.length; ++row) {  
			for (int column= 0; column < myArr[row].length; ++column) {
				// 행이 0행일떄 1개 열씩 쭉 더해 다음 행으로 넘어가서 또 더하고 반복
				rowSum[row] += myArr[row][column]; 
			}
		}
		System.out.println("각 행의 합: " + Arrays.toString(rowSum));
		System.out.println("============================");
		
		
		// 4. myArr의 각 열의 합을 구해서 출력하기
		
		int maxColSiz = 0 ; // 열이 몇개나 필요한가~
		
		for(int i = 0 ; i < myArr.length; ++i) {
			int colSize = myArr[i].length; // 각 행의 개수
			
			if(maxColSiz < colSize) {
				maxColSiz = colSize; // 각 행의 개수중 제일 긴 개수를 알아야 열의 총 필요 개수를 알 수 있다.
			}
		// if문 삼항 연산자로 변경하면
			// maxColSiz = maxColSiz < colSize ? myArr[i].length :maxColSiz;
			//  ? 까지의 질문이 맞으면 : 왼쪽 / 틀리면  : 오른쪽 선택
		}
		
		int[] colSum = new int[maxColSiz]; // 제일 긴 범위가 8개가 있기때문
		
		for(int row = 0 ; row < myArr.length; ++row) {
			for(int col = 0 ; col <myArr[row].length; ++col) {
				colSum[col] += myArr[row][col];
			}
		}
		
		System.out.println("각 열의 합: " + Arrays.toString(colSum));
		System.out.println("============================");
	}

}

//
// 3번  1>>
//int row = 0;
//for (int i = 0; i < myArr.length; ++i) {
//	for (int j = 0; j < myArr[i].length; ++j) {	
//		if(row < myArr.length) {
//			
//		}
//		row  += myArr[0][j];
//		
//	}
//	break;
//}
//System.out.println("0번행 :"+ row); >>> 이렇게 하면 0번 행부터 5번행까지 노가다 ..?는 아니래.. ㅠ_
