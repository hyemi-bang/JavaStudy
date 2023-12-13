package quiz;

public class B06_ForQuiz_3 {
	/*
	#for 문을 사용해 숫자 출력
	
	1. 0 3 6 9 12 .... 93 96 99
	2. -35 -28 -21 .... 0 7 14 ... 35
	3. 100 200 300.... 800 900 1000
	4. 100 99 98 97 .... 5 4 3 2 1 0
	5. 0 1 2 3... 7 8 9 0 1 2 3 . .. 7 8 9... (30번) 

	6. 10 9 8 7 ...3 2 1 10 9 8... 3 2 1 ...3 2 1 (30번)
	7. 7 77 777 7777 7777...7777777777 
	 >>7이 하나씩 늘어나는 것 
	 >> 7*10 +7 이 10번 반복 되는것

	*/
	
	public static void main(String[] args) {

		for(int i=0; i<100 ;i+=3) {
			System.out.print(i+" ");		
		}
		System.out.println();
		for(int i = -35; i<=35; i+=7) {
			System.out.print(i+" ");	
		}
		System.out.println();
		for(int i=100 ; i <=1000; i+=100) {
			System.out.print(i +" ");
		}
		System.out.println();
		for(int i=100; i>=0; i -=1) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		for(int i =0; i < 300 ; i++) {
			System.out.print(i%10 +" ");
		}
	
		System.out.println();
		for(int i =0; i < 300 ; i++) {
			System.out.print(10 -(i%10) +" "); // 10 -0 -> 10 , 10-1 ->9 .. 나머지(i%10)를 10에서 빼주면됨
		}	
		
		
		System.out.println();
		for(long i=7; i<=7777777777L ; i=i*10+7){ 
			System.out.print(i +" "); // 내가풀어본것
		}
		System.out.println();
		
		long num =7;
		for(long i=0 ; i<10 ;i++){ 
			System.out.print(num+" "); // 선생님 풀이
			num = num*10+7;
		}
	}
	

}
