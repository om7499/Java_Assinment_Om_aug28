package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _01_Create_Queue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);

	}

}

/*
Output : [10, 20, 30, 40]
*/