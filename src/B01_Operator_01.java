
public class B01_Operator_01 {
	
	/*
	  #연산자 (Operator)
	  - 계산 할때 값 사이에 넣어서 쓰는 것
	  - +,-,*,/,>,<,&, ...
	  
	   #산술연산자
	   
	   + , - , * ,
	   / : 정수끼리 나누면 몫만 구하고, 계산에 실수가 포함되어 있으면 정확한 결과를 구한다
	   % : 나머지, n으로 나눈 나머지 연산의 결과는 0~n-1이다.
	   		10%5 -> 0
	   		11%5 -> 1
	   		12%5 -> 2
	   		13%5 -> 3
	   		14%5 -> 4
	   		15%5 -> 0   >> 5로 나누면 나머지는 0~4까지 나온다는 이야기
	   
	   나누기 : 정수끼리 나누면 몫만 구하고, 계산에 실수가 포함되어 있으면 정확한 결과를 구한다
	   		  즉, 정수끼리 산술 연산 결과는 정수, 정수와 실수의 산술연산 결과는 실수
	
	 **/
	public static void main (String[] args) {
		int a = 10, b =7;
		double c = 7.0;
		
		System.out.println("a+b :"+(a+b));
		System.out.println("a-b :"+(a-b));
		System.out.println("a*b :"+(a*b));
		System.out.println("a/b :"+(a/b));
		System.out.println("a%b :"+(a%b));
		
		System.out.println();
		System.out.println("a/b :"+(double)(a/b)); // 혼자 해본거 실수 값 확인 원했음
		System.out.println(312421312%5); // 나머지 %, n으로 나눈 나머지 연산결과는 0~n-1 확인작업
		
		// 같은 숫자여도 char 타입은 문자로 보여주는 것 처럼
		// double, float 타입은 00.0 의 형식으로 보여준다.
		System.out.println();
		System.out.println("a+c :"+(a+c));
		System.out.println("a-c :"+(a-c));
		System.out.println("a*c :"+(a*c));
		System.out.println("a/c :"+(a/c));
		System.out.println("a%c :"+(a%c)); // 더블타입이 되면 출력할때 .0 이 나온다.
		
	/*
	 	# 함수 
	 Math.pow(a,b) = a 제곱 b의 결과를 반환한다
	 Math.sqrt(a) = a의 제곱근을 반환한다 (√루트)
	 Math.abs(a) = a의 절대값을 반환, 넣었던 타입으로 반환한다. (double -> double, float -> float, int->int)
	 
	 Math.round(a) = a를 소수 첫째 자리에서 반올림한 결과를 반환한다.
	 Math.ceil(a) = a를 소수 첫째 자리에서 올림한 결과를 반환한다.
	 Math.floor(a) = a를 소수 첫째 자리에서 버림한 결과를 반환한다. >> 이 3가지 모두 첫째 자리에서 반올림,올림,내림이라 원하는 소수점 자리에서 처리하지 못함
	 
	 	 #원하는 자리에서 반올림 하는 방법
	 1. 반올림 하고 싶은 자리를 소수 첫 번째 자리로 만든다.
	 2. 반올림하고 다시 원래대로 돌려놓는다.
	 3. 원래대로 돌려놓을때는 소수로 나눠야 한다. (/1000.0)
	 
	 double result = Math.pow(a, b); -> 우측의 결과값을 반환한다 
	
	  
	 */
	
		System.out.println();
		double result = Math.pow(2,10);
		double result2 = Math.pow(2.2, 7.8);
		System.out.println("pow 결과 :" + result);		
		System.out.println("pow 결과 :" + result2);		
		
		System.out.println();
		double result3 = Math.sqrt(25);
		System.out.println("sqrt 의 결과: " + result3);
		
		System.out.println();
		int abs = Math.abs(-7); // 넣었던 타입으로 반환한다.
		float abs2 = Math.abs(1.18f);
		double abs3 = Math.abs(3.2);
		System.out.println(abs);
		System.out.println(abs2);
		System.out.println(abs3);
		
		System.out.println();
		System.out.println(Math.round(abs3));
		System.out.println(Math.round(123.556));
		
		System.out.println();
		System.out.println(Math.ceil(123.111));
		
		System.out.println();
		System.out.println(Math.floor(18.85)); 
		
		System.out.println();
		double value5 = 123.1234567; // 4번째 자리에서 반올림 하는 방법 (1. 10000곱하고, Math.roud ,원래대로 돌려놓는다.)		
		System.out.println(value5 * 10000);
		System.out.println(Math.round(value5*10000));
		System.out.println(Math.round(value5*10000)/10000.0);
		
		System.out.println(); //위에 vlaue5 변수사용 하여 하는법		
		double unit = Math.pow(10,4);
		System.out.println(value5 * unit);
		System.out.println(Math.round(value5*unit));
		System.out.println(Math.round(value5*unit)/unit);
		
		System.out.println();
		//연습 1번 : 12500을 반올림 하여 13000으로 만들기 
		int q1 = 12500; // 12500/1000, 12500이 나는 double을 사용했는데, 선생님은 정수라 int사용..
		System.out.println(q1/1000.0); // int 타입 값에서 실수 표현 하고 싶을때는 xxx.0
		System.out.println(Math.round(q1/1000));
		System.out.println(Math.round(q1/1000)*1000);
		
		System.out.println();
		//연습 2번 : 1.138을 내림하여 1.13으로 만들기 
		double q2 = 1.138;
		double q3 = (q2*100); // 변수를 사용 하고 싶으면  Math.pow(a,b)이걸 사용 하고 싶을때 쓰라는 의미였다..;
		System.out.println(Math.floor(q3)/100);
		
		
	}

}












