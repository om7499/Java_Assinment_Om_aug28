package Set;

import java.util.HashSet;

public class _11_RemoveAll_Element {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("om");
		hs.add(20);
		hs.add(90.99);
		System.out.println("Before Remove : "+hs);
		hs.clear();
		System.out.println("After removeAll : "+hs);
		
	}

}


/*
output :
Before Remove : [90.99, 20, om]
After removeAll : []
*/