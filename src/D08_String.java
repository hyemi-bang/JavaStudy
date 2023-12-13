import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D08_String {

	public static void main(String[] args) {

		String fruits = "apple/banana/orange/kiwi/blueberry";
		System.out.println(fruits);
		// apple/banana/orange/kiwi/blueberry

		// "".split(delim) : 문자열을 원하는 기준으로 잘라서 문자열 배열로 반환
		String[] fruitArr = fruits.split("/");

		System.out.println(Arrays.toString(fruitArr));
		// [apple, banana, orange, kiwi, blueberry]

		// String.join(delim, iterable) : 모든 요소를 딜리미터로 이어붙인 하나의 문자열을 반환
		// iterable : 하나씩 꺼내 쓸 수 있는 모든 것 (배열, 리스트 등)
		String joinResult = String.join("++", fruitArr);

		System.out.println("join 결과 : " + joinResult);
		// join 결과 : apple++ banana++ orange++ kiwi++ blueberry
		// String.join(", ", fruitArr); => join 결과 : apple, banana, orange, kiwi,
		// blueberry

		Set<String> snackSet = new HashSet<>();
		// Set F3 >  Collection<E> F3 >> 이터러블이 되어있는걸 볼 수 있다.

		snackSet.add("포카칩");
		snackSet.add("오예스");
		snackSet.add("초코파이");
		snackSet.add("오감자");
		
		String joinResult2 = String.join("--", fruitArr);
		
		System.out.println("Set의 join결과> "+joinResult2);
		
		//String.contains가능
		//"".contains(CharSeq) : 해당문자열에 전달한 문자열이 포함되어 있는지 확인한다
		System.out.println("초코파이".contains("초코")); // true
		System.out.println("초코하임".contains("초코")); // true
		System.out.println("지크".contains("초코")); // false
		
		String url = "http://naver.com";
		//"".startsWith(CharSeq) : 해당 문자열이 전달한 문자열로 시작하는지 검사한다
		// 매우매우 많이 쓴다
		System.out.println(url.startsWith("https://")); // false
		System.out.println(url.startsWith("ftps://")); // false

		//"".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 검사한다
		System.out.println(url.endsWith(".co.kr")); // false
		System.out.println(url.endsWith(".com")); // true
		System.out.println(url.endsWith("jpg")); // false
		
		//"".replace(old, new) : 문자열 내부에서 원하는 문자열을 치환하여 교체한다
		String email = "minsu1234@naver.com";
		String replacedEmail = email.replace("naver", "gmail");
		
		System.out.println("원본: " + email);
		System.out.println("수정본: " + replacedEmail); // 수정본: minsu1234@gmail.com
		
		// "".substring(index) : 문자열을 입력한 위치부터 마지막까지 반환 
		System.out.println(email.substring(10)); //  naver.com
		
		// substring(int beginIndex, int endIndex) : 문자열을 시작 인덱스 부터 끝나는 인덱스 미만까지 자른 인스턴스 반환
		System.out.println(email.substring(0, 3)); // min
		
		//"".indexOf(str) : 문자열에서 찾고자 하는 문자열의 위치를 찾아 반환
		// 문자열을 못찾는 경우 -1 반환
		System.out.println(fruits.indexOf("kiwi")); // 20
		System.out.println(fruits.indexOf("pineapple")); // -1
		System.out.println(fruits.charAt(20)); // k
		
		System.out.println("이메일에서 아이디 부분만 자르기 : " + 	email.substring(0, email.indexOf('@')));
		// 이메일에서 아이디 부분만 자르기 : minsu1234
		System.out.println("이메일에서 도메인 부분만 자르기 : " + 	email.substring(email.indexOf('@')+1));
		// 이메일에서 도메인 부분만 자르기 : naver.com
		
		
		//"".trim : 문자열 바깥쪽의 공백을 제거한다 (내부의 공백은 제거하지 않는다)
		String passwordAnswer = "abcd1234";
		String input1 = "     abcd1234  ";
		System.out.println(passwordAnswer.equals(input1)); // false
		System.out.println(passwordAnswer.equals(input1.trim())); // true
		
		//"".toUpperCase(): 해당문자열을 모두 대문자로 변환
		//"".toLowerCase(): 해당 문자열을 모두 소문자로 변환
		
		String message = "Hello, world!";
		
		System.out.println(message.toLowerCase()); // hello, world!
		System.out.println(message.toUpperCase()); // HELLO, WORLD!
		
		
		// String.format(fmt, args) : 서식을 사용해 원하는 문자열을 생성할 수 있다
		String timeStr = String.format("%d:%d:%d", 14,55,37);
		System.out.println(timeStr); // 14:55:37
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
