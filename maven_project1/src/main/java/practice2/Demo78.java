/*Create:
Employee
    ↓
Manager
Employee:
name
salary
displayEmployee()
Manager:
department
displayManager()
Use a constructor in both classes.*/




package practice2;

public class Demo78 {

	public static void main(String[] args) {
		Manager m1 = new Manager("James",68754,"Sales");
		m1.displayManager();

	}

}
