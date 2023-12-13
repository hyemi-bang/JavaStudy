package myobj.clap;

import java.util.Scanner;

public class ClapGamePlayer {
	
	String name;
	
	public ClapGamePlayer(String name) { // 플레이어 이름 만들기
		this.name = name;
	}
	
	public String getName() {
		return name; // 	String name;의 이름을 알때 리턴해주는 것
	}
	
	public String auto(String answerStr) {
		// 정답을 받아서 확률적으로 알맞은 정답을 생성해준다 (90%정답, 10%오답)
		
		int ran = (int)(Math.random() * 10); 
		// 75%는 4분의 3 임으로, 랜덤숫자 4개를 뽑아서 1개만 오답으로 내면됨 근데 너무 컴퓨터가 못해서 랠리를 하기 위해 확률을 올림
		if(ran == 0) {
			return "으앗!"; // 오답을 출력~
		} else {
			return answerStr; // 정답을 그대로 출력해라
		}
		
	
	}
	
	public String manual(Scanner sc) {
		// 전달받은 스캐너로 직접 정답을 입력해서 리턴하기
		
		return sc.nextLine();
	}
	

}
