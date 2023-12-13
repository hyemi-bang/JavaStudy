import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import myobj.Apple;

public class D01_ArrayList {
	
	/*
	 #java.util.ArrayList
	 
	 - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조 클래스
	 - 배열처럼 데이터를 순차적으로 저장한다
	 - 모든 데이터를 순서대로 읽어야할 때 속도가 가장 빠른 자료구조이다.
	 
	 #자료구조 (Data Structure)
	 
	 - 데이터를 효율적으로 보관하기에 최적화된 구조들
	 - 상황마다 데이터를 가장 효율적으로 다룰 수 있는 방법들에 대해 연구한 결과물
	 >> 데이터 검색, 탐색, 정렬...

	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 새리스트를 하나 생성
		ArrayList list1 = new ArrayList();
		// ArrayList는  toString이 되어 있는 아이다
		
		// list.add(item) : 해당 리스트의 맨 뒤에 원하는 데이터를 추가하는 메서드
		// item 자리는 업캐스팅 되는 자리다.
		list1.add("apple"); 
		list1.add("kiwi");
		list1.add("lion");
		list1.add(123);
		list1.add(99);
		list1.add(new Apple()); 
	
		
		System.out.println(list1); // [apple, kiwi, lion, myobj.Apple@1eb44e46] 출력
		
		// list.get(index) : 해당번째 아이템을 꺼내는 메서드
		System.out.println("iten of index3: "+list1.get(3)); // iten of index3: 123 숫자를 0부터 센다
		System.out.println("iten of index4: "+list1.get(4)); // iten of index4: 99
		
		System.out.println("" + list1.get(3)+list1.get(4)); // 12399 출력
		// to String이 되어 있음으로 두개의 값이 나열된것
		System.out.println((int)list1.get(3)+(int)list1.get(4)); // 222 출력
		// object에서 int 로 다운 캐스팅 한것
		
		
		// list1.add(index, iten); 오버로딩 , 해당 리스트의 원하는 index에 데이터를 추가하는 메서드
		list1.add(5, "hello~"); // 오버로딩 가능
		list1.add(5, "Hi~"); // 헬로우가 추가된 다음에 그 앞에 하이 들어감

		System.out.println(list1);
		// [apple, kiwi, lion, 123, 99, Hi~, hello~, myobj.Apple@1eb44e46] 출력
		
		
		//list.size() : 해당 리스트의 크기를 반환
		System.out.println("list1 크기 : " +list1.size()); // list1 크기: 8 출력
		// 사이즈를 알고 있기에 반복문을 돌릴 수 있다 ( 즉, 요소들을 탐색할 수 있다)
		for(int i =0; i < list1.size(); ++i) {
			System.out.println(i + "번째 요소 :" + list1.get(i));
		}
		// 출력 : 
//		0번째 요소 :apple
//		1번째 요소 :kiwi
//		2번째 요소 :lion
//		3번째 요소 :123
//		4번째 요소 :99
//		5번째 요소 :Hi~
//		6번째 요소 :hello~
//		7번째 요소 :myobj.Apple@1eb44e46
		
		// 배열처럼 타입을 지정하면서 리스트 만들 수 있다. (제네릭 설정)
		ArrayList<String> fruits = new ArrayList<>(); // String만 들어오는 리스트입니다~
		// item 위치가 object 에서 String으로 바뀌었다. 
		// add의 매개변수에서 요구하는 타입이 String타입으로 변한 것을 확인 할 수 있다.
		fruits.add("apple"); 
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add(2,"mango");
		System.out.println(fruits); // [apple, banana, mango, orange, grape] 출력

		// get할때도 지정한 제네릭 타입으로 꺼내기 때문에 다운캐스팅 할 필요가 없다.
		String firstFruit = fruits.get(0); // 변수에 저장해서 출력하기
		System.out.println(firstFruit); // apple 출력
		
		// list.contains(item) : 해당 리스트에 아이템이 포함되어 있는지 확인한다.
		// boolean 타입으로 대답한다. 즉, boolean 타입이 필요한 자리에 들어갈 수 있겠지~
		System.out.println("리스트에 포도가 있나요? " + fruits.contains("grape"));// 리스트에 포도가 있나요? true
		System.out.println("리스트에 복숭아가 있나요? " + fruits.contains("peach")); // 리스트에 복숭아가 있나요? false
		
		if(fruits.contains("peach")) {
			System.out.println("복숭아 이미 포함되어있습니다.");
		} else {
			fruits.add("peach");
			System.out.println("복숭아가 없어서 추가했습니다."); // 복숭아가 없어서 추가했습니다. 출력
		}
		
		//list.remove(index) : 해당 번째 요소를 지운다 
		// ex> fruits.remove(3); System.out.println(fruits); :: [apple, banana, mango, grape, peach] 출력
		//						방금 지운값을 반환한다
		String removed = fruits.remove(3); 
		System.out.println("방금 지워진 값 :" + removed); // 방금 지워진 값 :orange 출력 
		
		
		//list.remove(item) : 해당 값을 지닌 요소를 하나 지운다
		//값으로 지우는 경우 맨 앞에 있는 값부터 하나씩 지운다.
		fruits.add("apple"); 
		fruits.add("apple"); 
		fruits.add("apple"); 
		fruits.add("apple"); 
		fruits.add("apple"); 
		fruits.add("banana");
		fruits.add("banana");
		fruits.add("banana");
		
		System.out.println(fruits);
		// [apple, banana, mango, grape, peach, apple, apple, apple, apple, apple, banana, banana, banana]
		fruits.remove("apple");
		System.out.println(fruits);
		// [banana, mango, grape, peach, apple, apple, apple, apple, apple, banana, banana, banana]
		fruits.remove("apple");
		fruits.remove("apple");
		fruits.remove("banana");
		fruits.remove("banana");
		System.out.println(fruits);
		// [mango, grape, peach, apple, apple, apple, banana, banana]
		
		// 값으로 삭제하면 성공여부를 반환한다.
		System.out.println("바나나 삭제 성공여부 : " + fruits.remove("banana")); // 바나나 삭제 성공여부 : true
		System.out.println("프링글스 삭제 성공여부 : " + fruits.remove("프링글스")); // 프링글스 삭제 성공여부 : false
		
		
		ArrayList<String> countries = new ArrayList<>();
		ArrayList<String> bigCountries = new ArrayList<>();
		countries.add("South Korea");
		countries.add("China");
		countries.add("America");
		countries.add("England");
		countries.add("Russia");
		countries.add("France");
		
		bigCountries.add("America");
		bigCountries.add("China");
		bigCountries.add("Russia");
		
		System.out.println(countries);
		//[South Korea, China, America, England, Russia, France] 출력
		System.out.println(bigCountries);
		//[America, China, Russia] 출력

		/*
			# Collection
			
			- Java에서 제공하는 자료구조 인터페이스
			- Collection 인터페이스를 구현하는 클래스로 List, Set 등이 있다.
			- List는 모두 Collection 인터페이스의 자손이다.
			
		*/
		//addAll(Collection) : 다른 컬렉션의 내용을 모두 더해준다
		countries.addAll(bigCountries);
		
