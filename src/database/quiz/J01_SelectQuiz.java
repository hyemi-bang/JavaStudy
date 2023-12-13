package database.quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_SelectQuiz {
	
	/*
		DB로부터 모든 사원의 사번/이름/부서명/직책명 읽어 파일형태로 저장해보세요
	*/
	
	public void saveEmployeesToFile() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로딩성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 이름 확인하시오");
			e.printStackTrace();
		}

		try {
			Connection co = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			System.out.println("연결성공" + co);
			
			String sql = "SELECT e.employee_id, e.first_name, e.last_name, "
                    + "e.department_id, j.job_title FROM employees e "
                    + " INNER JOIN jobs j ON e.job_id = j.job_id";
			
			PreparedStatement pstmt = co.prepareStatement(sql);			
			ResultSet rs = pstmt.executeQuery();
			
			try (PrintWriter out = new PrintWriter(new FileWriter("myfiles/SelectQuiz.text"))){
				while(rs.next()) {
//					System.out.printf("%d / %s %s / %d / %s \n",
//							rs.getInt("employee_id"),
//							rs.getString("first_name"),
//							rs.getString("last_name"),
//							rs.getInt("department_id"),
//							rs.getString("job_title")
//							);
					
					int employeeId = rs.getInt("employee_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int departmentId = rs.getInt("department_id");
                    String jobTitle = rs.getString("job_title");
                    
                    String info = String.format("%d / %s %s / %d / %s", 
                    		employeeId,firstName,lastName,departmentId,jobTitle);
					out.println(info);
				}
				rs.close();
				pstmt.close();
				co.close();
				System.out.println("myfiles폴더 안에 SelectQuiz파일 저장 성공");
			} catch (IOException e) {
				System.out.println("파일저장중 오류가 발생했습니다.");
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	    J01_SelectQuiz quiz = new J01_SelectQuiz();
        quiz.saveEmployeesToFile();
    }

}
