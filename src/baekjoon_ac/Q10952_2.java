package baekjoon_ac;

import java.io.IOException;


public class Q10952_2 {

	 public static void main(String[] args) throws IOException {
	        StringBuilder sb = new StringBuilder();

	        int sum;
	        while ((sum = sumUntilNextLine()) != 0) {
	            sb.append(sum).append('\n');
	        }
	        System.out.print(sb.toString());
	    }

	    public static int sumUntilNextLine() throws IOException {
	        int sum = 0;
	        int tmp;
	        while ((tmp = System.in.read()) != '\n') {
	            if (tmp == ' ') continue;
	            else sum += tmp & 15;
	        }

	        return sum;
	    }
	}
	/*
	 sumUntilNextLine() 메서드는 입력 스트림에서 숫자들을 읽어와 합을 계산하는 역할.
	 System.in.read() 메서드는 입력 스트림에서 한 바이트씩 읽어오며, 
	 개행문자 ('\n')이 나오면 읽기를 멈춘다.
	 이 메서드는 입력 스트림에서 개행문자가 나올때까지 숫자를 읽어와서 합을 계산하고 개행문자를 만나면 계산된 합을 반환한다
	 
	 메인메서드에서 sumUntilNextLine() 호출해서 반환된 합이 0이 아니면 이를 StringBuilder에 추가한 후 개행문자를 붙여
	 입력이 끝나면 저장된 문자열을 출력한다
	 
	 개행문자나 공백문자를 기준으로 하나씩 처리되기떄문에, 입력이 끝나는 시점을 판단할 수 있고
	 입력이 끝나면 0이 입력되서 이를 기준으로 프로그램 종료한다.
	 
	 -- 근데 좀 오류가 있는 로직 같음 멈추질 않는다.. 
*/
