
public class InputFromKeyboardMain{

  public static void main(String[] args) {

    System.out.println();
    
    // ask for the user's name
    String prompt1 = "Enter your name: ";
    String name = InputFromKeyboard.getString(prompt1);
    System.out.println("Your name is " + name);
    System.out.println();

    // ask for the user's age
    String prompt2 = "Enter your age: ";
    int age = InputFromKeyboard.getInt(prompt2);
    System.out.println("Your age is " + age);
    System.out.println();    

    // ask for the user's account balance
    String prompt3 = "Enter your account balance: ";
    double balance = InputFromKeyboard.getDouble(prompt3);
    System.out.println("Your balance is " + balance);
    System.out.println();    

  }
}