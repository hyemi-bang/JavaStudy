
public class B04_Switdh {

	/*
	  #switch-case 문
	  	switch() {
	  		case():
	  			break;}
	  	
	    switch() {
	  		case():
	  			break;
	  		default: if문의 else같은 역할, switch() 안의 값에 해당하는 case가 정의되어 있지 않은 경우 실행
	  			break;}
	  			
	  			
	   -()안의 값에 따라 실행할 코드를 결정하는 문법
	   -()안에 b00lean 타입 값은 실행 할 수 없다.
	   -if 문으로 완벽하게 대체 가능하기 때문에 자주 사용하지는 않는다.
	   - break를 적지 않으면 break를 만날때까지 해당 case보다 밑에 있는 모든 case를 실행한다.
	*/
	
	public static void main(String[] args) {

		int value = 1; 
		switch (value) {
			case 1:
				System.out.println("1일때 출력되는 문장");
				break;
			case 2:
				System.out.println("2일때 출력되는 문장");
				break;
			case 3:
				System.out.println("2일때 출력되는 문장");
				break;
			default:
				System.out.println("위의 참조변수값이 case에 해당하는 값이 없을 때");
				break;
		}
				
		switch (value) { 
			case 1:
				System.out.println("1일때 출력되는 문장");;
			case 2:
				System.out.println("2일때 출력되는 문장");;
			case 3:
				System.out.println("2일때 출력되는 문장");
				break;
			default:
				System.out.println("위의 참조변수값이 case에 해당하는 값이 없을 때");
				break;			
		}
		
		String cmd = "run";
			switch(cmd) {
			case "run":
				System.out.println("실행합니다.");
				break;
			case "help":
				System.out.println("도움말을 출력합니다.");
				break;
			case "cd":
				System.out.println("change directory.");
				break;		
			default:
				System.out.println("그런 커맨드는 없습니다.");
				break;	
		}
		
	}

	}