package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {
	
	/*
		# pstmt.executeQuery() 
		- SELECT 문에서만 사용하고 결과로 ResultSet이 나온다
		
		# pstmt.executeUpdate()
		- INSERT, UPDATE, DELETE문에 사용하고 결과로 int값이 나온다.
		- int값으로는 반영된 행의 개수가 리턴된다.
	
	*/

	public static void main(String[] args) {

		try (Connection conn = JdbcConnection.getConnection();) {
			
			// 기본키를 넣을떄는 자바쪽에서 시퀀스를 불러 사용한다
			String sql1 = "INSERT INTO "
					+ "fruits(fruit_id, fruit_name, fruit_price)"
					+ " VALUES(fruit_id_seq.nextval,?,?)";
							// fruit sequences를 넣어서 이 로직에 문제가 생기지 않도록 한다
							// 시퀀스를 사용하여 기본 키 값을 자동으로 생성하고자 할 때 이와 같은 방식으로 SQL 쿼리를 작성 
							// 이렇게 하면 데이터베이스가 자동으로 고유한 기본 키 값을 생성

			try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
				pstmt.setString(1, "Peach");
				pstmt.setInt(2, 1500);
				
				// INSERT, UPDATE, DELETE는 executeUpdate()로 실행해야한다
				int row = pstmt.executeUpdate();
				System.out.println(row + "행이 변경되었습니다..");
			}

			String sql2 = "UPDATE fruits SET fruit_price = fruit_price + 100"
					+ "WHERE fruit_id <150";
			try(PreparedStatement pstmt = conn.prepareStatement(sql2)){
				int row = pstmt.executeUpdate();
				System.out.println(row+"개의 과일 가격이 100원 올랐습니다.");
			}
			
			//DELETE도 같은 방식으로 하면 된다.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
