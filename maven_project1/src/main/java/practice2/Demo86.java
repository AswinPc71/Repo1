/*Create:
Employee
 ├── Developer
 ├── Manager
 └── Tester
Parent:
calculateSalary()
Each child overrides it differently.
Use:
Employee e;
to refer to different employee objects.*/



package practice2;

public class Demo86 {

	public static void main(String[] args) {
		Employee3 e;
		
		e = new Developer3();
		System.out.println("Salary of Developer : " + e.calculateSalary());
		
		e = new Manager3();
		System.out.println("Salary of Manager : " + e.calculateSalary());
		
		e = new Tester3();
		System.out.println("Salary of Tester : " + e.calculateSalary());
		

	}

}
