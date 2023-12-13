package quiz;

import java.util.Scanner;

public class B01_ConditionQuiz {
	
	/*
	 알맞은 비교연산을 만들어라
	 
	 1. int형 변수  10보다 크고 20보다 작을때 10<a<20 - ture // (그말은 a>10 && a<20 )의 값을 넣고 a=1 .. 을 넣어도 된다.
	 2. int형 변수 b가 짝수 일때 - true
	 3. int형 변수 c가 7의 배수 일때 - true
	 4. int형 변수 d-e = 30 true
	 5. int형 변수 year가 400으로 나누어 떨어지거나
	                   또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을때 true
	 6. boolean형 변수 powerOn이 false일 때 true
	 7. 문자열 참조변수 str이 "yes" 일때 true :: 문자열은 '=='으로 비교하면안된다. 오류가 나올수도 있다.
	*/
	

	public static void main(String[] args) {
		int a = 15,b = 4, c = 7, d=40, e=10;

		int year = 2000;
		boolean powerOn =false;
		

		System.out.println(10<a && a<20);
		// or, int a1 = 3; System.out.println(a>10 && a<20);
		System.out.println(b%2 == 0);
		System.out.println(c%7 == 0);
		
		System.out.println(d-e == 30 || e-d==30); // d-e==30만 넣어놓으면 e가 더 클때 해결이 안됨으로.
		System.out.println(Math.abs(d-e) == 30); // 절대값을 구하면 쉽게 해결~!
		
		// 2월이 하루 더 있는 해를 구하는 방식 (윤년이 있는 방식)
		System.out.println(year%4 == 0 && year % 100!=0 || year%400==0);
		
		 // System.out.println(year/400==0 || year/4 ==0 && year%100 !=0) ;
		                    // year가 100으로 나누어 떨어지지 않을때 !(~~)로 표현하고 싶으면 -> (~~)이 true or false 값이어야한다
							//  year%100!=0 ?? 뭔지 모르겠다.
		Scanner sc = new Scanner(System.in);
		String str = "yes";
		
		System.out.print("정말 제출하시겠습니까? (yes/no) >");
		String userInput = sc.next();
		
		System.out.println(str== "yes");
		System.out.println(userInput.equals("yes")); 
		// 문자열은 비교할 때 .equals() 메서드를 사용해야한다. 
		// 모든 참조형 변수는 .equals() 메서드를 통해 비교해야한다.
	}

}







