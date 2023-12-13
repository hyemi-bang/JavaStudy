
public class C16_AbstractClass {
	
	/*
		# Abstract Class 추상클래스
		
		- 추상 메서드를 가지고 있는 클래스를 추상클래스 라고 한다.
		- 미구현 메서드가 남아있기 때문에 인스턴스 생성이 불가능하다
		
		# Abstract Method 추상 메서드
		
		- 선언만 해놓고 구현은 아직 하지 않은 메서도
		- 구현은 상속받은 자식들에게 미룰 수 있다
		
	*/
	
	// 이 클래스는 abstract를 포함하고 있다는 뜻이다.
	// 이 클래스로 인스턴스 만들지 말라고 경고 하는 것 Abstract Class
	// 누군가 자식클래스로서 완성 시킬 것이다
	abstract class Tree {
		
		String name = "나무";
		
		public void breath() {
			System.out.println("산소를 뿜어낸다");
		}
		
		// 후에 상속을 받아서 제대로 구현할 메서드 Abstract Method
		abstract public void harvest();
		
		abstract public void fruit();
	}
	
	// abstract method를 구현하지 않으면 컴파일러가 구현해야 할 것 들을 알려준다
	// The type C16_AbstractClass.OrangeTree must implement the inherited abstract
	// method C16_AbstractClass.Tree.fruit()
	class OrangeTree extends Tree {
		
		@Override
		public void harvest() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fruit() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// 상속받은 abstract class가 또 상속받겠다고 abstract를 붙일 수 있다.
	// 구현을 더 미룰 수 있다.
	abstract class AppleTree extends Tree {
	}
	
	class GreenAppleTree extends AppleTree {
		
		@Override
		public void harvest() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fruit() {
			// TODO Auto-generated method stub
			
		}
	}

}
