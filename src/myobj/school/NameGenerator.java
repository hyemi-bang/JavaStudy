package myobj.school;

public class NameGenerator {
	// 이름을 생성하기 위한
	// 기능이 항상 일정하기떄문에 인스턴스가 필요없음으로 static

	static String[] lastNames = { "김", "이", "장", "박", "최", "송", "우", "동", "조", "유", "양", "배", "강", "권" };
	static String[] firstNames = { "철수", "민수", "민희", "영희", "솔이", "송이", "지호", "주현", "도연", "현경", "윤재", "태수" };

	public static String getRandomName() {
		return lastNames[(int) (Math.random() * lastNames.length)]
				+ firstNames[(int) (Math.random() * firstNames.length)];
	}
}
