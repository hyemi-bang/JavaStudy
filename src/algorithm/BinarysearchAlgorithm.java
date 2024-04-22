package algorithm;

public class BinarysearchAlgorithm {

	public static Integer BinarySearch(int[]array, int searchValue) {
		
		int lower = 0; //배열의 가장 작은 인덱스를 나타내며 초기값은 0
		int upper = array.length - 1;
		//배열의 가장 큰 인덱스를 나타내며 초기값은 array.length - 1
		
		while(lower <= upper) { // lower가 upper보다 작거나 같은동안 계속 반복
			int midPoint = (upper + lower) /2;
			int valueAtMidpoint = array[midPoint]; 
			// 범위내 중간 지점에 있는 항목
			
			if(searchValue == valueAtMidpoint) {
				return midPoint;
				// valueAtMidpoint가 찾는 값이 searchValue 이면 성공이고, 그 인덱스 값 반환가능
			} else if(searchValue < valueAtMidpoint) {
				upper = midPoint -1;
				// valueAtMidpoint가 searchValue보다 크다면 searchValue를 앞 부분에서만 찾겠다
				// 이제 upper에 midPoint는 왼쪽 인덱스를 할당해 검색 범위를 좁히는 것이다.
			} else if(searchValue > valueAtMidpoint) {
				lower = midPoint + 1;
				// 반대로 searchValue가 크면 searchValue를 midPoint 오른쪽 값들에게서만 찾겠다
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] array = {3,17,75,80,202};
		int searchValue = 22;
		
		System.out.println(BinarySearch(array, searchValue));
	}
}
