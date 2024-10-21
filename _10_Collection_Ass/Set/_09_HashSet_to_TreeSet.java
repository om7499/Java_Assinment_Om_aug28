package Set;

import java.util.HashSet;
import java.util.TreeSet;

public class _09_HashSet_to_TreeSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(50);
		hs.add(40);
		hs.add(10);
		hs.add(30);
		hs.add(20);
		System.out.println("HashSet : "+hs);
		
		TreeSet ts = new TreeSet(hs);
		System.out.println("TreeSet : "+ts);

	}

}

/*
output :
HashSet : [50, 20, 40, 10, 30]
TreeSet : [10, 20, 30, 40, 50]
*/