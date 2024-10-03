package Library_Book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println(" Library management Syatem");
        	System.out.println(" 1. Add a new Book");
        	System.out.println(" 2. search for a book by Title");
        	System.out.println(" 3. Display All Book");
        	System.out.println(" 4. Remove a book by title");
        	System.out.println(" 5. Exit");
        	
        	System.out.print("Enter  any  option number (1,2,3,4,5) : ");
        	int choice = sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice) {
        	case 1:
        	System.out.print("Enter book title  : ");
        	String title = sc.nextLine();
        	System.out.print("Enter a book author : ");
        	String author = sc.nextLine();
        	library.addbook(title, author);
        	System.out.println("---------------------------------------");
        	break;
        	
        	case 2:
        		System.out.print("Enter Book title to serch : ");
        		title  = sc.nextLine();
        		Book foundBook = library.serchBook(title);
        		if(foundBook != null) {
        			System.out.println("found : "+foundBook.toString());
        			System.out.println("---------------------------------------");
        		}
        		else {
        			System.out.println(" Book not found ");
        			System.out.println("---------------------------------------");
        		}
        		break;
        	case 3:
        		library.dispalyBook();
        		System.out.println("---------------------------------------");
        		break;
        	case 4:
        		System.out.print("Enter book title to remove : ");
        		title = sc.nextLine();
        		library.removeBook(title);
        		System.out.println("---------------------------------------");
        		break;
        	case 5:
        		System.out.print("Existing ...");
        		sc.nextLine();
        		System.out.println("---------------------------------------");
        		return;
        	default :
        		System.out.println("Invalid option plese try again");
        		System.out.println("---------------------------------------");
        		
        	}
        }
	}

}
