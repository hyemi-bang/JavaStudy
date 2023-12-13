package myobj.prizeDraw;

public class Draw {
	
	private Prize_T[] prizes;
	private Prize_T[] pickbox = new Prize_T[100];
	
	// 상품 목록 받고 배치 하는 생성자
	public Draw(Prize_T[] prizes) {
		this.prizes = prizes;
		initPickBox();
	}
	
	private void initPickBox() {
		int index = 0;
		for(int i =0 ; i < prizes.length; ++i) {
			double persent = prizes[i].getchance() * 100;
			for(int j = 0; j< persent; ++j) {
				pickbox[index++] = prizes[i];
			}
		}
	}
	
	public Prize_T draw() {
		Prize_T present = pickbox[(int)(Math.random() * 100)];
		
		if(present == null) {
			return new Prize_T("꽝", 0, 0);
		} else {
			if(present.getQty() == 0) {
				return new Prize_T("상품소진", 0, 0);
			}
			present.minusQty();
			return present;
		}
	}

}
