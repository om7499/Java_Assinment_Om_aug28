package Exception_Handling_Task;
 class InsufficeantBalenceException extends Exception {
	InsufficeantBalenceException(String msg){     
	super(msg);
	}
}
class Bank{
	private double balence;
	public Bank(double balence) {
		this.balence = balence;
	}
	public void withdraw(double amount) throws InsufficeantBalenceException
	{
		if(amount > balence ) {
			throw new InsufficeantBalenceException("insufficeant balence ");
		}
		balence = balence - amount;
	}
}

public class _13_Exercise13 {
	public static void main(String[] args) {
		Bank b= new Bank(10000.00);
       try {
    	   b.withdraw(15000.00);
       }catch(InsufficeantBalenceException e) {
    	   System.out.println(e);
       }
	}

}


/* output : 
 Exception_Handling_Task.InsufficeantBalenceException: insufficeant balence 
*/
