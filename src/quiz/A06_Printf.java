package quiz;

public class A06_Printf {

	public static void main(String[] args) {
		String star = "*";
		String star1 = "***";
		String star2 = "*****";
		String star3 = "*******";
		String star4 = "*********";
		
		System.out.printf("%s\n",star4);
		System.out.printf("%8s\n",star3);
		System.out.printf("%7s\n",star2);
		System.out.printf("%6s\n",star1);
		System.out.printf("%5s\n",star);  
		
		System.out.println();
		
		String star5 = "*********\n"
				 	 + " *******\n"
					+  "  *****\n"
					+  "   ***\n"
					+  "    *\n";
		
		System.out.printf("%s\n", star5);
		
		

	
		System.out.println();
		char ch = '*';
		System.out.printf("%c%c%c%c%c%c%c%c%c\n", ch, ch, ch, ch, ch, ch, ch, ch, ch);
		System.out.printf("%2c%c%c%c%c%c%c\n", ch, ch, ch, ch, ch, ch, ch);	
		
		// >> 이건 좀 어지러우니 위에 방향으로

	}

}
