import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class myTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este é o meu teste");
		
		File myObj = new File("myTest.txt");
		System.out.println("Arquivo criado.");
		
		
		try {
			myObj.createNewFile();
			FileOutputStream fos = new FileOutputStream(myObj);
			PrintWriter writer = new PrintWriter(fos);
			
			int i = 0;
			while(i<1000) {
			writer.println(i);
			i++;
			}
			
			
			
			
			
			
			writer.close();
			

		} 
	      catch (IOException e) {
	         e.printStackTrace();
	      }
		
	}

}
