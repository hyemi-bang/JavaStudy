package quiz;

public class D08_FindAll {
	
	public static void findOccurrence(String text, char find) {
		
		//"".indexOf(str) : 문자열에서 찾고자 하는 문자열의 위치를 찾아 반환
		// text.indexOf(find) >> text에서 find를 찾아 반환 해서 index에 넣어라		
//		int index = text.indexOf(find);
		int foundIndex = -1;
		// index가 0보다 크거나 같으면 출력해라, 0보다 크면 0번 인덱스에 있는 문자가 나올수 없음으로 이후에도 진행되지 않음
//		while(index >= 0) { // 내가 푼것
		int i = 0;
		while((foundIndex = text.indexOf(find,foundIndex +1)) != -1) { // 선생님 해설
		//while(index != -1) 
			System.out.printf("%d번째 %c의 위치 : %d\n", ++i , find, foundIndex); // 선생님해설
//			System.out.println("찾는 문자의 위치 : " + index); // 내가 푼것
//			index = text.indexOf(find, index+1);
			// indexOf(String str, int fromIndex);
			// fromIndex : 검색을 시작할 인덱스
			// index++; 무한루프에 빠지는데, 이 indexOf 오버라이드 사용하여 fromIndex에 필요한 재료를 넣어~
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String text = "apple/banana/orange/podo/gyul/pineapple/watermelon";
		
		// text 문자열과 찾을 문자를 전달하면 해당 문자의 모든 위치를 출력해주는 메서드를 만들어보세요.(indexOf()를 사용)
		
		findOccurrence(text,'a');
	}

}
