package dto;

import java.sql.Timestamp;

public class EmployeeDto {
	
	//기본 생성자
	public EmployeeDto() {
		
	}
	
	//매개변수 있는 생성자
	public EmployeeDto(String empId, String empName, int salary, Timestamp hiredate, String email, String phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.hiredate = hiredate;
		this.email = email;
		this.phone = phone;
	}
	//필드 생성
	private String empId;
	private String empName;
	private int salary;
	private Timestamp hiredate;
	private String email;
	private String phone;


	//getter, setter
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Timestamp getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	//toString
	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", hiredate=" + hiredate
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
