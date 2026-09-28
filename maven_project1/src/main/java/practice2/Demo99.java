
/*Create a class Student with a final variable collegeName. Initialize it through
the constructor and try to modify it later. Observe the compilation error.*/



package practice2;

public class Demo99 {
	final String collegeName;
	
	Demo99(String collegeName){
		this.collegeName = collegeName;
		
	}

	public static void main(String[] args) {
		
		Demo99 ab = new Demo99("ABC College");	
		System.out.println(ab.collegeName);
		
		ab.collegeName = "XYZ College";
		System.out.println(ab.collegeName);
		

	}

}
