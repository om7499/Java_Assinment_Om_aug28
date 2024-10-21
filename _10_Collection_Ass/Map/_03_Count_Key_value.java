package Map;

import java.util.HashMap;

public class _03_Count_Key_value {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        
        System.out.println("Total count : "+hm.size());
	}

}


/*
Output : Total count : 3
*/