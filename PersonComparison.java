
import java.util.Scanner;

public class PersonComparison{

  public static void main(String[] args){

    System.out.println("Ther first person: ");
    Person person1 = createAPerson();

    System.out.println("Person1's firstName: " + person1.getFirstName());

    System.out.println("Ther second person: ");
    Person person2 = createAPerson();
    System.out.println("Person2's firstName: " + person1.getFirstName());


    boolean isEqual = person1.equals(person2);    

    System.out.println("The first person is the same as the second person: "
     + isEqual);
  }

  public static Person createAPerson(){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first name: ");
    String firstName = scanner.nextLine();
    System.out.print("Enter the last name: ");
    String lastName = scanner.nextLine();    

    return new Person(firstName, lastName);
  }
}