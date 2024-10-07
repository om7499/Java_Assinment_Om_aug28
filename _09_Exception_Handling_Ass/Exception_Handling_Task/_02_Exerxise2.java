package Exception_Handling_Task;

public class _02_Exerxise2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		try {
			 int num = arr[6];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e);
			System.out.println("index is out of bound");
		}

	}

}

/*output :
Exception : java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
index is out of bound
*/