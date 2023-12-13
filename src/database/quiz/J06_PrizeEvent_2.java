package database.quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.quiz.event.EventDao;
import database.quiz.event.model.Prize;

public class J06_PrizeEvent_2 {
	
	/*
	# DB와 연동되는 경품추첨 이벤트 구현
	1. DB에 경품들의 이름, 당첨확률, 남은수량 등 필요한 정보를 저장할 수 있는 테이블 생성하기
	
	-> 상품ID/상품명/당첨확률/남은수량/초기수량
	
	2. 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들게 만들기
	3. 상품이 모두 소진된 상태로벤트가 종료되었음을 알려주고 프로그램이 종료되도록
	4. 리셋 기능을 실행하면 DB의 상품이 처음으로 돌아가야한다(충전되어야 한다)

*/ 
	EventDao eventDao = new EventDao();
	List<Prize> box = new ArrayList<>(); // Prize 객체를 저장할 ArrayList인 box를 초기화
	
	
	public J06_PrizeEvent_2() {
		//각 상품의 확률에 따라 box 리스트에 상품을 추가
		//데이터베이스에 있는 각 상품은 그 확률에 비례하여 box 리스트에 여러 번 추가됩니다. 
		//만약 어떤 상품의 확률이 0.05 (즉, 5%)이라면, 1000번 반복돌면서 해당 상품을 50번 box 리스트에 추가
		List<Prize> prizeList = eventDao.selectAllPrizes();
	
		int count =0;
		
		// 확률을 prize_rate NUMBER(3, 3) 즉 0.001까지 가능하다.
		for(Prize p : prizeList) {
			int r = (int)(p.getPrize_rate() * 1000);
			for(int i =0; i < r; ++i) {
				box.add(p);
				++count;
			}
		}
		while(count < 1000){
			box.add(null);
			++count;
		}
		
	}
	
	public Prize draw() throws SQLException {
		if (eventDao.getAllprizesRemainQty() <= 0) {
			throw new SQLException("모든 상품 소진");
		}
		
		//return box.get((int)(Math.random()*1000));
		//box 리스트에서 상품을 무작위로 추첨하여 반환
		
		Prize p = box.get((int)(Math.random()*1000));
		// DB에 수량 감소 반영
		// 추첨한 상품의 ID를 이용하여 EventDao 클래스의 reduceRemainQty 메서드를 호출하여 상품의 수량을 감소
		if(p != null) {
			int result = eventDao.reduceRemainQty(p.getPrize_id());
			
			if(result == 1) {
				System.out.println("이미 수량이 0이라 뽑지 못했습니다.");
				return p;
			}
			
			// 감소시킨뒤 현재 수량 읽어서 프로그램 반영
			Prize p2 = eventDao.getPrize(p.getPrize_id());
			p.setRemain_qty(p2.getRemain_qty());
		}
		
		return p;
	}

	public static void main(String[] args) {
		
		//EventDao eventDao = new EventDao();
		//System.out.println(eventDao.selectAllPrizes()); // 뽑기할 수 있는 그런 배열, 확률테이블 등등 을 만들 수 있다.
		J06_PrizeEvent_2 event = new J06_PrizeEvent_2();

		//while (true) -> 무한루프를 돌리면 DB가 이 속도를 따라 잡지 못해서  Listener refused the connection with the following error:~~ 에러출력
		for(int i = 0 ; i < 100; ++i){
			Prize p;
			try {
				p = event.draw();
			} catch (SQLException e) {
				System.out.println("모든 상품 소진");
				e.printStackTrace();
				break; 
			}
			
			if(p != null) {
			System.out.println(p);
			}
		}

	}

}
