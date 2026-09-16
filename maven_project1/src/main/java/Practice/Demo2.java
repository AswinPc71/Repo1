//Create an Employee class with:
//•	name 
//•	id 
//•	salary 
//Use a constructor and this keyword to initialize the variables.
//Create an instance method to display the employee details.



package Practice;

public class Demo2 {
	String name;
	int id;
	long salary;
	
	Demo2(String name,int id,long salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
		System.out.println();
	}

	public static void main(String[] args) {
		Demo2 d1 = new Demo2("Ghi",5433,80000);
		d1.display();		
		Demo2 d2 = new Demo2("Abc",6878,150000);
		d2.display();
		Demo2 d3 = new Demo2("Def",8979,25000);
		d3.display();

	}

}
