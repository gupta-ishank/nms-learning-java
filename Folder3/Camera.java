package Folder3;

public class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("staring camera");
	}
	
	@Override
	public void doStuff() {
		System.out.println("doing stuff in camera");
	}
	
	@Override
	public void shutdown() {
		System.out.println("shuttingdown camera");
	}
}
