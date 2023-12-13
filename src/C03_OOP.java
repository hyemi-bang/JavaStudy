
public class C03_OOP {
	/*
	 # OOP (Object Oriented Programming)
	 객체 지향 프로그래밍
	 
	 - 변수와 함수들을 하나의 개념으로 묶어서 생각하는 프로그래밍 방식
	 - 변수와 함수들을 무분별하게 사용하다보면 여러 문제점들이 발생하기 때문에,
	   현실에 존재하는 하나의 개념(객체)으로 묶어서 생각하기 시작
	 - 변수는 주로 객체의 현재 상태를 나타낸다
	 - 함수는 주로 해당 객체의 여러 기능(행동)들을 나타낸다
	 - 함수는 해당 객체의 현재 상태를 변화시킨다.
	 - 객체 내부에서 해당 객체의 상태를 변화시키는 함수를 메서드라고 부른다
	 
	 책을 예로 들어보자면
	 책의 현재 상태(변수) : 제목, 글쓴이, 전체 페이지, 현재 보고 있는 페이지, 가격
	 				   각 페이지의 낙서들, 각 낙서들의 좌표
	 책의 기능(메서드)	 : 책을 다음 페이지로 넘긴다, 여러 페이지 넘긴다, 앞으로 넘긴다
	 				   특정 페이지에 책갈피를 꽂는다, (특정 페이지, 특정 위치에)새로운 메모를 추가한다 등
	 				   책의 현재 상태를 변화시킬 수 있는 것들을 의미
	 				   
	 # 클래스 (Class)
	 
	 - 객체지향에서 말하는 객체라는 존재를 프로그래밍 언어로 표현하는 문법
	 - 클래스는 해당 객체의 설계도 역할을 한다
	 - 클래스를 정의한 시점에서는 실제 객체가 존재하지 않는다
(매우 중요) - 클래스를 통해 만들어내는 실제 객체를 인스턴스(instance)라고 부른다.
	 - 클래스를 통해 새로운 인스턴스를 생성할때 new라는 키워드를 사용한다
	 
	*/

	public static void main(String[] args) {

		// Book 클래스의 인스턴스를 3개 생성했다
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();

		// 생성된 인스턴스에 .을 찍고 해당 클래스의 변수와 메서드를 사용할 수 있다
		// 생성하지 않은 클래스의 변수를 만들수 없고
		// 생성하기만 하고 클래스의 변수를 만들지 않으면 사용하지 못한다.

		// 책들마다 각자의 현재 상태를 다르게 설정할 수 있다.
		b1.maxPage = 100;
		b1.currentPage = 37;

		b2.maxPage = 190;
		b2.currentPage = 8;

		b3.used = true;

		System.out.printf("책 1의 현재 상태 : %d/%d(%s)\n",
				b1.currentPage, b1.maxPage, b1.used ? "중고" : "새제품");
		System.out.printf("책 2의 현재 상태 : %d/%d(%s)\n",
				b2.currentPage, b2.maxPage, b2.used ? "중고" : "새제품");
		System.out.printf("책 3의 현재 상태 : %d/%d(%s)\n",
				b3.currentPage, b3.maxPage, b3.used ? "중고" : "새제품");
		// b3는 선언만 하고 값을 넣지 않았는데, 0/0 이 나오는 이유 : 자동으로 초기화가 되어 있기 때문이다.

		System.out.println();

		// 클래스의 정의한 메서드로 각 인스턴스를 변화시킬 수 있다
		for (int i = 0; i < 10; ++i) {
			b1.nextPage();
			b2.prevPage();
		}

		System.out.printf("책 1의 현재 상태 : %d/%d(%s)\n",
				b1.currentPage, b1.maxPage, b1.used ? "중고" : "새제품");
		System.out.printf("책 2의 현재 상태 : %d/%d(%s)\n",
				b2.currentPage, b2.maxPage, b2.used ? "중고" : "새제품");
		System.out.printf("책 3의 현재 상태 : %d/%d(%s)\n",
				b3.currentPage, b3.maxPage, b3.used ? "중고" : "새제품");
		
		System.out.println();
		
		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		
		System.out.println();
		
		Coffee co1 = new Coffee();
		Coffee co2 = new Coffee();
		Coffee co3 = new Coffee();
		
		co1.drink = true;
		co1.capacity = 355;
		co1.price = 4600;
		co1.brandName ="Starbuck";
		co1.name ="바닐라 더블샷";
		
		co2.drink = true;
		co2.price = 2000;
		co2.brandName = "Mega Coffee";
		co2.name ="아메리카노";
		
		co3.brandName = "Ediya";
		co3.price = 3400;
		co3.name = "아이스티";
		
		System.out.printf("1번 음료: (%s) %s / %s | 가격: %d,  | 용량 : %d \n",
				co1.drink ? "커피 o" : "커피 x" ,
				co1.brandName, co1.name, co1.price, co1.capacity);
		System.out.printf("2번 음료: (%s) %s / %s | 가격: %d,  | 용량 : %d \n",
				co2.drink ? "커피 o" : "커피 x",
				co2.brandName, co2.name, co2.price, co2.capacity);
		System.out.printf("3번 음료: (%s) %s %s/ %s | 가격: %d,  | 용량 : %d \n",
				co3.drink ? "커피 o" : "커피 x", co3.ice ? "아이스 음료로 변경되었습니다" : "변경되지 않았습니다",
				co3.brandName, co3.name, co3.price, co3.capacity);
		
		System.out.println();
		for(int i = 0; i < 1; ++i) {
			co1.drinkMore();
		}
		co1.changeIced();
	
		System.out.printf("1번 음료 : (%s) %s %s / %s | 가격: %d, | 마시고 난 후 용량 : %d\n",
				co1.drink ? "커피 o" : "커피 x", co1.ice ? "아이스 음료로 변경되었습니다" : "변경되지 않았습니다",
				co1.brandName, co1.name, co1.price, co1.capacity);

		System.out.println();
		Vehicle v1 = new Vehicle();
		Gun g1 = new Gun();
		
		v1.price = 50000000;
		v1.gun = g1;
		v1.gun.bullet = 30;
		
		for(int i = 0; i < 10; ++i) {
			v1.gun.fire();
		}
		
		System.out.println(v1.getGrade());
	}
}

