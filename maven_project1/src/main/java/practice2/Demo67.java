//Create a class:
//class Parent {
    //private int a;
    //int b;
    //protected int c;
  //  public int d;
//Create another class in the same package.
//Determine which variables can be accessed.




package practice2;

public class Demo67 {

	public static void main(String[] args) {
		Parent p = new Parent();
		
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);

	}

}
