
public class Machine implements Info{
	
	protected String name = "Machine1";
	
	public void start(){
		System.out.println("Machine started...");
	}
	public void stop(){
		System.out.println("Machine stopped...");
	}
	public void showInfo(){
		System.out.println("name is "+ name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
