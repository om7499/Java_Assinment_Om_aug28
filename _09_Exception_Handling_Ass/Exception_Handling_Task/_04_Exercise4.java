package Exception_Handling_Task;
/* Write a Java program that defines a custom exception class and throws 
that exception within the program.
*/


class CustomException extends Exception{
	CustomException(String msg){
		super(msg);
	}
}
public class _04_Exercise4 {

	public static void main(String[] args) {
		try {
			throw new CustomException("This is a custom exception");
		}
		catch(CustomException e) {
			System.out.println("Exception : "+e.getMessage());
		}

	}

}


/* output : 
Exception : This is a custom exception
*/