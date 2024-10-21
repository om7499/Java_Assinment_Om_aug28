package Set;

import java.util.HashSet;

public class _14_Remove_Other_HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(30);
		hs.add(50);
		hs.add(60);
		
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(50);
		hs1.add(20);
		System.out.println("Before remove hs : "+hs);
		System.out.println("hs1 conotain : "+hs1);
		hs.removeAll(hs1);
		System.out.println("After remove hs1 into hs : "+hs);
		

	}

}

/*
Output :
Before remove hs : [50, 20, 40, 10, 60, 30]
hs1 conotain : [50, 20, 10]
After remove hs1 into hs : [40, 60, 30]
*/