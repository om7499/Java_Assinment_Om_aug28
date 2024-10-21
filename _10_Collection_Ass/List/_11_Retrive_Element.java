package List;

import java.util.ArrayList;
import java.util.Iterator;

public class _11_Retrive_Element {

	public static void main(String[] args) {
   ArrayList al = new ArrayList();
   al.add("Red");
   al.add("Green");
   al.add("Blue");
   al.add("Pink");
   al.add("Yellow");
   al.add("White");
   
   Iterator  itr = al.iterator();
   while(itr.hasNext()) 
   {
	   System.out.println(itr.next());
   }

	}

}
/*
 * Output :
	Red
	Green
	Blue
	Pink
	Yellow
	White
 */

