
public class C10_Object {
	
	/*
		# Object class
		- 모든 자바 클래스들의 최고 조상 클래스
		- 모든 클래스는 Object를 상속받아 만들어진다
		-Object 클래스의 메서드는 모든 클래스에 존재한다
		
		# Object 클래스 메서드
		- 해당 클래스에 맞는 형태로 오버라이드하여 사용가능하게 설계되어있다
		
		# Object.toString()
		- 해당 객체를 문자열로 표현한다면 어떤 모양인가?를 정의하는 메서드
		- 자바의 모든 객체는 toString()을 통해 문자열로 표현될 수 있다
		- Object 클래스에 정의되어 있는 toString() 메서드 원형은
		  해당 클래스의 이름과 메모리상 주소를 출력하게 되어있다
		- print()등 다양한 메서드에서 객체의 toString()을 활용한다
		
		# Object.equals()
		- 해당 객체로 만들어진 두 인스턴스가 같은지 판정하는 기준을 정의하는 메서드이다
		- 매개변수로 전달받은 인스턴스와 this를 비교하여 결과를 리턴한다
		- Object 클래스에 정의되어 있는 equals()의 원형은 동일한 구조값을 가진 인스턴스 인지 비교하게 되어있다
		
		# Object.hashCode()
		- 해당 인스턴스의 지문 역할을 하는 값을 생성해야하는 메서드
		- Object 클래스의 기본 동작은 해당 인스턴스의 주소값을 리턴하는 것이다
		
		 
		# Hash 알고리즘
		
		- 책 한권 분량, 고유번호 등 을 비교할때에도 간단히 16진수로 나오기 때문에 다른 방법보다 훨씬 쉽게 비교할 수 있다
		
		- 다음의 여러가지 조건을 만족하는 알고리즘
		> 같은 값을 넣으면 항상 예측하기 힘든 일정한 값이 나와야 한다 (중복없는)
		> 다른 값을 넣었을때 같은 값이 나오면 안된다
		> 해쉬 알고리즘으로 얻어낸 결과값(해쉬코드)으로 원래 값을 유추하기 어려워야한다
		 
		>>> hello! => 5183AFDE23001 출력 16진수로
		>>> hello  => 3335423416AAA 출력
		
	*/
	

	public static void main(String[] args) {
		Snack s1 = new Snack();
		System.out.println(s1); 
		// s1의 주소(Snack@75a1cd57)가 나오다가, toSting 메서드를 만들고 나니 해당정보가 나오기 시작
		// print() 메서드들은 해당 객체의 toString()결과를 콘솔에 출력하는 메서드다
		// 즉 모든 객체는 toString()을 가지고 있을 수 밖에 없음으로 이런 구현이 가능하다
		s1.info();
		
		Snack s2 = new Snack("초코파이",4300);
		String snackStr = s2.toString();
		System.out.println(snackStr);
		
		Snack s3 = new Snack("초코파이",4300);
		Snack s4 = new Snack("몽쉘",4800);
		// 해당 클래스만의 equals를 구현하여 '같음'을 구현할 수 있다.
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		//System.out.println(s1.equals(new Car("마티즈","벤츠", 2000))); 
		// equals에서 받을 수 있는건 Object (모든 타입의 부모임으로) 다 비교할 수 있게 된다.
		// 그래서 만약에 이름과 가격이 있는 것과 비교하면 같다고 나올 수도 있다.
		
		// Object 타입은 모든 타입의 부모이기 때문에 모든 타입에서 업캐스팅이 가능하다.
		Object o1 = 123;
		Object o2 = "12345";
		Object o3 = new DumpTruck();
	}

}

class Snack {
	String name;
	int price;
	
	public Snack() {
		name = "과자";
		price = 500;
	}
	
	public Snack(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("과자 이름 : " + name);
		System.out.println("가격 : "+price);
	}
	
	//toString() >> 이 객체를 문자열로 표현한다면?
	@Override
	public String toString() {
		//return super.toString();
		// 오버라이드 되서 super로 가야하는데, 우리가 구현을 아래 내용으로 해놓아서 그 내용을 사용한것이다.
		return "["+name+"/가격:"+price+"]";
	}
	
	@Override
	public boolean equals(Object obj) { 
		// Object 자리에 Snack 타입을 받을 수 없는 이유는?? 
		// The method equals(Snack) of type Snack must override or implement a supertype method
		Snack s1 = this;
		Snack s2 = (Snack)obj;
		
		return (s1.price == s2.price && s1.name.equals(s2.name));
	}
	
}
