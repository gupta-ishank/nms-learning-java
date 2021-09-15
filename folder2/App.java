package folder2;

import Folder3.Machine;

class Machine{
	public void start() {
		System.out.println("starting machine...");
	}
}

interface Plant{
	public void grow();
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera starting..");
			}
		};
		machine1.start();
		
		Plant plant = new Plant() {
			@Override 
			public void grow() {
				System.out.println("plant is growing");
			}
		};
		plant.grow();
	}
}
