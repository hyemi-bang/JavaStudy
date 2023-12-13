package myobj;

public class Coffee {
	boolean ice;
	boolean drink; // 커피냐 아니냐
	int capacity; // 용량
	int price; // 가격
	String brandName; // 커피 브랜드
	String name; // 음료의 종류
	
	// 커피의 생성자 ( 이 클래스의 인스턴스를 생성할 때 호출해야 하는 것 )
	public Coffee(boolean ice, boolean drink, int capacity,
			int price, String brandName, String name) {
		// 인스턴스 생성과 동시에 필드값을 초기화 한다
		// 메서드의 매개변수 이름과 필드명이 같은 경우 this를 통해 명확하게 구분할 수 있다.
		
		this.ice = ice; // this.price 는 class Apple의 price를 의미하는 거고, 오른편 price는 필드명
		this.drink = drink;
		this.capacity = capacity;
		this.price = price;
		this.brandName = brandName;
		this.name = name;
	}
	

	void drinkMore() {
		if (this.capacity > 0) { // 커피용량 0이상일떄 마시고, 100씩 줄여
			capacity -= 100;
		} else {
			System.out.println("이미 다 마셨습니다.");
		}
	}

	void changeIced() {
		this.price += 500; // 500원 추가하고 아이스 입니다.
		ice = true;
	}
	// 사과의 메서드 (인스턴스 변수를 변화시키거나 꺼내 활용한다)	
		public void info() {
			System.out.printf("(%s) %s | %s / %s 가격: %d, 용량 : %d\n" ,
					 drink ? "커피 o" : "커피 x", ice ? "아이스 음료로 변경되었습니다" : "아이스로 변경되지 않았습니다",
					 brandName, name, price, capacity);
		}

}
