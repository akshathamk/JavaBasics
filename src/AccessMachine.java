
public class AccessMachine {

	public static void main(String[] args) {
		//inheritance
		Machine m1 = new Machine();
		m1.start();
		m1.stop();
		int i = Machine.infoId;
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.showInfo();
		String n = c1.getName();
		System.out.println(n);
		
		Machine m2 = new Machine();
		
		//interfaces
		Info i1 = m1;
		i1.showInfo();
		
		Info i2 = new Animal("dog");
		i2.showInfo();
		
		Animal a1 = new Animal("cat");
		
		outputInfo(i2);//actual interface object
		outputInfo(m2);//machine object
		outputInfo(a1);//animal obj

	}
	
	public static void outputInfo(Info info){
		info.showInfo();
	}

}
