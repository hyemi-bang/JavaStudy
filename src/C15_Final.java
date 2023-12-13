
public class C15_Final {
	
	/*
		# Final
		
		- 변수 앞에 final을 붙이면 이후로는 변경할 수 없는 값이 된다(상수)
		- 메서드 앞에 final을 붙이면 오버라이드 금지
		- 클래스 앞에 final을 붙이면 해당 클래스 상송 금지
		

	*/

	public static void main(String[] args) {
		
		// 변수 앞 final, 해당 변수 변경 불가능하다 
		final int a= 10;
		
		// a=99;
		//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		
		
	}
}


class Unit {
	int hp;
	int attack;
	
	public void hit() {
		System.out.println(attack + "의 공경력으로 공격합니다!!!");
	}
	
	//메서드 앞 final 오버라이드 금지
	final public void gotHit (int attack) {
		hp = hp - attack;
	}
	
}

//class 앞 final 더이상 상속 불가능
final class UnderGroundUnit extends Unit{
	
	boolean borrow = false;
	
	void borrow() {
		borrow = true;
	}
	
	void unborrow() {
		borrow = false;
	}
	
	@Override
	public void hit() {
		if(borrow) {
			System.out.println("땅 속에 있는 상태이기 때문에 공격 가능합니다.");
		} else {
			System.out.println("땅 위에서는 공격할 수 없습니다.");
		}
	}
	

	//@Override
	//public void gotHit() {}
	//The method gotHit() of type UnderGroundUnit must override or implement a supertype method
	
	
}