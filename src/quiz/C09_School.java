package quiz;

import java.util.Random;

public class C09_School {

	/*
	 1> 이과(ns) 학생들은 국어, 영어, 수1, 수2, 과학 5개의 점수가 있다 
	 2> 문과(la) 학생들은 국어, 영어, 수1, 국사, 윤리, 세계사 6개의 점수가 있다
	 
	 3> 100명의 학생들을 랜덤으로 생성하여 
	 모든 학생들의 과, 점수, 이름등의 모든 내용이 랜덤으로 생성되고 학생들의 학번은 중복없이 순차적으로 생성되어야 한다
	
	 4> 성적표 출력 메서드를 통해 각 학생의 [학번/이름/과목별점수/총점/평균/등급]을 볼 수 있다
	
	 최대한 객체지향적으로 만들도록
	
	 */

	final static String[] Major = { "문과 liberal arts", "이과 natural sciences" };
	final static String[] Subject_NS = { "국어", "영어", "수1", "수2", "과학" };
	final static String[] Subject_LA = { "국어", "영어", "수1", "국사", "윤리", "세계사" };
	
	
	public static void main(String[] args) {

		Random ran = new Random();
		// 이름랜덤생성

		// 학생 100명 저 이름이랑 연결시키고, 학번도 만들어내고, 학과도 만들어내고 @_@
		final int NUMBER_OF_STUDENTS = 100;

		Student[] students = new Student[NUMBER_OF_STUDENTS];

		for (int i = 0; 1 <= NUMBER_OF_STUDENTS; i++) {
			int studentNumber;
			studentNumber = (int) (Math.random() * 1000 + 1);
			String name = generateRandomName() + (i + 1); 
		}
	}

	static String generateRandomName() {
		final String nameStr = "가나다라마바사아자차카타파하" 
					+ "기역니은디귿시옷비읍지읏치티긑피읍" 
					+ "김나박이최동헌철혜은영화정훈현미혁";

		String tempName = " ";
		for (int i = 0; i < 2; ++i) {
			tempName += nameStr.charAt((int) (Math.random() * nameStr.length()));
		}
		return tempName.toString();
	}


class Student {
	int studentNumber;
	String name;
	String subject;
	String subjectScore;
	int total;
	double average;
	char grade;
	String major;
	
	
	 public Student(int studentNumber) {
	        this.studentNumber = studentNumber;
	 }
	 
	 void subjectScore(){
		 int kor = (int)(Math.random()*100);
		 int eng= (int)(Math.random()*100);
		 int math1= (int)(Math.random()*100);
		 int math2= (int)(Math.random()*100);
		 int science= (int)(Math.random()*100);
		 int ethics= (int)(Math.random()*100); //윤리
		 int historyofKor= (int)(Math.random()*100);
		 int worldHistory= (int)(Math.random()*100);
		 
		   
	 }
	 public String reportCard() {
		 
		 return "학번: " + studentNumber +
	            "\n이름: " + name +
	            "\n과목별 점수: " + subjectScore +
	            "\n총점: " + total +
	            "\n평균: " + average +
	            "\n등급: " + grade +
	            "\n학과: " + major +
	            "\n----------------------";
	    }
	 
	 public char calculateGrade() {
	        if (average >= 90) {
	            return 'A';
	        } else if (average >= 80) {
	            return 'B';
	        } else if (average >= 70) {
	            return 'C';
	        } else if (average >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }
}
}
	 
//	 void subjectScore(int num) { // 0~100점
//		 
//		 for(int i =0; i <= 1;  ++i) {
//			 num = (int)(Math.random() * 100);
//		 }
//		 System.out.println(num);
//		 
//	 }
