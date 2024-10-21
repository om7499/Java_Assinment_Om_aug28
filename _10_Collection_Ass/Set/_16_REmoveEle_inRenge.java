package Set;

import java.util.HashSet;

public class _16_REmoveEle_inRenge {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(33);
		hs.add(40);
		hs.add(30);
		hs.add(50);
		hs.add(14);
		hs.add(21);
		hs.add(18);
		hs.add(31);
		hs.add(50);
      
		System.out.println("HashSet Element  : "  +hs );
		if(hs.removeIf(val ->(val > 30))) {
		   System.out.println("Iterm removed Successfully...");	
		}
		else {
			System.out.println("Unable to remove item.");
		}
		System.out.println("Hasset Elements : "+hs);
	}

}

/*
Output : 
HashSet Element  : [33, 50, 18, 21, 40, 10, 30, 14, 31]
Iterm removed Successfully...
Hasset Elements : [18, 21, 10, 30, 14]
*/
