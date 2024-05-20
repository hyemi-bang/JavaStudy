package coding_quiz;

import java.util.Arrays;

public class Multiplication {

	public static int solution(int[][] dots) {

		// 주어질 좌표에서 x,y 값 추출

		int[] xCoords = new int[dots.length];
		int[] yCoords = new int[dots.length];

		// 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
		for (int i = 0; i < dots.length; i++) {
			xCoords[i] = dots[i][0];
			yCoords[i] = dots[i][1];
		}

		// 최대값 최소값
		int xMin = Arrays.stream(xCoords).min().getAsInt();
		int xMax = Arrays.stream(xCoords).max().getAsInt();
		int yMin = Arrays.stream(yCoords).min().getAsInt();
		int yMax = Arrays.stream(yCoords).max().getAsInt();

		int width = xMax - xMin;
		int height = yMax - yMin;

		return width * height;

	}

	public static void main(String[] args) {

		int[][] dots1 = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
		int[][] dots2 = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		System.out.println(solution(dots1));  // 1
		System.out.println(solution(dots2)); // 4
	}

}
