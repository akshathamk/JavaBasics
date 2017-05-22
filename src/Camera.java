
public abstract class Camera extends MachineAbs {

	@Override
	public void start() {
		System.out.println("camera started");
	}

	@Override
	public void stop() {
		System.out.println("camera stopped");
	}
	
	public abstract void click();

}
