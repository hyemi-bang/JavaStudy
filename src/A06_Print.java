
public class A06_Print { 
	/*
	  # 함수 : 뒤에 ()가 붙은 것 (쉽게 설명해서, 엄밀히 말하면 자바 안에서 모두 class 안에서 사용 되기 때문에 함수처럼 사용 되는 건 있지만, 함수는 없다.)
	  # 메서드 : 뒤에 ()가 붙고 class 내부에 있는 것 (쉽게 설명해서)
	  
	  # 콘솔 출력하기 위한 메서드들 (함수들)
	    1> print()
	    	- ()안에 전달한 데이터를 콘솔에 출력한다.
	    2> println()
	    	- ()안에 전달한 데이터를 콘솔에 출력하고 줄을 자동으로 바꿔준다.
	    	- 데이터 뒤에 자동으로 \n을 추가하여 출력해준다.
	    3> printf()
	    	- print format
	    	- \n을 자동으로 추가해주지 않으므로 주의
	    	- 원하는 서식을 먼저 설정하고 해당 서식대로 데이터를 출력
	    	
	    	*  서식문자의 종류
	    	 %d : 해당자리에 전달한 정수값을 10진수로 출력 (decimal)
	    	 %o :    " "             8진수로 출력 (octal)
	    	 %x :   " "     		 16진수로 출력 (hexa)
	    	 %X : 	   " "    		 16진수(대문자)로 출력
	    	 %f : 실수 출력
	    	 %s : 문자열 출력
	    	 %c : 문자 출력
	    	 %% : %를 출력하고 싶을 때 (서식문자의 Escape)
	    	 
	    	 * 서식문자 옵션
	    	  - 서식문자의 %+(옵션)+문자
	    	 %숫자d : 숫자만큼 자리수를 확보하면서 출력
	    	 %-숫자d : 숫자만큼 자리수를 확보한 후 왼쪽 정렬하여 출력
	    	 %+숫자d : 부호출력
	    	 %+-숫자d : 부호출력 및 왼쪽 정렬
	    	 %0d : 숫자 앞 자리에 0 추가하여 출력한다.
	    	 %.숫자f : 소수점 자리수를 설정하여 출력
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Hello~");
		System.out.print("Hello~");
		System.out.print("Hello~\n");

		int year = 2023 , month= 9, date = 6, hour =11, minute =15, second =35;
		String ampm ="AM";
		
		System.out.println(year+"년 "+month+"월 "+date+"월 "+date+"일 "+ ampm+" "+hour+":"+minute+":"+second);
		System.out.printf("%d년 %d월 %d일 %s %d:%d:%d\n", year, month, date, ampm, hour, minute, second);
		//%d = 10진수 데시발 자리, 정수값
		//%s = String, 문자열

		double successRate = 60.8;
		
		System.out.printf("%f%%의 확률로 강화에 성공합니다.\n",successRate);
		System.out.printf("%.1f%%의 확률로 강화에 성공합니다.\n",successRate); // .1 소수점 뒤 1자리만
		
		int money = 1234;
		System.out.printf("보유금액 : %d원\n", money);
		System.out.printf("보유금액 : %10d원\n", money); // xxxxxx(6자리)1234(4자리)원
		System.out.printf("보유금액 : %-10d원\n", money); //1234xxxxxx원
		System.out.printf("보유금액 : %+-5d원\n", money);
		System.out.printf("보유금액 : %08d원\n", money); // xxxx1234원 8자리 중 숫자4자리 제외 나머지 자리에 0추가
		
		double dollar = 10.19;
		System.out.printf("remains :%f$\n", dollar);
		System.out.printf("remains :%15.3f$\n", dollar); // 15칸 확보 및 소수점 3자리까지
		System.out.printf("remains :%+-8.1f$\n", dollar); // 8칸 확보 및 + 부호입력 및 왼쪽정렬, 소수점 1자리까지
	}

}
