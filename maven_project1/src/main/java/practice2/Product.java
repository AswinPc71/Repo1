package practice2;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	Product(int productId,String productName,double productPrice){
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public double getProductPrice(){
		return productPrice;
	}

}
