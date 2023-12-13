package myobj.school;

public class SubScience extends Subject {
	
	// 1> 이과(ns) 학생들은 국어, 영어, 수1, 수2, 과학 5개의 점수가 있다 
	int kor;
	int eng;
	int math1;
	int math2;
	int science;
	
	static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	
	// 기본생성자로 만들면 과목 점수를 랜덤으로 채워준다.
	public SubScience() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		math2 = getRandomScore();
		science = getRandomScore();
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0 ;
	}
	
	@Override
	public String getGrade() {
		double avg = getAvg();
		
		if(avg >= 90) {
			return "A";
		} else if(avg >=80) {
			return "B";
		} else if(avg >=70) {
			return "C";
		} else if(avg >=60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	@Override
	public int getTotal() {
		return (kor+eng+math1+math2+science);
	}
	
	public void printScores() {
		System.out.println("국어\t영어\t수학1\t수학2\t과학");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t\n",kor,eng,math1,math2,science);
	}

}
