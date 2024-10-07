package Exception_Handling_Task;
//  Custom Checked Exception with Parameters
class CustomCheckedException extends Exception{
	private int erorcode;
	CustomCheckedException(String msg, int errorcode){
		super(msg);
		this.erorcode = errorcode;
	}
	public int getErrorCode() {
		return erorcode;
	}
}
public class _15_Exercise15 {
	public static void main(String[] args) throws CustomCheckedException
	{
		
       try {
    	   throw new CustomCheckedException("custom checke exception with params ",404);
       }catch(CustomCheckedException e) {
    	   System.out.println(e.getMessage());
    	   System.out.println("Erroe code : "+e.getErrorCode());
       }
	}

}

/* output :
 * Exception in thread "main" java.lang.NoSuchMethodError: 'void Exception_Handling_Task.CustomCheckedException.<init>(java.lang.String, int)'
	at new_Java_project/Exception_Handling_Task._15_Exercise15.main(_15_Exercise15.java:18)
	*/
