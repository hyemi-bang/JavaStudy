package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_Metadata {

	public static void main(String[] args) {
	
		String sql ="SELECT * FROM employees";
		
		try (
			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			){
			
			// 조회한 ResultSet에 대한 정보를 볼 수 있다.
			// 실행했을때 쿼리문의 결과가 들어있다.
			
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println( "컬럼이 몇개인가?" + meta.getColumnCount());
			System.out.println("첫 번째 컬럼의 이름은 무엇인가?" + meta.getColumnLabel(1));
			System.out.println("두 번째 컬럼의 이름은 무엇인가?" + meta.getColumnLabel(2));
			// 메타데이터는 변수로 꺼내서 사용할 일이 거의 없다. 
			// 기억이 안날때는 sql developer를 켜서 desc 테이블명 해서 보는게 더 빠를 수 있다.
			
			System.out.println("========================");
			
			for(int i = 1; i <= meta.getColumnCount(); ++i) {
				System.out.printf("%-20s\t%s(%d)\n",
						meta.getColumnName(i),
						meta.getColumnTypeName(i),
						meta.getColumnDisplaySize(i));
					//JDBC(Java Database Connectivity)를 사용하여 데이터베이스로부터 데이터를 조회할 때,
					// 쿼리의 결과로 반환된 열(column)의 표시 크기, 메서드는 특정 열의 데이터를 표시하는 데 필요한 최대 문자 수 또는 바이트 수를 반환
					// 실제 데이터의 길이가 13이므로, 실제 데이터의 길이에 대한 정보는 이 메서드로는 알 수 없고
					// 단지 데이터를 표시하는 데 필요한 최대 공간 크기만을 제공
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
