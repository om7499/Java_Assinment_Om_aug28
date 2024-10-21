package List;

import java.util.ArrayList;
import java.util.Collections;

public class _14_Sort_ArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(60);
		al.add(10);
		System.out.println("Before sort : "+al);
		Collections.sort(al);
		System.out.println("After Sort : "+al);

	}

}
/*
Output : 
Before sort : [50, 40, 30, 20, 60, 10]
After Sort : [10, 20, 30, 40, 50, 60]
*/