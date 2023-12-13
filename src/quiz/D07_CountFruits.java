package quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D07_CountFruits {

	/*
	 * fruits[] 에 있는 과일들로 가득 찬 크기 1000개의 랜덤 배열을 생성한 후 각 과일이 몇 번 등장했는지 세어보세요
	 */

	final public static String[] fruits = { 
			"Apple", "Banana", "Orange", "Watermelon", "Strawberry", "Grape", "Melon",
			"Peach", "Cherry" };

	String fruit;

	public static String getRandomFruit() {
		return fruits[(int) (Math.random() * fruits.length)];
	}

//	public void generating() {
//		int len = fruits.length;
//		for (int i = 0; i < len; ++i) {
//			fruits[i] = getRandomFruit();
//		}
//	}

	public static void main(String[] args) {

		// 과일 1000번 무작위 섞기
		Map<String, Integer> info = new HashMap<>();
		String[] randomFruits = new String[1000];

		for (int i = 0; i < randomFruits.length; ++i) {
			randomFruits[i] = getRandomFruit();
		}

		// 각 과일이 몇 번 등장했는지 세어보세요
		for (String fruit : randomFruits) {
			int count = 0;
			for (String others : randomFruits) {
				if (fruit.equals(others)) {
					count++;
				}
			}
			info.put(fruit, count);
		}
		System.out.println(info);
		//System.out.printf("[%s = %d]\n", fruit,count);

		
	}

}