		System.out.println(countries);
		// [South Korea, China, America, England, Russia, France, America, China, Russia] 출력
		// 뒤에 bigCountries 더해짐
		
		// list.removeAll(Collection) : 전달한 컬렉션에 포함된 내용을 모두 삭제한다.
		// removeAll boolean 타입 삭제 성공여부 반환된다. 리스트의 내용이 변했다면 true 리턴
		countries.removeAll(bigCountries);
		System.out.println(countries);
		// [South Korea, England, France] 출력
		
		countries.removeAll(fruits);
		System.out.println("big Countries 삭제 성공여부 : " + countries.removeAll(fruits));
		// big Countries 삭제 성공여부 : false
		
		// list.containsAll(Collection) : 리스트에 전달한 컬렉션의 모든 내용이 포함되어 있으면 true
		countries.add("China");
		System.out.println(countries.containsAll(bigCountries)); // false, china 하나만 추가된다고 true가 나오는게 아니다~
		
		
		countries.add("Noth Korea");
		countries.add("Russia");
		countries.add("America");
		countries.add("Brazil");
		System.out.println(countries.containsAll(bigCountries));  // true
		System.out.println(countries);
		// [South Korea, England, France, China, Noth Korea, Russia, America, Brazil] 출력
		
		
		// list.set(index, item) : 해당 번째 요소를 수정한다.
		// add는 원래 있던 녀석이 뒤로 밀리지만, set은 덮어쓰기 된다.
		countries.set(1, "프링글스");
		System.out.println(countries);
		//[South Korea, 프링글스, France, China, Noth Korea, Russia, America, Brazil] 출력
		
		// list.subList(start, end) : 리스트를 원하는 만큼 잘라낸 리스트를 반환한다
		// start 이상, end 미만 반환, start 포함, end 불포함
		List<String> sub = countries.subList(3, 5);
 
		System.out.println(sub); // [China, Noth Korea]
		
		//ArrayList 의 업캐스팅
		ArrayList<String> drinks = new ArrayList<>();
		LinkedList<String> foods = new LinkedList<>();
		
		Collection<String> d1 = drinks;
		List<String> d2 = drinks;
		// 모든 클래스는 자기 부모클래스로 업 캐스팅이 가능하다~
		List<String> f1 = foods;
		// LinkedList, ArrayList는 세부구현 및 성능이 다르지만 같은 List의 자식이기 때문에 List 메서드로 쉽게 구현이 가능하다.
		
		f1.add("봉골레 파스타");
		f1.add("감바스");
		f1.add("알리오올리오");
		
		System.out.println(f1); // [봉골레 파스타, 감바스, 알리오올리오] 출력
	

	} 

}
