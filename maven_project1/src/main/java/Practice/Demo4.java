//. Second Largest
//Given:
//{10, 25, 5, 40, 30}
//Find the second-largest number.



package Practice;

public class Demo4 {

	public static void main(String[] args) {
		int[] num = {10, 25, 5, 40, 30};
		int max = num[0];
		int max1 = num[1];
		
		for(int i = 0 ;i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		
		for(int i = 0;i<num.length;i++) {
			if(max<num[i]) {
				max1 = max;
				max = num[i];
			}
			else if(max1<num[i] && num[i] != max) {
					max1 = num[i];
				}
			}
		System.out.println();
		System.out.println("Second Largest : " + max1);
		}

	}

