package Exception_Handling_Task;
//  Null Pointer Exception
public class _05_Exercise5 {

	public static void main(String[] args) {
		String str = null;
		 try {
			 int len = str.length();
			 System.out.println("String length : "+len);
		 }
         catch(NullPointerException e) {
        	 System.out.println("Execption : "+ e.getMessage());
        	 System.out.println("String is Null...");
         }
	}

}



/* output :  
Execption : Cannot invoke "String.length()" because "str" is null
String is Null...
*/