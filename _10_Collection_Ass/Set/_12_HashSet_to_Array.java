package Set;

import java.util.HashSet;

public class _12_HashSet_to_Array {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Red");
		hs.add("Green");
		hs.add("Blue");
		hs.add("Black");
		hs.add("Pink");
		
		System.out.println("HashSet : "+ hs);
		Object[] arr = hs.toArray();
		for(Object x : arr) {
			System.out.print("Array : "+x+",");
		}
	}

}

/*
Output : 
HashSet : [Red, Pink, Blue, Black, Green]
Array : Red,Array : Pink,Array : Blue,Array : Black,Array : Green,
*/