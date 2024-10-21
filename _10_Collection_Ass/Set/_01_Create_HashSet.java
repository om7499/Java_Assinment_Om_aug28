package Set;

import java.util.HashSet;

public class _01_Create_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs);

	}

}
/* 
Output : [20, 40, 10, 30]
*/