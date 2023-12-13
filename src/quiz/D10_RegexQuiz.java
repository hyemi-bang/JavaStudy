package quiz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_RegexQuiz {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("###연습문제###");

		Scanner sc = new Scanner(System.in);
		// 전화번호는 하이픈이 두개 포함되어 있거나 둘 다 없어야 트루나온다
		System.out.println();
		// Q1 : 해당 문자열이 핸드폰 번호[옛날번호]인지 검사할 수 있는 정규표현식을 만들어보세요
		System.out.println("핸드폰번호 >>");
		String userInput = "011-1111-1111"; // sc.nextLine();
		String correctPhoneNumber = "01[016-9]-\\d{3,4}-\\d{4}";
		boolean isPhoneNumber = Pattern.matches(correctPhoneNumber, userInput);
		System.out.println("입력한문자열은 핸드폰번호 : " + isPhoneNumber);

		// Q2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		// 이메일 : 계정@도메인.최상위도메인
		System.out.println("이메일주소 >>");
		String userInput2 = "abc@aa..a.a..aa...tt"; // sc.nextLine();
//		 String correctEmail = "\\w+@\\w+";
		String correctEmail = "[a-zA-Z0-9.-_]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}";
		boolean isEmailAddress = Pattern.matches(correctEmail, userInput2);
		System.out.println("입력한 이메일주소 : " + isEmailAddress);

		// Q3 : 해당 문자열이 IP주소 인지 검사할 수 있는 정규 표현식
		// (0.0.0.0 ~ 255.255.255.255)
		System.out.println("IP주소 >>");
		String userInput3 = "8.8.8.8"; // sc.nextLine();
//		 String correctDomain = "(0|[0-255]).(0|[0-255]).(0|[0-255]).(0|[0-255])";
		String correctDomain = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])" // 1번자리 0~255
				+ ".(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])" + ".(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])"
				+ ".(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])";
		boolean isIpAddress = Pattern.matches(correctDomain, userInput3);
		System.out.println("입력한 IP주소 : " + isIpAddress);

		// Teacher
		// Q1 : 해당 문자열이 핸드폰 번호[옛날번호]인지 검사할 수 있는 정규표현식을 만들어보세요

		System.out.println("is old ph? " + Pattern.matches("01[016789](-\\d{3,4}-|\\d{3,4})\\d{4}", "0181234123"));

		// Q2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		// 이메일 : 계정@도메인.최상위도메인

		System.out.println("is email?" + Pattern.matches("\\w[\\w-]*@[\\w-]+(\\.[a-zA-Z]+)*", "ab-ce@na.co.kr"));
		// \w : 일반적인 문자들을 허용한다 [a-zA-Z0-9_]와 같다고 볼 수 있다

		// Q3 : 해당 문자열이 IP주소 인지 검사할 수 있는 정규 표현식
		// (0.0.0.0 ~ 255.255.255.255)

		System.out.println("is IP Addr? " + Pattern.matches("((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}"
				+ "((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]))", "8.8.8.8"));

		// Q4 : 비밀번호 생성규칙을 만족하는 문자열인지 검사하는 정규표현식을 정의해보세요

	}
}
