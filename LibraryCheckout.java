
import java.util.Scanner;

public class LibraryCheckout{

  public static void main(String[] args){

    int selectedOption = getSelectedOption();
    Book[] books = new Book[10];
    int numberOfBooks = 0;
    int selectedBookIndex;

    while(selectedOption != 1){

      switch(selectedOption){

        // create a book
        case 2:
          books[numberOfBooks] = createABook();
          numberOfBooks++;
          break;

        // Take out a book  
        case 3:
          takeOutABook(books, numberOfBooks);
          break;

        // return a book  
        case 4:
          returnABook(books, numberOfBooks);
          break;

        // list all books  
        case 5:   
          showAllBooks(books, numberOfBooks);
          break;  

        default:
          System.out.println();
          System.out.println("Your input is invalid!");
          break;
      }

      selectedOption = getSelectedOption();
    }

    System.out.println();
    System.out.println("Thanks for stopping by!");

  }

  public static int getSelectedOption(){
    Scanner scanner = new Scanner(System.in);
    int selectedOption;

    
    System.out.println();
    System.out.println("******");
    System.out.println();

    System.out.println("Menu Options: ");
    System.out.println("1 - Quit");
    System.out.println("2 - Create a book");
    System.out.println("3 - Take out a book");
    System.out.println("4 - Return a book");
    System.out.println("5 - List all books");

    System.out.print("Please enter your option: ");
    selectedOption = scanner.nextInt();

    return selectedOption;
  }

  public static Book createABook(){
    Scanner scanner = new Scanner(System.in);
    String name;
    String author;
    int numberOfCopies;

    System.out.println();

    System.out.println("Please enter the book's name: ");
    name = scanner.nextLine();

    System.out.println("Please enter the book's author: ");
    author = scanner.nextLine();

    System.out.println("Please enter the number of copies: ");
    numberOfCopies = scanner.nextInt();

    return new Book(name, author, numberOfCopies);
  }

  public static void takeOutABook(Book[] books, int numberOfBooks){

    Scanner scanner = new Scanner(System.in);
    int selectedBookIndex;

    if (numberOfBooks > 0){

      showAllBooks(books, numberOfBooks);
      System.out.print("Please enter the index of book you will borrow: ");
      selectedBookIndex = scanner.nextInt();

      while(selectedBookIndex < 0 || selectedBookIndex >= numberOfBooks){

        System.out.println();
        System.out.println("Sorry, your input is invalid!");
        showAllBooks(books, numberOfBooks);
        System.out.print("Please enter the index of book you will borrow: ");
        selectedBookIndex = scanner.nextInt();              
      }

      books[selectedBookIndex].loan();
    }else{

      System.out.println();
      System.out.println("Sorry, no book is availabel!");
    }    
  }

  public static void returnABook(Book[] books, int numberOfBooks){

    Scanner scanner = new Scanner(System.in);
    int selectedBookIndex;

    if (numberOfBooks > 0){

      showAllBooks(books, numberOfBooks);
      System.out.print("Please enter the index of book you will return: ");
      selectedBookIndex = scanner.nextInt();

      while(selectedBookIndex < 0 || selectedBookIndex >= numberOfBooks){

        System.out.println();
        System.out.println("Sorry, your input is invalid!");
        showAllBooks(books, numberOfBooks);
        System.out.print("Please enter the index of book you will return: ");
        selectedBookIndex = scanner.nextInt();              
      }

      books[selectedBookIndex].returnABook();
    }else{

      System.out.println();
      System.out.println("Sorry, no book is availabel!");
    }    
  }

  public static void showAllBooks(Book[] books, int numberOfBooks){

    System.out.println();
    System.out.println("The book list: ");

    for(int i=0; i<numberOfBooks; i++){
      System.out.println("index " + i + ": " + books[i].toString());
    }

    if (numberOfBooks == 0){
      System.out.println("There are no books!");
    }
  }

}