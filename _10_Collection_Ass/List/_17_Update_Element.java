package List;

import java.util.ArrayList;

public class _17_Update_Element {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Befor Update : "+al);
		al.set(2,90);
		System.out.println("After Update : "+al);
		

	}

}

/*
Output :
Befor Update : [10, 20, 30, 40, 50]
After Update : [10, 20, 90, 40, 50]
*/