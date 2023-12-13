package myobj.prizeDraw;

public class DrawMachine_T {

	private Prize_T[] prizes;
	private Prize_T[] pickbox = new Prize_T[100]; // 확률 100%를 만들기 위한 배열

	// 임시 테스트용으로 상품을 배치하는 생성자
	public DrawMachine_T() {
		prizes = new Prize_T[3];

		prizes[0] = new Prize_T("물휴지", 200, 0.5);
		prizes[1] = new Prize_T("초콜렛", 100, 0.15);
		prizes[2] = new Prize_T("비틀즈", 50, 0.10); // 만들어놓은 상품들을 가지고 확률을 만들어야한다.

		initPickBox();
	}

	// 상품 목록을 전달받으면 상품을 배치하는 생성자
	public DrawMachine_T(Prize_T[] prizes) {
		this.prizes = prizes;

		initPickBox();
	}

	private void initPickBox() {

		int index = 0;
		// prizes에 들어있는 상품정보들로 확률을 만들어낸다
		for (int i = 0; i < prizes.length; ++i) {
			double per = prizes[i].getchance() * 100;
			for (int j = 0; j < per; ++j) {
				pickbox[index++] = prizes[i];
			}
		}

	}

	public Prize_T draw() {
		Prize_T present = pickbox[(int) (Math.random() * 100)];

		if (present == null) {
			return new Prize_T("꽝",0,0);
		} else {
			if (present.getQty() == 0) {
				return new Prize_T("상품소진",0,0);
			}
			present.minusQty();
			return present;
		}
	}

}
