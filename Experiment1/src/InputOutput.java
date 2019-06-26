import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\r.bhandary\\Desktop\\test.txt");
		File fileOut=new File("C:\\Users\\r.bhandary\\Desktop\\output.txt");
		 FileReader fr=new FileReader(file);    
         BufferedReader br=new BufferedReader(fr); 
         FileWriter fw=new FileWriter(fileOut);    
         BufferedWriter bw=new BufferedWriter(fw);
         
         
         int i;
         String name;
         while((name=br.readLine())!=null){
        	 if(!(name.contains("AM:")||(name.contains("PM:"))))
        	{
        		// System.out.print(name);
        		 bw.write(name);
        		 bw.newLine();
        	 }
        	        	// System.out.println("\n");
        	 
         }  
         br.close();    
         fr.close();
         bw.close();
         fw.close();
		
		
	}

}
