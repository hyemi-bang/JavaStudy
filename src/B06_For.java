
public class B06_For {
	
	/*
	 
	 #반복문 (Loop문)
	 - for, while, foeEach 
	 - do-while (x 사용하지 않음)
	 - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
	 
	 1. For문 for(;;) 세미콜론 2개 무조건 들어가야한다!
	 	for(초기값;반복조건;증감값){
	 		가운데의 반복조건이 참인 동안 반복될 코드를 적는다.
	 	}
	 	- 초기값 : for문ㅇ을 처음 시작하면 딱 한번 실행되는 곳
	 	- 반복조건 : 가운데의 반복 조건이 true인 동안, {}안의 내용을 계속 실행한다.
	 			  가운데의 반복조건이 false라면 {} 안의 내용을 실행하지않고 반복문을 종료한다.
	    - 증감값 : {}의 반복내용을 모두 실행하고 나면 실행되는 곳
	 
	*/

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) { // ++1 이나 1++ 이나 차이가없다. 왜냐하면 ;이후 하나의 조건이기때문. 
		System.out.println("hello~"+ i );
		} 

		/*
		 1> 가장 기본적인 for문
		 - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는 방식 
		 - 증가는 1식 
		 - 원하는 횟수만큼 반복하고 싶을 떄 가장 많이 사용되는 형태		 
		*/
		
		for (int i = 0; i < 10; ++i) {	//1+=i		
			System.out.println(i+"번");
			}
		/*
		 2> 초기값, 조건, 증감값을 자유롭게 설정한  for문
		 - for문을 자유롭게 변경하여 용도에 맞게 사용할 수 있다.
		 - 초기값 자리에 다양한 시작값을 넣을 수 있다.
		 - 조건 자리에 다양한 비교 연산을 넣을 수 있다.
		 - 증감값 자리에는 다양한 연산을 사용할 수 있다. 
		*/		
		for (int i = 1000; i >=970; i -=5) {
			System.out.println(i);
		}
		for (int i =1; i<1000000; i *=7) {
			System.out.println(i);
		}
		for(int i =0 ; i !=10; i+=2) {
			System.out.println(i);
		}
		
		// 연습 Quiz 반복문을 사용해 byte 타입의 모든값을 출력해보세요

		for (int b= Byte.MIN_VALUE; b<=Byte.MAX_VALUE;++b) {
			System.out.println(b);
		}
		for (byte b= Byte.MIN_VALUE; b!= Byte.MAX_VALUE;) {
			System.out.println(++b);
		} //둘이 같은 값.

		
		/*
		3> 각 자리에 값을 생략한 for문
		 - 모든 자리에 값을 넣지 않아도 for문을 사용할 수 있다.
		 - 조건을 생략하면 무한 반복하게 된다.
		 - 값을 생략하더라고 ;;는 반드시 넣어야 한다.
		 -> 이 경우 컴퓨터가 반복조건을 true라고 생각한다.
		*/
			
		}	
		
	}


