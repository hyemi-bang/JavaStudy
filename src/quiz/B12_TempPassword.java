package quiz;

import java.util.Random;

public class B12_TempPassword {

	public static void main(String[] args) {
	/*
	 알파벳 대문자로 구성된 4자리 랜덤 임시 비밀번호 만들어 출력하는 프로그램
	 
	*/
		
	Random ran = new Random();
	int password = ran.nextInt(26)+65;
	int password1 = ran.nextInt(26)+65;
	int password2 = ran.nextInt(26)+65;
	int password3 = ran.nextInt(26)+65;

	
	System.out.print((char)password) ;
	System.out.print((char)password1) ;
	System.out.print((char)password2) ;
	System.out.print((char)password3) ;
	
	
	
	System.out.println();
	
	for(int i = 0; i < 4; ++i) {
		// 65~90 , 차이 26
		// char ch = (char)(Math.random() * 26 +65);
		// System.err.print(ch);
		System.out.print((char)(Math.random() * 26 + 65));
	}
	System.out.println();

}

}
