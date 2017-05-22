

public class Abs {

	public static void main(String[] args) {
		//abstract class examples
		Nikon n = new Nikon();
		n.run();//abs  parent's abs parent's method
		n.start();//Abstract parent's abstract parent's abstract method
		n.click();// overridden abstract method of parent

	}

}
