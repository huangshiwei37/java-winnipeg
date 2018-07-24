
import java.text.DecimalFormat;

public class BankAccount
{
  private double balance;

  public double getBalance(){

    return balance;
  }

  public void depositFunds(double amount){

    balance += amount;
  }

  public boolean withdrawFunds(double amount){

    if (balance < amount){
      return false;
    }else{
      balance -= amount;
      return true;
    }
  }

  public String toString(){

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    return decimalFormat.format(this.balance); 
  }

}