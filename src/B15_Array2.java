
public class B15_Array2 {
	 // 베열 2번!

	public static void main(String[] args) {
	
		// 배열안의 요소로 배열을 넣을 수 있다.
		
		int[] arr1 = new int[7]; // int타입을 여러개 가지고 있는 배열이다
		int[] arr2 = new int[] {40, 60, 80, 100, 120};
		int[] arr3 = {1,2,3,4,5,6,8,9,13,15,17,20};
		
		
		int[][] arr4 = {
				arr1, 
				arr2, 
				arr3, 
				{9,8,7,10},
				new int[] {44,55,66,77,100,110}}; // int형 배열(int[])을 여러개 가지고 있을 수 있는 배열이다. 2차원배열
		
		System.out.println(arr4[0]); // [I@1ee0005 출력
		System.out.println(arr4[1]); // [I@6504e3b2 출력
		System.out.println(arr4[0][6]); // 초기화 해놓고 값을 안넣어 놨기 때문에, 0으로 초기화 되어있고, 0 출력되는것
		System.out.println(arr4[1][3]); // 100 출력
		System.out.println(arr4[2][1]); // 2 출력
		System.out.println(arr4[3][2]); // 7 출력
		System.out.println(arr4[4][3]); // 77 출력
		
		int[][][] arr5 = {
				arr4,
				arr4,
				arr4
		}; 
		System.out.println();
		
		// 배열의 신기한 점
		char[] name1 = new char[] {'김', '철', '수'};
		char[] name2 = name1;
		char[] name3 = name1; // 모두 같은 주소에 있는 김철수를 사용하는것
		char[] name4 = new char[] {'김', '철', '수'};
		char[] name5 = {'김', '철', '수'};
		char[] name6 = new char[3]; // 메모리 char타입으로 3칸이 필요하다
		
		name3[1] = '영';
		name3[2] = '희';
		// 실체의 주소값을 넣어놓는 것이기 때문에, 하나만 바꾸고자 하여도 실체가 바뀌게 되는것 
		
		name6[1] = '영';
		name6[2] = '희';
		
		System.out.println(name1); 
		System.out.println(name2); 
		System.out.println(name3); 
		// name1~3까지 김철수로 다 출력이 되는데, name3 이름을 바꿔버리면 3개 출력 전부 김영희로 바뀜
		System.out.println(name4);
		System.out.println(name5); // name4,5 다 새로운 실체를 만든것이다 볼 수 있다.
		System.out.println(name6); // " 영희"로 출력됨
	
		System.out.println();
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		char[][] fruits = new char[][] {
			{'a','p','p','l','e'},
			{'o','r','a','n','g','e'},
			{'w','a','t','e','r','m','l','o','n','e'},
			{'p','i','n','e','a','p','p','l','e'},
			{'g','r','a','p','e'}
		};
		
		// fruits.length : 배열이 몇개인가
		for(int i =0; i <fruits.length; ++i) {
			System.out.println(fruits[i]);
			for(int j = 0; j < fruits[i].length; ++j){
				// fruits[i].length 해당하는 각 배열의 길이 몇인가? 각 배열의 길이가가 다를 수 있음으로 fruits[i] 사용한 것.
			System.out.printf("fruits[%d][%d]: %c\n", i, j, fruits[i][j]);
			}
			System.out.println("============================");
		}
		
	}

}
