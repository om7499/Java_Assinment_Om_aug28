package Exception_Handling_Task;

class CustomCheckedException extends Exception{
	private String errorInfo;
	CustomCheckedException (String msg,String errorInfo){
		super(msg);
		this.errorInfo = errorInfo;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
}

public class _16_Exercise16 {
	public static void main(String[] args) throws CustomCheckedException
	{
		 try {
			 throw new CustomCheckedException("custom checked Exception","Addition info :Abc");
		 }catch(CustomCheckedException e) {
			 System.out.println("CustomCheckedException cought : "+e);
		 }

	}

}

/* output : 
Exception in thread "main" java.lang.NoSuchMethodError: 'void Exception_Handling_Task.CustomCheckedException.<init>(java.lang.String, java.lang.String)'
at new_Java_project/Exception_Handling_Task._16_Exercise16.main(_16_Exercise16.java:18)
*/