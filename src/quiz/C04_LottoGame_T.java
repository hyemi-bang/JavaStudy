package quiz;


import myobj.lotto.LottoGame;

public class C04_LottoGame_T {
	
	public static void main(String[] args) {
		// static은 해당 메서드에서 this라는 개념을 사용할때는 쓰지 않아도 된다
		
		new LottoGame().play(); // import check!!
		
		
//		LottoNumber winNum = new LottoNumber(true); // 사이즈 7개 짜리 배열이 오는것
//		winNum.print();
//		// LottoNumber guessNum = new LottoNumber(false); // 사이즈 6개 짜리 배열이 온다.
//		//guessNum.print();
//		
//	
//		System.out.println();
//		for(int i =0; i < 10; ++i) {
//			LottoNumber guess = new LottoNumber(false); // 사이즈 6개 짜리 배열이 온다.
//			int result = guess.check(winNum); // 이렇게 먼저 사용하겠다 생각하고 check 메소드 만들기
//			
//			winNum.print();
//			guess.print();
//			System.out.println( result + "등 입니다.");
//			
//		}
	}

}
