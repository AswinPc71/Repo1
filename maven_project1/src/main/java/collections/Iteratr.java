package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratr {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(34);
		num.add(12);
		num.add(87);
		num.add(32);
		
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
