
public class B08_Break {
	/*
	 # break
	 - switch_case문 내에서 사용해 해당 case를 탈출한다.
	 - 반복문 내부에서 사용하면 해당 반목문 하나만 탈출한다.
	 - if문 내부에서 사용한다고 해서 if문을 탈출하지는 않는다.
	   (for문 안에 if문을 돌고 있다면 for문을 탈출하는 것이지, if문을 탈출한것이 아니다.)
	    
	 # continue
	 - 반복문 내부에서 만나면 다음번 반복으로 넘어간다.
	 
	*/
	
	public static void main(String[] args) {

		// ex1>
		for (int i = 0; i < 100; ++i) {
			System.out.println("hello" + i + "!");
			if (i == 3) {
				break; // i=='A'-> hello65! 출력 후 탈출
			}
		}

		// ex2>
		String str = "정은 북한 국무위원장과 블라디미르 푸틴 러시아 대통령의" + "만남의 장소로 러시아 우주기지와 전투기 공장이 유력해지면서"
				+ "이번 정상회담이 양국 군사 협력 확대·강화로 이어질 것이라는 우려가 증폭되고 있다.";

		for (int index = 0; index < str.length(); ++index) {
			char ch = str.charAt(index);
			// System.out.printf("%d번째 문자는 \"%c\"입니다. \n", index, ch);
			System.out.print(ch); // 정은 북한 국무위원장과 블라디미르 푸틴 러시아 대통령의
			if (ch == '의') {
				break;
			}
		}System.out.println();

		// continue ex1>
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			System.out.print(ch);
			if (ch == '의') {
				System.out.println(); // 문장을 쭉 읽다가 의를 만나면 한줄씩 산출
				//정은 북한 국무위원장과 블라디미르 푸틴 러시아 대통령의
				//만남의
			}
		}System.out.println();
		for (int i = 0; i < 100; ++i) {
			if (i % 2 == 0) {
				continue; //짝수가 컨티뉴를 만나면 ++i로 넘어가 , 짝수가 출력되지 않는다.
			}
			System.out.print(i);
		}

	}

}
