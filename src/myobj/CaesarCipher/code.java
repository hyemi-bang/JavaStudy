package myobj.CaesarCipher;

public class code {

	// 아스키문자표처럼 나만의 문자표를 만든다
	final public static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*"
			+ "0123456789abcdefghijklmnopqrstuvwxyz[]/?;'\""; 
	
	// 1. 평문과 키값이 전달되면 해당 평문을 암호화하여 리턴해주는 메서드
	public static String encrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();
		
		int lenOfCharset = CAESAR_CHARSET.length();
		int len = text.length();
		
		// CAESAR_CHARSET 에서 텍스트 하나씩 검사
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);// ch가 CAESAR_CHARSET 에서 몇번째 글자 인지 알게됨
			
			if(index != -1) { //-1 = 가나다 등등
				int cipherIndex = (index + key)% lenOfCharset;
				// %연산자 사용이유는 CAESAR_CHARSET에서 문자를 밀어낼 때 문자셋의 길이를 넘어가면 다시 처음으로 돌아가야 하기 때문이다
				// CAESAR_CHARSET의 길이가 36이라면, (index + key) % 36을 통해 36으로 나눈 나머지를 구하게 되어 범위를 0부터 35까지로 제한하는 것 
				sb.append(CAESAR_CHARSET.charAt(cipherIndex));
			} else {
				// 암호 CHARSET에 없는 문자인 경우 그대로 더해줘야한다.
				sb.append(ch);
			}
			
		}
		return sb.toString();
	}
	
	// 2. 암호문과 키 값이 전달되면 해당 암호문을 복호화 하여 리턴해주는 메서드
	public static String decrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();
		
		int lenOfCharset = CAESAR_CHARSET.length();
		int len = text.length();
		
		for(int i = 0 ; i <len; ++i) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);
			
			if(index != -1) {
				int plainIndex = (index - key)% lenOfCharset; 
				
				if(plainIndex < 0){
					// key 값을 제외한 결과가 0보다 작으면 
					sb.append(CAESAR_CHARSET.charAt(lenOfCharset + plainIndex));
				}else {
					//key 값을 제외한 결과가 0보다 크면 그대로 사용한다
					sb.append(CAESAR_CHARSET.charAt(plainIndex));
				}
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
