package Set;

import java.util.HashSet;

public class _19_Using_SplitIterator {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	       hs.add(10);
	       hs.add(20);
	       hs.add(30);
	       hs.add(40);
	       hs.add(50);
	       
	       System.out.println(hs);
	      hs.spliterator();
	      System.out.println(hs);
	       

	}

}
