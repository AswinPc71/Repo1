package practice2;

public class Manager extends Employee2{
	String department;
	
	Manager(String name,int salary,String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void displayManager() {
		displayEmployee();
		System.out.println("Department : " + department);
	}
	

}
