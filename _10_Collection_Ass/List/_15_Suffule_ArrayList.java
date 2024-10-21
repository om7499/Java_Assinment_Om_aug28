package List;

import java.util.ArrayList;
import java.util.Collections;

public class _15_Suffule_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("om");
		list.add("Jay");
		list.add("Laksh");
		list.add("Shri");
		list.add("Ram");
	
		System.out.println("Befor shuffle : "+list);
	   Collections.shuffle(list);
       System.out.println("After Shuffle : "+list);
	}

}

/*
 output :
Befor shuffle : [om, Jay, Laksh, Shri, Ram]
After Shuffle : [Shri, om, Laksh, Jay, Ram]
*/