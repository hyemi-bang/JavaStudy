
public class C05_Static {
	// 앞에 배운거 다 이해했으면 쉬울거래..ㅎ
	
	/*
		Static 정적영역, 클래스 영역 
		
		
		- 인스턴스 영역과 대조되는 개념의 영역
		- 같은 클래스로 만들어진 모든 인스턴스들이 함께 사용하는 공동역역을 의미한다
		-> book영역에 1개의 인스턴스를 만들어서 다른 곳에서 참조하여 사용한다...? 인것 같다....?
		-> 커피 머신 여러개들이 원두 내리는 시점은 다 달라도 똑같은 속도로 원두가 내려진다. 이 속도가 static
		- 앞에 static 이라는 키워드를 붙인 모든 자원(변수, 메서드)들은
		  모든 인스턴스들이 함계 사용하는 공동영역에 있는 자원이 된다.
		- main에도 static이 붙어있고, 이 static은 내가 이 위에 클래스로 아무리 곱하기 100개 천개 곱해내도, 메인은 한개이다.
		  메인은 파일을 실행했을때의 시작지점이고 각 파일당 한개 밖에 없기때문에 유일하게 하나만 존재하는 것이다~
	*/

	public static void main(String[] args) {
		
		// 객체를 100개 담을 수 있는 배열을 생성, 내용은 비어있다.
		Wall[] walls = new Wall[100];
		
		// new로 실체를 만들어 배열에 담아야 한다.
		for (int i =0 ; i < walls.length; ++i) {
			walls[i] = new Wall();
		}
	}

}

class Wall{
	//벽을 여러개 설치할 수 있고, 벽에는 각자의 최대체력, 체력,  위치(좌표 x,y) 방어력  등
	static int maxHp;
	static int hp; // 이 2개는 생성된 모든 벽에서 동일할 값들이다.
	
	int x;
	int y;
	int def; // 각 벽마다 다른 값들을 갖는다.
}



class Fruit{
	static String eatable; // 먹을수 있다 char -> o,x ?
	
	int sugarContent; 
	String name; 
	int price;
	int color;
	String shape;
}





























