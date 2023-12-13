package quiz;

import java.util.Scanner;

public class D09_CaesarCipher {
	
	/*
	 # 시저 암호
	 
	 - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호알고리즘
	 - 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화되고 암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화된다.
	 
	 ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'"
	 
	 (평문)		key : 10     (암호문)
	 Hello!!      ==>		Rovvy22
	 			 암호화
	 			
	 (암호문)		key : -10	(평문)
	 Rovvy22      ==>		Hello!! 
	 			 복호화
	*/
	
	// 암호 : ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'"
		
	// 1. 평문과 키값이 전달되면 해당 평문을 암호화하여 리턴해주는 메서드
	public static String getPlainText(String input, int key) {
		StringBuilder result = new StringBuilder();
		final String myCaesarSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789!@#$%^&*[]/?;'";

		for (int i = 0; i < input.length(); ++i) {
			char ch = input.charAt(i);
			int index = myCaesarSet.indexOf(ch);
			// "".indexOf(ch) : myCaesarSet에서 찾고자 하는 ch 위치를 찾아 반환
			// input 문자 ch가 mySet 문자열 안에 존재하는지

			// mySet에 있는 문자들인지 확인하고, 맞으면 암호화한다
			if (index > 0) {
				int newIndex = (index + key) % myCaesarSet.length();
				// 해당위치의 인덱스에 + key값을 더한후 mySet 을 나눈 나머지 
				if(newIndex < 0) { // 0보다 작게 되면 
					// newIndex 에 누적연산 뭘 더해야할까앙
					newIndex+=myCaesarSet.length();
				}
			
				result.append(myCaesarSet.charAt(newIndex)); // 여기에 암호화한 값을 저장해
			} else { // indexOf() 가  문자열을 못찾는 경우 -1 반환, 그러면 -1에 대해 변환한 값을 내게 되는것 mySet에 있지않은 경우 그대로 결과에 리턴한다
				result.append(ch);
			}
		}
		return result.toString(); //
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("key 값을 입력하세요 >>");
		int calculatedValue = scanner.nextInt();
		scanner.nextLine();

		System.out.println("암호화할 텍스트 (평문) 입력 >> ");
		String input = scanner.nextLine();

		String encryptedText = getPlainText(input, calculatedValue); // input(평문)과 키값 들어가야함
		System.out.println("암호화된 텍스트 : " + encryptedText);

		// 2. 암호문과 키 값이 전달되면 해당 암호문을 복호화 하여 리턴해주는 메서드
		String decryptedText = getPlainText(encryptedText, -calculatedValue); // 암호화된텍스트와, 뒤집힌 키값이 들어가면 평문으로 돌아간다
		System.out.println("복호화된 텍스트 : " + decryptedText);

	}

}
