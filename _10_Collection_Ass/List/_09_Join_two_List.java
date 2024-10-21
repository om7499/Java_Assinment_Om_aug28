package List;

import java.util.ArrayList;

public class _09_Join_two_List {

	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("List one : "+li);
		ArrayList al1 = new ArrayList();
		al1.add(40);
		al1.add(50);
		al1.add(60);
		System.out.println("List two : "+al1);
		
		li.addAll(al1);
		System.out.println("Joined list : "+li);
		

	}

}

/*
Output :
List one : [10, 20, 30]
List two : [40, 50, 60]
Joined list : [10, 20, 30, 40, 50, 60]
*/