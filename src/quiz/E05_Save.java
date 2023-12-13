package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E05_Save {
	
	/*
	
		컴퓨터와 진행하는 가위바위보 게임 만든 후 
		프로그램 종료시 전작을 파일에 저장하고 프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어서 예전 전적이 그대로 이어지도록 만들어보세요
	*/
	
	// 파일에 숫자 3개만 저장하면 된다 x승,x무,x패
	// 필요한 것 : 기록이 저장되어있는 파일, 게임 플레이 , 기록을 저장할 파일
	// 승패 내역을 프로그램 끄면 저장하고, 키면 다시 가져왕

	private static final String fileName = "myfiles/RockScissorsPaper.txt";
	// 파일이 있다고 가정하고 게임을 만들고, 결과를 이 파일에 최종 저장하고 계속 불러왔다 저장했다 하기

	public static void main(String[] args) {

		int win = 0;
		int draw = 0;
		int lose = 0;

		// 이전의 게임 결과 저장된 것
		
		try {
			FileInputStream in = new FileInputStream(fileName);
			byte[] allBytes = in.readAllBytes();
			//byte배열을 String으로 
			String result = new String(allBytes);
			String[] resultArrays = result.split(" "); 
			
			// 파일에서 읽어온 문자열 값을 정수로 변환하려면 Integer.parseInt() 메서드
			win = Integer.parseInt(resultArrays[0]);
			draw =Integer.parseInt(resultArrays[1]);
			lose =Integer.parseInt(resultArrays[2]);
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로를 찾을 수 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("이전 게임 결과: %s승 %s무 %s패\n", win, draw, lose);
	
		
		// 게임 play 로직
		boolean continuePlaying = true;
		System.out.println();
		
		while (continuePlaying) {
			Scanner sc = new Scanner(System.in);
			System.out.println("가위(0), 바위(1), 보(2) 중 하나 선택하세요 >>");
			int userChoice = sc.nextInt();
			int computerChoice = (int)(Math.random() * 3); // 0, 1, 2 중 하나로 설정

			String[] conditions = { "가위", "바위", "보" };

			// 사용자, 컴퓨터
			// 1 - 1 +3 = 3 %3 = 0
			// 1 - 0 + 3 = 4 %3 ===> 사용자 승리 1
			// 2 - 0 + 3 = 5 % 3 =====> 컴퓨터 승리 2
			int result = (userChoice - computerChoice + 3) % 3;

			if (result == 0) {
				System.out.println("무승부");
				System.out.println("플레이어 선택 : " + userChoice);
				System.out.println("컴퓨터 선택 : " + computerChoice);
				draw++;
			} else if (result == 1) {
				System.out.println("플레이어승리");
				System.out.println("플레이어 선택 : " + userChoice);
				System.out.println("컴퓨터 선택 : " + computerChoice);
				win++;
			} else {
				System.out.println("컴퓨터 승리");
				System.out.println("플레이어 선택 : " + userChoice);
				System.out.println("컴퓨터 선택 : " + computerChoice);
				lose++;
			}

			System.out.printf("%s승 %s무 %s패 \n", win, draw, lose);
			System.out.println("게임을 더 플레이하시겠습니까? (1: 예, 0: 아니오)");
			int choice = sc.nextInt();
			if (choice != 1) {
				continuePlaying = false;
			}
		}

		// 업데이트된 게임 결과 저장
		try {
			FileOutputStream out = new FileOutputStream(fileName);
			String data = win + " " + draw + " " + lose;
			out.write(data.getBytes());

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  System.out.println("게임을 종료합니다.");
		  System.out.printf("%s승 %s무 %s패\n", win, draw, lose);
	}

}