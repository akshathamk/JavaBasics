
public abstract class MachineAbs {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public abstract void start();
	public abstract void stop();
	
	public void run(){
		start();
		stop();
	}

}
