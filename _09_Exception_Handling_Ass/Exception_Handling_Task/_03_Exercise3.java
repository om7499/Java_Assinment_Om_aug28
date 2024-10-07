package Exception_Handling_Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 3: File Not Found Exception
public class _03_Exercise3 {

	public static void main(String[] args) {
		String filename = "nonexistant.txt";
		try {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception : "+e);
			System.out.println(filename+"file not found");
		}

	}

}


/*output :
Exception : java.io.FileNotFoundException: nonexistant.txt (The system cannot find the file specified)
nonexistant.txtfile not found
*/