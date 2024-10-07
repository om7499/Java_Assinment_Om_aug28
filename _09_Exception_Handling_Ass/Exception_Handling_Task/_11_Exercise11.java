package Exception_Handling_Task;


class CustomCheckedException extends Exception
{
	CustomCheckedException(String msg){
		super(msg);
	}
	
}
public class _11_Exercise11 
{

	public static void main(String[] args) {
		try {
			throw new CustomCheckedException("It is custome checked Exception ");
		}catch(CustomCheckedException e) {
			System.out.println(e);
		}
	}
}



/* output : 
Exception_Handling_Task.CustomCheckedException: It is custome checked Exception 
*/