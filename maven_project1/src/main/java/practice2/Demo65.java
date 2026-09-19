//Write a program that demonstrates the basic usage of both StringBuilder and StringBuffer.
//Then answer:
//1.	What is the difference? 
//2.	Which one is synchronized? 
//3.	Which one is generally faster in single-threaded code? 



package practice2;

public class Demo65 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" world");
		builder.append("!");
		System.out.println("StringBuilder : " + builder);
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" world");
		buffer.append("!");
		System.out.println("StringBuffer : " + buffer);

	}

}
