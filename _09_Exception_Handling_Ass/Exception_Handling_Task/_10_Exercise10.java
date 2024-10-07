package Exception_Handling_Task;

import java.nio.channels.AcceptPendingException;


public class _10_Exercise10 {
  public static void divideByZero() {
	  int num1 = 10;
	  int num2 = 0;
	  try {
		  int res = num1 /num2;
		  System.out.println(res);
	  }catch(ArithmeticException e) {
		  System.out.println(e);
		  throw e; // rethrow the Exceptioon
	  }
  }
	public static void main(String[] args) 
	{
	   try {
		   divideByZero();
	   }catch(ArithmeticException e) {
		   System.out.println(e);
	   }
   
	}
}

/* output :
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
 */

