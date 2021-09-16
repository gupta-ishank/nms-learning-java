package Folder5;

//functional interface - interface which contains 1 method inside.
interface Executable{
	int execute(int a, int b);
}

interface StringExecutable{
	int execute(String a);
}

class Runner{
	public void run(Executable e) {
		System.out.println("Executing code block....");
		int value = e.execute(12, 13);
		System.out.println(value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executing code block....");
		int value = e.execute("hello....");
		System.out.println(value);
	}
}

//Lambda Expressions Type
// 1.
/*
	() -> System.out.println("Hello there!")
 */

// 2.
/*
	() -> {
			System.out.println("This is code is passed in lambda expression");
			System.out.println("Hello there!");
		}
 */

// 3.
/*
	() -> {
			System.out.println("This is code is passed in lambda expression");
			System.out.println("Hello there!");
			return 9;
		}
 */

// 4. 
/*
	() -> {
			return 9;
		}
 */

// 5.  same as 4. 
// () -> 9

// 6.
/*
	(int a) -> 9 + a
 */

// 7.
/*    // also it need not to put type in lambda expression
	(int a) -> {   // here if write ' (a)-> ' , this is also correct, java at backend takes care of type 
			System.out.println("Hello there!");
			return 7 + a;
		}
 */

// 8.
/*
	(int a, int b) -> {
			System.out.println("Hello there!");
			return a + b;
		}
 */

// 9. 
/*
	(int a, int b) -> {
			System.out.println("Hello there!");
			return a + b + c;
		}
 */

// 10. 
/*
	(int a, int b) -> {
			System.out.println("Hello there!");
			//int d = 12;  // but here in lambda expression we cannot declare a new variable   
	                     // with same name bcoz it is same scope unlike anonymous class         		
			return a + b + c + d;
		}
 */

public class App {
	public static void main (String[] args) {
		Runner runner =  new Runner();

		// instancing an object and passing that as argument in runner.run() 
//		Executable e = new Executable() {
//			public void execute() {
//				System.out.println("Hello there!");
//			}
//		};
//		runner.run(e);
		
		//effectively final
		int c = 100;  // in earlier versions, to use local variables in anonymous class, we have to use final keyword
		              // In java8 there is no need to put final but neverthless it acts as final 
                      // we cannot change value of variable once declared
		//c = 15;  can't do this, 
		
		
		int d = 7;
		
		// passing code block by anonymous class in runner.run()
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there!");
				int d = 10;                  // here this 'd' is completely new variable, there is no relation between previous 'd' 
				return a + b + c + d;        // bcoz scope is different, this anonymous class has different scope, traditionally its a altogether a different class with no name
			}
		});
		
		
		System.out.println("=================================================");
		
		// Java8 feature : instead of anonymous class, we can use lambda expression
		runner.run((int a, int b) -> {
			System.out.println("Hello there!");
			//int d = 12;  // but here in lambda expression we cannot redeclare a new variable   
	                     // with same name bcoz it is same scope unlike anonymous class         		
			return a + b + c + d;
		});
	}
}
