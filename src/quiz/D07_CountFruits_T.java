package quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D07_CountFruits_T {
	
	final public static String[] fruits = { 
			"Apple", "Banana", "Orange", "Watermelon", "Strawberry", "Grape", "Melon",
			"Peach", "Cherry" };
	
	public static void main(String[] args) {
		
		String[] randomFruits = new String[1000];
		int fruitCount = fruits.length;
		int len = randomFruits.length;
		
		// 과일 랜덤으로 골라서 1000개 채워주기 
		for(int i = 0 ; i <len; ++i) {
			randomFruits[i] = fruits[(int)(Math.random()*fruitCount)];
		}
		
//		System.out.println(Arrays.toString(randomFruits));
		
		Map<String, Integer> countMap = new HashMap<>();
		
		for(String ranFruit : randomFruits) {
			if(!countMap.containsKey(ranFruit)) {
				countMap.put(ranFruit,1); // 처음나온 과일은 개수 1로 시작을 한다
			} else {
				countMap.put(ranFruit, countMap.get(ranFruit)+1); // 이미 추가한 과일은 개수를 가져와서 1 더한 후 다시 저장
			}
		}
		System.out.println(countMap);
	}
}
