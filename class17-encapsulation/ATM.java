import java.util.Scanner;

public class ATM
{
  public static int GetMenuChoice()
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please select an option: ");

    return scanner.nextInt();
  }

  public static double GetPositiveAmount()
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an amount: ");
    double amount = scanner.nextDouble();

    while(amount < 0){
      System.out.println("Invalid input amount! It should NOT be negative!");
      System.out.println();
      
      System.out.print("Please enter an amount: ");
      amount = scanner.nextDouble();      
    }

    return amount; 
  }

  public static void PrintMenu()
  {
    System.out.println();
    System.out.println("**************");
    System.out.println();

    System.out.println("Available options:");
    System.out.println("1 - Show balance");
    System.out.println("2 - Make a deposit");
    System.out.println("3 - Make a withdrawal");
    System.out.println("4 - Make a transfer");
    System.out.println("5 - Quit");

    System.out.println();
  }
}