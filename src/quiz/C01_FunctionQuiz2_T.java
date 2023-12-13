package quiz;

public class C01_FunctionQuiz2_T {

	// 2. 문자열을 전달하면 해당 문자열을 마구 뒤섞은 문자열을 반환해주는 함수
		public static String shuffleText(String text) {
			// "".toCharArray() : 문자열로 char[]을 만들어 반환한다
			char[] arr = text.toCharArray();
		
			for (int i = 0; i < 1000; ++i) {
			 int ranIndex = (int) (Math.random() * (arr.length - 1) + 1);

				char temp = arr[0];
				arr[0] = arr[ranIndex];
				arr[ranIndex] = temp;
			}
			
			// char[]로 문자열을 생성하는 방법
			// new String(); :: 캐릭터형 배열 (= char[])을 재료로 전달하여 새 문자열을 생성한다.
			// return new String(arr); 이거를 풀면 아래 ↓
			
			String shuffled = "";
			for (int i = 0; i < arr.length; ++i) {
				shuffled += arr[i];
			}
			return shuffled;
		}
		
		// 3. 문자열을 전달하면 해당 문자열의 대소문자를 반전시킨 문자열을 반환해주는 함수
		// 밖으로 나오는 것도 문자열이고, 내가 입력하는 것도 문자열이다~
		public static String inverse (String text) {
			String result = "";
			for (int i = 0; i < text.length(); ++i) { // 전달받은 텍스트를 한글자 씩 보면서 변환시키기
				char ch = text.charAt(i);

				if (ch >= 'A' && ch <= 'Z') {
					result += (char) (ch + ('a' - 'A'));
				} else if (ch >= 'a' && ch <= 'z') {
					result += (char) (ch - ('a' - 'A'));
				} else {
					result += ch;
				}
			}
			return result;
		}

		// 4. 문자열을 전달하면 해당 문자열이 숫자로만 이루어져있는지 여부를 알려주는 함수
		
		public static boolean isNumeric (String text) {
			
			for (int i = 0; i < text.length(); ++i) {
				char ch = text.charAt(i);
				if (ch < '0' || ch >'9') {
					return false;
				}
			}
			return true;
		}
		
		
	public static void main(String[] args) {
		
		System.out.println(shuffleText("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(inverse("ApPLe"));
		System.out.println("숫자로만 되어있나요? " + isNumeric("010-1111-1111"));
		System.out.println("숫자로만 되어있나요? " + isNumeric("123456"));
		

	}

}
