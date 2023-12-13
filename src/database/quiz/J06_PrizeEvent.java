package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.JdbcConnection;
import myobj.prizeDraw.Draw;
import myobj.prizeDraw.Prize_T;

public class J06_PrizeEvent {

	/*
		# DB와 연동되는 경품추첨 이벤트 구현
		1. DB에 경품들의 이름, 당첨확률, 남은수량 등 필요한 정보를 저장할 수 있는 테이블 생성하기
		2. 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들게 만들기
		3. 상품이 모두 소진된 상태로벤트가 종료되었음을 알려주고 프로그램이 종료되도록
		4. 리셋 기능을 실행하면 DB의 상품이 처음으로 돌아가야한다(충전되어야 한다)
	
	*/ 
	
	// DB 테이블 생성: 데이터베이스에 경품 정보를 저장할 테이블을 생성
	// 사용자 입력을 받아 뽑기 이벤트, 리셋 기능 중 선택
	public void startEvent(Connection connection) {
		try (Scanner sc = new Scanner(System.in);) {
			while (true) {
				System.out.println("1. 뽑기 이벤트 시작");
				System.out.println("2. 이벤트 리셋기능");
				System.out.println("3. 이벤트 종료");

				System.out.println("원하는 기능을 선택하세요>> ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					drawPrize(connection);
					break;
				case 2:
					resetEvent(connection);
					break;
				case 3:
					endEvent(connection);
					return;
				default:
					System.out.println("유효하지 않은 선택입니다. 다시 시도하세요");
				}
			}
		}

	}

	// 뽑기 이벤트 메서드
	private void drawPrize(Connection connection) {
		// DB에서 남은 상품 수량 확인
		String sql = "SELECT prize_name, prize_amount, winning_probability FROM prizes";
		List<Prize_T> prizes = new ArrayList<>();
		try (Connection conn = JdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			// 수량이 0보다 크고, 당첨확률도 0이상일때 뽑기

			while (rs.next()) {
				String name = rs.getString("prize_name");
				int qty = rs.getInt("prize_amount");
				double chance = rs.getDouble("winning_probability");
				Prize_T prize = new Prize_T(name, qty, chance);
				prizes.add(prize);
			}
			// 뽑기
			if (!prizes.isEmpty()) {
				Draw drawMachine = new Draw(prizes.toArray(new Prize_T[0]));
				Prize_T selected = drawMachine.draw();

				System.out.println("축!" + selected.getName() + "뽑으셨습니다");

				String updateSql = "UPDATE prizes SET prize_amount = prize_amount - 1 " + "WHERE prize_name = ?";
				// 뽑기를 진행한 경우 DB의 상품 수량 감소
				try (PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {
					updatePstmt.setString(1, selected.getName());
					updatePstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("더 이상 남은 상품이 없습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void endEvent(Connection connection) {
		// 프로그램 종료
		System.out.println("이벤트가 종료되었습니다.");
		System.exit(0);
	}

	// 리셋 기능 구현 메서드
	public void resetEvent(Connection connection) {
		// DB의 상품 정보를 초기 값으로 리셋
		// DB파일에서 롤백을 수행하는 것은 특정시점으로 되돌릴 수 있지만 해당 상황에는 맞지 않는다.
		// 이벤트에서 사용된 상품 수량을 초기화하고 이벤트를 리셋하려면 초기 데이터로 테이블을 다시 채우는 것이 일반적이라고 한다.
		String resetSql = "INSERT INTO prizes  (prize_id, prize_name, prize_amount, winning_probability)"
				+ "VALUES(?, ?, ?)";
		try (Connection conn = JdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(resetSql)) {
			// 초기 데이터 배열을 선언할 때 Object 타입을 사용하면 서로 다른 타입의 데이터를 하나의 배열에 담을 수 있다.
			Object[][] initialData = { 
					{ 01, "lg gram 15", 15, 0.25 }, 
					{ 02, "뮤지컬 R석 티켓'", 30, 0.3 },
					{ 03, "공기청정기", 5, 0.05 }, 
					{ 04, "스타벅스 아메리카노 상품권", 300, 0.4 } };
			// 초기 데이터를 테이블에 삽입
			for (Object[] data : initialData) {
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// DB 연결 & 오토클로즈 작성
		// DB 연결 해제 코드 작성

		try (Connection conn = JdbcConnection.getConnection()) {
			J06_PrizeEvent prizeEvent = new J06_PrizeEvent();
			prizeEvent.startEvent(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

