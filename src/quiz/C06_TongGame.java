package quiz;
import java.util.Scanner;

import myobj.TongGame.TongGame;

public class C06_TongGame {
	
	/*
	 	통 아저씨 게임만들기
	 	
	 	1> 게임이 시작되면 꽝의 자리가 정해진다
	 	2> 플레이어는 아저씨가 발사될 때까지 계속 자리를 선택한다
	 	3> 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
	 		 1. 폭탄인 경우 (지르면 발사됨)
	 		 2. 폭탄이 아닌 일반 구멍인 경우 (찌르면 다음판으로 넘어감)
	 		 3. 찔렀던 구멍인 경우 (다시 찌를 수 없음)
	 		 
	 	boolean[] holes = {true , false, true, false}; 
	 	>> 폭탄이니 아니니 확인은 가능하지만, 중복을 확인 할 수 없으니 byte 로 0(멀쩡구멍),1(폭탄),2(이미찌른구멍)로 상태를 확인 하는게 죻을 듯 하다
	 	int로 하기에는 너무 용량 크니까 byte 정도로 하는게 좋겠다~
	 		 
	 	4> 아저씨가 발사되면 몇 번 만에 발사되었는지 알려주는 메세지가 나온다
	 	
	 	++> 클래스 나눠서 진행하기
	 
	 */

	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Tong game = new Tong();
//		game.play();
		
		while(true) { // 한번 게임이 끝나면 다시 시작되도록
			
			TongGame g1 = new TongGame();
			g1.play();
			
			System.out.println("더 하시겠습니다? (Y/N)");
			
			if(sc.next().charAt(0) == 'N') {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}


}



