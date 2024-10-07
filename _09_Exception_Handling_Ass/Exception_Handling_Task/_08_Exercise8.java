package Exception_Handling_Task;
// Exercise 8: Propagating Exceptions
public class _08_Exercise8 {
   public static void divideByZero() {
	   int num1 = 10;
	   int num2 = 0;
	   int result = num1/0;
	   System.out.println("Result : "+result);
   }
	public static void main(String[] args) {
		try {
			divideByZero();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}

}


/* output : 
 * Exception : java.lang.ArithmeticException: / by zero
 * */
