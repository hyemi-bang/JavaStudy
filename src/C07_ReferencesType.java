import java.util.Arrays;

public class C07_ReferencesType {
	
	/*
	  # ReferencesType 
	  
	  # 기본형 데이터 타입
	   - byte, short, int, char, long, double, boolean ..
	   - 소문자로 시작하는 타입들
	   - 기본형 데이터 타입 변수에는 실제 값이 저장 된다.
	   - 기본형 데이터 타입에는 . 찍을 수 없다.
	   
	  # 참조형 데이터 타입
	   - String
	   - 배열 
	   	 -> 배열타입 변수에는 해당 배열의 시작 위치 주소값이 저장되어 있다.
	   - 모든 클래스들 (여러 타입들을 묶어서 만들어낸 커스텀 타입
	   	 -> 클래스는 내가 만들어 낼 수 있는 참조형 데이터 타입이다)
	   - 참조형 데이터 타입 변수는 인스턴스의 위치(주소값)이 저장 된다.
	   - 참조형 데이터 타입은 .을 찍어 저장되어 있는 주소를 찾아갈 수 있다.
	     -> 주소를 찾아가니까 참조~~
	  	
	 
	 */

	public static void main(String[] args) {
	
		// 기본형 데이터 타입
		
		int a = 10;
		int b = a;
		
		a = 13;
		
		System.out.println("a : " +  a); // 13
		System.out.println("b : " +  b); // 10 출력
		
		// 참조형 데이터 타입
		
		
		Card c1 = new Card('♡', 10);
		Card c2 = c1; // 얕은 복사 (주소값만 복사하는 것)
		Card c3 = new Card(c1.shape, c1.num); // 깊은 복사, 실제 동일한 인스턴스를 만들어 내는 것
		
		c2.num = 3;
		c3.num = 9;
		
		System.out.printf("c1: %c%d\n", c1.shape, c1.num); // c1: ♡3
		System.out.printf("c2: %c%d\n", c2.shape, c2.num); // c2: ♡3 같은 주소 값을 사용하기때문에 하나만 변경하면 다 바뀌어버림
		System.out.printf("c2: %c%d\n", c3.shape, c3.num); // c2: ♡9 로 실제 인스턴스를 만들어낸거라 수정이 된 것이다
		
		// 기본형 타입을 메서드에 전달한 경우
		int a1 = 10;
		plus(a1);
		System.out.println("a1의 값은 " + a1);
		
		Card c4 = new Card('♠', 99);
		changeNum(c4);
		System.out.println("메서드 실행 후 c4의 숫자 : " + c4.shape + c4.num); // 메서드 실행 후 c4의 숫자 : ♠3 출력
		// c4의 new~~를 준건데 changeNum()메서드에 갔더니 값이 3이 되어있기 때문에 그게 다시 돌아온것이다
		
		int[] nums = {10, 11, 12, 13, 14};
		changeElement(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void changeElement(int[] arr) { // arr에 전달한건 nums의 시작 위치를 전달한것이다
		arr[0] = arr[0] * 2; // arr에는 이 배열의 첫번째 위치
		arr[1] = arr[1] * 5; // arr 에 2번째 위치가 전달
	}
	
	public static void changeNum(Card c) {
		c.num = 3;
		System.out.println("바뀐 카드의 숫자 : " + c.shape + c.num); // 바뀐 카드의 숫자 : ♠3 출력
		// 어떤 값이 들어가더라도 숫자를 3으로 바꿔주고있다.
	}
	
	public static void plus(int num) {
		num +=3;
		System.out.println("num + 3 =" + num); // num + 3 =13 , a1의 값이 넘어왔음으로~
	} 

}
