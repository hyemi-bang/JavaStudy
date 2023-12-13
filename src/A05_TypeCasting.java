
public class A05_TypeCasting {	
	/*
	  #타입 캐스팅
	   - 자동 타입 캐스팅과 강제 타입 캐스팅이 있다.
	   - 데이터 또는 변수 앞에 (타입)을 적으면 타입이 강제로 변한다.
	   
	    1>자동타입캐스팅 : 명시하지 않아도 타입이 자동으로 변한다.
	     - 작은 타입에서 큰 타입으로 변하는 경우
	     - 특별히 문제가 발생하지 않는 경우
	     - 값이 손상될 우려가 없는 자연스러운 경우
	     
	    2>강제타입캐스팅 : 데이터 타입을 강제로 변환하는 것
	     - 큰 타입의 값을 작은 타입에 억지로 넣어야 하는 경우
	     - 그외 타입이 변했을때 특정 기능이 손실 되는 경우
	     - 값이 손상될 우려가 있음을 프로그래머에게 에러로 알려야 하는 경우
	  	   
	  # 타입의 크기순서
	  	byte(1바이트) < short, char(2) < int(4) < long(8) < float(4) < double(8)
	  													=> int 와 long 사이에 없는 이유
	  													- 소수와 정수로 비교했을때 소수-> 정수로 갈때 소수점 아래 분실하기때문에 더 큰 쪽에 있는 것이다.
	   - 작은 타입의 값을 큰 타입 변수에 넣을때는 문제가 발생하지 않는다.
	   - 큰 타입의 값을 작은 타입 변수에 넣을때는 에러가 발생한다. (자바에서는 경고, c 언어에서는 가차없이 자른다)
	   
	 */

	public static void main(String[] args) {
		
		// 작은 타입 값을 큰 타입에 넣기 (정상작동)
		// 자동으로 바이트타입 값을 인트타입으로 변환하여 넣어줌 (자동 타입 캐스팅)
		byte b = 127;
		int i = b; // int i = (int)b 작은 타입이 큰타입으로 갈때는 (int) 생략가능
		
		// 큰 타입 값을 작은 타입에 넣기 (에러 메세지 뜬다)
		int a = Integer.MAX_VALUE;
		short s = (short)a;
		
		System.out.println("강제타입캐스팅 : "+s); // byte로 강제타입캐스팅 : 2147483647
		
		// int 타입 값을 강제로 byte 타입으로 변환하여 넣을 수 있다.
		int i2 = 130;
		byte b2 = (byte)i2; // 오버플로우 날 수도 있음을 인지 하고 그래도 하겠다고 한 것
		
		System.out.println("강제로 짤린 i2의 결과: " +b2); 
		// int i2 = 130이 byte b2 = (byte)i2 sysout 했을때 -126되는 이유
		
		/*
		 
		 메모리상 
		 컴퓨터는 맨 앞의 자리를 부호로 인식한다.
		 
		 ㅁㅁㅁㅁㅁㅁㅁㅁ ㅁㅁㅁㅁㅁㅁㅁㅁ ㅁㅁㅁㅁㅁㅁㅁㅁ 10000010 -> int i2
		 00000000 00000000 00000000 10000010 >> (130 이진법)
		 ....										
		 ㅁㅁㅁㅁㅁㅁㅁㅁ -> byte b2
		 10000010 >> i2를 b2에 넣었을 때
		 컴퓨터는 1000 0010 = 1111 1010 +1 로 계산한다.
		 즉, 부호비트가 1일때 나머지 값의 2의 보수를 음수 값이라고 생각한다.
		 
		 부호비트가 0일때 나머지 값을 양수 값 이라고 생각한다.
		 
		 */
		
		// long 은 8바이트, float는 4바이트 이지만, 소수를 더 큰것으로 간주 한다. 따라서 int는 타입캐스팅 해야하지만, float는 하지 않아도 된다.
		long l1 = 1000000000000L;
		int i3 = (int)l1;
		float f1 = l1;
		
		System.out.println(i3);
		System.out.println(f1);		
		
		// short 와 char는 모두 2byte 이지만, 
		// short는 음수값이 존재할 위엄이 있음으로 확인(강제 타입캐스팅)이 필요하다.
		short s1 =70;
		char ch1 = (char) s1;
		// char ch1 = s1; >> 에러메시지
		
		System.out.println(ch1);
		
		// char에서 shotr로 갈때도 32767보다 큰 양수가 포함되어 있을 가능성이 있으므로 강제타입캐스팅을 통한 확인이 필요하다.
		// 왜냐면, char은 0~65535 까지의 값을 표현할 수 있고 short는 -32,768~32,767 값을 표현할 수 있기 때문.
		char ch2 = 'F';
		short s2 = (short) ch2;
		// 	short s2 = ch2; >> 에러메시지
		
		System.out.println(s2);		
		
		// 해당 문자 코드 값의 문자 형태를 보고 싶은 경우
		// 타입 캐스팅을 사용해 간편하게 확인 할 수 있다.
		int value = 44800;
		int value2 = 44033;
		
		char c = (char)value;
		System.out.println(c);
				
		System.out.println(value);
		System.out.println((char)value);
		System.out.println((char)value2);
	}

}
