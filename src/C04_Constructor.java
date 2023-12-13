import myobj.Apple; // import 사용을 안하고 싶으면 main 아래 myobj.Apple ~~ 하여 사용 하면 된다
import myobj.Coffee;

public class C04_Constructor {
	
	/*
	 #Constructor 클래스의 생성자
	 해당 클래스의 새 인스턴스를 생성할때 new와 함께 호출하는 것
	 해당 클래스 이름과 동일한 이름으로 사용한다
	 메서드 이지만 리턴타입을 적지 않는다.
	 클래스 내부에 선언한 생성자가 하나도 없는 경우 자동으로 아무것도 없는 기본 생성자가 생성되어 있다.
	
	*/
	

	public static void main(String[] args) {
		
	Apple a1 = new Apple(300, 9, 10, "red");
	Apple a2 = new Apple(350, 12, 9, "green");
	
	Apple a3 = new Apple(400, 11, 8.8, "blue");
	
	Apple a4 = new Apple();
	
	
	a1.info();
	a2.info();
	a3.info();
	a4.info();
	
	System.out.println();
	
	/// OOP에 만들었던 클래스 myobj로 옮기고 생성자 추가하기
	
	Coffee c1 = new Coffee(true, true, 450, 3800, "스타벅스", "오늘의 커피");
	Coffee c2 = new Coffee(false, true, 380, 4100, "이디야", "카푸치노");
	
	c1.info();
	c2.info();
	
	}

}
