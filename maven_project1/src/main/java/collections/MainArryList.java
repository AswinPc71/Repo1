package collections;

import java.util.ArrayList;

public class MainArryList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("abc");
		names.add("def");
		names.add("ghi");
		names.add("jkl");
		System.out.println(names);
		
		names.add(1, "mno");
		System.out.println(names);
		
		System.out.println(names.get(3));
		
		names.set(0, "xyz");
		System.out.println(names);
		
		names.remove(3);
		System.out.println(names);
		
		System.out.println(names.contains("xyz"));
		
		System.out.println(names.size());
		
		System.out.println(names.isEmpty());
		System.out.println();
		
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println();
		
		for(String j:names) {
			System.out.println(j);
		}
		
		names.clear();
		System.out.println(names);

	}

}
