package day8_9_10;

public class Store {
	
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.brand = "Apple";
		product1.model = "Iphone13";
		product1.price = 1200.0;
		
		product1.productInformation();
		
		Product product2 = new Product();
		product2.brand = "BMW";
		product2.model = "I4";
		product2.price = 80000.0;
		
		product2.productInformation();
		
		
		Product.displayBrand();
		
	}

}
