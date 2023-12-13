
public class E03_CustomExceotion {
	
	/*
	
		#Exceotion 일반예외
		- 반드시 처리해야하는 예외
		- 이 예외는 처리하지 않으면 컴파일 진행할 수 없다.
		
		#Runtime Exception 실행예외
		- 굳이 처리하지 않아도 되는 예외
	*/

	public static void method1() throws NotMustHandledException{
		throw new NotMustHandledException();
	}

	public static void method2() throws MustHandledException{
		throw new MustHandledException();
	}
	
	public static void main(String[] args) {
		method1(); // 강제로 처리하지 않아도 된다
		
		// method2(); try-catch-finnaly 로 감싸줘야한다.
		
	}

}

// Exception 또는 Runtime Exception을 상속받은 클래스는 throw가 가능하다
class MustHandledException extends Exception {
	// Exception을 상속받으면 반드시 처리해야하는 예외이다 
	
	public MustHandledException() {
		super("내가 만든 예외메세지");
	}
}

class NotMustHandledException extends RuntimeException {
	// Exception을 상속받으면 반드시 처리해야하는 예외이다 
	
	public NotMustHandledException() {
		super("반드시 처리하지 않아도 되는 메세지");
	}
}