import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		//reading a file using Buffered reader
		
		//new file
		
		try {
			File file = new File("src\\Readme.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str; 
			
			while((str =br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}










/* String locationOfFile = "src\\Readme.txt";
			  File file = new File(locationOfFile); 
			  
			  BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			  
			  String st; 
			  try {
				while ((st = br.readLine()) != null) 
				    System.out.println(st);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
 */