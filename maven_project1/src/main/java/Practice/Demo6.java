//"programming"
//Find how many times each character occurs.



package Practice;

public class Demo6 {

	public static void main(String[] args) {
		String word = "programming";
		
		for(int i =0;i<word.length();i++) {
			boolean h = false;
		
		    for(int k =0;k<i;k++) {
		    	if(word.charAt(i) == word.charAt(k)) {
		    		h = true;
		    		break;
		    	}
		    }
		    
			if(h == true) {
				continue;
			}
			
			int count = 1;
			
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			System.out.println(word.charAt(i) + " - " + count);
		}

	}

}
