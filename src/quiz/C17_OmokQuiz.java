package quiz;

import myobj.omok.Handler;
import myobj.omok.Board;
import myobj.omok.Players;

public class C17_OmokQuiz {
	
	public static void main(String[] args) {
	
		
		//  String[][] omok = new String[15][15];
		
		 String[][] omok = {
		            // Omok board initialization
		            { "  ", "A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J ", "K ", "L ", "M ", "N ", "O " },
		            { "A", "┌ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┬ ", "┐" },
		            { "B", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "C", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "D", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "E", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "F", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "G", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "H", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "I", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "J", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "K", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "L", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "M", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "N", "├ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┿ ", "┤" },
		            { "O", "└ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┴ ", "┘" }
		        };
		 Board omokBoard = new Board(omok);
		 Players player1 = new Players();
		 Players player2 = new Players(player1.getstoneSymbol());
		 
		 Handler handler = new Handler(omokBoard, player1, player2);
		 handler.play();
		   
		    }
		}