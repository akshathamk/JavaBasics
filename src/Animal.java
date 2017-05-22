
public class Animal implements Info {
	
	private String aniName;
	
	public void move(){
		System.out.println("moving...");
	}

	public Animal(String aniName) {
		//super();
		this.aniName = aniName;
	}

	@Override
	public void showInfo() {
		System.out.println("my name is "+aniName);
		
	}

}
