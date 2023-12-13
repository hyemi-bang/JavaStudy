package baekjoon_ac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11022_2 {

	public static void main(String[] args) {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int T = Integer.parseInt(in.readLine()); // 테스트 케이스의 개수를 읽음

            for (int i = 1; i <= T; i++) {
                String[] input = in.readLine().split(" ");
                int A = Integer.parseInt(input[0]); 
                int B = Integer.parseInt(input[1]); 

                int sum = A + B; 

                // 결과 출력
                out.write("Case #" + i + ": " + A + " + " + B + " = " + sum + "\n");
            }
            out.flush(); // 출력 버퍼 비우기
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}