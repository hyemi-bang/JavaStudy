package myobj;

public class getWinRandomNum45 {

	public static int[] getWinNum() {
		int[] winNums = new int[7];
		int i = 0;

		while (i < winNums.length) {
			winNums[i] = (int) (Math.random() * 45 + 1);
			
			int j = 0; 
			boolean duplicate = false; 
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}
		for (i = 0; i < winNums.length; ++i) {
			return winNums;
		}
		return winNums;


	}
	
}
