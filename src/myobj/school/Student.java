package myobj.school;

public class Student {
	
	String name;
	String s_id; //  학번 각자가 가지고 있는 값 인스턴스 변수
	static int s_count = 0; // 모두가 함께 사용하는값, 스태틱변수
	
	Subject subject; // 과목이라는 클래스 생성 하러 ㄱㄱ
	
	// 기본생성자로 학생을 만들면 랜덤으로 만들어줄 예정이다.
	public Student() {
		name = NameGenerator.getRandomName(); // 이름을 어디선가 받아오고 싶다는 마음으로 설정 후 새로운 클래스 만들어	
		s_id = "EZEN" + String.format("%08d", s_count++); // 이름 하나씩 만들때마다 더하면, 최종 몇명인지 알게되겠지
			// String.format() 문자열을 만들어주는 printf 같은 녀석
			// printf는 콘솔에 출력하지만,
			// String.format()은 해당 형식의 문자열을 사용할수 있게 반환해준다.
		
//		while (true) {
//			
//		}
		// (department.equals("ns")) ? SUBJECTS_NS : SUBJECTS_LA;
		
		int sub;
		//for(int i =0 ; i <2; i++) {
			sub = (int)(Math.random()*2);
			if(sub == 0) {
				subject = new SubScience();				
			} else {
				subject = new SubLiberal();
			}
		//}
	}
	
	public void printReportCard () {
		
		System.out.println();
		System.out.println(name +"의 성적표 출력[ "+s_id+" ]");
		System.out.println("총점: " + subject.getTotal());
		System.out.printf("평균: %.2f\n" , subject.getAvg());
		System.out.printf("등급: %s\n" , subject.getGrade());
		subject.printScores();
		System.out.println();
	}

}
