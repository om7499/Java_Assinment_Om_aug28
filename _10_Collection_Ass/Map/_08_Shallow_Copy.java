package Map;

import java.util.HashMap;

public class _08_Shallow_Copy {

	public static void main(String[] args) {
		HashMap map = new HashMap();
       map.put(1,"om");
       map.put(2,"Jay");
       map.put(3, "Laksh");
       map.put(4, "Shri");
       System.out.println("Original  : "+map);
       HashMap hm = new HashMap(map);
       System.out.println("Shallow Copy : "+hm);
       
	}

}


/*
output :
Original  : {1=om, 2=Jay, 3=Laksh, 4=Shri}
Shallow Copy : {1=om, 2=Jay, 3=Laksh, 4=Shri}
*/