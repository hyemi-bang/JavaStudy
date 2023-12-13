/**
 * 여기도 주석
 */

public class A00_Hello { //{} 범위는 중괄호로 지정
	public static void main(String[] args) {
		//main() : 프로그램 그 자체, 메인이 시작(끝나면)되면 프로그램이 시작(끝남)
		// public static void main(String[] args) 순서 틀리면 안된다.
		System.out.println("Hello~, Worild!!");
	// System.out.println("~"); ()의 전달한 내용은 콘솔에 출력한다., ; 한 명령어가 끝남을 의미
											// 콘솔 = 글자만 나오는 옛날 컴퓨터 화면
	/*# () 안에 전달할 수 있는 데이터의 종류 (자바의 리터럴)
	*   1. 숫자 (정수, integer, 계산 가능)
		2. "" 사이에 들어가는 모든 문자 : 문자열(String), +만 가능
		3. '' 사이에 들어간 단 하나의 문자 (두글자 이상은 안됨) 
		  : 문자(Character), 계산이 가능하긴 하다
		4. 소수 (실수, Double, 계산 가능)
		5. true, false (참, 거짓형 데이터)
		6. 아주 큰 숫자 뒤에 L (숫자를 쓰다보면 빨간줄 뜸) : 큰 정수 (long), 계산가능
		7. 소수 + F : 짧은 실수 (Float), 계산 가능
	 * ctrl+f11 (실행,빌드,런) / ctrl+m 파일
	 * */
		
		System.out.println(123456);
		System.out.println(98.9);
		System.out.println("오늘의 메뉴 :~~");
		System.out.println('김');
		System.out.println(true);
		System.out.println(false);
		System.out.println(12345678911234L);
		System.out.println(98.444222233313);
		System.out.println(98.444222233313F);
		
		//+, -, *, / 등 계산을 할 수 있다.
		System.out.println(25*88);
		System.out.println(88 / 4);
		System.out.println(91/3); // 정수끼리 계산하면 몫만 구한다.
		System.out.println(91/ 3.0); // 소수점 아래의 값 계산을 원하면 실수로 연산해야한다.
		System.out.println(33333333L / 123.333);
		
		//문자열은 다른 타입과 +를 통해 이어붙이기 할 수 있다.
		System.out.println("Apple" + "Pie"); // apple - pie 는 안됨
		System.out.println("평균점수 :" + 85.8); // 계산은 불가능 하지만, 이어 붙여준다.		
		System.out.println(300+"개");
		System.out.println("오늘 점심을 먹었는가?" + true);
		System.out.println("안경을 썼는가?" + false);
		System.out.println("오늘 식대:" + 5000*4 + "원");
		System.out.println("오늘 간식 값:" + 3500 + 5400 + "원");
		System.out.println("오늘 간식 값:" + (3500 + 5400) + "원");
	}
}

