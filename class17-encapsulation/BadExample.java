import java.text.DecimalFormat;

public class BadExample
{
  public static void main(String[] args)
  {
    BankAccount account = new BankAccount();

    System.out.println("Welcome to ComIT bank!");

    ATM.PrintMenu();
    int menuChoice = ATM.GetMenuChoice();

    while (menuChoice != 5)
    {
      switch(menuChoice)
      {
        case 1:
          System.out.println("Account balance is $" + account.toString()); 
          break;
        case 2:
          makeADeposit(account);
          break;
        case 3:
          makeAWithdrawal(account);
          break;
        case 4:
         makeATransfer(account);
          break;
        default:
          System.out.println("Not a valid option");
          break;
      }

      ATM.PrintMenu();
      menuChoice = ATM.GetMenuChoice();
    }

    System.out.println("Thanks for using ComIT bank!");
  }

  public static void makeADeposit(BankAccount account)
  {
    double amount = ATM.GetPositiveAmount();

    account.depositFunds(amount);
  }

  public static void makeAWithdrawal(BankAccount account)
  {
    double amount = ATM.GetPositiveAmount();

    boolean successful = account.withdrawFunds(amount);

    if (!successful)
    {
      System.out.println("Insufficient funds.");
      System.out.println("Account balance is $" + account.toString());
    }
    else
    {        
      System.out.println("Successfully withdrew $" + amount);
      System.out.println("New balance is $" + account.toString());
    }
  }

  public static void makeATransfer(BankAccount account)
  {
    double amount = ATM.GetPositiveAmount();

    boolean successful = account.withdrawFunds(amount);

    if (!successful)
    {
      System.out.println("Insufficient funds.");
      System.out.println("Account balance is $" + account.toString());
    }
    else
    {
      System.out.println("Successfully transferred $" + amount);
      System.out.println("New balance is $" + account.toString());
    }
  }  

}