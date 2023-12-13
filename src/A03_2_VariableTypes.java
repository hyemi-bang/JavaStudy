
public class A03_2_VariableTypes {
	
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
	   -부동 소수점 방식, 소수를 저장할 수 있는 방식
	   -float	(4byte) 숫자 뒤에 f를 붙여 크기를 줄여줘야 한다.
	   -double	(8byte) 그냥 소수만 적으면 됨
	   
	  #참,거짓 타입
	   -boolean 변수의 이름이 아주 중요하다.
	   			true, false 값을 나타내는
	   
	  #문자열 타입
	   -String 
	   
	   
	 */

	public static void main(String[] args) {

		 float avg_score=96.7F; 
		 double avg_weight=78.468;
		 
		 System.out.println("평균 점수: "+avg_score);
		 System.out.println("평균 몸무게: " + avg_weight);
		 
		 boolean isMaie = true;
		 boolean kimchi = true;
		 boolean tteokbbokki = false;
		 boolean rich = false;
		 boolean powerOn = true;
		 
		 System.out.println(isMaie);
		 System.out.println(kimchi);
		 System.out.println(tteokbbokki);
		 System.out.println(rich);
		 System.out.println(powerOn);

		String welcomeMessage = "어서오세요. 환영합니다!";
		System.out.println(welcomeMessage);
		 
	}

}
