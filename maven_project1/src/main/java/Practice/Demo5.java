//Duplicate Elements
//Given:
//{1, 2, 3, 2, 4, 1, 5}
//Print the elements that occur more than once.



package Practice;

public class Demo5 {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 2, 4, 1, 5};
		
		for(int i = 0;i<num.length;i++) {
			for(int j = i+1;j<num.length;j++) {
				if(num[i] == num[j]) {
					System.out.print(num[i] + " ");
				}
			}
		}

	}

}
