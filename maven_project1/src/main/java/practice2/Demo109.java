/*Create:
Employee
├──
Developer
├──
Manager
└── Tester
Make calculateSalary() abstract.
Store all objects in:
Employee[] employees;
Loop through the array and call
calculateSalary().*/



package practice2;

public class Demo109 {

	public static void main(String[] args) {
		Employee4[] emp4 = { 
				new Developer4(),
				new Manager4(),
				new Tester4()
		};
		
		for(Employee4 e :emp4) {
			e.calculateSalary();
		}

	}

}
