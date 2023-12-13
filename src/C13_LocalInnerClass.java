import myobj.school.SubLiberal;
import myobj.school.SubScience;
import myobj.school.Subject;

public class C13_LocalInnerClass {
	/*
		# LocalInnerClass, 지역 내부 클래스
		
		- 클래스 메서드 내부(local)에서도 선언할 수 있다.
		- 해당 메서드 밖에서는 사용할 수 없는 일시적인 클래스가 된다.
		
		# 익명 지역 내부 클래스
		
		- 지역에서 클래스를 바로 상속받아 사용하는 방식
		-클래스 이름을 지정할 수 없기 때문에 익명 클래스라고 부른다.
		
	*/


	public static void main(String[] args) {
		
		// Apple a = new Apple();
		// 클래스를 내부에 만들어두면, 클래스 위에서는 사용 할 수 없다.
		class Apple{
			String color;
			int sweet;
			int price;
		}
		
		Apple a = new Apple();
		System.out.println(a.color);
		
		//익명 클래스
		Subject s1 = new Subject();
		Subject s2 = new SubScience(); // 업캐스팅
		// 클래스를 만듦과 동시에 상속을 받는 것
		// 컴퓨터 과목의 성적표라고 이름을 저장할 수 없는 익명클래스다
		// 이름을 알 수 없기 때문에 일회용이다.
		
		Subject s3 = new Subject() {
			
			int c = 80 ;
			int java = 90;
			
			@Override
			public int getTotal() {
				// TODO Auto-generated method stub
				return (c + java);
			}
			@Override
			public void printScores() {
				System.out.println("컴퓨터 과목의 성적표 출력 메서드 입니다.");
			}
		}; 
		
		s2.printScores();
		s3.printScores();
		System.out.println(s3.getTotal() + "점 입니다.");
		
		// SubLiberal 클래스를 상속받은 무엇인가의(익명) 인스턴스가 된것이다.
		// 무언가 > 문과클래스 > 서브젝트 클래스 > 오브젝트
		Subject s4 = new SubLiberal() {
			@Override
			public void printScores() {
				System.out.println("문학의 가치는 점수를 매길 수 없다");
			}
		};
		
		s4.printScores();

	}

}
