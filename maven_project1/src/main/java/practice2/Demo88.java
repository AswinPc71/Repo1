package practice2;

public class Demo88 {

	public static void main(String[] args) {
		Student3 stu1 = new Student3("ABCD",21,89); 
		Student3 stu2 = new Student3("EFGH",22,78); 
		Student3 stu3 = new Student3("IJKL",23,99); 
		
		stu1.display();
		stu2.display();
		stu3.display();
		
		stu1.setAge(44);
		stu2.setAge(12);
		stu3.setAge(19);

		System.out.println("New age of stu1 : " +stu1.getAge());
		System.out.println("New age of stu2 : " +stu2.getAge());
		System.out.println("New age of stu3 : " +stu3.getAge());
		System.out.println();
		
		stu1.display();
		stu2.display();
		stu3.display();
		
	}

}
