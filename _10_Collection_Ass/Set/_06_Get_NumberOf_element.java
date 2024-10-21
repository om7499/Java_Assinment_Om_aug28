package Set;

import java.util.HashSet;

public class _06_Get_NumberOf_element {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Red");
		hs.add("Green");
		hs.add("Blue");
		hs.add("Black");
		hs.add("Pink");
		System.out.println(hs);
		
		System.out.println("total element : "+hs.size());

	}

}

/*
output :
[Red, Pink, Blue, Black, Green]
total element : 5
*/