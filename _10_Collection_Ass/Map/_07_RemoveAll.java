package Map;

import java.util.HashMap;

public class _07_RemoveAll {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "Black");
        hm.put(5, "grey");
        System.out.println("Before remove : "+hm);
        hm.clear();
        System.out.println("After remove : "+hm);

	}

}

/*
Output :
Before remove : {1=Red, 2=Green, 3=Blue, 4=Black, 5=grey}
After remove : {}
*/