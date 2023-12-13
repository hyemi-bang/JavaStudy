package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	
	/*
		# JDBC (Java Database Connectivity)
		
		- 자바에서 데이터베이스에 접속하여 쿼리문을 전달하고 결과를 얻어오는 기능들이 구현되어 있는 API
		- 다양한 종류의 DB와 연결할 수 있다
		- 어떤 DB와 연결하더라도 항상 JAVA쪽 소스코드는 동일하게끔 설계
		 -> Java에는 인터페이스만 존재하고 실제 구현은 각 DB회사에게 미룸
		 
		
		# OJDBC (Oracle JDBC)
		- Oracle 데이터베이스가 JDBC API와 소통하기 위해 만들어놓은 라이브럴
		- 오라클 데이터베이스 또는 SQLDeveloper 설치 폴더에 포함되어 있다
		
		# 외부의 라이브러리 프로젝트에 포함시키기
		
		- 프로젝트 우클릭 -> Properties -> Java Build Path
			-> Libraris 탭 -> modulepath에 Add External JARs..
	 
	*/

	public static void main(String[] args) {
		
		// JDBC API의 사용절차
		
		//1. Class.forName()으로 각 회사의 JDBC 드라이버를 한번 로드한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클 패키지 > jdbc 패키지 > 드라이버 패키지 >OracleDriver 실행시키는것
			System.out.println("클래스 로딩 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 이름이 틀린 것 같습니다.");
			e.printStackTrace();
		}
	

		//2. DriverManager 클래스를 통해 DB에 접속한다 (새 워크시트 접속과 같음)
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			// sqlDeveloper 에서 주소를 가져다 쓰는 것 
			// 워크시트 시작 부분
			System.out.println("연결성공!" + conn);
			
			//3. 생성된 conn인스턴스를 통해 쿼리문을 전달한다
			// 	(해당 위치에서 쿼리문에 ;을 추가하면 에러가 발생하므로 주의)
			
			//[3-1] 쿼리문 준비하기
			String sql = "SELECT * FROM employees";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//[3-2] 준비된 쿼리문 실행하기 (DB로 전달하기)
			//	   해당 쿼리문의 실행결과는 Set형태로 반환된다
			ResultSet rs = pstmt.executeQuery();
			// HashSet의 그 Set 배웠던 Set이다
			
			//[3-3] 받아온 결과 사용하기
			
			//rs.next() : 커서를 다음행을 넘긴후 true반환. 더 읽을게 없으면 false 반환
			while(rs.next()) {
				System.out.printf("%s %s / %d\n",
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary")
						);
			}
			// 사용이 끝난 객체를 열었던 반대의 순서로 닫는다.
			rs.close();
			pstmt.close();
			// 사용이 끝난 연결은 반드시 접속을 해제해야 한다	
			conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}