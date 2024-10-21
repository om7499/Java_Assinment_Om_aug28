package List;

import java.util.ArrayList;
import java.util.List;

public class _06_Empty_List {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("om");
		list.add("Amit");
		list.add("Sumit");
		list.add("Ram");
		System.out.println("Befor : "+list);
		list.clear();
		System.out.println("After : "+list);
		

	}

}


/*
Output : 
Befor : [om, Amit, Sumit, Ram]
After : []
*/