package collections;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("grapes");
		
		System.out.println(fruits);
		
		System.out.println(fruits.contains("apple"));
		
		fruits.remove("grapes");
		
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		fruits.clear();
		
		

	}

}
