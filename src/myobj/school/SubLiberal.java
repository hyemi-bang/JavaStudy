package myobj.school;

public class SubLiberal extends Subject{
	
	//  2> 문과(la) 학생들은 국어, 영어, 수1, 국사, 윤리, 세계사 6개의 점수가 있다
	int kor;
	int eng;
	int math1;
	int historyKor;
	int ethics;
	int historyWorld;
	
	static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	public SubLiberal() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		historyKor = getRandomScore();
		ethics = getRandomScore();
		historyWorld = getRandomScore();
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 6.0;
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
		return (kor+eng+math1+historyKor+ethics+historyWorld);
	}
	
	public void printScores() {
		System.out.println("국어\t영어\t수학1\t국사\t윤리\t세계사");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n",kor,eng,math1,historyKor,ethics,historyWorld);
	}
	
}
