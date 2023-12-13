import java.util.Scanner;
//import quiz.A00_Rabbit;

public class B00_Scanner {
	/*
	 #import
	  
	  - 다른 패키지에 있는 클래스를 가져다 사용할 수 있게 하는 문법
	  - 같은 패키지에 있는 다른 클래스는 import 없이 가져다 사용할 수 있다.
	  - 다른 패키지에 있는 클래스를 불러 사용하고 싶을때는 반드시 import가 필요하다.
	  
	 #java.util.Scanner 클래스
	 
	  - 입력을 받을 수 있는 기능들이 모여있는 클래스
	  - 새 스캐너를 생성할때 어느곳으로부터 입력 받을지 설정한다. 
	  - System은 현재 컴퓨터의 콘솔을 의미함	  
	 */

	public static void main(String[] args) {
		//같은 패키지에 있는 다른 클래스 불러다 사용해보기
		//A00_Hello.main(null);
		// 다른 패키지에 있는 클래스를 불러 사용할때 import 사용해보기
		//A00_Rabbit.main(null);
		
		
		Scanner sc = new Scanner(System.in); // new Scanner : 새 스캐너 생성, (입력 통로 설정)
											 // System.in : 콘솔로부터 데이터를 받아오는 통로
		// ctrl+shift+o(자동 import 단축키)
		
		// 입력 안내 문구 출력 (print를 사용해야 옆에 입력이 가능하다, println하면 \n 된거라 아래 적힌다)
		System.out.print("아무 숫자나 입력해주세요 > "); // System.out : 콘솔로 데이터를 내보내는 통로
		int num=sc.nextInt(); // nextInt() : 다음으로 입력받는 숫자 하나를 꺼내는 기능, 스캐너를 만들어야 사용가능하다.
		
		System.out.println("입력한 숫자"+num);
		System.out.println("입력한 숫자 x 3"+num*3);
		System.out.println("두 번째로 입력한 숫자: "+ sc.nextInt());
		System.out.println("세 번째로 입력한 숫자: "+ sc.nextInt()+ sc.nextInt());
		
		
		/*
		  #스캐너의 대표적인 기능
		  1> next타입() 메서드 : 사용자가 콘솔에 입력한 여러값들 중 하나만 꺼낸후 원하는 타입으로 변환하여 가져오는 기능 
		  					(그러면 // System.out.println("두 번째로 입력한 숫자: "+ sc.nextInt()); 이런식으로 입력하면 두번째 입력 숫자도 확인 가능하다.
		  					 System.in을 통해서 들어오는 숫자 123, 4가 들어가면 123만 인식하고 4를 인식하지 못한다.)
		  					 사용자는 공백을 사용해 한번에 여러값을 입력할 수 있다.
		  					 -공백, \t,\n 등을 통해 각 값을 구분한다.
		  					 만약 입력 통로에 남아있는 값이 없다면 프로그램을 멈추고, 다음 입력을 기다린다.
		  					 
		  	 nextInt(), nextDouble(),nextFloat(),nextLong() 등 // nextInt는 문자열 문자는 인식 못함
		  	  				    
		   
		  2> next() 메서드 : 통로에 있는 값 하나를 무조건 문자열로 꺼낸다.
		  				   공백, \t, \n을 통해 각 값을 구분한다.
		  				   통로에 남아있는 값이 없다면 다음 입력을 기다린다.
		  				   
		  3> nextLine() 메서드 : 통로에 남아있는 값을 모두 문자열로 꺼낸다 (한 줄을 입력받는다)
		  					   \n만으로 값을 구분하기 때문에 공백으로 값을 구분하지 않고 모든 값을 꺼내버린다.
		  					   통로에 남아있는 값이 없다면 입력을 기다린다.
		*/

	}

}
