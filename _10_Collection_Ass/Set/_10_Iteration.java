package Set;

import java.util.HashSet;
import java.util.Iterator;

public class _10_Iteration {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(50);
		hs.add(40);
		hs.add(10);
		hs.add(30);
		hs.add(20);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}

/*
output :  50 20 40 10 30 
*/