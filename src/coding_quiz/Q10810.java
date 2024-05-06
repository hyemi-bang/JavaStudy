package coding_quiz;

import java.util.Scanner;

public class Q10810 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] z = new int[n]; // n개의 바구니를 나타내기 위한 배열, 바구니 공의 번호

        for (int i = 0; i < m; i++) { // m번의 공을 넣는 과정
            int a = sc.nextInt(); // i번 바구니 ~
            int b = sc.nextInt(); // ~j 번 바구니
            int c = sc.nextInt(); // k번호가 적힌 공 넣음
            for (int k = a - 1; k <= b - 1; k++) { // 인덱스는 0부터 시작이라 -1
                z[k] = c; // 해당하는 바구니 번호에 공 넣음
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " "); // 각 바구니에 들어있는 공 번호 출력
        }
    }
}