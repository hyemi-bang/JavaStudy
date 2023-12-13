
public class B11_Var2_A02ver2 {
	


	public static void main(String[] args) {
	
		// 1. {} 내부에서 선언된 변수는 벗어나면 사용할 수 없다.
		
		if(true) {
			int x =10;
			System.out.println("x :" + x);
		}
		// System.out.println("x :" + x); {}를 벗어나서 출력하면 선언된적이 없다고 컴파일 에러
		
		int x =15;
		System.out.println("x :" + x);
		
		// for문 내부에서 선언한 변수는 for문 {}내부에서 선언한 것으로 간주한다.
		// 동일하게 {}를 벗어나면 사용할 수 없다.
		for(int i =0 ; i <=10 ;++i) {
			System.out.println("hello~");				
		}
		
		// 2. {} 바깥에서 선언한 변수는 {}가 끝나더라도 계속 사용가능
		int num = 30 ; // 참고 : main {}안에 있는 변수임. main 벗어나면 사용 불가
		if(true) {
			num = 50;
			System.out.println(num); // 50 출력
		}
		
		System.out.println(num); // 50 출력
		
		/* 
		 # 들여쓰기 원칙
		 	*. 이 외 자바 코딩컨벤션 검색
		 	0. ctrl+shift+F
		 	1. 새로운 {}가 열리면 한번 들여쓰기 한다
		 	2. } 뒤에 무언가를 쓰지말것
		  	3. 스페이스바로 줄을 맞추지 말것
		  	4. 에러메시지가 떠있는 채로 무언가를 하면 자동 들여쓰기의 도움을 받을 수 없다.
		  	5. ++) 연산자 한칸 띄워 쓰기 . 비교연산자 들어갈때 () 사용하기, 봤을때 읽기 힘들어지는건 하지말기
		 */
		
		
	}

}
