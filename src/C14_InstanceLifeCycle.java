
public class C14_InstanceLifeCycle {
	
	/*
	
	#인스턴스의 생명 주기
	
	- 하나의 인스턴스가 생성될 떄 실행되는 코드 순서
		1. 스태틱 영역 (최초의 클래스 호출시 단 한 번 실행된다)
		2. 인스턴스 영역 (새 인스턴스를 생성할 때마다 실행)
		3. 생성자 영역 (새 인스턴스 생성할 때마다 실행)
	
	*/

	public static void main(String[] args) {
		
		new LifeCycleTest();
		new LifeCycleTest();
		new LifeCycleTest(); // 스태틱은 단 한번만 출력된다 
		
		System.out.println();
		System.out.println(LifeCycleTest.num);
	}

}

class LifeCycleTest {

	// 스태틱영역
	static int num = 10;
	static int[] numArr = { 1, 2, 3, 4, 5 };
	
	//스태택 영역에 블록 생성
	static {
		for(int i =0; i<10; i++) {
			System.out.println("static block :" + i);
		}
	}
	
	// 인스턴스 영역, static를 붙이지 않은 친구들
	String text = "Hello";
	// 인스턴스 블록
	{
		System.out.println("인스턴스 블록이 실행되었습니다.");
		num = 99;
		
	}
	
	//생성자 영역
	public LifeCycleTest() {
		System.out.println("생성자가 실행되었습니다.");
		num = -1;
	}
}















