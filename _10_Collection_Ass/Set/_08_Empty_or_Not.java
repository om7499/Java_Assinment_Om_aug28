package Set;

import java.util.HashSet;

public class _08_Empty_or_Not {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		
		if(hs.isEmpty()) {
			System.out.println("HashSet is Empty ...");
		}
		else {
			System.out.println("HashSet is Not Empty...");
		}

	}

}

/*
output :  HashSet is Not Empty...
*/
