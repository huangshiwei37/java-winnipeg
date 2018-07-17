public class Person{

  private String _firstName;
  private String _lastName;

  public Person(){
    _firstName = "default";
    _lastName = "default";
  }

  public Person(String firstName, String lastName){
    _firstName = firstName;
    _lastName = lastName;
  }

  public String getFirstName(){
    return _firstName;
  }

  public String getLastName(){
    return _lastName;
  }  

  public boolean equals(Person otherPerson){

    boolean isEqual;

    if ( _firstName.equals(otherPerson.getFirstName()) && _lastName.equals(otherPerson.getLastName()) ){

      isEqual = true;
    }else{

      isEqual = false;
    }

    return isEqual;
  }

}