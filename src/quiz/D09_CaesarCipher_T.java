package quiz;

import myobj.CaesarCipher.code;

public class D09_CaesarCipher_T {


	public static void main(String[] args) {
		System.out.println(code.encrypt("Hello!!!", 3555));
		String encryptedText = code.encrypt("Hello!!!", 3555);
		System.out.println(code.decrypt(encryptedText,3555));
	}

}