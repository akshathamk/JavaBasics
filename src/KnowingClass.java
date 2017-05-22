class Person {
	int age;
	String name;
	
	public Person(){
		System.out.println("Constructor running");
		this.name = "Aksh";
		this.age = 25;
	}
	public Person(String name){
		this();
		this.name = name;
	}
	
	public Person(int age){
		this();
		this.age = age;
	}
	
	void speak() {
		System.out.println("Heyya I am "+name);
		System.out.println(this.getClass());
		speakThis("calling u from a diff method");
	}
	
	void speakThis(String str){
		System.out.println("I was asked to speak "+str);
	}
	
	int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void move(String direction,int metres){
		System.out.printf("I am moving %d metres to %s\n",metres,direction);
	}
	
}
public class KnowingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person() ;
		p1.name = "aksh";
		p1.age = 25;
		p1.speak();
		p1.speakThis("what I like");
		
		Person p2 = new Person();
		p2.name = "pru";
		p2.age = 26;
		p2.move("west", 3);
		
		System.out.println(p1.name + " is " + p1.age + " years old");
		System.out.println(p1.getClass());
		System.out.println(p2.getAge());
		System.out.println();
		

	}

}
