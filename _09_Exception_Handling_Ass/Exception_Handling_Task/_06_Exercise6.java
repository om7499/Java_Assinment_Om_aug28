package Exception_Handling_Task;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exercise 6: Input Mismatch Exception
public class _06_Exercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter an integer value : ");
			int num = in.nextInt();
			System.out.println("Entered Number : "+num);
		}
		catch(InputMismatchException e) {
			System.out.println("Exception : "+e.getMessage());
			System.out.println("Invalid input Please enter an integer");
		}
		finally{
			in.close();
		}

	}

}

/* output : 
	Enter an integer value : om
	Exception : null
	Invalid input Please enter an integer
*/
