package Library_Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
 private List <Book> books;
  public Library() {
	  this.books = new ArrayList<>();
  }
  
  public void addbook(String title,String author) {
	  Book newBook = new Book(title,author);
	  books.add(newBook);
	  System.out.println("Added : "+newBook);
  }
  
  public Book serchBook(String title) {
	  for(Book book : books) {
		  if(book.gettitel().equalsIgnoreCase(title)) {
			  return book;
		  }
	  }
	  return null;
  }
  public void dispalyBook() {
	  if(books.isEmpty()) {
		  System.out.println("No books in the  library");
		  return;
	  }
	  for(Book book : books) {
		  System.out.println(book);
	  }
  }
   
  public void removeBook(String title) {
	  Book bookremove = serchBook(title);
	  if(bookremove != null) {
		  books.remove(bookremove);
		  System.out.println(" Removed : "+ bookremove);
	  }
	  else {
		  System.out.println(" Book not found.");
	  }
  }
}
