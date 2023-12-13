package quiz;

import java.util.HashSet;
import java.util.Set;

public class D02_Jiphap {
	
	/*
	
	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 매서드
	[1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	
	2. 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	[1, 2, 3] , [2, 3, 4, 5] => [2, 3]
	>> if(! aSet.containsAll(bSet)){}
	
	>>for(Integer aSet : aSets) {
			for(Integer bSet : bSets){
			aSet.equlas(bSet) 
			}}
	
	3. 두 컬렉션의 차집합(A에 속하고 B에는 속하지 않는 원소)을 Set으로 반환하는 메서드
	[1, 2, 3] - [2, 3, 4, 5] => [1]
	[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	*/

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		HashSet<Integer> aSet = new HashSet<>();
		HashSet<Integer> bSet = new HashSet<>();
		
		
		
		
		aSet.add(1);
		aSet.add(2);
		aSet.add(3);
	
		
		bSet.add(2);
		bSet.add(3);
		bSet.add(4);
		bSet.add(5);
		

//		while(aSet.size()< 3) {
//			aSet.add((int)(Math.random() * 3 + 1));
//		}
		System.out.println("A집합 : " + aSet);
		
//		while(bSet.size()< 4){
//			bSet.add((int) (Math.random() * 4 + 2));
//		}
		System.out.println("B집합 : " + bSet);
		
		System.out.println("합집합 : " + assembleSet.combination(aSet, bSet));
		System.out.println("차집합 1 : " + assembleSet.subtract(aSet, bSet));
		System.out.println("차집합 2 : " + assembleSet.subtract(bSet, aSet));
		
		
//		numbers.addAll(aSet);
//		numbers.addAll(bSet);
//		System.out.println("A,B 합집합 : " + numbers);
		
		
		
		
		
		
	}

	
}


class assembleSet {
	static final int[] aSets = { 1, 2, 3 };
	static final int[] bSets = { 2, 3, 4, 5 };

	int aSet;
	int bSet;

	public assembleSet() {
		aSet = aSets[ (int) Math.random() * aSets.length];
		bSet = bSets[ (int) Math.random() * bSets.length];
	}
	
	// 합집합 combination
	public static Set<Integer> combination(Set<Integer> aSet, Set<Integer> bSet) {
		Set<Integer> combinationSet = new HashSet<>(aSet);
		combinationSet.addAll(bSet);
		return combinationSet;
	}
	// 교집합 intersection
	// contain
	public static Set<Integer> intersection(Set<Integer> aSet, Set<Integer> bSet) {
		Set<Integer> intersectionSet = new HashSet<>(aSet);
			if(! aSet.containsAll(bSet)){
				
		}
		intersectionSet.addAll(bSet);
		return intersectionSet;
	}
	// 차집합 subtract
	// A-B
	public static Set<Integer> subtract(Set<Integer> aSet, Set<Integer> bSet) {
		Set<Integer> subtractSet = new HashSet<>(aSet);
		subtractSet.removeAll(bSet);
		return subtractSet;
	}

}
