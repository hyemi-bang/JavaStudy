package myobj.Yacht;

import java.util.Collections;
import java.util.List;

public class Play {

	public static void checkYachtDice(List<Integer> results) {
		// 주사위 결과 정렬
		Collections.sort(results);
		System.out.println("주사위결과 : " + results);

		boolean hasYacht = false; // 5개
		boolean hasFullHous = false; // 같은 눈이 3/2개
		boolean fourOfKind = false; // 4개
		boolean threeOfKind = false; // 3개
		boolean largeStraight = false; // 숫자 5개가 연속되야함 12345/ 23456
		boolean smallStraight = false; // 숫자 4개가 연속되야함 1234/ 2345/ 3456

		int sameCount; // 같은 주사위 결과 저장
		// 반복문으로 주사위 결과 한개씩 비교하면서 같은거 있으면 sameCount 증가
		// sameCount를 1로 초기화하는 이유는 첫 번째 주사위 숫자부터 시작해서 같은 숫자를 찾을 때마다 이 변수를 증가시켜 연속된 숫자의 개수를 세기 위함
		//같은 숫자를 찾기 시작하면 sameCount는 1로 초기화되고, 그 다음 숫자가 이전과 같다면 sameCount가 2로 증가하고, 이렇게 연속된 숫자의 개수를 세다가,5로 도달하면 hasYacht를 true로 설정
		// sameCount 증가 조건: 현재 sameCount가 증가하는 조건은 이전 숫자와 현재 숫자가 같은 경우. 연속성을 검사하는 로직에서는 현재 숫자와 다음 숫자를 비교해야 한다.
		// 이에 따라 results.get(i).equals(results.get(i)+1)이 아니라 results.get(i).equals(results.get(i + 1) - 1)로 수정
		for (int i = 0; i < results.size()-1; i++) {
			sameCount = 1;
			if(results.get(i).equals((results.get(i)+1)-1)) {
				sameCount++;
			} else {
				sameCount = 1;
			}

			// 3~5개 같을때
			if (sameCount == 5) {
				hasYacht = true;
				System.out.println("Yacht!!");
				break;
			} else if (sameCount == 4) {
				fourOfKind = true;
				System.out.println("Four Of Kind!");
				break;
			} else if (sameCount == 3) {
				threeOfKind = true;
				System.out.println("Three Of Kind!");
				break;
			} 
			
			// else if 로 하면 가장 높은 것만 출력
	
		}
		
		
		  boolean foundFourConsecutive = checkConsecutiveNums(results, 4);
	      boolean foundFiveConsecutive = checkConsecutiveNums(results, 5);
	      
	      if (foundFourConsecutive) {
	            smallStraight = true;
	            System.out.println("Small Straight");
	        }
	      if (foundFiveConsecutive) {
	    	  largeStraight = true;
	    	  System.out.println("Large Straight");
	        }
	      
	

	}
	
	 public static boolean checkConsecutiveNums(List<Integer> results, int consecutiveCount) {
	        Collections.sort(results);
	        
	        for (int i = 0; i < results.size() - consecutiveCount + 1; i++) {
	            boolean isConsecutive = true;
	            for (int j = i; j < i + consecutiveCount; j++) {
	                if (results.get(j) != results.get(j + 1) - 1) {
	                    isConsecutive = false;
	                    break;
	                }
	            }
	            if (isConsecutive) {
	                return true;
	            }
	        }
	        return false;
	    }
	
		//스트레이트
		// 정렬된 주사위 결과에서 연속된 4개 또는 5개의 숫자를 확인  
		
//		if(i == results.size()){
//			if(results.get(0) == 1 && results.get(1) == 2 && 
//					results.get(2) == 3 && results.get(3) == 4 && results.get(4) == 5   
//					|| results.get(0) == 2 && results.get(1) == 3 && results.get(2) == 4
//                 && results.get(3) == 5 && results.get(4) == 6) {
//				largeStraight = true;
//			}
//			if(results.get(0) == 1 && results.get(1) == 2 && results.get(2) == 3 && results.get(3) == 4 ) {
//				smallStraight = true;
//			}
//		}
		
		//스트레이트 연속적으로 나와야하는데, 이렇게 하면 그냥 그 숫자가 있는지만 보는거 아님
//		if(i == results.size()){
//			if((results.contains(1) && results.contains(2) && results.contains(3) && results.contains(4)&& results.contains(5) )
//			        || (results.contains(2) && results.contains(3) && results.contains(4) && results.contains(5)&& results.contains(6))) {
//				largeStraight = true;
//			}
//			if((results.contains(1) && results.contains(2) && results.contains(3) && results.contains(4))
//			        || (results.contains(2) && results.contains(3) && results.contains(4) && results.contains(5))
//			        || (results.contains(3) && results.contains(4) && results.contains(5) && results.contains(6))) {
//				smallStraight = true;
//			}
//		}
	
}


