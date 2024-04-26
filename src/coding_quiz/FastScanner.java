package baekjoon_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastScanner {

	public static void main(String[] args) {
		// 스캐너 같은 아이, 한줄씩 받는 아이
		BufferedReader in =
				new BufferedReader(
						new InputStreamReader(System.in));
		
		try {
			System.out.print("입력해보세요 : ");
			String line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
