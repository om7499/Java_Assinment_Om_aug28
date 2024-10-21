package Map;

import java.util.HashMap;

public class _06_Map_contains {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "Black");
        hm.put(5, "grey");
        
       boolean b =  hm.containsValue("grey");
      System.out.println(b);
	}

}
