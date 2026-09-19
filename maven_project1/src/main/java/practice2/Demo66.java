//Given:
//"programming"
//Use StringBuilder to create:
//"progamin"
//Remove repeated characters while preserving the first occurrence.



package practice2;

public class Demo66 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("programming");
		
		for(int i = 0; i < sb.length();i++) {
			for(int j =i+1;j < sb.length();j++) {
			if(sb.charAt(i) == sb.charAt(j)) {
				sb.deleteCharAt(j);
				j--;
			}
		}
		}
		System.out.println(sb);
				

	}

}