// 책 클래스 (설계도) 현재는 실제 상태가 아니고, 인스턴스를 생성할때 실체한다
class Book{
	// 두 가지의 변수(현재 상태 )를 가지고 있다
	//         == 인스턴스 변수, 멤버 면수, 필드 ..
	
	int maxPage;
	int currentPage;
	boolean used;
	String[] contents; // 책의 전체내용을 String 하나로 할 수 없음으로 String[]로
	// 클래스의 인스턴스 변수는 배열과 마찬가지로 자동으로 초기화가 되어있다.
	// int  - 0, float, double - 0.0 , boolean - false ... 로 초기화 되어있다.
	
	// class 내부의 함수 (메서드)
	// 주로 현재 인스턴스(this)의 상태를 변화시키는 역할을 한다
	// 생긴 인스턴스만 ! 실체 한 녀석만 ! 변화시킬 수 있다~
	
	void nextPage() {
		if (this.maxPage > this.currentPage) {
			++this.currentPage; // this. 현재 인스턴스 b1.nextPage -> 현재 b1이다~ 라고 생각
								// this.은 기본적으로 생략이 가능하지만, 안될때도 있음으로 주의~
		} else {
			System.out.println("[Warning] 이미 책의 맨 뒤 페이지 입니다");
		}
	}

	void prevPage() {
		if (this.currentPage > 0) {
			--this.currentPage;
		} else {
			System.out.println("[Warning] 이미 책의 맨 앞 페이지 입니다");
		}
	}
	
	void printBookInfo() {
		System.out.printf("현재 책 상태 %d/%d(%s)\n",
				this.currentPage, this.maxPage, this.used ? "중고" : "새 제품");
	}

}


/*

	 실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후
	 해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상태를 출력해보세요
	 (인스턴스 3개 이상, 필드 3개 이상, 메서드 2개 이상, 책 금지)
 
*/

class Coffee{
	boolean ice;
	boolean drink; // 커피냐 아니냐
	int capacity; // 용량
	int price; // 가격
	String brandName; // 커피 브랜드
	String name; // 음료의 종류
	
	void drinkMore() {
		if(this.capacity > 0) { // 커피용량 0이상일떄 마시고, 100씩 줄여
			capacity -= 100;
		} else {
			System.out.println("이미 다 마셨습니다.");
		}
	}
	
	void changeIced() {
		this.price += 500; // 500원 추가하고 아이스 입니다. 
		ice = true;
	}
	
}

//T _ car
class Gun {
	String name;
	int damage;
	int bullet;
	double attackSpeed;
	
	void fire () {
		if(bullet > 0) {
			System.out.printf("총을 쐈습니다! %d/30 \n" , --bullet);
		}
	}
}

class Vehicle {
	Gun gun;
	String name;
	int price;
	int fuel;
	
	void addFuel(int liter) {
		this.fuel += liter;
	}

	
	String getGrade() {
		if (price > 100000000) {
			return "luxury car";
		} else if (price > 80000000) {
			return "small luxury car";
		} else {
			return "car";
		}
	}
}





































