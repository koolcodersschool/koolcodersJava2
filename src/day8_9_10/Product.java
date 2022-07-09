package day8_9_10;

public class Product {
	
	String brand;
	String model;
	double price;
	
	public void productInformation() {
		System.out.println("brand: " + brand);
		System.out.println("model: " + model);
		System.out.println("price: " + price);
		System.out.println();
	}
	
	public static void displayBrand() {
		System.out.println("This is static method");
	}
	

}
