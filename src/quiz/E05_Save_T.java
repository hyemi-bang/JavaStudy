package quiz;

import myobj.rps.RockScissorsPaperGame;

public class E05_Save_T {
	
	public static void main(String[] args) {	
		RockScissorsPaperGame game = new RockScissorsPaperGame();
		
		for(int i = 0 ; i < 10; ++i) {
			game.fight(RockScissorsPaperGame.Rock); // scanner입력받아야하는데 일단 그냥 돌린다
		}
		
		game.save();
	}

}
