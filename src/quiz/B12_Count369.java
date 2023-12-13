package quiz;

import java.util.Random;

public class B12_Count369 {
	/*
	100 ~ 500 랜덤 양의 정수를 하나 생성하고
	해당 숫자까지 369를 진행한다면 박수를 총 몇번 쳐야하는지 출력해보세요
	
	*/
	public static void main(String[] args) {
		Random ran = new Random();

		int randomNumber = ran.nextInt(401) + 100;
		System.out.println("Random Number : " + randomNumber);
		int clap = 0;

		for (int number = 1; number <= randomNumber; ++number) {
			 String numberStr = " "; // randomNumber가 String으로 못바꿈
			 		// "" + number  >> 문자열로 바꾸는 방법, 종종사용했다고 하는데 기억이 안남...
			 for (int j = 0; j < numberStr.length(); ++j) {
	                char digit = numberStr.charAt(j);
				if (digit == '3' || digit == '6' || digit == '9') {
					 ++clap;
                }
            }
        }
		System.out.println("Total Claps: " + clap);
	}

}
