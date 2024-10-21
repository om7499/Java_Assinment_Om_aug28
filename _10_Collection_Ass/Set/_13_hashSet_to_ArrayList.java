package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class _13_hashSet_to_ArrayList {

	public static void main(String[] args) {
	   HashSet hs = new HashSet();
	   hs.add(10);
	   hs.add(20);
	   hs.add(30);
	   hs.add(40);
	   System.out.println("HashSet : "+hs);
	   ArrayList al = new ArrayList(hs);
	   System.out.println("ArrayList : "+al);
	}

}

/*
Output :
HashSet : [20, 40, 10, 30]
ArrayList : [20, 40, 10, 30]
*/