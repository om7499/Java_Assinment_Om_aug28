package List;

import java.util.ArrayList;
import java.util.List;

public class _07_Sub_List {

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add("Rohit");
		li.add("Virat");
		li.add("Dhoni");
		li.add("Gill");
		System.out.println("Main List : "+li);
       System.out.println("Sub_list : "+ li.subList(1, 3));
       
	}

}

/* 
Output :
Main List : [Rohit, Virat, Dhoni, Gill]
Sub_list : [Virat, Dhoni]
*/