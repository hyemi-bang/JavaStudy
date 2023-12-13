
public class C01_Function {
	/*
		# function 함수
		
		- 기능을 미리 정의해두고 나중에 불러다 쓰는것
		- 함수는 정의한 시점에서는 실행되지 않고 나중에 호출해야 실행된다.
		- 재사용 할 가능성이 있는 코드들을 함수로 만들어 두면 
		  작업의 반복을 줄일 수 있다. (프로그래머의 생산성이 올라간다)
		- 클래스 내부에 있는 함수는 메서드(method)라고 부른다. (자바는 클래스 안에만 만들 수 있기 때문에 사실 메서드만 존재)
		
		#argument 함수의 매개변수
		
		- 함수를 호출할 때 해당 함수에 값을 전달할 수 있도록 선언해 놓는 변수
		- 함수를 호출할 때 ()에 전달하는 값을 인자라고 한다
		- 함수를 정의할 떄 ()에 선언하는 인자를 받을 수 있는 변수를 매개변수라고 한다
		- 매개변수의 개수애는 제한이 없다.
		- 매개변수 타입에 ...을 쓰면 해당타입 인자를 무한대로 받을 수 있다.
		
		# 함수의 타입 (리턴타입)
		
		- 해당 함수의 실행 결과로 얻게 되는 결과의 값의 타입을 지정한다
		- void : 이 함수는 실행결과 아무값도 돌아오지 않는 의미이다.
		- 그 외 타입들 : 해당 함수를 실행하면 해당 타입 값을 반드시 돌려준다.
		- return : 해당 함수를 즉시 종료하고 함수를 호출한 곳에 값을 보낸다.
		
	*/

	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >$");
	}
	// 생성한 여기서는 실행되지 않고

	public static void plus(int a, int b) { // #argument 함수의 매개변수 // int a, int b 인자
		System.out.println(a+b);
	}
	
	public static void minus (int...num) {
		//... 으로 선언한 매개변수는 배열이 된다. // 가변인자라고 부른다.
		for(int i = 0; i <num.length; ++i) {
			System.out.println("빼야하는 수 : " + num[i]);
		}
	}
	
	public static void plusAll(int...num) {
		int sum = 0;
		for(int i = 0; i <num.length; ++i) {
			sum += num[i];
		}
		System.out.println("총합은" + sum + "입니다.");
	}
	
	public static int getBasket(int appleCount) { // 	# 함수의 타입 (리턴타입)
		if(appleCount % 10 == 0) {
			return appleCount / 10;
		}else {
			return appleCount / 10 +1;
		}
	}
	
	
	public static String getBasketMessage(int appleCount) { 
		if(appleCount % 10 == 0) {
			return "사과의 개수가 나누어 떨어집니다";
		}else {
			return "사과의 개수가 나누어 떨어지지 않습니다";
		}
	}
	
	//System.out.println(C01_Function.getBasketMessage(13545));
	//다른 자바 파일에서 위처럼 실행하면 다른 자바 파일에서 해당 결과를 사용이 가능하다.
	
	
	/**
	 * 
	  사과의 개수와 바구니의 크기를 입력하면 필요한 바구니의 개수를 콘솔(System.out)에 출력해주는 함수
	  @param apple - 사과의 개수를 입력 (0 이상)
	  @param size - 바구니의 크기를 입력 (1 이상)
	 */
	
	
	public static void howManyBasket (int apple, int size) {
		if(apple % size == 0) {
			System.out.println("필요한 바구니 개수 : " + apple / size);
		} else {
			System.out.println("필요한 바구니 개수: " + (apple / size +1 ));
		}
	}
	
	public static void main(String[] args) { // main 위에 생성한 함수는 호출한 이곳에서 실행된다
	rabbit(); 
	System.out.println();
	
	for(int i = 0 ; i < 5; ++i) {
		rabbit(); // 토끼 5번 실행시켜라~
	}
	System.out.println();
	plus(30, 33); 
	System.out.println();
	
	minus(1, 2, 3, 10, 15);
	minus(100);
	
	System.out.println();
	plusAll(10,20,30,40,100);
	
	System.out.println();
	int basket = getBasket(15);
	// getBasket F2눌러보면 >> int C01_Function.getBasket(int appleCount)
	// 즉, 위에 getBaket은 int 값으로 돌아온다는 것을 알 수 있다.
	System.out.println("바구니의 개수 : " + basket);
	// 이건 String 타입으로 만들었기때문에 
	
	
	}
	


}
