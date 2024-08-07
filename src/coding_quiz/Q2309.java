package coding_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] heights = new int[9]; // 9명 난쟁이 키 배열에 넣는다

		for (int i = 0; i < 9; i++) {
			heights[i] = sc.nextInt();
		}

		int[] dwarf = findDwarf(heights); // 7명의 난쟁이 찾기
		Arrays.sort(dwarf);

		 for (int height : dwarf) {
	            System.out.println(height);
	        }
	    }

    // 난쟁이 찾을 메서드
    private static int[] findDwarf(int[] heights) {
        int[] dwarfResult = new int[7];

        // 7명 키의 합이 100이 되는지 찾는다
        for (int i = 0; i <= 7; i++) { // 첫 번째 제외할 난쟁이
            for (int j = i + 1; j <= 8; j++) { // 두 번째 난쟁이
                int sum = 0;
                for (int k = 0; k <= 8; k++) { 
                    if (k != i && k != j) { // 1,2 번째 난쟁이 제외하고 합해라!
                        sum += heights[k];
                    }
                }

                // 합이 100이 되는 경우 찾기
                if (sum == 100) {
                    int index = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                        	dwarfResult[index++] = heights[k];
                        }
                    }
                    return dwarfResult; // 7명의 난쟁이를 찾았으므로 반환
                }
            }
        }
        return null; // 조건 만족하지 못할경우 반환 , 일곱 난쟁이를 찾을 수 없는 경우는 없다고 했음으로 null 나올리 없음 (아마도)
    }
}