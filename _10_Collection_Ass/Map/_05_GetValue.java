package Map;

import java.util.HashMap;

public class _05_GetValue {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "Black");
        hm.put(5, "grey");
  
        
        System.out.println(hm.get(2));

	}

}
