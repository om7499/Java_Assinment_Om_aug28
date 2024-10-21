package Set;

import java.util.HashSet;

public class _03_Empty_HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Red");
		hs.add("Green");
		hs.add("Blue");
		hs.add("Black");
		hs.add("Pink");
		
		System.out.println(hs);
		hs.clear();
		System.out.println("Empty : "+hs);
		

	}

}

/* output :
[Red, Pink, Blue, Black, Green]
Empty : []
*/