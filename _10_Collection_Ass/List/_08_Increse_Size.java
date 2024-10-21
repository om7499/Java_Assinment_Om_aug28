package List;

import java.util.ArrayList;

public class _08_Increse_Size {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(3);
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		System.out.println("Original list : "+list);
		list.ensureCapacity(6);
		list.add("Yellow");
		list.add("Pink");
		list.add("White");
		System.out.println("After Incerse : "+list);

	}

}

/* 
Output :
Original list : [Red, Green, Blue]
After Incerse : [Red, Green, Blue, Yellow, Pink, White]
*/