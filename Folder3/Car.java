package Folder3;

public class Car extends Machine {
	@Override
	public void start() {
		System.out.println("staring car");
	}
	
	@Override
	public void doStuff() {
		System.out.println("doing stuff in car");
	}
	
	@Override
	public void shutdown() {
		System.out.println("shuttingdown car");
	}
}
