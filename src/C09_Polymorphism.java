
public class C09_Polymorphism {
	
	/*
		 # Polymorphism, 객체의 다형성
		 
		 - 객체가 다양한 형태를 지닐 수 있는 성질
		 - 사과는 과일이다 & 과일은 사과가 아니다
		  즉> 사과는 사과이고, 과일이기도 하다 (다형성)
		 
		 # 업 캐스팅
		 
		 - 자식 타입이 부모 타입이 되는 것 (사과 타입을 과일 타입으로 변경 하는 것/ 사과가 과일이 되는 것)
		 - 자식 타입 인스턴스는 내부에 부모타입의 모든 것을 지니고 있음으로
		   부모타입으로 타입 캐스팅 되는 것에는 문제가 없다.
		 - 업 캐스팅된 자식타입 인스턴스는 원래 가지고 있던 자식 클래스의 기능들을 사용할 수 없다.
		 
		 # 다운 캐스팅
		 
		 - 부모 타입을 자식 타입으로 만드는 것
		 - 일반적으로 부모타입은 자식타입이 될 수 없다
		 >>  DumpTruck d2 = new Car("자동차", "현대", 123); 덤프트럭이 가지고 있는 기능을 자동차는 몰라
		 - 원래 자식타입이었다가 업캐스팅 되어있는 인스턴스의 경우에만
		  후에 다시 다운캐스팅(자식 타입으로 돌아 가는 것) 가능 하다
		  
		  # instanceof 연산자
		  
		  - 해당 인스턴스의 실제 타입을 알아보기 위한 연산자
		  - 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자 이다.
	*/

	public static void main(String[] args) {
		// 덤프트럭클래스를 카 타입으로 변경, 업캐스팅
		// Car c1 = (Car)(new DumpTruck());
		// c1.addCargo(100);  
		// 이 상태는 이미 카 클래스로 업캐스팅 되어버렸기 때문에 덤브트럭의 기능을 사용 할 수 없다
		
		DumpTruck d1 = new DumpTruck();
		d1.addCargo(100);
		Car c1 = (Car)(d1);

		Liquid l1 = new Liquid();
		l1.drink(); // 상속이 일어나지 않은 일반적인 상황
		
		Water w1 = new Water();
		w1.drink(); // 오버라이드 
		Liquid w2 = new Water(); // 업 캐스팅
		w2.drink();
		Liquid a1 = new Alcohol(); // 업 캐스팅은 명시적으로 하지 않아도 된다 (자연스러운 타입 캐스팅중 하나)
		a1.drink();
		// 업 캐스팅된 자식타입 인스턴스는 원래 가지고 있던 자식 클래스의 기능들을 사용할 수 없지만
		// 업 캐스팅 되었더라도 오버라이드된 메서드는 자식에 구현된 대로 사용할 수 있다
		
		
		// 다운캐스팅
		// DumpTruck d2 = new Car("자동차", "현대", 123);
		
		//원래 트럭이었던 인스턴스를 자동차로 업캐스팅 하여 사용
		Car c2 = new DumpTruck();
		// c2는 원래 트럭 인스턴스 였기 때문에 다시 원래대로 돌아가는 것은 가능
		DumpTruck d2 = (DumpTruck)c2;
		
		Car c3 = new Car("차","삼성",120);
		
		System.out.println(c1 instanceof DumpTruck);
		System.out.println(c1 instanceof Car);
		System.out.println(c3 instanceof DumpTruck);
		System.out.println(c3 instanceof Car);
	}

}

class Liquid {
	
	void drink() {
		System.out.println("정체불명의 액체를 마셨습니다.");
	}
}

class Water extends Liquid {
	
	// 오버라이드 상속받은 자식에서 동일한 메서드를 만들어 덮어쓰기 하는 것
	@Override 
	// F2눌러보기~ 
	// 오버라이드 하려는 거라는 표시
	void drink() {
		System.out.println("물을 마셔서 갈증을 해소했습니다.");
	}
}

class Alcohol extends Liquid{
	void drink() {
		System.out.println("술을 마셔서 기분이 좋아졌으나 두통이 생겼습니다.");
	}
}
