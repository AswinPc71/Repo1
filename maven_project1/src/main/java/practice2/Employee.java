package practice2;

public class Employee {
	private String empName;
	private int empAge;
	private int empId;
	
	public void setempName(String empName) {
		this.empName = empName;
	}
	
	public void setempAge(int empAge) {
		if(empAge<=0 || empAge>120) {
			System.out.println("Invalid age entered, Age must be greater than zero");
		}
		else {
			this.empAge = empAge;
		}
	}
	
	public void setempId(int empId) {
		if(empId<=0) {
			System.out.println("Invalid employee Id entered, Employee id must be greater than 0");
		}
		else {
			this.empId = empId;
		}
	}
	
	public String getempName() {
		return empName;
	}
	
	public int getempAge() {
		return empAge;
	}
	
	public int getempId() {
		return empId;
	}

}
