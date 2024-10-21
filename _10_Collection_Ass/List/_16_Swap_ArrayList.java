package List;

import java.util.ArrayList;
import java.util.Collections;

public class _16_Swap_ArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Pink");
        al.add("Black");
        
        System.out.println("Before Swap : "+al);
        Collections.swap(al, 1, 3);
        System.out.println("After Swap : "+al);
        
	}

}

/*
Output :
Before Swap : [Red, Green, Blue, Pink, Black]
After Swap : [Red, Pink, Blue, Green, Black]
*/

