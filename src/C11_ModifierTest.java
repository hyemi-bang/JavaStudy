
public class C11_ModifierTest {

	// static 변수의 접근제어자
	public static int si1 = 10;
	protected static int si2 = 10;
	static int si3 = 10;
	private static int si4 =10;
	
	// 인스턴스 변수의 접근제어자
	public int i1 = 20;
	protected int i2 =20;
	int i3 =20;
	private int i4 =20;
	
	// 스태틱 메서드 접근제어자
	public static void smethod1() {
		System.out.println("123");
	}
	protected static void smethod2() {
		System.out.println("123");
	}
	static void smethod3() {
		System.out.println(123);
	}
	private static void smethod4() {
		System.out.println(123);
	}
	
	// 인스턴스 메서드 접근제어자
	public void method1() {
		
	}
	protected void method2() {
		
	}
	void method3() {
	
	}
	private void method4() {
	
	}
}
