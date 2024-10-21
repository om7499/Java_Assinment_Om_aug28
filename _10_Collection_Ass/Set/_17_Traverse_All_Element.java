package Set;

import java.util.HashSet;
import java.util.Iterator;

public class _17_Traverse_All_Element {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add("red");
		hs1.add("green");
		hs1.add("Blue");
		hs1.add("Pink");
		hs1.add("Black");
		hs1.add("Yellow");
		
		Iterator itr = hs1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

/*
Output :
red
green
Pink
Blue
Yellow
Black
*/