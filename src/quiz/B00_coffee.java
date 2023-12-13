package quiz;
import java.util.Scanner;
public class B00_coffee {

	public static void main(String[] args) {
		/* 
		   1> 커피 3개의 개수를 입력받고 각 메뉴를 몇잔 시켰는지
		   2> 총 가격은 얼마인지 출력해주는 프로그램을 만들어보세요.		   
		   
		  아메리카노 1600원 , 카페라떼 2700원 , 카페모카 3300원
		*/
		
		int AME_PRICE = 1600;
		int LATTE_PRICE = 2700;
		int MOCA_PRICE = 3300; // 상수설정
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아메리카노 몇 잔 주문하시겠습니까?");
		int americanoCount = sc.nextInt();
							
		System.out.print("카페라떼 몇 잔 주문 하시겠습니까?");		
		int latteCount = sc.nextInt();
		
		System.out.print("카페모카 몇 잔 주문 하시겠습니까?");		
		int mocaCount = sc.nextInt();		
		
		String format = "아메리카노 - %d잔\n" +
						"카페라떼 - %d잔\n" +
						"카페모카 - %d잔\n" +
						"=================\n"+
						"총합\t%d\n";
		
		int totalPrice = americanoCount*AME_PRICE + latteCount*LATTE_PRICE +mocaCount*MOCA_PRICE;						
		System.out.printf(format, americanoCount, latteCount, mocaCount, totalPrice);
	}
}

/*   이건 내가 풀고 .. 값이 안나온것, 콘솔에 2번 이상 출력을 하려면 sc.nextInt를 두번 이상 입력해야한다 생각함
 
 		System.out.print("아메리카노 몇 잔 주문하시겠습니까?");
		int americano = sc.nextInt();
					
		
		System.out.print("카페라떼 몇 잔 주문 하시겠습니까?");		
		int cafelatte = sc.nextInt()+ sc.nextInt();
		
		System.out.print("카페모카 몇 잔 주문 하시겠습니까?");		
		int cafemoca = sc.nextInt()+ sc.nextInt()+ sc.nextInt();		
		

		int total_rate = americano*1600 + cafelatte*2700 + cafemoca*3300;
		System.out.printf("고르신 총 음료수 가격은 %d 원 입니다.", total_rate);
 */


/*  위에 틀린거 고침
 package quiz;

import java.util.Scanner;

public class B00_CoffeeMenu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아메리카노 몇 잔 주문하시겠습니까?");		
		int americano = sc.nextInt();				
		System.out.print("카페라떼 몇 잔 주문 하시겠습니까?");		
		int cafelatte = sc.nextInt();		
		System.out.print("카페모카 몇 잔 주문 하시겠습니까?");		
		int cafemoca = sc.nextInt();		
		

		int total_rate = americano*1600 + cafelatte*2700 + cafemoca*3300;
		System.out.printf("고르신 총 음료수 가격은 %d 원 입니다.", total_rate);
	}
	
	*/
