import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D07_HashMap {
	
	/*
	
	#Map
	- 데이터를 Key/Value 방식으로 저장하는 자료구조
	- 인덱스 번호 대신 Key값을 사용해 사용하기 편하게 만들어진 자료구조이다
	- Key 값은 중복이 허용되지 않으나, Value는 중복 허용
	
	#HashMap
	
	
	*/

	public static void main(String[] args) {
		int[] information = {3000, 15, 5};
	
		System.out.println("0번은 돈 :" + information[0]);
		System.out.println("1번은 나이 :" + information[1]);
		System.out.println("2번은 구매횟수 :" + information[2]);
		// 이런식으로 배열로 하면 0,1,2가 각 무엇인지 외우고 있어야 한다.

		//데이터를 구분하기 쉬운 키값으로 넣어놓기 때문에 인덱스를 외우는 수고를 덜 수 있다.
		//데이터 저장하기 위해서는 index.put("key",value); => map.put(K,V)  map에 해당 데이터를 추가하거나 수정한다
		//데이터 꺼낼때는 index.get("key");	=> map.get(K) 해당 키를 사용해 값을 꺼낸다	
		Map<String, Integer> info = new HashMap<>();
		//  key 제네릭, value 제네릭
		
		info.put("money", 3000);
		info.put("age", 15);
		info.put("purchaseCount", 5);
		
		// 인덱스의 번호대신 키 값으로 데이터를 꺼내 사용할 수 있다.
		System.out.println("money : " +info.get("money")); // money : 3000
		info.put("money", 50000);
		// 이미 있는 키값에 데이터를 추가하면 기존 키 값을 덮어쓴다.
		System.out.println("money : " +info.get("money")); // money : 50000
		
		// 존재하지 않는 키 값을 사용하면 null 이 리턴된다.
		System.out.println(info.get("future"));
		
		//map.putIfAbsent(K,V); 해당 키에 값이 없는 경우 전달한 값을 추가한다.(기본값)
		// 해당 키에 이미 값이 있는 경우 값을 꺼낸다.
		
		// 이미 존재하는 키에 putIfAbsent 하는 경우 이미 존재하는 값을 꺼냄
		System.out.println(info.putIfAbsent("money", 1500)); // 50000 리던
		// 존재하지 않는 키에 putIfAbsent 하는 경우 데이터가 추가된 후 null 리턴
		System.out.println(info.putIfAbsent("stock", 30)); // null
		System.out.println(info);
		//{money=50000, purchaseCount=5, stock=30, age=15}
		
		
		//map.keySet(): 모든 키들을 Set으로 꺼낸다
		Set<String> keys = info.keySet();
		System.out.println(keys); // [money, purchaseCount, stock, age]
		
		// for-each 키를 하나씩 꺼내는 반복문을 돌릴 수 있다.
		// int i 사용이 안되서 for each문 사용함
		
		for(String key : keys) {
			System.out.printf("%s=%d\n",key,info.get(key));
		}
		// money=50000
		// purchaseCount=5
		// stock=30
		// age=15

		//map.values(): 모든 값들을 List로 꺼낸다
		// value만 꺼내는건 크게 의미가 없기때문에 key 값도 같이 꺼내준다.
		System.out.println(info.values()); // [50000, 5, 30, 15]
		
		//map.containsKey(K) : 맵에 해당키가 있는지 확인
		
		System.out.println(info.containsKey("salary")); // false
		System.out.println(info.containsKey("age")); // true
		
		// map.containsValue(V) : 맵에 해당 값이 있는지 확인
		System.out.println(info.containsValue(50000)); // true
		
		// map.remove(K) : 해당 키값을 지운다. 지우면서 들어있던 값을 리턴한다
		System.out.println(info.remove("money")); // 50000리턴, 
		System.out.println(info.remove("salary")); // null
		
		System.out.println(info); 
		// {purchaseCount=5, stock=30, age=15}  money가 지워진것을 확인 할 수 있다.
		System.out.println();
		
		
		
		
	}

}
