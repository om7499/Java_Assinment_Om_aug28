package Exception_Handling_Task;

class AuthenticationException extends Exception{
	AuthenticationException(String msg){
		super(msg);
	}
}
public class _17_Exercise17 {
	
	_17_Exercise17(String name , String pass) throws AuthenticationException
	{
		if(!isValided(name,pass)) {
			throw new AuthenticationException("invalid username and password");
		}else {
			System.out.println("login successfully... ");
		}
	   
	}
	
	private String name = "ombehare";
	private String password= "xyz1234";
	public boolean isValided(String name , String password) {
		if(name ==this.name && password == this.password) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		try {
			_17_Exercise17 at = new _17_Exercise17("om","xyz1234");
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
	}
}


/* output :
 * Exception_Handling_Task.AuthenticationException: invalid username and password
	at new_Java_project/Exception_Handling_Task._17_Exercise17.<init>(_17_Exercise17.java:13)
	at new_Java_project/Exception_Handling_Task._17_Exercise17.main(_17_Exercise17.java:30)
	*/
