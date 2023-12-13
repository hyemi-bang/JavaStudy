package quiz;

import java.util.ArrayList;
import java.util.Collection;

public class D01_ArrayListPractice {

	/*
	
	1. 리스트에 1000~2000사이의 랜덤 정수를 100개 추가하기
	2. 원본에서 짝수를 모두 제거한 후 총합
	3. 원본에서 홀수 모두 제거한 후 총합
	
	*/
	public static void main(String[] args) {
		
		// 리스트에 정수 넣는 방법	
		// 제네릭에는 일반형 변수 타입을 사용 할 수 없다. 각 기본형 타입의 참조형 버전을 사용 해야한다
		// ArrayList<int>~~ 는 불가능하다
		// Short, Long  등
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> withOutEvenNum = new ArrayList<>();
		
//		ArrayList<Integer[]> numbers = new ArrayList<>();
//		int[] ran = new int[100];
//		for (int i = 0; i < ran.length; i++) {
//			ran[i] = (int) (Math.random() * 1001 + 1000);			
//		}
//		numbers.add(ran);
//		System.out.println(numbers);
		
		for (int i = 0; i < 100; ++i) {
			int ranNum = (int) (Math.random() * 1001 + 1000);
			numbers.add(ranNum);
		}
		System.out.println(numbers);

		int sumWithoutEvenNum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			if (num % 2 != 0) {
				sumWithoutEvenNum += num;
			}
		}
		System.out.println(sumWithoutEvenNum);

		int sumEvenNum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			if (num % 2 == 0) {
				sumEvenNum += num;
			}
		}
		System.out.println(sumEvenNum);
		
		  // 2. 원본에서 짝수를 모두 제거 한 후 총합 구하기

	      int sum = 0;
	      System.out.print("짝수 제거한 정수 :");
	      for (int i = 0; i < numbers.size(); ++i) {
	         int num = numbers.get(i);
	         if (num % 2 != 0) {
	             System.out.print(num + " ");
	             
	         } else {
	            numbers.remove(i);
	            sum += num;
	         }
	      }
	      System.out.println();
	      System.out.println("짝수 제거한 후 총 합 : " + sum);

	      // 3. 원본에서 홀수 모두 제거 한 후 총합 구하기 
	      // -> 짝수를 모두 더해라, 2단계에서 짝수를 다 제거했는데 어떻게 하라는겨..?
	      // 2번에서 제거한 짝수들을 따로 저장해두고, 3번에서 홀수 다 제거하고, 저장해둔 짝수들을 불러온 후 더한다.

	   }
	}