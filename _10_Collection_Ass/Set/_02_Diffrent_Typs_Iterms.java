package Set;

import java.util.HashSet;

public class _02_Diffrent_Typs_Iterms {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Om");
		hs.add("Jay");
		hs.add(10);
		hs.add(true);
		hs.add(30.30);
		
		System.out.println(hs);

	}

}


/*
Output : [Jay, 30.3, 10, Om, true]
*/