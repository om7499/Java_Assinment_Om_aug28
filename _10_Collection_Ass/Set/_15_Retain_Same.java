package Set;

import java.util.HashSet;

public class _15_Retain_Same {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add("red");
		hs1.add("green");
		hs1.add("Blue");
		hs1.add("Pink");
		hs1.add("Black");
		hs1.add("Yellow");
		
		HashSet hs2 = new HashSet();
		hs2.add("Pink");
		hs2.add("red");
		hs2.add("Black");
		hs2.add("Purple");
		hs2.add("Grey");
		
		hs1.retainAll(hs2);
		System.out.println(hs1);

	}

}

/*
Output :  [red, Pink, Black]
*/