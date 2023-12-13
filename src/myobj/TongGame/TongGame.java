package myobj.TongGame;

import java.util.Scanner;

public class TongGame {

	int[] answerArr; //
	int stabCount = 0; // 새 게임을 만드니까 0부터 시작 얼마나 통아저씨가 살아남았나 보기 위함

	public TongGame() { // answerArr 초기화 해줄건데, 필요한게 있다 랜덤으로 인트형 배열에 1이 4개 (4/20 이라 1/5 로 본다),  makeAnswerArr() 메서드 확인!
		answerArr = makeAnswerArr(20);
	}

	public TongGame(int size) { // 여기는 오버로딩을 통해서 추후 사이즈 변경하게 되면 들어갈 부분이다
		answerArr = makeAnswerArr(size);
	}

	/**
	 * 정답 배열을 만들어서 리턴해주는 메서드 정답의 개수는 size의 1/5개로 설정한다.
	 *  0은 그냥 구멍 , 1은 발사되는 구멍, 2는 이미 찌른 구멍
	 * 
	 * @param size -
	 * @return - 생성된 정답 배열
	 */
	public int[] makeAnswerArr(int size) {
		int[] arr = new int[size];

		int answerCount = size / 5;
		// 정답 배열을 만들겠다
		for (int i = 0; i < answerCount; ++i) {
			arr[i] = 1; // 배열이 기본적으로 0으로 초기화 되어있음으로, 정답(발사되는 구멍)을 1로 보는게 좋을 것 같다
						// 지금은 앞에 4개가 발사되는 구멍이라, 셔플 시켜야한다
		}

		return shuffle(arr);

	}

	public int[] shuffle(int[] arr) {
		for (int i = 0; i < 100; ++i) {
			int ran = (int) (Math.random() * (arr.length - 1)) + 1;
			int temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		return arr;
	}

	public void print() {
		for (int i = 0; i < answerArr.length; ++i) {
			
			switch (answerArr[i]) { // 발사되는 자리를 안보이게 바꿈
			case 2:
				System.out.printf("%-2d: [x] ", i+1);
				break;
			default:
				System.out.printf("%-2d: [ ] ", i+1);
				break;
				
			}
//			System.out.printf("%-2d: [%d]", 1+1, answerArr[i]); 정답자리가 보이는 방법

			if (i % 5 == 4) {
				System.out.println();
			}
		}

		System.out.println("시도 횟수: " + stabCount);
	}
	
	// 지금까지 셔플까지만 되었기에 이제 찌르는 기능을 만들것이다~
	// 찌르는데 몇번을 찌를 것이냐를 알아야해
	// print()메서드 System.out.printf(" [%d]", answerArr[i]); 이 모양에서 System.out.printf("%-2d: [%d]", 1+1, answerArr[i]); 이렇게 고쳤다
	// 사용자가 번호를 선택하면 상황에 따라 상태를 변경해주는 모습이 되어야한다~
	public int stab(int num) { 
		int index = num -1 ; 
		
		// 범위를 벗어났을때 -1
		if(index < 0 || index >= answerArr.length) {
			return -1;
		}
		
		int answer = answerArr[index];
		
		// 찌른 후 찔럿던 곳에 있던 숫자를 반환한다
		if(answer == 0) {
			answerArr[index] = 2;
		}
		return answer; // stab이라는 친구가 그때그때 다른 반응을 할 수 있도록 하기 위함
		
//		switch (answer) {
//			case 0: // 0 은 그냥 구멍임
//				answerArr[index] = 2 ;
//				return 0;
//			case 1: 
//				return 1;
//			case 2: // 이미 찌른곳이란걸 알려줘야 하기떄문에,  return 값이 필요하다
//				return 2;
//			default :
//				return -1; // stab이라는 친구가 그때그때 다른 반응을 할 수 있도록 하기 위함
//			
//		}
		
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			this.print(); // 아까 만들어둔 print() 메서드 가져오기
			
			System.out.println("찌를 곳을 선택 해주세요 >");
			int result = this.stab(sc.nextInt()); // 찌른 후 결과
			
			if(result == 0) {
				System.out.println("살아남았습니다~");
				++stabCount;			
			} else if(result == 1) {
				System.out.println("!!! 아저씨가 발사되어 하늘로 날아갔습니다 !!! ");
				System.out.println(++stabCount + "번 만에 아저씨를 날려보냈습니다.\n");
				System.out.println("게임을 종료합니다");
				++stabCount;
				break;
			} else if(result == 2) {
				System.out.println("찌른곳은 다시 찌를 수 없습니다.");
			} else if(result == -1) {
				System.out.println("범위를 벗어나는 곳은 찌를 수 없습니다!");
			}
		}
	}
}

























