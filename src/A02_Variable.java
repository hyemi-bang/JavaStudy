

public class A02_Variable {
	/*
	  #변수 (variable)
	  - 프로그래밍 언어에서 데이터를 저장해 두는 공간
	  - 변수에 어떤 데이터를 보관할 것인지 타입을 지정해야한다.
	  - 2가지 타입(int, String)만 보고 넘어갈 것이다 :)
	 */
	
	public static void main(String[] args) {
		/*
		 변수의 선언(Declare) : 타입과 변수명을 적어 앞으로 해당 변수를 사용하겠다고 선언
		 					 타입은 저장하고 싶은 타입을 지정하고 변수명은 사용 하고 싶은 이름을 적는다
		 					 한 {} 안에서는 같은 이름의 변수를 여러번 선언할 수 없다.
		 대입 연산 (=) : 왼쪽에 있는 변수에 오른쪽의 있는 값을 넣어라 (기존에 알고 있던 값이 같다와는 다르다!!!)
		 			   
		 */ 
		
		
		//int =  나는 정수를 저장하겠다 (타입 지정/ 변수 선언)
		//String = 나는 문자열을 저장하겠다.
		
		int age = 31; // 변수에 값을 대입
		age = 34; // 추가로 대입하면, 처음 입력한 데이터가 사라진다.
		int price = 100000;
		String 피자 = "pizza"; 
		String name = "김밥";
		String NAME = "햄버거"; // name, NAME는 대소문자가 달라서 다른 문자로 인식한다.
		
		System.out.println(age);
		System.out.println(age - 10);
		System.out.println("오늘 납작복숭아 2박스의 가격은 "+price+"원.");
		System.out.println("오늘 저녁으로는 " + 피자 + " 먹어야 겠다.");
		System.out.println("오늘 점심 : "+name+','
				+ "\t어제 저녁 : " + NAME);
		
		int apple=7; 
		// 초기화가 되지 않은 변수는 사용할 수 없다. 즉, 값을 한번도 넣은 적 없는 변수는 사용 할 수 없다.
		// 최초로 값을 넣는 것을 초기화라한다
		System.out.println("사과는 총" +apple + "개 입니다.");
		
		// 변수를 선언하는 여러방식들
		//[1] 선언만 하는 경우 (초기화x) 
		int x;
		//[2] 선언과 동시에 초기화
		int y = 10;
		//[3] 같은 타입 변수를 한번에 여러개 선언 (초기화x)
		int a,b,c;
		String snack1, snack2, snack3;
		//[4] 같은 타입 변수를 여러개 선언하며 동시에 초기화
		int d=10, e=20, f=33;
		String snack4="쿠쿠다스", snack5="초코파이", snack6="민트하임";
		
		System.out.println(snack4+" "+e+"개");
		
		
		x=1;
		int result = x+y;
		System.out.println(result);
		
	}
}
