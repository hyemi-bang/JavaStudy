package quiz;

public class B12_Count369_T {
	
	/*
	100 ~ 500 랜덤 양의 정수를 하나 생성하고
	해당 숫자까지 369를 진행한다면 박수를 총 몇번 쳐야하는지 출력해보세요
	
	*/

	public static void main(String[] args) {
		
		int ran =(int)(Math.random() * 401 + 100);
		int clapCount = 0;
	
		
		for(int i = 1 ; i <= ran; ++i) {
			System.out.print(i + " ");
			
			// 1. 숫자를 문자열로 바꿔서 센다
			
			String numStr = "" + i; // int를 문자열로 바꾸는 방법
			
			for(int j = 0; j <numStr.length(); ++j) {
				char ch = numStr.charAt(j);
				
				if(ch == '3' || ch == '6' || ch =='9') {
					System.out.print("짝");
					++clapCount;
				}
			}
			// 2. 숫자를 한자리씩 검사하여 3/6/9 인지 센다
			
			int chkNum = i;
			boolean clapped = false; // 박수를 칠때만 보이게 하고 싶다면
					
			// 이번에 검사할 숫자를 10씩 나누면서 일의 자리만 검사하기
			while (chkNum > 0) {
				int digit = chkNum % 10;
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("짝");
					++clapCount;     
					clapped = true;
				}
				chkNum /= 10;
			}
			if (clapped) {
				System.out.print("\t - 누적" + clapCount + "회");
			}
			System.out.println();
		}
		System.out.printf("박수 횟수는 %d회 입니다. \n", clapCount);
	}

}
