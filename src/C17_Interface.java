
public class C17_Interface {
	
	/*
		# Interface 
		- 추상 클래스처럼 내부에 추상 메서드를 지닐 수 있다
		- 추상 메서드로 규격을 만들어 놓고 해당 규격을 상속받는 클래스들을 규격에 소속하게 만들어주는 용도
		- 추상 클래스는 한 클래스에 하나만 상속 가능하지만
		  인터페이스는 한 클래스에 여러개 구현이 가능하다
		- 해당 클래스에 다형성을 추가하는 용도
		- 추상 클래스에는 인스턴스 영역이 존재하지만 인터페이스에는 인스턴스 영역이 없다
	*/
	
	public static void main(String[] args) {
		Human minsu = new Human("민수");
		Bear bear = new Bear("미샤");
		Bear bear2 = new Bear("패트리샤");
		
		Stuff stuff = new Stuff("돌"); 
		
		minsu.throwing(stuff); // 민수이/가 돌을/를 던집니다.
		bear.bite(stuff); // 곰 "미샤"이/가 돌을/를 물었습니다.
		bear.scratch(stuff); // 곰 "미샤"이/가 돌을/를 할퀴었습니다.
		
		Swimmer swimmer1 = minsu; // 인터페이스타입으로 업캐스팅 가능 ,, 스위머로서 민수가 가지고 있는 것만 사용하겠지
		Runner runner1 = bear;
		
		System.out.println(swimmer1 instanceof Bear); // false

	}

}


//abstract class Runner{
//	abstract void run();
//} 
// 클래스를 상속받는다는건 그 해당 클래스에서 하나를 추가 해야 한다.. 다형성을 추가하는 용도
// 곰과 사람은 Runner에서 나온 뿌리들


// 인터페이스 내부의 메서드는 모두 추상 메서드이다
// 인터페이스 내부의 변수는 모두 static 변수 이다(인스턴스 변수 추가 불가능)
interface Swimmer{
	 void swim();
	 void fastswim();
} 
interface Runner{
	 void run();
} 

class Stuff {
	String name;

	public Stuff(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class Human implements Runner, Swimmer {

	String name;

	public Human(String name) {
		this.name = name;
	}

	void throwing(Stuff stuff) {
		System.out.println(name + "이/가 " + stuff + "을/를 던집니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastswim() {
		// TODO Auto-generated method stub
		
	}
}

class Bear implements Runner  {
	String name;

	public Bear(String name) {
		this.name = name;
	}

	void bite(Stuff stuff) {
		System.out.printf("곰 \"%s\"이/가 %s을/를 물었습니다.\n", name, stuff);
	}

	void scratch(Stuff stuff) {
		System.out.printf("곰 \"%s\"이/가 %s을/를 할퀴었습니다.\n", name, stuff);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}