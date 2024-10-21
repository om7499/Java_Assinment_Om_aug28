package Set;

import java.util.HashSet;

public class _20_Append_element {

	public static void main(String[] args) {
		  HashSet hs = new HashSet();
		  hs.add(10);
          hs.add(20);
          hs.add(30);
          hs.add(40);
          hs.add(50);
          
          HashSet hs1 = new HashSet();
          hs1.add(89);
          hs1.add(78);
          hs1.add(67);
          hs1.add(56);
          hs1.add(45);
          
          hs.addAll(hs1);
          System.out.println(hs);
		  
	}

}

/*
Output :  [50, 67, 20, 40, 56, 89, 10, 45, 30, 78]
*/
