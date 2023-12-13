package myobj.omok;

import java.util.Scanner;

public class Players {

	
	private String stoneSymbol;
	// '○', '●'
	
	public Players() {
		Scanner sc = new Scanner(System.in);
		System.out.println("돌을 선택하세요. (○ 또는 ●)");
		String userChoice = sc.nextLine();
		
		while(!userChoice.equals("●") &&!userChoice.equals("○")) {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			userChoice = sc.nextLine();
		}
		userChoice = stoneSymbol;
		
	}
	
	public Players(String stoneSymbol) {
		this.stoneSymbol = stoneSymbol;
	}
	
	public void settingstoneSymbol() {
		if(stoneSymbol.equals("●")) {
			stoneSymbol = "●";
		} else {
			stoneSymbol = "○";
		}
	}
	
	public String getstoneSymbol() {
		return stoneSymbol;
	}
	

}
