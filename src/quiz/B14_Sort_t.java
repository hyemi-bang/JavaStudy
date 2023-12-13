package quiz;

import java.util.Arrays;

public class B14_Sort_t {

	public static void main(String[] args) {
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 201 - 100);
		}
		System.out.println("--원본--");
		System.out.println(Arrays.toString(arr));

		// 값을 정렬하는 방법
		// 처음부터 끝까지 보면서 가장 큰 값을 맨 앞에 놓는다 (내림차순) 맨 뒤에 놓는다 (오름차순)

		int step = 0;// 이 반복문이 20개의 정수값을 가지니까, 총 19번 비교하면 되고, 이것을 while문으로 묶는다
		// 0번째 단계에 가장 큰 값을 넣어주고, 1번째 단계에서는 1번째 단계에 가장 큰 값을 넣어주고..
		while (step < arr.length) {
			// 가장 큰 것을 골라서 맨 앞에 놓는다
			// 0단계일때 가장 큰 숫자를 골라서 0번 위치에 놓는다
			// 1단계일때는 0번 위치에 가장 큰 숫자가 있음으로 0은 보지 않고 1번 인덱스 부터 비교
			// 나머지 중 가장 큰 숫자를 골라서 1번 위치에 놓는다
			// 반복~

			int biggestIndex = step; // 제일 큰 값이 0이라고 생각하면서 비교 들어가는것> step로 생각하며 비교 들어가기
			for (int i = step + 1; i < arr.length; ++i) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;

				}
			}
			// 제일 큰 값을 찾아서 맨 앞의 값과 교환하겠다는 의미
			// 맨 앞은 이미 큰 값이 있으니까 더 확인할 필요없다
			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;

//			// 어떤과정으로 교환하고 있는지 확인하기
//			System.out.printf("- %d단계 정렬 후 - \n", step);
//			System.out.println(Arrays.toString(arr));

			++step;
		}
		System.out.println("==== 내림차순 정렬 후 ====");
		System.out.println(Arrays.toString(arr));
				
		step = 0;
		while (step < arr.length) {
			int smallestIndex = step; 
			for (int i = step + 1; i < arr.length; ++i) {
				if (arr[smallestIndex] > arr[i]) {
					smallestIndex = i;

				}
			}
			
			int temp = arr[step];
			arr[step] = arr[smallestIndex];
			arr[smallestIndex] = temp;

			++step;
		}
		System.out.println("==== 오름차순 1번> 정렬 후 ====");
		System.out.println(Arrays.toString(arr));
		
		step = 0;		
		while (step < arr.length) {
			int biggestIndex = arr.length- step -1 ; 
			// 제일 큰 값이 0이라고 생각하면서 비교 들어가는것> step로 생각하며 비교 들어가기
			
			for (int i = 0; i < arr.length - step -1; ++i) { 
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;

				}
			}
			// arr.length - 1 - step 맨 뒤자리에 놓겠다~
			int temp = arr[arr.length - 1 - step];
			arr[arr.length - 1 - step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			++step;
		}
		System.out.println("==== 오름차순 정렬 후 ====");
		System.out.println(Arrays.toString(arr));
	}
}
