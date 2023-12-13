package quiz;

import java.util.List;

import myobj.Yacht.Play;
import myobj.Yacht.YachtDice_T;
import myobj.Yacht.Yatchdice;

public class D05_YachtDice {
	



	public static void main(String[] args) {
		
//		Yatchdice dice = new Yatchdice();
//		List<Integer> diceResults = dice.rollDice(5);
//
//
//		Play p1 = new Play();
//		Play.checkYachtDice(diceResults);
		
//		YachtDice_T dice1 = new YachtDice_T();
//		YachtDice_T dice2 = new YachtDice_T();
//		
//		System.out.println(dice1); 		// toString()오버라이드 후 ↓
		// myobj.Yacht.YachtDice_T@182decdb => [1, 1, 1, 5, 4]
//		dice1.showAvailableRanks(); // => 각 주사위 개수 : [3, 0, 0, 1, 1, 0]
//		System.out.println(dice2); 
		// myobj.Yacht.YachtDice_T@26f0a63f => [2, 6, 3, 2, 1]
		// 주소값이 나오니까 , toString()을 해야겠다~
//		dice2.showAvailableRanks();// => 각 주사위 개수 : [1, 2, 1, 0, 0, 1]
		
		for(int i = 0; i < 20 ; ++i) {
			YachtDice_T dice1 = new YachtDice_T();
			
			System.out.println(dice1); 	
			dice1.showAvailableRanks(); 
		}

	}

}

	/*
	1. 주사위를 5개 던진다
	2. 각 주사위의 눈을 가지고 어떤 패가 만들어졌는지 구분
	3. 다섯개의 주사위 눈을 통해 다음을 구분한다.
	
		(1) 풀하우스 (같은 눈이 3/2개)
		 ex> 11222, 33311, 55566, 56556 ...
		(2) 스몰 스트레이트 (1234/ 2345/ 3456)
		 ex> 12346, 64513, .....
		(3) 라지 스트레이트 (12345/ 23456)
		 ex> 54321, 24356, ...
		(4) Three of kind (같은 주사위 눈이 3개)
		 ex> 31323, 66651, ...
		(5) Four of kind (같은 눈 4개)
		(6) Yacht (같은 눈 5개)
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	*/

		
		
//		List<Integer> dice = new ArrayList<>();
//		Collections.addAll(dice, 1, 2, 3, 4, 5, 6);
//		System.out.println(dice);
		
		

		// Collections.shuffle(List) : 전달한 리스트의 순서를 섞는다
//		for (int i = 0; i < 5; i++) {
//			Collections.shuffle(dice);
//			System.out.print(dice);
//		}
//		
//		System.out.println();
		

		
		// 주사위 던져서 값 출력
//		List<Integer> resultDice = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			// dice 를 랜덤으로 5번 돌려서, 그 값을 산출한다.
//			int random = (int) (Math.random() * dice.size());
//			resultDice.add(dice.get(random));
//			System.out.print(resultDice.get(i) + " ");
//		}
//		
//		// 주사위 5번 던진 결과 저장하는 곳 ???
//		List<Integer> numCount = new ArrayList<>();
//		for(int num : resultDice) {
//			for(int i =0 ; i < 6 ; ++i) {
//				
//			}
//			int count = Collections.frequency(resultDice, 1); // 1자리에 뭘 넣어야 할지 모르겠다~~~
//		}
		// Collections.frequency(Collection, value) 해당 값이 몇 번 나오는지 세준다
		
	
		
		
		
		
