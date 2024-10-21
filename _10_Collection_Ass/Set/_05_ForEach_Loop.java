package Set;

import java.util.HashSet;

public class _05_ForEach_Loop {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
        hs1.add(50);
        hs1.add(60);
        hs1.add(70);
        hs1.add(80);
        hs1.add(20);
        hs1.add(30);
        hs1.forEach(e -> System.out.println(e));

	}

}
/*
output : 
80
50
20
70
60
30
*/