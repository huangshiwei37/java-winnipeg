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

  public String getName(){
    return _name;
  }

  public String toString(){

    return _name + ", by " + _author + ". "
     + _numberOfLentCopies + " lent out from " + _numberOfCopies + " total.";
  }

  // loan a copy of book
  public boolean lendACopy(){

    boolean lendSuccessfully;

    if(_numberOfLentCopies < _numberOfCopies){

      _numberOfLentCopies++;
      lendSuccessfully = true;
      System.out.println("Thank you! One copy of book \"" + _name + "\" has been lent out successfully!");
    }else{
      lendSuccessfully = false;
      System.out.println("Sorry, no copy of book \"" + _name + "\" is available to lend!");
    }

    return lendSuccessfully;
  }

  // retrun a copy of book
  public boolean returnACopy(){

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