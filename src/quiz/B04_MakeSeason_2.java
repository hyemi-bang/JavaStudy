package quiz;
import java.util.Scanner;

public class B04_MakeSeason_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입려해주세요 :");
		int month =sc.nextInt();
		
		switch(month) {
		case 11, 12, 1, 2 :
			System.out.println("겨울");
			break;
		case 3, 4, 5: // , 찍는것은 옛 버전에서는 사용못할 수도 있음
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9:	case 10:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		if(month<1 || month >12) {
			System.out.println("그런달은 없습니다.");
			} else if (month >=11 || month<=2) {
				System.out.println("겨울입니다.");
			} else if (month >=9) {
				System.out.println("가을입니다.");
			} else if (month >=6) {
				System.out.println("여름입니다.");
			} else 
				System.out.println("봄입니다.");
			}


}
