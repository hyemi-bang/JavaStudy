import java.util.Random;

public class B12_Random {

	/*
	 # 무작위 숫자 생성하기
	 
	 1. java.util.Random 클래스 사용하기
	 2. Math.random() 메서드 사용하기 
	 
	*/
	
	public static void main(String[] args) {

		
		// 1. 랜덤 번호 생성기 생성
		
		Random ran = new Random(); // Ctrl+Shirf+O
		
		//생성기에 번호 하나 받아오기
		int num1 = ran.nextInt(); // int의 전 범위
		// 번호를 받아올때 범위 지정 가능
		int num2 = ran.nextInt(10); // 0 ~ 9
		int num3 = ran.nextInt(100); // 0 ~ 99
		int num4 = ran.nextInt(201)+100; // 100 ~ 300
		int num5 = ran.nextInt(81)-50; // -50 ~ +30
		
		System.out.println("랜덤번호 : " + num1);
		System.out.println("랜덤번호 : " + num2);
		System.out.println("랜덤번호 : " + num3);
		System.out.println("랜덤번호 : " + num4);
		System.out.println("랜덤번호 : " + num5);
		
		// 2. Math.random() 메서드 사용하기 -> 1번 만들기 싫을때..ㅎ
		// Math.random() : 0 <= x < 1 범위의 랜덤 실수를 생성하는 메서드
		
		for(int i = 0; i < 5; ++i) {
			System.out.println(Math.random());
		}
		
		/*
		# Math.random()으로 원하는 범위의 랜덤 정수 만들기
		
		 1> 원하는 숫자의 개수를 곱한다 (bound)역할
		 2> 곱한 결과를 int로 변환한다 (소수점 아래 삭제)
		 3> 더하거나 빼서 원하는 범위로 만든다
		 
		 Math.random()	~~ 0 <= x < 1  
		 step1.	0 * 21 <= x < 1 * 21 // 50~70사이의 수를 원할때 총 개수가 21개이기 떄문에
		 		따라서 0 <= x < 21
		 step2.	int 변환
		 step3.	0 * 21 + 50 <= x < 1 * 21 + 50 
				따라서 50 <= x 71
				
				
		*/
		System.out.println();
		
		for(int i = 0; i < 10; ++i) {
			// 50~70
			System.out.println((int)(Math.random() * 21 + 50));
		}
		System.out.println();
		// 연습문자 : 100 ~ 127의 (총28개) 랜덤 정수를 10개 출력해보세요.
		for(int i = 0; i <10; ++i) {
			System.out.println((int)(Math.random() * 28 + 100));
		}
		
	}
}
