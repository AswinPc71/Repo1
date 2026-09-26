//Create:
//package1.Parent
//package2.Test
//Try accessing:
//•	private 
//•	default 
//•	protected 
//•	public 
//from Test.
//Record which ones work.



package practice2;

import practice3.Parent1;

public class Demo68 {

	public static void main(String[] args) {
		
		Parent1 p1 = new Parent1();
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p1.d);
		

	}

}
