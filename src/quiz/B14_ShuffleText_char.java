package quiz;

public class B14_ShuffleText_char {
	
	public static void main(String[] args) {
		
		 String input = "banana";
		 char[] chs = new char[input.length()];
		 
		 
		 for(int i =0 ; i <input.length(); ++i) {
			 chs[i] = input.charAt(i);
		 }
		 
		 for(int i=0; i < 100; ++i) {
			 // 문자열의 길이가 6일때 1~6까지 랜덤 인덱스를 생성
			 int ran = (int)(Math.random()*(chs.length-1) +1); 
			 
			 char temp = chs[0]; // 임시로 하나 만들어서 바꿔
			 chs[0] = chs[ran] ; // 랜덤위치의 무언가와 맨 앞의 문자를 바꾼다
			 chs[ran] = temp;
			 // chs[0] = chs[ran] -> temp 만들지 않고 했으면 ran을 0으로 덮어버린거..
		 }
		
		 System.out.println("섞은 후: ");
		 System.out.println(chs);
		 // ↑ char[]만 예외로 주소 대신 문자열이 출력된다.
		 
		// System.out.println(new int[10]);
		 // ↑ 배열은 그냥 출력하면 주소값이 나온다 int[10] 주소값 : [I@cac736f 출력됨.
	}

	
}
