package Map;

import java.util.HashMap;
import java.util.Set;

public class _04_Create_Set_View {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "Black");
        hm.put(5, "grey");
        
        Set set = hm.entrySet();
        System.out.println(set);

	}

}

/*
output : [1=Red, 2=Green, 3=Blue, 4=Black, 5=grey]
*/
