
public class C02_Overloading {
	
	/*
	# 함수 (메서드) 오버로딩 Overloading
	
		- 같은 이름으로 다른 매개변수를 받는 다양한 버전의 함수를 만드는 문법
		- 매개변수의 개수또는 타입이 다르면 함수의 이름이 같더라도 각 함수를 구분할 수 있기 때문에
		  같은 이름의 함수를 여러개 선언할 수 있다
		  
		  ex> System.out.prinln()
	*/
	
	public static int add(int value1, int value2) {
		return value1 + value2;
	}
	
	// 매개변수의 개수는 같지만 타입은 다른 오버로딩
	public static double add(double value1, double value2) {
		return value1 + value2;
	}
	
	// 메서드의 리턴타입이나 매개 변수명이 다른것만으로는 오버로딩이 불가능하다
	// 같은 이름으로 타입을 여러개 하는건 가능하지만, 같은 타입으로는 불가능
//	public static String add(int vi, int v2) {
//		return "결과는" + (v1 +v2) + "입니다.";
//	}

	public static void main(String[] args) {
		
		// int, int
		add(3, 11);
		// double, double
		add(3.5, 10.1);
		// int , double 오버로딩은 만들어 놓지 않았지만
		// double, double 오버로딩에 int가 무리없이 들어갈 수 있음으로 (타입캐스팅이 되었다고 본다)
		// 해당 오버로딩을 사용 할 수 있다
		add(8,3.3); // ctrl + space 누르면 어떤 타입을 받는지 알 수 있다
		
		System.out.println(add(5,10));
		// int 타입으로 만들어놨기때문에 double 타입은 받지 못한다
		// Syste.out.println() 은 여러 타입을 다 받을 수 있는데, 오버로딩을 하면 여러 타입을 받을 수 있다.
		
		System.out.println();
	}

}
