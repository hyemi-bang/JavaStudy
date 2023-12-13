package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_Jiphap_T<T> {
	
	/*
	
	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 매서드
	[1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	
	2. 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	[1, 2, 3] , [2, 3, 4, 5] => [2, 3]
	
	3. 두 컬렉션의 차집합(A에 속하고 B에는 속하지 않는 원소)을 Set으로 반환하는 메서드
	[1, 2, 3] - [2, 3, 4, 5] => [1]
	[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	*/

	// 두 Set을 전달받으면 합집합을 만들어 리턴하는 메서드
	// 메서드 타입이 Set 이었을때 union(set1,list1); 은 컴파일 에러가 나온다
//	static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
//		 a.addAll(b);
//		 return a;
//	} 
	

//	static Set<Integer> union(Collection<Integer> a, Collection<Integer> b) {
//		 a.addAll(b);
//		 return new HashSet<>(a);
//	} 
	//이대로 하면 메인에서 출력할 때 포함하지 않았던 숫자들이 출력이 된다. 따라서 아래 메서드처럼
	//System.out.println(union(set1, set2)); // [1, 2, 3, 4, 5, 6]
	//System.out.println(union(set1, list1)); // [1, 2, 3, 4, 5, 6]

	// 빈 셋을 만들어서 전달받은 a를 바로 더하지 않도록 한다
	Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		 // ? extends T :(메인에서 인티저 사용했으니까,,)만약에 인티저를 상속받은 자식들이 있다면 그 자식들도 받겠다
		HashSet<T> union = new HashSet<>();

		union.addAll(a);
		union.addAll(b);

		return union;
	}
	
	Set<T> inter(Collection<T> a, Collection<T> b){
		HashSet<T> inter = new HashSet<>();
		
		// a에 있는 값들을 돌리면서, i에 b가 있으면 그걸 추가해라
		for(T i : a) {
				if(b.contains(i)) {
					inter.add(i);
			}
		}
		return inter;

	}
	
	Set<T> inter1(Collection<T> a, Collection<T> b){
		HashSet<T> inter1 = new HashSet<>();
		
		inter1.addAll(a);
		inter1.retainAll(b); // b와 일치하는 것만 남긴다. (교집합)
		
		return inter1;

	}
	
	
	
	Set<T> different(Collection<T> a, Collection<T> b){
		HashSet<T> different = new HashSet<>();
		different.addAll(a);
		different.removeAll(b);
		
		return different;
	}

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		ArrayList<Integer> list1 = new ArrayList<>(); // 컬렉션을 받는다는건, 리스트에서 출력해도 나와야한다는 의미

		
		set1.add(1);
		set1.add(2);
		set1.add(3);

		set2.add(3);
		set2.add(4);
		set2.add(5);

		list1.add(2);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		
		D02_Jiphap_T<Integer> quiz = new D02_Jiphap_T<Integer> ();
		
		quiz.union(set1, set2);
		quiz.union(set1, list1);
		// 메서드 타입이 Set 이었을때 union(set1,list1); 은 컴파일 에러가 나왔었다
		// The method union(Set<Integer>, Set<Integer>)
		// in the type D02_Jiphap_T is not applicable for the arguments
		// (HashSet<Integer>, ArrayList<Integer>)

		
		System.out.println("합집합 : ");
		System.out.println(quiz.union(set1, set2)); // [1, 2, 3, 4, 5]
		System.out.println(quiz.union(set1, list1)); // [1, 2, 3, 4, 6]
		System.out.println("교집합 : ");
		System.out.println(quiz.inter(set1, set2)); // [3]
		System.out.println(quiz.inter(set2, list1)); // [4]
		System.out.println(quiz.inter1(list1, set1)); // [2]
		System.out.println("차집합 : ");
		System.out.println(quiz.different(set2, set1)); // [4, 5]
		System.out.println(quiz.different(list1,set2)); // [2, 6]

	}

}
