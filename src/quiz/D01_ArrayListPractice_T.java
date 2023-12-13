package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//1
		
		for(int i =0 ; i <100; ++i) {
			numbers.add((int)(Math.random() * 1001 + 1000));
		}
		System.out.println("<<1. 원본 numbers>>");
		System.out.println(numbers);
		
		// 2
		
		int evenSum = 0;
		for(int i = 0 ; i < numbers.size(); ++i) {
			int num = numbers.get(i);
			
			if(num % 2 == 0) {
				evenSum += numbers.remove(i--);
				// 2로 나누어 떨어지는 애들은 지우면서, evenSum으로 가 더해
			}
		}
		System.out.println("<<2. 짝수가 제거된 후 numbers>>");
		System.out.println(numbers);
		// 원본 [1701, 1550, .....]
		//numbers.remove(i); [1701, 1636, 1361, 1147, 1605, 1185, 1449, 1514, .....]
		// for문에서 ++i 하면서 0번째 짝수 제거후에 뒤에 짝수가 0번째가 되고 1번째 부터 검사를 하게 되기 때문에 0번째는 다시 검사하지 않는다
		// 그래서 numbers.remove(i--);로 다시 0번째 부터 검사하게 한다.
		System.out.println("제거한 짝수의 합 : " + evenSum);
		
		// 3
		
		int oddSum = 0;
		for(int i = 0 ; i < numbers.size(); ++i) {
			int num = numbers.get(i);
			
			if(num % 2 == 1) {
				oddSum += numbers.remove(i--);
				// 2로 나누어 떨어지지 않는 애들 지우면서, oddSum으로 가 더해
			}
		}
		System.out.println("<<3. 홀수가 제거된 후 numbers>>");
		System.out.println(numbers);
		//<<3. 홀수가 제거된 후 numbers>>
		// [] 2번에서 짝수 제거되었고, 3번은 홀수가 제거된거니까 없어지는 거고..
		System.out.println("제거한 홀수의 합 : " + oddSum);

	}

}
