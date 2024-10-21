package List;

import java.util.ArrayList;

public class _10_Remove_Element {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println("Before Remove : "+al);
		al.remove(4);
		System.out.println("After Remove : "+al);

	}

}

/*
Output :
Before Remove : [10, 20, 30, 40, 50, 60]
After Remove : [10, 20, 30, 40, 60]
*/