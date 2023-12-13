package myobj.Yacht;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YachtDice_T {
	// 클래스를 만들때 나중에 new YachtDice_T 를 어떻게 써야 편할지를 고려하면서 만들기

	ArrayList<Integer> dices = new ArrayList<>();
	// 주사위가 숫자로 이루어 져있음으로  <Integer>
	
	public YachtDice_T() {
		// 주사위 5개 돌리는 문제 임으로 반복문을 돌린다.
		for(int i = 0 ; i < 5; ++i) {
			dices.add(randomDice());
		}
	}
	
	// 주사위는 숫자 6개가 랜덤으로 나온다~~
	private int randomDice () {
		return (int)(Math.random() * 6 + 1);
	}
	
	// 6가지의 점수내는 방법 (족보)를 만든다.
	// 선택 가능한 조건들을 보여주면 된다.
	public void showAvailableRanks() {
		// 각 주사위 눈의 개수를 세어서 어떤 숫자가 몇번 나오는지 
//		int[] counts = new int[6];
		List<Integer> counts = new ArrayList<>();
		
		for(int i = 1; i<7; ++i) {
			counts.add(Collections.frequency(dices, i));
		}
		System.out.println("각 주사위 개수 : " + counts);
//			for(int i = 0; i < counts.length; ++i ) {
//			counts[i] = Collections.frequency(dices, i+1);
			// 0번 방에 주사위 1의 개수
			// 1번 방에 주사위 2의 개수가 나오게 될 것 이다
//		}
//		System.out.println("각 주사위 개수 : " + Arrays.toString(counts));
		
		
		// 각 주사위의 개수가 나왔으니 가능한 랭크를 만들어
		// contains를 사용하고 싶어서 int[]배열에서 list로 변경
		
		int availNum = 1;
		int maxCount = Collections.max(counts);
		
		if (maxCount == 5) {
			System.out.println(availNum++ +" ) Yacht");
		} 
//		if (counts.contains(4)) {
		if (maxCount >= 4) {
			System.out.println(availNum++ +" ) Four of a kind");
		}
		if (maxCount >= 3) {
			System.out.println(availNum++ +" ) Three of a kind");
		}
		if (counts.contains(3) && counts.contains(2)) {
			System.out.println(availNum++ +" ) Full House");
		}
		
		// 스트레이트
		// count 하나씩 꺼내면서 연속적은 숫자를 확인
		
		// 각 주사위 개수 : 1 1 1 0 1 1  >> 주사위 눈 : 1 2 3 5 6 나온거고
		// Collections.addAll(continuousCount, 0, 0, 0);	
		// 여기에 0번째 0자리에 숫자를 올려가면서 연속적으로 몇개가 나오는지 보는거다, 그래서 올라가다가 0이 나오면 1번째 0으로 넘어가서 그 다음 수를 보게 되는거지
		
		List<Integer> continuousCount = new ArrayList<>();
		Collections.addAll(continuousCount, 0, 0, 0);	
		
		int continuousIndex = 0; 
		for(Integer count : counts) { // counts 까지 하나씩 꺼내면서 
			if(count > 0) { // list.set(index, item) : 해당 번째 인덱스를 아이템으로 수정한다.
				continuousCount.set(continuousIndex, 
						continuousCount.get(continuousIndex) + 1);
				//현재 숫자가 양수면, continuousCount 리스트에서 continuousIndex에 해당하는 인덱스의 값을 1 증가
			} else {
				if(continuousCount.get(continuousIndex)!=0) {
					++continuousIndex;
				}
				//현재 숫자가 0 이하일 때, 연속된 양수의 시퀀스가 끝났다는 것.
				//continuousIndex를 증가시켜 다음 연속된 양수 시퀀스를 기록하는 것이다.
			}
		}
		// Collections.max(Collection) : 해당 컬렉션에서 최대값을 구한다
		int maxcontinuousCount = Collections.max(continuousCount);
		if(maxcontinuousCount == 4) {
			System.out.println(availNum++ +" ) Large Straight");
		}
		if(maxcontinuousCount == 4) {
			System.out.println(availNum++ +" ) Small Straight");
		}
		
//		int continuousCount =0;
//		for(Integer count :  counts) {
//			if(count > 0) {
//				++continuousCount;
//			} else {
//				continuousCount = 0 ; // 숫자가 증가하지 않으면 0로 초기화 한다 
		// 1 2 3 0 4 > 0이 나올때 continuousCount가 0으로 초기화 되버려서 문제가 발생
//			}
//		}
	}
	
	@Override
	// toString() 오버라이드 하기 전에는 주소값만 나옴
	public String toString() {
		return dices.toString();
	}
}
