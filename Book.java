public class Book{

  private String _name;
  private String _author;
  private int _numberOfCopies;
  private int _numberOfLentCopies = 0;

  public Book(){

    _name = "default";
    _author = "default";
    _numberOfCopies = 0;
    _numberOfLentCopies = 0;
  }

  public Book(String name, String author, int numberOfCopies){

    _name = name;
    _author = author;
    _numberOfCopies = numberOfCopies;
  }

  public String toString(){

    return _name + ", by " + _author + ". "
     + _numberOfLentCopies + " lent out from " + _numberOfCopies + " total.";
  }

  // loan a copy of book
  public boolean loan(){

    boolean isLoaned;

    if(_numberOfLentCopies < _numberOfCopies){

      _numberOfLentCopies++;
      isLoaned = true;
      System.out.println("Thank you! One copy of book \"" + _name + "\" has been lent out successfully!");
    }else{
      isLoaned = false;
      System.out.println("Sorry, no copy of book \"" + _name + "\" is available to lend!");
    }

    return isLoaned;
  }

  // retrun a copy of book
  public boolean returnABook(){

    boolean isReturned;

    if (_numberOfLentCopies == 0){

      isReturned = false;
      System.out.println("Sorry, your return is invalid since no copy of book \"" + _name 
        + "\" has been lent out!");
    }else{

      _numberOfLentCopies--;
      isReturned = true;
      System.out.println("Thank you! One copy of book \"" + _name + "\"" + " has been returned!");
    }

    return isReturned;
  }
}