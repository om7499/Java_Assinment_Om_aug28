package Pattern_Statement_Ass;

public class _01_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

/* output :
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
*/
 