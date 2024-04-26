package baekjoon_ac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10952 {
	/*
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	입력의 마지막에는 0 두 개가 들어온다.
	입력   출력
	1 1 => 2
	2 3 => 5
	9 8 => 17
	0 0 
	*/

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));) {

			while (true) {
				String[] input = in.readLine().split(" ");

				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);

				if (a == 0 && b == 0) {
					break;
				}
				int sum = a + b;

				out.write(sum + "\n");
			}
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}