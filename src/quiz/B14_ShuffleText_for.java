package quiz;


import java.util.Arrays;
import java.util.Scanner;

public class B14_ShuffleText_for {

	// 사용자로부터 문자열을 입력받으면 해당 단어를 랜덤으로 섞어주는 프로그램을 만들어보세요.

	// string 문자열을 받아
	// 문자열을 하나씩 꺼내서 ->  중복 없는지 체크한 후에 랜덤으로 골라서 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요: ");
        String message = sc.nextLine();
        
        // 문자열 번호를 중복없는 랜덤 순서를 생성
        
        int len = message.length();
        int[] ranIndex = new int[len];
        for(int i =0; i < len; ++i) {
        	ranIndex[i] =(int) (Math.random() * len);
        	
        	// 이번에 뽑은 번호가 이전 번호중에 있는지, 중복 검사
        	for(int j =0 ; j < i ;++j) {
        		if(ranIndex[i] == ranIndex[j]) {
        			--i; // 감소시켜서 다시 i를 뽑아라
        			break;
        		}
        	}
        }
     // 원래 문자열에서 랜덤으로 섞은거 하나씩 출력해라
        for(int i = 0; i < ranIndex.length; ++i) { 
        	System.out.print(message.charAt(ranIndex[i])); 
        }
              
	}

}
