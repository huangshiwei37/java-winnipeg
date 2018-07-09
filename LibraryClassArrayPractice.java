
import java.util.Scanner;

public class LibraryClassArrayPractice{
  public static void main(String[] args){
    final int NUMBER_OF_BOOKS = 3;

    Book[] books = new Book[NUMBER_OF_BOOKS];

    // read in books' information
    for(int i=0; i<books.length; i++){
      String name;
      int numberOfPages;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the book name: "); 
      name = scanner.nextLine();

      System.out.println("Enter the number of pages of the book: "); 
      numberOfPages = scanner.nextInt();

      books[i] = new Book(name, numberOfPages);

      // books[i] = new Book(); // default values
    }

    // print books
    for(int i=0; i<books.length; i++){
      System.out.println("Book" + (i+1) + " name is " + books[i].name);
      System.out.println("The number of pages of Book " + (i+1) + " is " + books[i].numberOfPages);
    }

    // find the largest book
    Book largestBook;
    largestBook = findLargestBook(books);
    System.out.println("The book" + largestBook.name + " is the largest with " 
     + largestBook.numberOfPages + " pages");

    // find the number of pieces of paper required
    for(int i=0; i<books.length; i++){
      System.out.println("Print book " + books[i].name + " requires "
       + books[i].findNumberOfPapersRequired() + " pieces of paper");
    }
  }

  public static Book findLargestBook(Book[] books){
    int largestBookIndex = 0;
    int largestNumberOfpages = books[0].numberOfPages;
    for(int i=1; i<books.length; i++){
      if(largestNumberOfpages < books[i].numberOfPages){
        largestBookIndex = i;
        largestNumberOfpages = books[i].numberOfPages;
      }
    }
    return books[largestBookIndex];
  }
}

class Book{
  public String name;
  public int numberOfPages;

  // default values
  public Book(){
    this.name ="A";
    this.numberOfPages = 10;
  }

  public Book(String name, int numberOfPages){
    this.name = name;
    this.numberOfPages = numberOfPages;
  }

  public int findNumberOfPapersRequired(){
    return (numberOfPages/2) + (numberOfPages%2);
  }
}