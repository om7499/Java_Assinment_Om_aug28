package List;

import java.util.ArrayList;
import java.util.Vector;

public class _02_Capacity_Arraylist {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		
		Vector v = new Vector(list);
		 System.out.println("Capacity of ArryList : "+v.capacity());

	}

}

/*
   Output : Capacity of ArryList : 4
*/