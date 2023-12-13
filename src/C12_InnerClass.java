
public class C12_InnerClass {
	
	/*
	 # InnerClass 
	 - 클래스 내부에도 클래스를 만들 수 있다.
	 
	  > 인스턴스가 생성되야 실체가 있는 설계도 (인스턴스가 없는 경우 실체가 없는 설계도 이다)
	  > 클래스 내부의 클래스는 바깥 클래스의 인스턴스가 보유한 값에 영향을 받아 달라지는 클래스를 설계할 수 있다는 장점이 있다.
	  
	 - 클래스 내부의 스태틱 클래스
	 
	  > 인스턴스에 영향을 받지 않는 내부 클래스를 생성할 수 있다.
	  > 스태틱 변수의 영향을 받는다.
	  
	*/
	
	int a =10;
	
	class Bus {
		int num;
		int fee;
	}
	
	static class Subway{
		int num;
		int fee;
		String name;
	}

	public static void main(String[] args) {
		// 내부의 instance class는 인스턴스가 존재해야 사용할 수 있다.
		C12_InnerClass instance = new C12_InnerClass();
		System.out.println(instance.a);
		// System.out.println(a); 인스턴스가 생성되지 않아서 에러 생긴다.
		
		// new Bus(); Bus에 대한 인스턴스가 필요해서 에러가 발생한다.
		// instance class 인스턴스가 있어야 사용할 수 있다
		new C12_InnerClass().new Bus();
		instance.new Bus();
		// Inner class는 인스턴스가 있어야 사용할 수 있는 설계도 이다.
		C12_InnerClass.Bus bus = instance.new Bus();
		
		//No enclosing instance of type C12_InnerClass is accessible. 
		//Must qualify the allocation with an enclosing instance of type C12_InnerClass
		//(e.g. x.new A() where x is an instance of C12_InnerClass).
		
		// 내부의 static class는 인스턴스 없이도 사용할 수 있다.
		C12_InnerClass.Subway subway = new C12_InnerClass.Subway();
		System.out.println("subway num :" + subway.num);
		System.out.println("subway fee :" + subway.fee);
		System.out.println("subway name :" + subway.name);
		
		
		Product p = new Product();
		System.out.println(p.howMuch);
		
		// 사용 예
		TransportMaker maker = new TransportMaker(1400);  // 이버스의 요금은 1400원 입니다. 출력
		
		// 바깥 클래스 설정했던 기본요금으로 버스가 생성됨
		System.out.println(maker.makeBus(500));
		
		maker.defaultFee = 2300;
		
		System.out.println(maker.makeBus(5544)); // 이버스의 요금은 2300원 입니다. 출력

	}

}

class Product {
	String name;
	int howMuch;
}

class TransportMaker {
	
	class Bus{
		int fee;
		int num;
		
		public Bus(int num) {
			this.num = num;
			fee = defaultFee;
		}
		
		@Override
		public String toString() {
			return String.format("%d 버스의 요금은 %d원 입니다.\n",num, fee);
		}
	}
	
	int defaultFee;
	
	public TransportMaker(int defaultFee) {
		this.defaultFee = defaultFee; // 기본요금을 설정해서 TransportMaker 라는 클래스를 만들었다.
	}
	
	public Bus makeBus(int num) {
		return new Bus(num);
	}
}
