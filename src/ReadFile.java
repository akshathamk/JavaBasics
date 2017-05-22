import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File f = new File("test.txtj");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+f.toString());
		}
		 catch (IOException e) {
			System.out.println("Unable to read: "+f.toString());
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("unable to close: "+f.toString());
			}catch (NullPointerException e){
				// file not opened?
				System.out.println("I'm here");
			}
		}
		

	}

}
