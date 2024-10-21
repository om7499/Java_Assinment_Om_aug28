package List;

import java.util.ArrayList;
import java.util.Collections;

public class _12_Reverse_List {
	public static void main(String[] args) {
		   ArrayList al = new ArrayList();
		   al.add("Red");
		   al.add("Green");
		   al.add("Blue");
		   al.add("Pink");
		   al.add("Yellow");
		   al.add("White");
		   System.out.println("Original List : "+al);
		 Collections.reverse(al); 
		 System.out.println("Reversed List : "+al);
		   
}
}

/*
Output :
Original List : [Red, Green, Blue, Pink, Yellow, White]
Reversed List : [White, Yellow, Pink, Blue, Green, Red]
*/