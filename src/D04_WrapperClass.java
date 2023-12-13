
public class D04_WrapperClass {
	
	/*
	 # Wrapper Class
	 - 각 기본형 타입에 대응하는 참조형 타입
	 - 각 기본형 타입에 관련된 유용한 기능들이 추가되어 있다
	 
	 # 기본형
	 - boolean, byte, char, shor, int, long, float, double 
	 - .~~ 불러다 쓸 수 없었다. 인스턴스가 아니니까
	 
	 # 참조형
	 - Boolean, Byte, Character, Short, Integer, Long, Float, Double
	 - .~~ 가능했다.
	  
	*/

	public static void main(String[] args) {
		
		/*
		
		# Parsing
		- 문자열 데이터를 해당 타입 값으로 변환하는 것
		- 각 타입마다 parseXXX 메서드가 존재한다
		- 각 인스턴스에 딸린 메소드가 아니라, 스테틱 메서드라고 볼 수 있다.
	
		*/
	

		String v1 = "1234";
		int i1 = Integer.parseInt(v1);
		short s1 = Short.parseShort(v1);
		// Character.parseChar 없음
		Boolean b1 = Boolean.parseBoolean(v1);
		
		/*
		 대소문자를 구분하지 않으며, true가 들어오면 true, false가 
		Parses the string argument as a boolean. 
		The booleanreturned represents the value true if the string argumentis not null 
		and is equal, ignoring case, to the string "true".
		Otherwise, a false value is returned, including for a nullargument.

		Example: Boolean.parseBoolean("True") returns true.
		Example: Boolean.parseBoolean("yes") returns false.

		
		*/
		
		
		System.out.println(i1); // 1234
		System.out.println(s1); // 1234
		
		
		String v2 = "AF00";
		int i2 = Integer.parseInt(v2, 16); 
		// 진법을 넣으면, 원하는 진법 문자열 값으로 해석 가능하다. radix => 16진법의 값으로 해석해주세요
		System.out.println("v2의 16진수의 값 : " + i2); // v2의 16진수의 값 : 44800
		System.out.printf("10진수 :%d, 16진수 %X \n", i2, i2); // 10진수 :44800, 16진수 AF00 
		
		String v3 = "1001011";
		Integer i3 = Integer.parseInt(v3, 2);
		
		System.out.println("v3의 2진법의 값 :" + i3); // v3의 2진법의 값 :75
		
		
		/*
		   # toString
		   
		   - 각 WrapperClass의 toString()은 해당 타입 값을 문자열로 변환하는 기능을 가지고 있다.
		   - 인스턴스 메서드 toString()은 해당 인스턴스 문자열로 변환한다
		   - 스태틱 메서드 toString()은 전달하는 값을 문자열로 변환한다
		   
		*/
		
		Integer num1 =10;		
		String numStr1 = num1.toString();
		String numStr2 = Integer.toString(1234);
		
		System.out.println(numStr1); // 10
		System.out.println("배웠던것 " + "" + num1); // 배웠던것 10
		System.out.println(numStr2);// 1234
		
		Integer num2 = 5234213;
		String numStr3 = Integer.toString(num2, 16);
		String numStr4 = Integer.toString(num2, 2);
		System.out.println(numStr3); // 4fde25
		System.out.println(numStr4); // 10011111101111000100101
		
		String numStr5 = Integer.toHexString(num2); // toString(v, 16) 16진수변환
		String numStr6 = Integer.toBinaryString(num2); // toString(v, 2) 2진수
		String numStr7 = Integer.toOctalString(num2); // toString(v, 8) 8진수
		
		String doubleStr = Double.toHexString(123.12345677);
		System.out.println(doubleStr); // 0x1.ec7e6b73967abp6
		
		// 각 타입의 상수들
		
		// 각 타입의 최대,최소값을 저장해놓은 상수
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		
		// 각 타입 바이트를 저장해놓은 상수
		System.out.println(Short.BYTES); // 2
		System.out.println(Integer.BYTES); //4
		System.out.println(Long.BYTES); //8
		
		// 각타입의 비트수를 저장해 놓은 상수 byte * 8
		System.out.println(Short.SIZE); // 16
		System.out.println(Integer.SIZE); // 32
		
		// Character 타입의 기능들
		System.out.println("숫자인가요?? " + Character.isDigit('a'));
		// 숫자인가요?? false
		
		/*
		이런 아이들을 숫자로 인정한다~
		'\u005Cu0030' through '\u005Cu0039',ISO-LATIN-1 digits ('0' through '9') 
		'\u005Cu0660' through '\u005Cu0669',Arabic-Indic digits 
		'\u005Cu06F0' through '\u005Cu06F9',Extended Arabic-Indic digits 
		'\u005Cu0966' through '\u005Cu096F',Devanagari digits 
		'\u005CuFF10' through '\u005CuFF19',Fullwidth digits 		
		*/
		System.out.println("문자인가요? "+ Character.isAlphabetic('['));
		//문자인가요? false
		System.out.println("문자인가요? "+ Character.isAlphabetic('김'));
		System.out.println("문자인가요? "+ Character.isAlphabetic('A'));
		// 문자인가요? true
		
		System.out.println("대문자인가요? "+Character.isUpperCase('a'));
		//대문자인가요? false
		System.out.println("소문자인가요? "+Character.isLowerCase('a'));
		//소문자인가요? true
		
		System.out.println("공백인가요?? " +  Character.isWhitespace(' '));
		System.out.println("공백인가요?? " +  Character.isWhitespace('\n'));
		System.out.println("공백인가요?? " +  Character.isWhitespace('\t'));
		// 공백인가요?? true
		
		/*
		Determines if the specified character is white space according to Java.
		A character is a Java whitespace character if and only if it satisfiesone of the following criteria: 
		It is a Unicode space character (SPACE_SEPARATOR, LINE_SEPARATOR, or PARAGRAPH_SEPARATOR)
		but is not also a non-breaking space ('\u005Cu00A0', '\u005Cu2007', '\u005Cu202F'). 
		자세한 내용은 F2 눌러서 확인하기

		*/
		
		//자바 변수 첫 번째 글자로 사용 할 수 있나요?
		System.out.println(Character.isJavaIdentifierStart('7')); // false
		
		//자바 변수의 몸통으로 사용할 수 있나요?
		System.out.println(Character.isJavaIdentifierPart('2')); // true
		System.out.println(Character.isJavaIdentifierPart(' '));  // false
		
		
	}

}





























