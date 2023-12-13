package quiz;

import myobj.school.Student;

public class C09_School_T {

	/*
	 1> 이과(ns) 학생들은 국어, 영어, 수1, 수2, 과학 5개의 점수가 있다 
	 2> 문과(la) 학생들은 국어, 영어, 수1, 국사, 윤리, 세계사 6개의 점수가 있다
	 
	 3> 100명의 학생들을 랜덤으로 생성하여 
	 모든 학생들의 과, 점수, 이름등의 모든 내용이 랜덤으로 생성되고 학생들의 학번은 중복없이 순차적으로 생성되어야 한다
	
	 4> 성적표 출력 메서드를 통해 각 학생의 [학번/이름/과목별점수/총점/평균/등급]을 볼 수 있다
	
	 최대한 객체지향적으로 만들도록
	
	 */
	
	
	public static void main(String[] args) {
		
		
		new Student().printReportCard();
		new Student().printReportCard();
		new Student().printReportCard();
		new Student().printReportCard();
		
	
		

	}

}
