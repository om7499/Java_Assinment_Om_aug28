package Exception_Handling_Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//  9: Checked and Unchecked Exceptions
public class _08_exercise9 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream file = new FileInputStream("xyz.txt");
			int data = file.read();
			System.out.println(data);
			
			int numinator = 10;
			int denomenator = 0;
			int result = numinator / denomenator;
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}

/* output : 
  java.io.FileNotFoundException: xyz.txt (The system cannot find the file specified)
  */

