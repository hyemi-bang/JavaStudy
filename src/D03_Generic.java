
public class D03_Generic {
	
	/*
	 # generic 제네릭
	 - 클래스를 정의할 때 나중에 타입을 지정할 수 있도록 설계해 두는 것 
	   (구상을 해놓고,,, 어떤 타입을 만들지 나중에 정하겠다 ~ 하는 것)
	 - 해당 클래스의 인스턴스 생성시 <>제네릭의 타입을 결정할 수 있다.
	 - 기본타입을 사용할 수 없다 (int, char, short... 대신 Integer, Character, Short... 사용해야한다)
	 - 제네릭은 한 클래스에 여러개 설정할 수도 있다.
	 - 제네릭이 있는 클래스에 제네릭 타입을 설정하지 않으면 Object 타입으로 설정된다. (모든게 다 들어갈 수 있는 타입이 된다~)
	 
	*/


	public static void main(String[] args) {
		// 클래스 정의 당시에 타입을 정하지 않고 인스턴스 생성시 결정할수 있게 된다.
		// <Integer>, <String> 으로 넣으면 a,b도 각 타입에 맞게 적용 된다.
		Fish<Integer> f1 = new Fish<>();
		f1.a = 10;
		f1.b = new Integer[10];
		// Integer[] Fish.b
		
		Fish<String> f2 = new Fish<>();
		f2.a = "fish";
		f2.b = new String[5];
		//String[] Fish.b
		
		Whale<Fish<Integer>, Integer> w1 = new Whale<>();
		// 처음받은게 T타입, 두번째꺼 E 타입
		// Fish<Integer> => Fish로 <>생략해서 사용해도 가능하다.
		w1.food = new Fish<>();
		w1.drink = 123;

	}

}

class Fish<T>{ // T 자리가 제네릭, 내가 나중에 인스턴스를 만들면서 지정할 수 있다.
	T a;
	T[] b;
	
	T swin() {
		return b[(int)(Math.random()*b.length)];
	}
}

class Whale<T, E>{
	T food;
	E drink;
	
}