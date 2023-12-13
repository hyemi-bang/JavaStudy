package quiz;

import java.util.Arrays;

public class C02_Range {
	/*
	 1. 정수값을 전달 받으면 0부터 해당 값 미만의 int[] 생성하여 반환하는 range 함수
	 ex> range(8) -> 결과  [0,1,2,3,4,5,6,7] 이 나와야한다
	 */
	public static int[] range(int num) {
		int[] arr = new int[num];
		
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = i;
		}
		
		return arr;
		 
	}
	
	/*
	 2. 정수의 최소값과 최대값을 전달 받으면 최소값부터 최대값 미만인 int[] 생성하여 반환하는 range 함수
	 ex> range(10, 15) -> [10,11,12,13,14]
	 	 range(15, 10) -> [15,14,13,12,11]
	*/
//	public static int[] range(int first, int last) {
//		int num = (first - last); // 이게아닌것 같은디 ?
//	
//		
//		for(int i = first ; first < last ; first ++) {
//			if(first < last) {
//				num[i] += last + 1 ; // last; 이것도 이상한디 last+1?
//			}
//			if(first > last) {
//				num[i] -= last - 1; 
//			}
//		}
//		return num;
//	}
//	
	public static int[] range(int start, int end) {
		int size = Math.abs(start-end);
		
		int[] arr = new int[size];
		
		int increment =  start < end ? 1 : -1;
		for(int i = 0 ; i < arr.length; ++i) { // 횟수만큼 증가를 시킨다  
			arr[i] = start + (increment * i);
		}
		return arr;
	}
	
	
	/*	 
	 3. 최소값 최대값 증감값을 전달받으면 최소값부터 최대값 미만까지 증가하는 int[] 생성하여 반환하는 range 함수
	 ex> range(10, 20, 2) -> [10, 12, 14, 16, 18]
	     range(40, 30, -3) -> [40, 37, 34, 31]
	     range(20, 10, 5) -> [] or null
	 
	*/
	
	public static int[] range(int start, int end, int increment) {
		int size = (int)Math.ceil((end - start) / (double)increment);
		// 정해진 두가지의 값을 나누었을때 0으로 떨어지면  (end - start) / increment 하면 되지만
		// 두 수를 나누었을떄 .1이라도 생길 수 있으며 그러면 필요한 값이 달라지기 때문에 
		
		
		 // 사이즈가 음수가 나오면 방향이 잘못된 것이다
		if(size < 0) {
			return null;
		}
		int arr[] = new int[size];
		// arr.length 가 size와 같은 의미임으로 arr.length 대신 size 사용
		for(int i = 0; i < size; ++i) {
			arr[i] = start + (increment * i);
		}
		return arr;
	}
	


	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(range(8)));
		System.out.println(Arrays.toString(range(10,15)));
		System.out.println(Arrays.toString(range(10,80,13)));
		
		System.out.println(Arrays.toString(range(10,80,-1)));
		
		// 해당 함수에서 null을 리턴할 가능성이 있는 경우
		// null이 아닐때만 해당 값을 활용하도록 코드를 작성하는 것이 좋다
		int[] result = (range(10,80,-1));
		if (result != null) {
			System.out.println(Arrays.toString(result));
		} else {
			System.out.println("null이 출력되었습니다.");
		}
		

	}

}
