//Create a class:
//Product
//---------
//private productId
//private productName
//private price
//Make productId read-only after construction.
//Hint: provide a getter but no setter.



package practice2;

public class Demo74 {

	public static void main(String[] args) {
		Product pd = new Product(2324,"Laptop",72000);
		System.out.println("Product Id : " + pd.getProductId());
		System.out.println("Product Name : " + pd.getProductName());
		System.out.println("Product Price : " + pd.getProductPrice());
		System.out.println();
		
		pd.setProductName("Asus Laptop");
		System.out.println("Product Id : " + pd.getProductId());
		System.out.println("Product Name : " + pd.getProductName());
		System.out.println("Product Price : " + pd.getProductPrice());
		System.out.println();
		
		pd.setProductPrice(77000);
		System.out.println("Product Id : " + pd.getProductId());
		System.out.println("Product Name : " + pd.getProductName());
		System.out.println("Product Price : " + pd.getProductPrice());
		

	}

}
