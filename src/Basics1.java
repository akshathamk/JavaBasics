import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		//My hello world prg
		System.out.println("Hello World!");
		
		//variables
		int myNumber;
		myNumber = 67;
		int myNumber1 = 76;
		float f1 = 6.45f;
		System.out.println(myNumber1);
		char ch = '9';
		boolean b = true;
		
		//working with text
		String str = "Hello";
		String str1 = str + "Aksh";
		System.out.println(str1 + "Pru" + myNumber);
		
		//loops
		boolean loop = 4==myNumber1;
		System.out.println(loop);
		
		int i = 0;
		while(i<6) {
			System.out.println(i);
			i++;
		}
		
		
		for(int f=0;f<7;f++){
			System.out.println("hi"+f);
			System.out.printf("value is %d\n",f);
		}
		
		/*
		int int1 = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter an integer");
			int1 = scanner.nextInt();
		}while(int1 !=5);
			
		System.out.println("Got 5!");
		*/
		
		//if
		int cond = 15;
		if(cond <10)
			System.out.println("Its a yes");
		else if(cond >20)
			System.out.println("Its a no");
		else
			System.out.println("whatever");
		
		int var = 0;
		while(true){
			if(var == 3)
				break;
			var++;
			System.out.println("running..");
		}
		
		//switch
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter a command");
		String input = scanner1.nextLine();
		
		switch(input){
		case "start":
			System.out.println("Machine started for u");
			break;
		case "stop":
			System.out.println("Machine stopped for u");
			break;
		default:
			System.out.println("I dunno what to do for that");
		}
		
		//get user input
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String text = s.nextLine();
		System.out.println("You entered:"+text);
		*/
		
		//arrays
		int arr3[] = new int[5];
		int[] arr = new int[3];
		System.out.println(arr.getClass());
		System.out.println(arr[0]);
		arr[0]=6;
		System.out.println(arr[0]);
		for(int a=0;a<arr.length;a++){
			System.out.println(arr[a]);
		}
		int[] numbers = {8,4,6,0};
		String[] word = {"Hi","Hello","Hey"};
		for(String w: word){
			System.out.println("I'm :"+w);
		}
		
		String string = null;//default, int 0
		String[] strings = new String[2];
		
		int[][] grid = {
				{1,1,1},
				{2,2},
				{3}
		};
		System.out.println(grid[1][1]);		
		for(int row = 0; row<grid.length;row++){
			for(int col = 0; col<grid[row].length;col++){
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
		
		String[][] strArray = new String[2][1];
		strArray[0] = new String[2];
		for(int row = 0; row<strArray.length;row++){
			for(int col = 0; col<strArray[row].length;col++){
				System.out.print(strArray[row][col]+"\t");
			}
			System.out.println();
		}
		
	}
}
