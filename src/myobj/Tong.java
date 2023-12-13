package myobj;

import java.util.Scanner;

public class Tong {
	static int[] Halls;



//	// 20개의 랜덤 구멍을 갖고 있다
//	public static int getRandomHalls() {
//		return (int) (Math.random() *totalHalls + 1);
//	}

	// 고정되어 있는 꽝의자리 4개
	public int[] fixedLoseNumbers() {
	    int totalHalls = 20; // 전체 구멍 수
	    int fixedlosing = 4; // 고정된 탈락 숫자의 개수

	    int[] fixedLoseNum = new int[fixedlosing];
	    for (int i = 0; i < fixedlosing; i++) {
	        fixedLoseNum[i] = (int) (Math.random() * totalHalls + 1);
	        System.out.printf("고정되어있는 발사 자리 : %d \n", fixedLoseNum[i]);
	    }

	    return fixedLoseNum;
	}
	
//	public int[] fixed() {
//		int totalHalls = 20; // 전체 구멍 수
//		int Fixedlosing = 4; // 고정된 탈락 숫자의 개수
//
//		int[] fixedLoseNum = new int[Fixedlosing];
//		for (int i = 0; i < Fixedlosing; i++) {
//			fixedLoseNum[i] = getRandomHalls();
//		}
//
//		halls = new int[totalHalls];
//		int Index = 0;
//
//		while (Index < totalHalls) {
//			int randomHole = getRandomHalls();
//			boolean isDuplicate = false;
//
//			// 생성한 숫자가 이미 고정된 탈락 숫자 중 하나인지 확인하고 내보내기
//			for (int i = 0; i < Fixedlosing; i++) {
//				if (randomHole == fixedLoseNum[i]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//		}
//		return null;
//	}

	// 아저씨가 발사되면 몇 번 만에 발사되었는지 알려주는 메세지가 나온다
	
    public static void info(int result) {
        System.out.println("총 " + result + "번 만에 통 아저씨가 발사되었습니다.");
    }

    
	// 중복없는 구멍중에 4개만 선택해서 꽝 / 통아저씨가 발사되었습니다.
	// 입력한 숫자와 탈락번호를 비교한다 @_@
	 public int getFireTong(int userInput, int[] fixedLoseNum) {
	        for (int i = 0; i < fixedLoseNum.length; i++) {
	            if (userInput == fixedLoseNum[i]) {
	                System.out.println("통 아저씨가 발사되었습니다.");
	                return 1; // 일치하면 1 반환
	            }
	        }
	        return 0; // 일치하지 않으면 0 반환
	    }



	public void play() {
	    System.out.println("통 아저씨가 발사되면 종료되는 게임입니다.");
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int[] fixedLoseNum = fixedLoseNumbers(); // 탈락 숫자 생성
    
        int attempts = 0; // 시도 횟수를 저장하는 변수
	    
	 
        while (true) {
	        System.out.print("구멍을 선택하세요 (1에서 20 사이의 숫자): ");
	        int userInput = sc.nextInt();
	        
	        // 입력된 숫자가 범위를 벗어나면 다시 입력 요청
	        while (userInput < 1 || userInput > 20) {
	            System.out.println("잘못 입력했습니다. 1에서 20 사이의 숫자를 입력하세요.");
	            userInput = sc.nextInt();
	        }
	        
	        int result = getFireTong(userInput, fixedLoseNum); // 게임 진행
            attempts++;

            if (result == 1) {
                System.out.println("게임을 종료합니다");
                info(attempts); // 시도 횟수 출력
                break; // 일치하는 탈락번호가 있으면 게임 종료
            }
        }
    }


//	public void play() {
//		System.out.println("통 아저씨가 발사되면 종료되는 게임입니다.");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// 플레이어는 아저씨가 발사될 때까지 계속 자리를 선택한다
//		
//		 int[] userInputs = fixed(); 
//		 userInputs[i] = sc.nextInt();
//
//		 System.out.print("구멍을 선택하세요 (1에서 20 사이의 숫자): ");  
//
//        int result = getFireTong(userInputs);
//        info(result);
//        
//    }
	
}





