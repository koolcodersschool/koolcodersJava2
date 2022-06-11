package day6;

public class CustomMethodsVoidNoParameter {
	/*
	 *   Methods:
  		- void - no parameter
  		- void - with parameter
  		- returns - no parameter
  		- returns - with parameter
	 */
	
	public static void main(String[] args) {
		sayHelloToMaryam();
	}
	
	public static void sayHelloToMaryam() {
		String name = "Maryam";
		System.out.println("Hello " + name);
	}
	
	//public            -> access modifier
	//static            -> access specifier
	//void              -> return type
	//sayHelloToMaryam  -> method name
	//()                -> no parameters
	//{}                -> method body
	

}
