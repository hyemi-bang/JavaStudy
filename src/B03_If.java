
public class B03_If {
	/*
	 #if문 
	  -(조건문/true) 안의 값이 true면 {}안의 코드를 실행한다
	  -() 안의 값이 false면 {}안의 값을 무시한다.

	 #else if문 
	  -if문이 조건이 맞지 않아 실행되지 않았다면, if문처럼 동작한다.
	  -else if는 여러번 사용할 수 있고, 단독으로는 사용 불가능하다.

	 #else 문 
	  -모든 if문, else if 이 조건이 맞지 않아 실행되지 않았을때, {} 내용을 무조건 실행
	  -단독으로는 사용 불가능하다.
	  -else가 붙어 있으면 해당 if문 블록은 무조건 실행된다.
	*/
	
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작.");
		
		int a =-55;
		
		if(a> 10) {
			System.out.println("a가 10보다 크면 실행되는 곳");
			} 	else if(a%2 ==0) { 
				System.out.println("a가 10보다 작으면서 짝수 일때 실행");
						
		} else if(a>-30) { 
			System.out.println("a가 10보다 작으면서 짝수도 아니면서" +"-30보다 큰곳");
			
	} else  { 
		System.out.println("위의 모든 조건이 성립하지 않았습니다.");
		
}
		char appleGrade = 'C';
		int price; 
		if(appleGrade == 'A') {
			price = 1200;	
		}		else if(appleGrade == 'B') {
			price = 800;	
		} 		else if(appleGrade == 'C') {
			price = 600;	
		} else {
			price =0;
		}
		System.out.println("사과의 가격:"+ price);		// if문과 else if 문 만으로는 초기화가 안될 수도 있다고 에러메세지 뜸
		
		
		System.out.println("프로그램 끝.");
		} 

	}



