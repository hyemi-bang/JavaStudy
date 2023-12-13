package quiz;

public class B14_Sort {
	/*
	  -100 ~ 100 사이의 랜덤 정수 값이 20개 들어있는 배열을 하나 생성한 후 
	  1> 해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력 
	  Ascending 오름차순
	  2> 해당 배열의 내용을 큰 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력 
	  Dsscending 내림차순

	 */
	public static void main(String[] args) {

		// -100 ~ 100 까지 배열을 하나 만들고
		int[] number = new int[20];
		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 201 + (-100));
		}
		// 일단 잘 나오는지 출력
		
		int i = 0;
		for (i = 0; i < number.length; i++) {
			System.out.print( number[i] + " ");
			// 위 배열의 내용을 작은 것 부터 보기
			// 이번에 뽑은 번호가 저번에 뽑은 번호보다 작으면 그걸 i로 놓고,
			for (int j = 0; j < i; j++) {
				if (number[j] > number[i]) {
					int temp = number[j];
					number[j] = number[i];
					number[i] = temp;
				}
			}
		
		}
		System.out.println();
		for(i = 0 ; i < number.length;i++) {
			System.out.print( number[i] + " ");
		}

		
		// 위 배열을 큰 것부터 보기
		for (i = 0; i < number.length; i++) {
			// 이번에 뽑은 번호가 저번에 뽑은 번호보다 크면 그걸 i로 놓고,
			for (int j = 0; j < i; j++) {
				if (number[j] < number[i]) {
					int temp = number[j];
					number[j] = number[i];
					number[i] = temp;
				}
			}
		
		}
		System.out.println();
		for(i = 0 ; i < number.length;i++) {		
			System.out.print(number[i] + " ");
		}

	}

}
