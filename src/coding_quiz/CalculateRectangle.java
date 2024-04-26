package coding_quiz;

import java.util.Scanner;

public class CalculateRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		
		System.out.print("가로 입력 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 입력 : ");
		double height = sc.nextDouble();
		
		// 넓이
		double area = width * height;
		System.out.printf("\"%s\" 사각형 넓이 : %.2f\n", name, area);
		
		// 넓이가 100초과 500미만이라면 true 출력
		boolean isRange = (area > 100 && area < 500) ? true : false;
		System.out.println(isRange);
		
	    boolean isInRange = (area > 100) && (area < 500);
        System.out.println(isInRange);
	}

}
