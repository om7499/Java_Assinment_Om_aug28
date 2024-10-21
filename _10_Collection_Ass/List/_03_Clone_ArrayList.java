package List;

import java.util.ArrayList;

public class _03_Clone_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		list.add("Black");
		System.out.println("Original List : "+list);
		ArrayList al = new ArrayList(list);
		System.out.println("Clone list : "+al);
		

	}

}

/* Output : 
Original List : [Red, Blue, Green, Pink, Black]
Clone list : [Red, Blue, Green, Pink, Black]
*/