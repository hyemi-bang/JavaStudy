package quiz;

import myobj.prizeDraw.DrawMachine_T;
import myobj.prizeDraw.Prize;
import myobj.prizeDraw.Prize_T;


public class C11_PrizeDraw {
	
	/*
	 #경품 추첨 프로그램을 만들어보세요
	 
	 1> 각 경품들은 한정된 수량이 있으며 이는 경품마다 다를 수 있다
	 2> 각 경품들이 나올 수 있는 확률이 모두 다르며 수량이 모두 소진된 상품은 더 이상 당첨될 수 없다
	 
	 ※객체지향
	 ※toString()
	 ※equals()
	 
	*/

	public static void main(String[] args) {

		new Prize().Random();
		
		Prize g1 = new Prize();
	
		for(int i =0 ; i < 100; ++i) {
			System.out.println("당첨된 경품: " + g1.Random());		
			System.out.println();
		}
	
		
		DrawMachine_T m = new DrawMachine_T(new Prize_T[] {
				new Prize_T("TV",30,0.05),
				new Prize_T("노트북",10,0.03),
				new Prize_T("iPad",25,0.01),
				new Prize_T("사탕",1000,0.1),
		});
		
		for(int i =0; i < 200; i++) {
			System.out.println(m.draw());
			System.out.println();
		}
		


	}
}
// 공통적인부분 : 경품을 추첨 하여 출력
// 다른부분 : 경품수량, 상품마다 정해진 확률

// 경품들
//class Prize {
//	
//	String name;
//	int amount;
//	
//	
//}

// 추첨하기
//class Draw {
//	
//	public static int getRandomDraw() {
//		
//	}
//}