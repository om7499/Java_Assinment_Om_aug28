package List;

import java.util.ArrayList;

public class _13_Serch_Element {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		if(al.contains(30)) {
		System.out.println("30 is present into list... ");
		}else {
			System.out.println("30 is not Present inot List...!");
		}
	}

}

/* output :
30 is present into list... 
*/