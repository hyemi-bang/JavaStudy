import java.util.Scanner;

public class E01_Exception {
	
	/*
		#Exception 예외
		- 프로그램 실행 도중 문제가 발생하여 나타나는 에러들
		- 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러이다. 
		  (컴파일 에러는 아예 실행되지 않는다. 자바 문법상의 오류)
		- 프로그래머는 발생할 수 있는 예외를 미리 예상하여 대비해 둘 수 있다 : 예외처리
		
		# try-catch-finally / 예외처리
		- 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
		- try문 내부에서 예외가 발생하지 않으면 평소대로 정상 작동한다
		- try문 내부에서 예외가 발생하면 즉시 try문을 중단하고 발생한 예외에 해당하는 catch문으로 이동한다.
		- 예외 처리의 기본 동작은 예외 발생 당시 상황을 콘솔에 출력하고 프로그램을 강제종료하는 것이다.
		->> System.exit(), return으로 강제종료가능
		- 예외 발생 당시 상황을 출력하고 싶을 경우 e.printStackTrace
		- finally문은 try문 내부에서 예외가 발생하던 안하던 무조건 실행하는 구문이다.
	*/

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		//System.out.println(arr[10]);
		// Index 10 out of bounds for length 10 >> 문제가 생겨서 발생한것 예외라고 부른다
		
		try {
			System.out.println("1 : " + arr[(int)(Math.random() * 11)]);
			System.out.println("2 : " + arr[(int)(Math.random() * 11)]);
			System.out.println("3 : " + arr[(int)(Math.random() * 11)]);
			System.out.println("4 : " + arr[(int)(Math.random() * 11)]);
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("반드시 정수만 입력해주세요 >");
			int value = sc.nextInt();		
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기가 넘쳤습니다.");
			// 예외 객체에 담겨있는 예외발생 당시의 스택 상황을 콘솔에 출력한다.
			// 예외처리의 기본 동작
			//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
			//at E01_Exception.main(E01_Exception.java:31)
			e.printStackTrace();
		} catch(java.util.InputMismatchException a) {
			System.out.println("정수만 입력하시오.!!");
			System.out.println("프로그램을 강제종료합니다.");
			//System.exit(0); // 프로그램 강제종료, finally 출력되지 않는다
			return; // 메인 메서드 종료, finally 출력된다
		} finally {
			System.out.println(" () ()");
			System.out.println("(  .. )");
			System.out.println("(> ★ <)");
		}
		System.out.println("프로그램이 정상 종료되었습니다.");

		
	
		

	}

}
