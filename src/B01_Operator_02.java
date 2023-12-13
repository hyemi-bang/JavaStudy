
public class B01_Operator_02 {

	public static void main(String[] args) {
		/*
		  # 비교연산자 
		   - 두 값을 비교하는 연산
		   - 비교 연산의 결과는 항상 참(true) 또는 거짓(flase) ->비교 연산의 결과는 항상 boolean 타입
		   - 비교연산은 우선순위가 낮다.(()괄호가 없더라도 산술연산과 같이있을때는, 산술연산이 우선)
		   
		   # 논리연산자 
		   - boolean 값으로 연산하는 연산자
		   - && : 양 옆의 두 값이 모두 true 일때 true. (AND 연산)
		   - || : 양 옆의 두 값중 하나만 true 여도 true (OR 연산)
		   - ! : tuer 면 false, false 면 true (NOT연산)
		 */

		int a=10, b=10;
		// 비교연산
		System.out.println(a>b); // > 으면 true
		System.out.println(a<b); // < 으면 true
		System.out.println(a>=b); // >, >== 으면 true
		System.out.println(a<=b); // <, <= 으면 true
		System.out.println(a==b); // 같으면 true
		System.out.println(a!=b);// 다르면 true
		System.out.println(a+5>b*10);
		System.out.println(a%2 == 0); // a를 2로 나누었을때 나머지가 0이냐?, a를 2로 나누었을때 나머지가 0이면 true
		System.out.println(a%5 != 0); // a를 5로 나누었을때 나머지가 0이 아니냐?, a가 5의 배수가 아닐때 true
		
		//논리연산
		// 논리 연산자는 비교 연산자보다 우선순위가 낮아 ()없이도 비교 연산을 먼저 수행한다.
		System.out.println();
		System.out.println("#### AND ####"); // &&가 ||보다 먼저한다.
		System.out.println(true && true); 
		System.out.println(true && false);
		System.out.println(false && true); // AND연산은 모두 true여야 true니까, 앞에 false가 나오는 순간부터 뒤에 아예 계산을 안한다. 그래서 노랑표시뜨는것
		System.out.println(false && false);
		System.out.println(a%3 == 0 && a<100);// a가 3의 배수 이면서, 100보다 작아야 true
		System.out.println(a%3==0&&a<100&& a>-100);
		System.out.println("#### OR ####");
		System.out.println(true || true); 
		System.out.println(true || false);// OR 연산은 둘중 하나만 true면 true니까, 앞에 ture가 나오는 순간부터 뒤에 아예 계산을 안한다.
		System.out.println(false ||  true);
		System.out.println(false ||  false);
		System.out.println(a%3 == 0 || a<10); // 3의 배수 이거나 10보다 작거나 , 둘중 하나만 만족하면 true
		System.out.println("#### NOT ####");
		System.out.println(!true); 
		System.out.println(!false);		
		System.out.println(!(a>3)); // a가 3보다 작거나 같을때 true
		
	}

}






