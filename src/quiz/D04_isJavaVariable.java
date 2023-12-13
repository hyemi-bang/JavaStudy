package quiz;

import java.util.HashSet;

public class D04_isJavaVariable {
	
	/*
	 문자열을 매개변수로 전달하면 해당 문자열이 
	 자바 변수로 사용할 수 있는 문자열인지 검사해주는 메서드를 만들어보세요
	*/

	public static void main(String[] args) {
		System.out.println(Variable.inputMethod("가"));
		System.out.println(Variable.inputMethod("A"));
		System.out.println(Variable.inputMethod("0"));
		System.out.println(Variable.inputMethod("#"));
		System.out.println(Variable.inputMethod("미ㅏㅅ^^"));
		System.out.println(Variable.inputMethod("-244*3514"));
		System.out.println(Variable.inputMethod("$"));
		System.out.println(Variable.inputMethod("_"));

		Variable quiz = new Variable();
		System.out.println(quiz.checkVarName("abcd"));
	}

}

class Variable {
	
	char letters;
	boolean isPossible;	
	
	public Variable() {
	
	}
	
	public Variable(char letters) {
		this.letters = letters;
	}
	
	
	// Teacher
	static HashSet<String> reservedKeywords = new HashSet<>();
	static String [] kws = {
	        "abstract", "continue",     "for",          "new",          "switch",
	        "assert",   "default",      "if",           "package",      "synchronized",
	        "boolean",  "do",           "goto",         "private",      "this",
	        "break",    "double",       "implements",   "protected",    "throw",
	        "byte",     "else",         "import",       "public",       "throws",
	        "case",     "enum",         "instanceof",   "return",       "transient",
	        "catch",    "extends",      "int",          "short",        "try",
	        "char",     "final",        "interface",    "static",       "void",
	        "class",    "finally",      "long",         "strictfp",     "volatile",
	        "const",    "float",        "native",       "super",        "while",
	        // literals
	        "null",     "true",         "false"
	    };
	
	static {
		// 배열의 모든 내용을 set에 추가한다.
		for(String kw : kws) {
			reservedKeywords.add(kw);
		}
	}
	
	
	// Teacher
	boolean checkVarName(String varName) {
		if(reservedKeywords.contains(varName)) {
			System.out.printf("%s는 자바 예약어라 변수명으로 사용할 수 없습니다.\n", varName);
			return false;
		}
		if(Character.isJavaIdentifierStart(varName.charAt(0))) {
			for(int i = 1; i < varName.length(); ++i) {
				char ch = varName.charAt(i);
				if (!Character.isJavaIdentifierPart(ch)) {
					System.out.printf("%d 번째 문자 %c는 변수명으로 적합하지 않습니다 \n", i, ch);
					return false;
				}
			}
		} else {
			System.out.printf("첫 번째 문자%c 는 변수명으로 사용 할 수 없습니다. \n"
					,varName.charAt(0));
			return false;
		}
		return true;
	}
	
	
	
	//매개변수로 전달받은 문자열의 전체 길이릂 파악한다
	public static boolean inputMethod(String str) {
		for(int i = 0 ; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			 // 숫자로 시작하거나 특수 문자, 공백 문자인 경우
			if(i == 0 && Character.isDigit(ch) 
					|| !Character.isJavaIdentifierPart(ch) 
					|| Character.isWhitespace(ch)) {
				return false; 	
			} 
		} 
		return true;
	}
	
	private static boolean isKeyword(String str) {
	    // 예약어 목록
	    String[] keywords = {
	       "boolean", "byte", "char","short","int", "long", "float", "double",
	       "private", "protected", "public", "class", "abstracted", "interface",
	       "extends", "implements", "enum", "new", "instanceof", "this", "super",
	       "null", "void", "return", "if", "else", "switch", "case", "default",
	       "for", "do", "while", "break", "continue", "true", "false",
	       "try", "catch", "finally", "throw", "throws", "package", "import",
	       "synchronized", "final", "static"
	    };
	    
	    // 입력 문자열이 예약어인지 확인
	    for (String keyword : reservedKeywords) {
	        if (str.equals(keyword)) {
	            return true;
	        }
	    }
	    return false;
	}


	
	/*
	
	
		public static boolean inputMethod(String str) {
		for(int i = 0 ; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(Character.isJavaIdentifierPart(ch))  {
				System.out.println( );
			} else if (!Character.isJavaIdentifierPart(ch)) {
				System.out.println( );
			}
			return true;
			
		} 
		return false;
	}
	*/
	
}























