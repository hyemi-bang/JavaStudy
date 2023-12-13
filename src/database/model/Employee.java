package database.model;


// 데이터모델 클래스
public class Employee {

	// DB로 부터 null이 나올수 있음으로 기본타입보다 Wrapper 클래스 사용하는것이 좋다
	
	Integer employee_id;
	String first_name;
	String last_name;
	String email;
	String phone_number;

	
	
	public Employee(
			Integer employee_id,
			String first_name,
			String last_name,
			String email,
			String phone_number
			) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s", first_name, last_name);
	}
}
