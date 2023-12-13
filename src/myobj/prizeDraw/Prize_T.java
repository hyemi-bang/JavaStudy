package myobj.prizeDraw;

public class Prize_T {
	
	String name;
	int qty;
	double chance;
	
	public Prize_T(String name, int qty, double chance) {
		this.name = name;
		this.chance = chance;
		this.qty = qty;
	}
	
	//Getter, get필드명() : 해당 필드값을 꺼내주는 메서드
	public String getName() {
		return name;
	}
	public double getchance() {
		return chance;
	}
	
	public int getQty() {
		return qty;
	}
	
	// 이런만들어둔 여러개의 상품들을 가져다가 사용할 클래스를 만들어야한다~  >> DrawMachine_T
	
	public void minusQty() {
		--qty;
	}
	
//	@Override
//	public String toString() {
//		return String.format("[%s/남은수량:%d/확률%.2f]", name, qty, chance);
//	}
	
	

}
