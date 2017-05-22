import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		File f = new File("write.txt");
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(f));
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("This is line three");
			
			
		} 
		 catch (IOException e) {
			System.out.println("Unable to write: "+f.toString());
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
