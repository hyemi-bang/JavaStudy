package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J02_PrepareStatement {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름>> ");
		String keyword = sc.next();
		
		//쿼리문
		// ※SQL Injection 공격의 위험※이 있는 안좋은 방법이다.
		// https://namu.wiki/w/SQL%20injection
//		String sql ="SELECT * FROM employees WHERE "
//				+ "first_name = '" + keyword + "'";
		
		// SQL Injection을 방지하기 위해 채워야하는 곳은 ?로 비워놓고 쿼리문을 작성한다
		String sql ="SELECT * FROM employees WHERE = ?";

		try (Connection co = JdbcConnection.getConnection(); // 클래스 나누어 놓은것 불러들이기.
				PreparedStatement pstmt = co.prepareStatement(sql);
		// ResultSet rs = pstmt.executeQuery();
		) {
			// 쿼리문을 준비시킨 후 ?를 채워줄 수 있다.
			// ?는 1번부터 시작한다.
			pstmt.setString(1, keyword);

			// AutoClose를 위한 try문
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					System.out.printf("%s %s / %s\n", 
							rs.getString("first_name"), 
							rs.getString("last_name"),
							rs.getDate("hire_date"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
