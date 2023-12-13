package myobj;

public class Apple {

	// 사과의 속성 (인스턴스 변수, 멤버, 필드, 상태...)
	public int price;
	public int sweet;
	public double weight;
	public String color; 
	// 진행 순서 : 속성 1번 생성자 2번
	// 속성에 기본값을 넣어 초기화 하는것 가능하고 /  생성자 쪽에서 속성 초기화 해놓은 것 덮어쓰게 되는 것도 가능하다
	
	// 생성자의 위치는 속성 아래 !!
	
	// 사과의 생성자 ( 이 클래스의 인스턴스를 생성할 때 호출해야 하는 것 )
	public Apple(int price, int sweet, double weight, String color) {
		// 인스턴스 생성과 동시에 필드값을 초기화 한다
		// 메서드의 매개변수 이름과 필드명이 같은 경우 this를 통해 명확하게 구분할 수 있다.
		this.price = price; // this.price 는 class Apple의 price를 의미하는 거고, 오른편 price는 필드명
		this.sweet =sweet;
		this.weight = weight;
		this.color =color;
	}
	// 생성자 오버로딩
	// 생성자 오버로딩을 통해 하나의 클래스에 여러개의 생성자를 보유할 수 있다.
	public Apple() {}
	public Apple(int price) {
		// 가격만 채우고 나머지는 입력한 기본값으로 사용하는 생성자
		this.price = price;
		this.sweet = 13;
		this.weight = 10.0;
		this.color = "빨간색";
	}
	// 사과의 메서드 (인스턴스 변수를 변화시키거나 꺼내 활용한다)	
	public void info() {
		System.out.printf("%d원/%d브릭/%.2fg/%s\n", price, sweet, weight, color);
	}
}
