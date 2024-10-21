package Map;

import java.util.HashMap;
import java.util.Map;

public class _02_copy_all {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Om");
		map.put(2,"Jay");
		map.put(3, "Shri");
		map.put(4, "Laksh");
		System.out.println("Original : "+map);
	   HashMap hm = new HashMap(map);
	   System.out.println("Copy: "+hm);
	   

	}

}


/*
Output :
Original : {1=Om, 2=Jay, 3=Shri, 4=Laksh}
Copy: {1=Om, 2=Jay, 3=Shri, 4=Laksh}
*/