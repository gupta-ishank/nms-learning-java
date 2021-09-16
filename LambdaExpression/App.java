package LambdaExpression;

public class App {
	
	//Syntax for lambda expressions
	
	//function with no argument and return type
	public void print() {
		System.out.println("Hello World!");
	}
	
	() -> System.out.println("Hello World!");
	
	////////////////////////////////////////////////////////////////////////////////////
	
	//function with arguments and return type
	public void subtract (int a, int b) {
		System.out.println("Subtraction is:" + (a - b));
	}
	
	(a, b) -> {
		System.out.println("Subtraction is:" +  (a - b));
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	//function with arguments and return type
	public double (int a) {
		return (a + 2);
	}
	
	(a) -> a + 2;
}
