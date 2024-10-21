package Set;

import java.util.HashSet;

public class _07_HashSet_to_Array {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println("HashSet : "+hs);
      
		Object [] arr = hs.toArray();
		for(Object x : arr) {
			System.out.println(x);
		}
		


	}

}

/*
Object : 
HashSet : [50, 20, 40, 10, 30]
50
20
40
10
30
*/