

public class A01_Escape {
/*
   #Escape 문자
   - \와 합쳐져서 특수한 기능을 하는 문자
 	그냥 사용하기에는 문제가 생기는 문자들을 표현하기 위한 방식
 	두개의 문자로 보이지만 (\', \\, \n...)  이스케이프 문자는 하나로 인식한다.
 */
	public static void main(String[] args) {
		System.out.println("안녕하세요, 반갑습니다~");
		
		System.out.println();
		// \n 줄 바꿈 기능을 가진 이스케이프 문자
		System.out.println("안녕하세요. \n반갑습니다~"); 
		System.out.println("안녕하세요,\n반갑\n습니다~");
		
		System.out.println();
		// \t tab키 기능을 가진 이스케이프 문자
		System.out.println("안녕하세요. \t반갑습니다~");
		System.out.println("나이 :\t"+20);
		System.out.println("평균 점수 :\t"+88.4);
		
		System.out.println();
		// \\ 역슬래시를 출력하고 싶을때 사용 하는 이스케이프 문자
		// \ 출력 원하면 \\, \\ 출력원하면 \\\\ 입력해라.
		System.out.println("C:\\Program Files\\java\\jdk"); // \P 인 이스케이프를 컴퓨터가 찾으려 하는데 그런 이스케이프가 없기때문에 에러메세지가 나온다.
		
		System.out.println();
		 // \" : " 출력하는 기능을 가진 이스케이프 문자
		System.out.println("\"안녕하세요\"");
		String 피자 = "pizza";
		System.out.println("오늘 저녁으로는"+피자+"먹어야 겠다."); // 여기서 피자는 변수가 되는거라 ..  에러가 나오게 된다.
		
		System.out.println();
		// \' : ' 출력하는 기능을 가진 이스케이프
		System.out.println("오늘 야식으로는 \'라면\' 먹고 싶다."); 
		System.out.println("오늘 야식으로는 '라면' 먹고 싶다."); // "" 사이에서의 ''는 문제가 발생하지 않는다.
		System.out.println('D'); // 문자 타입으로 작은 따옴표로 하나를 사용하고자 할때 escape \' 사용해야 한다.

	}
}
