package quiz;

public class B12_TempPassword2 {
	
	/*
	 대문자, 소문자, 특수문자, 숫자로 구성된 6자리 랜덤임시 비밀번호 만들어 출력하는 프로그램
	 
	 ※ 사용가능한 특수문자 - !@$%^&*()=+-_[]
	 
	*/
	public static void main(String[] args) {

		/*
		33 ! 37% 38& 42* 43+ 45 - 48~57 0~9 61 =
		64 @ 65 ~90 A~Z 91 [ 93 ] 94 ^ 95 _ 97~122 a~z
		*/
		for (int i = 0; i < 6; ++i) {
			char ch = (char) ((Math.random() * 90) + 33);
			if (i <= 34 && i >= 36) {
				continue;
			} else if (i <= 39 && i >= 40) {
				continue;
			} else if (i == 44) {
				continue;
			} else if (i <= 46 && i >= 47) {
				continue;
			} else if (i <= 58 && i >= 60) {
				continue;
			} else if (i <= 62 && i >= 63) {
				continue;
			} else if (i == 92 && i == 96) {
				continue;
			} else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		// final : final 을 붙이고 선언한 변수는 값을 변경할 수가 없다.
		final String myCharSet ="abcdefghijklmnopqrstuvwxyz+"
				+ "ABCDEFGHIJKLMNOPQURTUVWXYZ+"
				+ "0123456789+"
				+ "!@$%^&*()=+-_[]";
		
		System.out.println("내 문자셋의 길이 : " + myCharSet.length());
		
		int len = myCharSet.length();
		String tempPassword = " ";
		for(int i=0; i<6; ++i) {
			tempPassword +=
			myCharSet.charAt((int)(Math.random() *len));
		}
		System.out.println("생성된 임시비밀번호 : " + tempPassword);
	}
}

























