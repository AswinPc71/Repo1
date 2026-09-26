//Create:
//Employee
//---------
//private id
//private name
//private salary
//Create setters with validation.
//For example:
//salary cannot be negative
//id cannot be 0 or negative



package practice2;

public class Demo73 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setempName("Charles");
		emp1.setempAge(0);
		emp1.setempId(768);
		
		System.out.println("Name : " + emp1.getempName());
		System.out.println("Age : " + emp1.getempAge());
		System.out.println("Id : " + emp1.getempId());
		
		
		

	}

}
