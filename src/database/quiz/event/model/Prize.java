package database.quiz.event.model;

public class Prize {
	// 데이터를 저장하기 위한 프라이즈 타입
	
	int prize_id;
	String prize_name;
	double prize_rate;
	int remain_qty;
	int init_qty;
	
	// 데이터 담아놓는 데이터 클래스 
	public Prize(int prize_id, String prize_name, double prize_rate, int remain_qty, int init_qty) {
		this.init_qty = init_qty;
		this.prize_id = prize_id;
		this.prize_name = prize_name;
		this.prize_rate = prize_rate;
		this.remain_qty = remain_qty;
	}
	
	public int getInit_qty() {
		return init_qty;
	}
	
	public String getPrize_name() {
		return prize_name;
	}

	public int getPrize_id() {
		return prize_id;
	}

	public double getPrize_rate() {
		return prize_rate;
	}

	public int getRemain_qty() {
		return remain_qty;
	}
// this.re~~ 마우스 우클릭 >  Source -> Generate Getters and Setters > 
// 각 필드에 대한 getter 또는 setter를 자동생성 할 수 있다.(이클립스의 기능)
	
	//수량을 수정
	public void setRemain_qty(int remain_qty) {
		this.remain_qty = remain_qty;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%d개 남음]", prize_name, remain_qty);
	}
}
