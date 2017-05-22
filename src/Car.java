
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started...");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped...");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		//super.showInfo();
		System.out.println("name is "+name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
 
}
