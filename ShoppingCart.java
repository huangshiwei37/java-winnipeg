
import java.util.Scanner;

public class ShoppingCart{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String itemName;
    double itemPrice;
    double taxRate;

    System.out.print("Please enter the item name: ");
    itemName = scanner.next();

    System.out.print("Please enter the item price: ");
    itemPrice = scanner.nextDouble();
  }

  public static void printCustomerReceipt(String itemName, double itemPrice, double taxRate){

  }


}