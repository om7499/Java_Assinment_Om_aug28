package List;

import java.util.ArrayList;

public class _05_Copy_ArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Orignal List : "+al);
		
		ArrayList  copy = new ArrayList(al);
		System.out.println("Copy List : "+copy);

	}

}

/* Output :
Orignal List : [10, 20, 30, 40, 50]
Copy List : [10, 20, 30, 40, 50]
*/