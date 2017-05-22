class Thing{
	//instance variable
	public String name;
	
	//class variable
	public static String description;
	public static int count = 0;
	
	//constant
	public final static int CODE=123;
	
	public Thing(){
		count++;
	}
	//instance method
	public void showAll(){
		int n = 0 ;
		System.out.println(n);
		System.out.println("name is "+name+ " description is "+description + "and the code is always "+CODE);
	}
	
	//static method
	public static void showInfo() {
		System.out.println(description+CODE);
		//wont work: System.out.println(name);
	}
}
public class StaticFinalEg {

	public static void main(String[] args) {
		
		System.out.println("count before "+Thing.count);
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		System.out.println("count after "+Thing.count);
		
		t1.showAll();//name is null description is null
		
		t1.name = "Bottle";
		t1.showAll();//name is Bottle description is null
		
		//t1.description = "ggg";//warning
		t1.showAll();//name is Bottle description is ggg
		
		Thing.description = "abcd";
		t1.showAll();//name is Bottle description is abcd
		
		t2.showAll();//name is null description is abcd
		
		//t1.showInfo();
		//t2.showInfo();
		//Thing.CODE = 9;
		Thing.showInfo();
		
	}

}
