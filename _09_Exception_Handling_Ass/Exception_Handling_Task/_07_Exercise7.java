package Exception_Handling_Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

// Exercise 7: Multiple Exceptions
public class _07_Exercise7 {


	public static void main(String[] args) {
		FileInputStream file = null;

        try {
            file = new FileInputStream("nonexistent.txt");
        	 int data = file.read();
        	 System.out.println("Read data : "+data);
         }
         catch(FileNotFoundException e) {
        	 System.out.println(e);
         }
         catch(IOException e1) {
        	 System.out.println(e1);
         }
         finally {
        	 try {
        		 if(file != null) {
        			 file.close();
        		 }
        	 }
        	 catch(IOException e2) {
            	 System.out.println("Error : "+e2);
             }
         }
        
	}

}

/* output :
  java.io.FileNotFoundException: nonexistent.txt (The system cannot find the file specified)
*/
