
public class C06_StaticMethod {
	
	
	/*
		# 인스턴스 변수 (필드, 멤버변수, 속성 등)
		 - 각 인스턴스 마다 다른 값을 가질 수 있는 변수
		 - 인스턴스 변수는 인스턴스가 생성되었을때 사용할 수 있다. ( 인스턴스가 생기기 전에 사용 할 수 없다 )
		 - new를통해 인스턴스 생성 가능
		 
		# 인스턴스 메서드
		 - static이 붙지 않은 메서드
		 - 인스턴스 변수를 활용하여 각 인스턴스마다 다른 결과를 도출해 낼 수 있는 메서드
		 - 인스턴스 변수를 활용해야 하기 때문에 인스턴스가 없이는 사용 할 수 없다.
		 
		# 스태틱 변수 (클래스 변수)
		 - 모든 인스턴스에서 함께 사용 할 수 있는 변수
		 - 한 클래스에 하나밖에 없다
		 - 인스턴스가 아직 존재하지 않는 때에도 사용할 수 있다.
		 - 클래스에 딸려 있는 값이기 때문에 클래스 이름에 .을 찍고 사용할 수 있다.  (인스턴스 . 찍고 사용 해도 가능하지만, 어차피 한개의 값이기 때문에..)
		 - 해당 클래스의 인스턴스가 하나도 없는 상황에서도 사용할 수 있다.
		
		# 스태틱 메서드
		- 스태틱 변수만 활용 할 수 있는 메서드
		- 인스턴스 변수는 사용 할 수 없다.
		-> 스태틱을 활용하는 시점에 인스턴스가 하나도 없을 수 있고, 이치에 맞지 않다~
		- 스태틱 변수만 활용하기 때문에 모든 인스턴스에서 같은 결과가 나온다.
		- 해당 클래스의 인스턴스가 하나도 없는 상황에서도 사용할 수 있다.
	*/

	public static void main(String[] args) {
		Card.width = 90; // 스태틱변수/ static 자원들은 인스턴스가 생기기 전에도 충분히 값을 넣어 사용 할 수 있다.
		Card.heigth = 180;
		
		Card c1 = new Card ('◇', 10);
		Card c2 = new Card ('♧', 7);
		
		c1.shape = '♣'; // c1.shape만  ◇ -> ♣ 모양이 바뀌었다.		
		//c1.width = 80; // 원래 100이었고, c1, c2모두 출력 100으로 나왔었는데, c1.width의 너비를 80으로 바꾸니 모든 출력이 80으로 바뀌었다.
		System.out.printf("%c %d \n", c1.shape, c1.num);
		System.out.printf("c1의 너비: %d\n", c1.width);
		System.out.printf("c1의 높이: %d\n", c1.heigth);
		System.out.printf("%c %d \n", c2.shape, c2.num);
		System.out.printf("c2의 너비: %d\n", c2.width);
		System.out.printf("c2의 높이: %d\n", c2.heigth);
		
		
	}

}

class Card {
	static int width = 100;// 너비
	static int heigth = 200; // 높이 이 둘은 모든 카드들에서 같아야 한다.
	
	// 인스턴스 변수들 
	char shape; // ♧ ♡ ♤ ◇ 이런 모양들이 있다
	int num; // A ~ K
	
	public Card(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	// 카드에 면적을 구하는 메서드
	public static int getAreaSize() {  // static를 사용하지 않으면 모든 인스턴스에서 동일한 값을 사용하는 것이고, 인스턴스마다 면적을 구하는게 또 생기는 거라 메모리낭비 
		return width * heigth; // 같은 동작을 진행하지만, 다른 결과를 낼 수 있다.?
	}
}
