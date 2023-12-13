
public class A04_VariableNaming { 
	/* 
	  # 변수를 사용 하는 이유
	  	
	  	1. 코드의 가독성을 높일 수 있다.
	  	2. 여러곳에서 사용 되는 값을 한번에 변경 할 수 있다 (재사용, reused)
	  	    == 하나의 값을 여러곳에 사용 할 수 있다. / 수학적 사고 ★	  
	  	    
	  # 변수의 작명 규칙(권장)
	  
	  	1. snake_case 
	  	   두 단어 이상을 이어붙인 변수명을 사용할때는 _ 언더바를 사용해 붙인다. apple_price
	  	2. canelCase
	  	   두 단어 이상을 이어붙인 변수명을 사용 할때 대문자를 사용한다. chulsuGrade
	  	3. 변수명에 첫 번째 글자는 소문자를 사용 하는 것이 좋다.  blood(o), Blood(x)
	  	4. 클래스명의 첫 번째 글자로 대문자를 사용 하기 때문에, 다른 사람들이 보면 헷갈린다. Personinfo(o) personinfo(x)
	  	5. 패키지명은 모두 소문자 사용 quiz(o), Quiz(x)
	  	6. 프로그램에서 상수(항상 변하지 않고 동일해야 하는 값)는 모두 대문자를 사용한다. MAX_COUPON_SLOT (쿠폰 최대 개수는 변경 되지 않으니까.)
	  	7. 변수안에 들어있는 값을 쉽게 파악할 수 있는 단어를 사용하자
	  	
	  # 변수의 작명규칙 (필수)
	    1. 변수의 첫 번째 글자는 숫자 사용 할 수 없다.
	    2. 변수 사이에 공백 사용 할 수 없다.
	    3. 특수문자는 _와 $만 사용 가능. __magic (o), $upermarket(o)
	    4. 자바에서 이미 사용 하는 키워드는 사용 불가. public, static, long, int ... (x)
	      (예약어 / 이클립스에서 보라색+굵은글씨로 보이는 단어들)
	   
	  
	 */
	
	public static void main (String[] args) {
		
		int apple_price = 837;
		int apple_qty = 55;
		double apple_weight = 195.37;
		
		System.out.println("사과의 개당 가격: " + apple_price+" 원");
		System.out.println("사과의 개수: " + apple_qty+" 개");
		System.out.println("사과 개당 무게: " + apple_weight+ " g");
		System.out.println("사과의 총 무게: " + apple_qty*apple_weight + " g");
		System.out.println("사과의 총 가격: "+ apple_qty * apple_price + " 원");
		System.out.println("사과의 1g당 가격: "+ apple_price/apple_weight + " 원");
		
	}
}
