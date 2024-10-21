package Set;

import java.util.HashSet;

public class _18_Using_Parralel_Strime {

	public static void main(String[] args) {
       HashSet hs = new HashSet();
       hs.add(10);
       hs.add(20);
       hs.add(30);
       hs.add(40);
       hs.add(50);
       
       hs.parallelStream().forEach(e -> System.out.print(e+" "));

	}

}

/*
Output : 40 30 20 50 10 
*/