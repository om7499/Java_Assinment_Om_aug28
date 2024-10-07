package Exception_Handling_Task;
//  Create a Custom Unchecked Exception

class CoustomUnCheckedException extends Exception{
	 CoustomUnCheckedException(String msg){
		 super(msg);
	 }
}
public class _12_Exerxise12 {
	public static void main(String[] args) {
		
      try {
    	  throw new  CoustomUnCheckedException("It is custom un checked Exception ");
      }
      catch( CoustomUnCheckedException e) {
    	  System.out.println(e);
      }
	}

}
