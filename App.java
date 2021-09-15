class Machine{
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken");
	}
}


public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//upcasting
		Machine machine2 = camera1;
		machine2.start();
		//machine2.snap();  error : calling a method depends on variable type,
		                   //  there is no method name 'snap' with machine
		
		//downcasting
		Machine machine3 = camera1;
		Camera camera2 = (Camera) machine3; // add casting to object in brackets to avoid error
		camera2.start();
		camera2.snap();
		
		//exception in downcasting
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera) machine4; // this is why downcasting is unsafe
		//camera2.start();
		//camera2.snap();
	}
}
