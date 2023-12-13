package quiz;

import java.util.Scanner;

public class E01_CorrectInput {
	
	/*
		사용자로부터 스캐너로 숫자를 입력받되 
		숫자가 아닌 문자를 입력하더라도 다시 입력받을 수 있는 프로그램을 만들어보세요
		+ 그러면 숫자를 입력 받으면 또 받지 않게 해야하는것인가??
		
		nextInt(); 로 입력 받고 난 후에는 
	*/ 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int digit;
		boolean validInput = false;

		while (!validInput) { // while (true) {
			System.out.println("정수 입력하세요 >>");
			try {
				digit = sc.nextInt();
				validInput = true; // break; (입력을 잘받으면 break~)
				System.out.println("출력 > " + digit);
			} catch (java.util.InputMismatchException error) {
				System.out.println("숫자만 입력하시오.!!");
				sc.nextLine(); // 내용물이 남이있기 때문에 한 줄 비워줘야한다. 찌꺼기 빼내기
			}
		}
		

	}

}
