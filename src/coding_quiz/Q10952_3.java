package baekjoon_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10952_3 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();

	    String input;
	    while (true) {
	      input = br.readLine();
	      int a = (input.charAt(0) - 48);
	      int b = (input.charAt(2) - 48);

	      if (a == 0 && b == 0) {
	        break;
	      }

	      sb.append(a + b).append("\n");
	    }

	    System.out.println(sb.toString());
	    br.close();
	  }
	}