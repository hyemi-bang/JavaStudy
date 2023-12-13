package myobj;

import java.util.Scanner;

public class GetUserInput {
	  public static int[] getUserNums() {
	        Scanner sc = new Scanner(System.in);
	        int[] userNumbers = new int[6];

	        System.out.println("6개의 숫자 입력하세요:");

	        for (int i = 0; i < 6; i++) {
	            userNumbers[i] = sc.nextInt();
	        }

	        return userNumbers;
	    }

	}