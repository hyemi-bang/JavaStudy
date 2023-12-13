package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J04_Transaction {

	public static void main(String[] args) {

		try(
			Connection conn = JdbcConnection.getConnection();
		) {
			
			// 커넥션을 받아오면 (연결 인스턴스) 자동으로 오도커밋이 켜져있다.
			// 해당 연결인스턴스의 자동 커밋을 비활성화해야 커밋과 롯백을 활용한 트랜잭션 관리가 가능하다
			conn.setAutoCommit(false);
			
			String sql1 = "INSERT INTO " 
					+ "fruits(fruit_id, fruit_name, fruit_price) "
					+ "VALUES(fruit_id_seq.nextval,'Pineapple', 5000)";
			
			try(PreparedStatement pstmt = conn.prepareStatement(sql1)){
				for (int i = 0; i <5; ++i) {
				pstmt.executeUpdate();
				}
			}
			
			// 확률적으로 롤백이 되거나, 커밋이되도록
			if((int)(Math.random() *2) ==1){
				System.out.println("파인애플 5개 추가 및 커밋되었습니다.");
				conn.commit();
			} else {
				// 롤백되더라도 시퀀스 번호는 돌아가지 않아서, 중간에 비어있는 시퀀스 번호들을 볼수 있다.
				
				System.out.println("파인애플 5개 추가 되었다가 롤백되었습니다.");
				System.out.println("롤백되더라도 시퀀스 번호는 돌아가지 않습니다...");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
