package Library_Book;

public class Book {
      private String title;
      private String author;
      public Book(String title,String author) {
    	  this.title = title;
    	  this.author = author;
      }
     public String gettitel() {
    	  return title;
      }
     public String getauthor() {
    	  return author;
      }
   
     public String toString() {
    	  return title +" by "+author;
      }

}
