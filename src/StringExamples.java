
public class StringExamples {

	public static void main(String[] args) {
		
		//string builder
		String str = "";
		str+= "Hey";
		str+= " ";
		str+= "Hi";
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder("hell ");// works without initializing with a value
		sb.append("hellooooo ").append(str).append("  end");
		
		System.out.println(sb);
		
		//string formatting
		for(int i = 0; i<=15; i=i+3){
			System.out.printf("%-3d an integer with left allignment\n",i);
		}
		
		System.out.printf("Total value is %f\n",5.6);//5.600000
		System.out.printf("Total value is %.2f\n",5.6888);//5.69
		System.out.printf("Total value is %6.2f\n",5.6);//  5.60
		System.out.printf("Total value is %-8.2f\n",523.765);//523.77  //....
		

	}

}
