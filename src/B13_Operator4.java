
public class B13_Operator4 {
	
	/*
		# 삼항연산자
		
		- 간단한 if문을 한 줄로 쉽게 사용할 수 있는 연산자
		- 비교 ? 예 : 아니요;
		- 비교의 결과가 true 라면 : 왼쪽의 값을 사용
		- 비교의 결과가 false 라면 : 오른쪽의 값을 사용한다
		
	*/
	
	public static void main(String[] args) {
		
		int age = 25;
		
		int money = age > 30 ? -50000 : 50000;
		
		System.out.println("이번 추석에 받을 돈 : " + money);
		
		int apple = 33;
		int basket = apple % 10 == 0 ? apple / 10 : apple /10+1;
		System.out.printf("사과가 %d개 일때 필요한 바구니 개수는 %d개이다.\n",+
				apple, basket);
		
		String greetings = age < 10 ? "안녕!" : "안녕하세요~" ;
		System.out.println(greetings);
		
	}

}
