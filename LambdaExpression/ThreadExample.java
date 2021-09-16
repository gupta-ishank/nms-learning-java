package LambdaExpression;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable with inner clas running");
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		System.out.println("====================================================");
		
		
		Thread thread2 = new Thread(() -> {
				System.out.println("My Runnable with lambda running");
		});
		thread2.start();
	
		System.out.println("====================================================");
		
		
		Runnable runnable3 = () -> {
			System.out.println("My Runnable with lambda (method2) running");
		};
		
		Thread thread3 = new Thread(runnable3);
		thread3.start();
		
		System.out.println("====================================================");
	
	}
}
