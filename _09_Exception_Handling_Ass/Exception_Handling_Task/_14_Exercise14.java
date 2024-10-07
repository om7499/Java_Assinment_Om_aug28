package Exception_Handling_Task;

import java.util.Scanner;

class InvalidInputException extends Exception
{
	InvalidInputException(String msg){
		super(msg);
	}
}
public class _14_Exercise14 {
	public static void main(String[] args) throws InvalidInputException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your UserName");
		String userName = in.nextLine();
		if(userName.length() < 6) {
			throw new InvalidInputException("user name must be at least 6 character");
		}
       System.out.println("UserName : " +userName);
	}

}


/*  output : 
Enter your UserName
om
Exception in thread "main" Exception_Handling_Task.InvalidInputException: user name must be at least 6 character
	at new_Java_project/Exception_Handling_Task._14_Exercise14.main(_14_Exercise14.java:18)
*/