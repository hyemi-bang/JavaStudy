package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Employee;

public class J06_DataModelClass {

	/*
	
		# 데이터 모델 클래스
		- db에서 꺼낸 데이터를 담아놓는 용도로 사용하는 클래스
		- 데이터를 매개변수 등으로 활용하기 편리한 상태
		- DTO 또는 VO 등으로 불린다
	
	*/
	
	// 사원정보를 다른 메서드에 반환하고 싶다.
	
	
	public static void main(String[] args) {

		

		String sql ="SELECT * FROM employees";
		
		try (
			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
		){
			//컬럼개수
			int columnCount = rs.getMetaData().getColumnCount();
			
			// 테이블의 한 행을 인스턴스화 해놓으면 Collection에서도 활용할 수 있다.
			
			List<Employee> employees = new ArrayList<>();
			
			while(rs.next()) {
				// 꺼낸 데이터를 인스턴스화 해놓으면 여기저기 사용하기 편리해진다.
				Employee emp = new Employee(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number")
						);
				//System.out.println(emp); 
				// database.model.Employee@17aad511 toString()이 안된상태
				//  package database.model => Employee => toString()오버라이드 하면 -> William Gietz출력
				
				employees.add(emp);
				
				
//				System.out.println(rs.getInt("employee_id"));
//				System.out.println(rs.getString("first_name"));
//				System.out.println(rs.getString("last_name"));
//				System.out.println(rs.getString("email"));
//				System.out.println(rs.getString("phone_number"));
//				System.out.println("---------------------");
				
//				for(int i = 1; i <= columnCount; ++i) {
//					System.out.printf(
//							//%s 들어 갈 수 있는데. 그 자리수가 metadata안에 있기 때문에 %-s 로 만든것.
//							"%-"+ rs.getMetaData().getColumnDisplaySize(i)+"s",
//							rs.getObject(i) + "\t");
				//}
				}
			System.out.println(employees);
				System.out.println();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
