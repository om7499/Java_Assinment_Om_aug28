package List;

import java.util.LinkedList;
import java.util.List;

public class _04_Compare_Two_List {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add("Rohit");
		list1.add("Virat");
		list1.add("Dhoni");
		System.out.println(list1);
		
		LinkedList list2 = new LinkedList();
		list2.add("Virat");
		list2.add("Rohit");
		list2.add("Dhoni");
		System.out.println(list2);
		
		boolean result = list1.equals(list2);
		System.out.println(result);
       
	}

}

/*
Output :
[Rohit, Virat, Dhoni]
[Virat, Rohit, Dhoni]
false
*/