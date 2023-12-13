import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	
	/*
	
		#Set
		- 집합을 구현해 놓은 클래스
		- 중복을 허용하지 않는다
		- Collection 인터페이스를 구현한 클래스다
		
		
		# Collection ( 어제 배운 ArrayList에 있는 내용 )
		- Java에서 제공하는 자료구조 인터페이스
		- Collection 인터페이스를 구현하는 클래스로 List, Set 등이 있다.
		- List는 모두 Collection 인터페이스의 자손이다.
			
		#Hash
		- 같은 값을 넣으면 항상 일정한 값이 나와야 하는 단방향성 알고리즘
		- HastSet은 중복 체크하는데 해당 객체의 Object.hashcode() 메서드를 사용한다.
		- hash의 결과는 규칙적이지 않기 때문에 순서는 존재하지 않는다 (순서가 없다는 말은 index가 없다는 이야기)
		
	
		
		# java.util.HashSet
		- 해쉬 알고리즘을 사용하는 Set
		- 중복된 데이터를 허용하지 않으며 순서를 알 수 없다.
		
	
	*/

	public static void main(String[] args) {
		
		"".hashCode();
		
		HashSet<Integer> numbers = new HashSet<>();
		
		// Set.add(item) : 요소를 추가한다
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		
		System.out.println(numbers); // [50, 20, 40, 10, 30] 출력, 10은 중복이라 어차피 1번만 출력된다 (set의 규칙)
		
		// HashSet은 index가 없어서 get을 할 수 없다
		// 반복문을 통해 하나씩 모두 꺼내는 방법밖에 없다
		
		// forEach 반복문 :  오른쪽에서 맨 앞에서 부터 순서대로 값을 하나씩 꺼내서 반복한다
		for(Integer number : numbers) {
			System.out.print(number + " "); // 50 20 40 10 30  출력
			
			//Object 타입 hashCode : 주소값 리턴
			//Integer 타입 hashcode : 기본형 값 리턴
			//String hashCode : 문자열 값을 통한 계산값 리턴
			
			System.out.println("Integer hashCode : " + number.hashCode());
//			50 Integer hashCode : 50
//			20 Integer hashCode : 20
//			40 Integer hashCode : 40
//			10 Integer hashCode : 10
//			30 Integer hashCode : 30 출력
		}
		System.out.println("String hashCode : " + "abcd".hashCode()); //String hashCode : 2987074
		
		/*
		# Hash 알고리즘 (Object에서 잠깐 배운내용)
		- 책 한 권 분량, 고유번호 등 을 비교할때에도 간단히 16진수로 나오기 때문에 다른 방법보다 훨씬 쉽게 비교할 수 있다
		- 다음의 여러가지 조건을 만족하는 알고리즘
		> 같은 값을 넣으면 항상 예측하기 힘든 일정한 값이 나와야 한다 (중복없는)
		> 다른 값을 넣었을때 같은 값이 나오면 안된다
		> 해쉬 알고리즘으로 얻어낸 결과값(해쉬코드)으로 원래 값을 유추하기 어려워야한다
		 
		 여기 16진수는 실제 값이 아니고 이런식으로 되어 있다고 대충 알려주기 위함임
		>>> hello! => 5183AFDE23001 출력 16진수로
		>>> hello  => 3335423416AAA 출력
		>>> 50	   => A12.....
		>>> 10	   => D543....
		
		나으 추측 >> 50이 가지고 있는 hash값이 10이 가지고 있는 해쉬값보다 앞에 있어서 50이 먼저 출력되는 것 같다
		 
		 
		 */
		
		HashSet<String> animals = new HashSet<>();
		
		animals.add("zibra");
		animals.add("lion");
		animals.add("tiger");
		animals.add("tiger"); // tiger 들의 해쉬코드들을 비교해서 중복이면 출력하지 않는다. 
		
		System.out.println("tiger".hashCode() == "tiger".hashCode() ); 
		// hashCode 110358719로 동일함,, true 출력
		System.out.println("tiger".equals("tiger")); // true 출력
		
		// equals 로 비교하면 되는데 굳이 hashCode 사용 하는 이유는?
		System.out.println("tiger1".hashCode()); // -873846958 출력
		System.out.println("tiger".hashCode());
		// equlas 비교는 문자열 한글자씩 확인을 하면서 하기때문에 시간이 오래걸린다.
		// hashCode는 조금 더 속도가 빠르게 비교할 수 있음으로 중복체크에 있어서 hashCode를 많이 사용한다.
		
		
		System.out.println(animals); // [zibra, tiger, lion]
		
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("lemon");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("orange");
		
		
		// Set.addAll(Collection<? extends GenericType>)
		// 해당 Set에 다른 컬렉션(List도 포함)의 값을 모두 더한다 ( 중복은 제거 )
		animals.addAll(fruits);
		// animals.addAll(numbers); 제네릭이 Integer라 더할 수 없다
		//The method addAll(Collection<? extends String>) 
		//in the type AbstractCollection<String> is not applicable for the arguments (HashSet<Integer>)
		
		System.out.println(animals);
		// [orange, lemon, zibra, grape, tiger, lion, mango]
		
		ArrayList<String> anmialList = new ArrayList<>();
		anmialList.add("monkey");
		anmialList.add("monkey");
		anmialList.add("monkey");
		anmialList.add("rabbit");
		animals.addAll(anmialList); // List도 Collection 이므로 더할 수 있다.
				
		System.out.println(animals);
		// [orange, lemon, monkey, rabbit, zibra, grape, tiger, lion, mango]
		
		
		// Set.removeAll(Collection)
		animals.removeAll(fruits);
		System.out.println(animals); // [monkey, rabbit, zibra, tiger, lion]
		
		//Set.contains(item) : 포함여부 반환
		System.out.println("오리 있나요? " + animals.contains("duck")); // 오리 있나요? false
		
		// 컬렉션은 다른 컬렉션으로의 변환이 자유롭다 (해당 컬렉션의 생성자를 사용)
		
		//Set -> List
		List<String> list1 = new ArrayList<>(animals);
		Set<String> set1 = new HashSet<>(animals);
		
		System.out.println("list가 된 Set" + list1); // list가 된 Set[monkey, rabbit, zibra, tiger, lion]
		System.out.println("Set이 된 list" + set1); // Set이 된 list[monkey, rabbit, zibra, tiger, lion]

	}

}
