package Exception_Handling_Task;
//1: Divide by Zero Exception
public class _01_Exercise1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2;
		}
		catch(ArithmeticException e) {
			System.out.println("error : "+e);
			System.out.println("we  can not divided by zero");
		}
	}

}

  /* output : 
	error : java.lang.ArithmeticException: / by zero
	we  can not divided by zero
*/
