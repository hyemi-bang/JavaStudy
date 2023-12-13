import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	
	/*
		 # 정규표현식 (Regex Expression)
		 - 문자열이 특정 패턴과 일치하는지 검사할 수 있는 표현식
		 - 특정 프로그래밍 언어에 종속된 것이 아닌 공통의 규칙이다
		 - 회원가입 때 많이 쓰인다.
		 
		 # 자바에서 정규표현식을 활용하기 위한 클래스
		 - java.util.regex.Pattern
 
	*/

	public static void main(String[] args) {
		// Pattern.matches(regex, text)
		// 해당 문자열이 정규표현식에 해당하는 문자열인지 검사하는 메서드
		// 리턴타입 boolean, new Pattern() 은 없다. 인스턴스를 스태틱 매서드를 사용해서 출력한다.

		System.out.println(Pattern.matches("sleep", "sleep")); // true

		// [] : 해당 위치에 들어올 수 있는 문자를 정의하는 정규표현식 문법
		// [] 1번째 자리에 l.h 둘 모두 허용하겠다. 단 하나의 문자만 올 수 있다
		System.out.println(Pattern.matches("s[lh]eep", "sheep")); // true
		System.out.println(Pattern.matches("s[lh]eep", "skeep")); // false
		System.out.println(Pattern.matches("s[lh]e[ea]p", "sleap")); // true

		System.out.println(Pattern.matches("01[01679]-", "010-")); // true
		System.out.println(Pattern.matches("01[01679]-", "019-")); // true

		System.out.println(Pattern.matches("s[abc/]eep", "s/eep")); // true

		System.out.println(Pattern.matches("s[abc/\\\\]eep", "s\\eep")); // true
		// 정규표현식에서 \ 특수한 문법으로 사용되기 때문에, 정규표현식에서도 \\로 해석되도록 자바 문자열에서 \\\\ 4개를 적어주어야한다.
		 
		 /*
		 
		 	#[] 내부 문법들
		 	
		 	[abc] : a또는 b 또는 c를 허용
		 	[a-z] : a~z 모두 허용
		 	[A-Z] : A~Z 모두 허용
		 	[a-zA-Z] : 모든 알파벳 허용
		 	[a-g&&c-p] : 두 조건을 모두 만족하는 문자만 허용
		 	
		 */

		System.out.println(Pattern.matches("[a-z]at", "cat")); // true
		System.out.println(Pattern.matches("[a-z]at", "hat")); // true
		System.out.println(Pattern.matches("[a-z]at", "Pat")); // false

		 /*
		 
		 	# 하나로 여러 문자를 나타내는 문법들
		 	
		 	.	: 모든 문자 허용 
		 	    [.] 또는 \. 을 사용해야만  .만 허용 가능하게 된다.
		 	\d	: 모든 숫자를 허용 
		 	\D	: 숫자를 제외한 나머지 모두를 허용
		 	\s	: 모든 공백을 허용한다 (\n,\t,\r,' ')
		 	\S	: 공백을 제외한 나머지 모두를 허용
		 	\w	: 일반적인 문자들을 허용한다 [a-zA-Z0-9_]와 같다고 볼 수 있다
		 	\W	: \w를 제외한 나머지 모두를 허용한다
		 	
		 	
		 */

		System.out.println(Pattern.matches(".at", "Cat")); // true
		System.out.println(Pattern.matches(".kr", "akr")); // true
		System.out.println(Pattern.matches("[.]at", ".at")); // true

		System.out.println(Pattern.matches("\\deleven", "7eleven")); // true
		// 자바 문자열에서는 \d를 나타내고 싶으면 \\d를 사용해야해
		System.out.println(Pattern.matches("\\d\\s\\D.", "9\nA*")); // true
		System.out.println(Pattern.matches("[\\d\\s]\\D.", " A*")); // true
		System.out.println(Pattern.matches("[\\d\\s]\\D.", "9A*")); // true
		 
		 /*
		 
		  # 앞의 패턴을 여러번 적용시키기 위한 문법
		  .{n}		: {} 앞의 패턴이 n개 일치해야 한다
		  .{n,m}	: {} 앞의 패턴이 n개 이상 m개 이하 일치해야 한다. n과 m사이를 띄면 안됨
		  .{n,}		: {} 앞의 패턴이 n개 이상 일치해야 한다.
		  .?		: ? 앞의 패턴이 0번 또는 딱 1번 나와야 한다.
		  .+		: + 앞의 패턴이 1번 이상 나와야 한다.
		  .*		: * 앞의 패턴이 0번 이상 나와야 한다. 써도 되고 안써도 되고, 패턴을 썼을때 잘못된걸 확인할 수 있겠지.
		 */

		// .{}
		System.out.println(Pattern.matches("[0-5]{3}\\d", "0006")); // true
		System.out.println(Pattern.matches("[.]{2,3}에휴", "...에휴")); // true
		System.out.println(Pattern.matches("[.]{2,3}에휴", ".에휴")); // false
		System.out.println(Pattern.matches("[.]{2,}에휴", ".....에휴")); // true

		// .?
		System.out.println(Pattern.matches("(010)?-[\\d]{4}-[\\d]{4}", "010-1111-1111"));
		// true 010없어도 되고 -는 꼭써라
		System.out.println(Pattern.matches("(010)?-?[\\d]{4}-?[\\d]{4}", "1111-1111"));
		// true 010이없어도되고, -도 없어도되고
		System.out.println(Pattern.matches("010-?[\\d]{4}-?[\\d]{4}", "01012345678"));
		// true - 없어도되고~ 010은 꼭 써라
		// 문법을 소괄호로 묶어서 적용하는 것이 가능
		System.out.println("() text: " + Pattern.matches("([a-z]\\d)", "a7")); // () text: true

		// 여러개 중 하나를 선택하게 만들기
		System.out.println("choice text: " + Pattern.matches("123|456|789", "123")); // choice text: true
		System.out.println("choice text: " + Pattern.matches("123|456|789", "234")); // choice text: false
		System.out.println("is hp? : " + Pattern.matches("010(-\\d{4}-|\\d{4})\\d{4}", "010-1111-9999")); // is hp?
	

		 /*
		 	#Matcher
		 	- 전체 문자열을 탐색하면서 정규표현식과 매치하는 부분을 찾는 기능을 수행하는 클래스
		 	- Pattern 클래스에서 만들어낸 정규표현식 인스턴스를 장착하여 사용한다.
		 	- Pattern 클래스는 문자열 정규표현식을 컴파일 하여 Pattern 인스턴스를 생성할 수 있다.
		 	
		 	# 자바에서 활용하기 위한 클래스
		 	# import java.util.regex.Matcher;
		 	 	
		 */

		// 리턴타입 boolean, new Pattern() 은 없다. 인스턴스를 스태틱 매서드를 사용해서 출력한다.
		String fruits = "apple/banana/orange/kiwi/peach/pinappel/waterapple/goldapple"
				+ "apple/orange/apple/apple/banana";

		// 1> 정규표현식을 컴파일 하여 Pattern 인스턴스 생성
		Pattern fruitPattern = Pattern.compile("([a-zA-Z]*)(apple)");	
		// 이 인스턴스로 할 수 있는 일 phonePattern. 찍어보기

		//2> Pattern 인스턴스에 검사할 문자열을 넣어 matcher 생성
		Matcher matcher = fruitPattern.matcher(fruits);

		//3> 반복문을 통해 패턴과 매치하는 문자열의 위치를 찾는다
		
		// matcher.find() : 패턴과 일치하는 다음 문자열을 찾는다. 찾은게 있으면 true, if문 말고 while문을 사용해라
		while(matcher.find()) {
			System.out.println("----------------------");
			System.out.println("이번에 찾은 전체 문자열 : "+ matcher.group());
			System.out.println("시작위치 : " + matcher.start());
			System.out.println("끝난위치 : " + matcher.end());
			
			// 괄호를 이용해 패턴과 일치하는 일부분만 꺼낼 수 있다.
			System.out.println("group(0)" + matcher.group(0));
			System.out.println("group(1)"+ matcher.group(1));
			System.out.println("group(2)"+ matcher.group(2));
			
			System.out.printf("group(1)의 시작 위치 : %d ~ %d\n", matcher.start(1), matcher.start(1));
			System.out.printf("group(2)의 시작 위치 : %d ~ %d\n", matcher.start(2), matcher.start(2));
		}
		
	
		
		
		}

	}
