package quiz;

import java.util.HashSet;

public class D02_LottoSet {
	
	/*
		HashSet을 이용해 1~45의 중복없는 6개의 랜덤 숫자를 생성해보세요
	*/

	public static void main(String[] args) {
		
		HashSet<Integer> ticket = new HashSet<>();

		
//		for (int i = 0; i < 6; ++i) { }// 중복이 알아서 제거가 되기때문에 6개가 다 안나올 수도 있다.
		
		while(ticket.size() < 6) { // 중복이 되는 건 계속 지워 반복하기 때문에, 간편하게 해결이 된다.
			ticket.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(ticket); 

	}

}
