
public class PolyEg {

	public static void main(String[] args) {
		Plant p1 = new Plant();
		p1.grow();
		
		Tree  t1 = new Tree();
		t1.grow();
		t1.shedLeaves();
		
		Plant p2 = new Tree();
		Plant p3 = t1;
		
		//wont work cant convert from plant to tree(here tree extends plant)
		//Tree t2 = new Plant();
		
		p2.grow();// calls grow of class Tree, 
		//here not the type of the variable but the object its pointing to is imp
		// here the obj type is considered to know which method to implement
		
		p3.grow();
		
		//p3.shedLeaves(); // cannot access Tree specific methods 
		//here the variable typ is considered to know what all methods are accesible
		
		doGrow(p1);
		doGrow(t1);
		//doGrow("p");
		doGrow(p2);
		
	}
	
	public static void doGrow(Plant p){
		p.grow();
		
	}

}
