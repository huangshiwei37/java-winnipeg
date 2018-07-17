
import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    // Add an invoice
    Invoice invoice = addAnInvoice();
    if (invoice == null){
      System.out.println();
      System.out.println("-------------------------");
      System.out.println();
      System.out.println("Making an invoice failed!");
    }else{
      System.out.println();
      System.out.println("-------------------------");
      System.out.println();      
      System.out.println("Making an invoice succeeded!");
      // print the invoice
      System.out.println();
      System.out.println("-------------------------");
      System.out.println();            
      invoice.printInvoice();
    }


  } // End main()

  public static Invoice addAnInvoice(){

    final int MAX_NUMBER_OF_ITEMS = 10;

    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.print("Enter the invoice id: ");
    String invoiceId = scanner.nextLine();

    System.out.println();
    System.out.print("Enter the customer id: ");
    String customerId = scanner.nextLine();
    System.out.print("Enter the customer name: ");
    String customerName = scanner.nextLine();    
    Customer newCustomer = new Customer(customerId, customerName);

    System.out.println();
    System.out.print("Enter the number of Items: ");
    int numberOfItems = scanner.nextInt();

    Invoice newInvoice;

    if(numberOfItems < 0 || numberOfItems > MAX_NUMBER_OF_ITEMS){
      System.out.println("The number of items typed is invalid"  
        + " since it is negative or it has exceeded the capacity " + MAX_NUMBER_OF_ITEMS);
      newInvoice = null;
    }else{
      newInvoice = new Invoice(invoiceId, newCustomer, MAX_NUMBER_OF_ITEMS);
      for(int i=0; i<numberOfItems; i++){
        System.out.println();
        System.out.println("Enter the information of Item " + i);
        Item newItem = addAnItem();
        boolean addAnItemSuccessfully = newInvoice.addAnItem(newItem);
        if(!addAnItemSuccessfully){
          System.out.println("Item is not added successfully. Please report the exception!");
          newInvoice = null;
          break;
        }
      }
    }

    return newInvoice;
  }// End addAnInvoice()

  public static Item addAnItem(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter item id: ");
    String id = scanner.nextLine();

    System.out.print("Enter item name: ");
    String name = scanner.nextLine();

    System.out.print("Enter item description: ");
    String description = scanner.nextLine();  
    
    System.out.print("Enter item price: ");
    double price = scanner.nextDouble(); 

    return new Item(id, name, description, price);
  }

}