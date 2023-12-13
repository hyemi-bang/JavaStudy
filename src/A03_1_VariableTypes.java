
public class A03_1_VariableTypes {
	
	/*
	  #정수 타입
	   -byte	(1바이트, 8비트, 1비트는 0.1 2가지만 할 수 있기에 총 2^8 가지의 값을 표현할 수 있다.)   													
	   													  = 256(-128~+127, -/+ 합쳐서) 
	   -short	(2바이트, 16비트, 2^16=65,536 / -32,768~32,767)
	   -char	(2바이트, 16비트, character의 약자, 65536가지의 양수 값만 사용) 0~65535 까지의 값을 표현할 수 있다.
	   																char 타입에 넣는 정수 값은 우리에게 문자로 바꿔서 보여준다.
	   -int		(4바이트, 32비트 2^32 =4,294,967,296 / -2,147,483,648~2,147,483,647)
	   			// Integer.MIN_VALUE; -> 미리 저장된 최소값
	   			// Integer.MAX_VALUE; -> 미리 저장된 최대값
	   -long	(8바이트, 64비트)
	   			Long.MIN(MAX)_VALUE
	   
	  #실수 타입
	  #참,거짓 타입
	  #문자열 타입
	 */
	

	public static void main(String[] args) {

		byte num = (byte)129; // 오버플로우, 
		int number =100;
		
		byte byte_min=-128, byte_max=127;
		System.out.println("byte 타입의 최소값은 " + byte_min + "이고 " 
						+"최대값은 " +byte_max + "입니다.");
		
		short short_min =-32768, short_max=32767;
		System.out.println("short 타입의 최소값은 " + short_min + "이고 " 
						+"최대값은 " +short_max + "입니다.");
		
		System.out.println(number);
		System.out.println(num);
		

		System.out.println("short 타입의 최소값은 " + Short.MIN_VALUE + "이고 " 
						+"최대값은 " +Short.MAX_VALUE + "입니다.");		
		System.out.println("int min : " + Integer.MIN_VALUE 
				+ ", int max : " + Integer.MAX_VALUE);
		System.out.println("long min : " + Long.MIN_VALUE 
				+ ", long max : " + Long.MAX_VALUE);
		
		char ch1 = 44032;	
		int num1 = 44032;
		System.out.println(ch1);
		System.out.println(num1);
		
		// '(문자)'도 실제로는 정수 값을 가지고 있는 데이터 타입이다.
		char ch2 = 'F';
		char ch3 = '가';
		// 문자 타입 리터럴은 실제로 정수값 이기 때문에 다른 정수 타입에도 저장할 수 있다.
		int num2 = '값';
		int num3 = 'F';
		// 숫자 타입에 저장한 문자 리터럴을 출력하면 해당 문자의 실제 값을 확인할 수 있다.
		System.out.println(ch2);		
		System.out.println(ch3);		
		System.out.println(num2);
		System.out.println(num3);
		
		//아스키코드
		char ch4 = 65; // 숫자 를 넣고		
		System.out.println(ch4); // 문자가 나오고

	}

}
