
public class C08_Extend {
	/*
		# Extend, 클래스 상속
		
		- 이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법
		 >> 기본형태는 부모 클래스의 모든 기능을 그대로 사용 가능
		- 클래스를 물려받아 기능을 새로 추가하거나 고쳐쓸 수 있다
		- 기능을 고쳐 사용하는 것을 '오버라이드(Override)'라고한다.
		>> 상속받은 자식에서 동일한 메서드를 만들어 덮어쓰기 하는 것
		- 상속받은 자식 클래스는 반드시 가장 먼저 부모클래스의 생성자를 호출 해야한다
		 >> 부모클래스에 기본생성자만 있었다면 문제가 없지만, 
			생성자를 만들고 난 후에는 super() 형태로 생성자 호출
			
		# Super
		
		- 자식 클래스로 생성된 인스턴스는 2가지로 분류할 수 있다.
		- this는 해당 인스턴스의 현재 클래스 부분
		- super는 해당 인스턴스의 부모 부분
		- this()는 현재 클래스의 다른 생성자를 호출할 때 사용한다.
		- super()는 현재 클래스의 부모 생성자를 호출할 때 사용한다.
		
	*/

	public static void main(String[] args) {
		//Car c1 = new Car(); 
		// 생성자가 없을떄는 기본 생성자가 있지만, 생성자가 생기고 나면 기본 생성자가 자동으로 생기지 않는다
		
		Car c1 = new Car("레이", "기아", 200);  // 생성자를 생성 후엔 정보를 담아야한다
		Car c2 = new Car("아반떼", "현대", 220);
		//c1.addCargo(); 부모클래스에서는 자식 클래스의 메서드를 사용 할 수 없다.
		
		DumpTruck d1 = new DumpTruck();
		
		d1.accelerate();
		d1.decelerate(); // 부모클래스 Car 메서드
		d1.addCargo(10);
		d1.reduceCargo(3); // DumpTruck 메서드
		
		d1.info();
	

	}

}


class Car{
	String name;
	String brand;
	final int MAX_SPEED;
	int speed;
	int fuel;
	int weigth;
	
	public Car(String name, String brand, int MAX_SPEED) {
		// ctrl + space > constructor
		this.name = name;
		this.brand = brand;
		this.MAX_SPEED = MAX_SPEED;	
	}
	
	void accelerate() {
		++speed;
	}
	void decelerate() {
		--speed;
	}
}


// DumpTruck class is a car class extended class
class DumpTruck extends Car{
	// 사용은 Car class와 같지만, 여기에는 추가적으로 다른 부분을 생성 할 수 있다.
	
	final int MAX_WEIGHT;
	int weigth;
	
	
	public DumpTruck(){
		super("덤프트럭","볼보", 160); // 부모 클래스 생성자 맨먼저 호출
		this.MAX_WEIGHT = 10000; // final은 변경할 수 없으니까 초기화를 해줘야한다.
	}
	
	public DumpTruck(String name, String brand, int MAX_SPEED, int MAX_WEIGHT) {
		super(name,brand,MAX_SPEED);
		this.MAX_WEIGHT = MAX_WEIGHT;
	}
	
	void addCargo (int kg) {
		this.weigth += kg;
	}
	
	void reduceCargo (int kg) {
		this.weigth -= kg;
	}
	
	void removeCargo (int kg) {
		weigth = 0 ;
	}
	
	void info() {
		System.out.println("DumpTruck 클래스에서 만든 필드, 현재 적재량" + this.weigth);
		System.out.println("Car 클래스에서 만든 필드, 현재 속도" + super.speed);
		// 부모클래스에 weigth 만들기 전에 super.weigth가 안되는 이유는 car클래스에 해당 내용이 없고 자식 클래스에만 있으니까
		// this.speed는 부모클래스에 있는데 되는 이유는 자식 클래스에서 찾아서 없으면 부모한테 가서 확인하니까 가능하다
		// 즉, 부모에 있는 필드(메서드)는 this, super 모두 접근할 수 있다.
		
		System.out.println("Car 필드, 트렁크 공간" + super.weigth);
		// 부모와 자식 모두에게 있는 필드(메서드)는 this, super로 구분해서 사용한다 
	}
	
	
}
