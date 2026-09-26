//Create:
//class Student {
//    private String name;
//}
//Try accessing name directly from main().
//Then fix the program using getter and setter methods.



package practice2;

public class Demo70 {
	
		private String name;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName(){
			return name;
		}

	public static void main(String[] args) {
		Demo70 stu = new Demo70();
		stu.setName("Name");
		System.out.println(stu.getName());

	}

}
