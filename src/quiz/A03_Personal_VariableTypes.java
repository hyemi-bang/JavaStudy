package quiz;

public class A03_Personal_VariableTypes {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20; // 컴퓨터 용량을 아낄꺼면 byte, 보통 int , 어느 상황에서 사용 할 때인지에 따라
		String num = "010-1234-1234"; // 문자열로 저장
		double height = 178.5;
		float weight =75.0f; // float는 f를 써야하는 번거로움이 있기 때문에 double 을 써도 문제없다.
		String blood = "O"; // 혈액형은 ab형도 있는데 그건 char 타입으로 쓸 수 없다.
						    //char bloodtype = AB;
		
		char ch2 =79;
		System.out.println(ch2);
		
		System.out.println("========= 출력 결과 ========");
		System.out.println("이름\t:"+name);
		System.out.println("나이\t:"+age);
		System.out.println("Tel\t:"+num);
		System.out.println("키\t:"+height);
		System.out.println("몸무게\t:"+weight);
		System.out.println("혈액형\t:"+blood);
	}
}
