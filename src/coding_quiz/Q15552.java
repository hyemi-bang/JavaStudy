package baekjoon_ac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
BufferedReader와 BufferedWriter 사용 BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
*/
public class Q15552 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader를 사용하여 입력을 읽습니다.
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine()); 
		// Read the number of test cases 테스트 케이스의 수 T를 읽습니다.
		
		for(int i = 0; i<T; i++) {
			//for 루프를 사용하여 T번 반복. 각 반복에서는 두 개의 정수 A와 B를 공백을 기준으로 읽어들입니다.
			String[] input = in.readLine().split(" "); // 두 개의 정수를 문자열로 받는다
			int a = Integer.parseInt(input[0]); // 첫번째 정수
			int b = Integer.parseInt(input[1]); 
			
			int sum = a + b ; 
			out.write(sum + "\n"); 
		}
		out.flush();  // 모든 테스트 케이스에 대한 처리가 끝나면 출력 버퍼를 비워서(Flush) 결과를 표준 출력에 출력
	}

}
