class Frog{
	private int id;
	private String name;
	public Frog(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		//return super.toString();
		return String.format("%d %s", id,name);
	}
	
	
}
public class ToStringEg {

	public static void main(String[] args) {
		Frog f1 = new Frog(1,"feffy");
		String str = f1.toString();
		System.out.println(str);

	}

}
