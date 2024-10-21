package Set;

import java.util.HashSet;

public class _04_Union_hashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        
        HashSet hs1 = new HashSet();
        hs1.add(50);
        hs1.add(60);
        hs1.add(70);
        hs1.add(80);
        
        System.out.println("HashSet 1 : "+hs);
        System.out.println("HashSet 2 : "+hs1);
        
        HashSet<Integer> union = new HashSet<Integer>(hs);
        union.addAll(hs1);
        System.out.println("Union set 1 + set 2 : "+union);
	}

}

/*
Output : 
HashSet 1 : [20, 40, 10, 30]
HashSet 2 : [80, 50, 70, 60]
Union set 1 + set 2 : [80, 50, 20, 70, 40, 10, 60, 30]
*/
