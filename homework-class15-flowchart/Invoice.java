
public class Invoice{

  private String id;
  private Customer customer;
  private Item[] items;
  private int itemCapacity; // maximum number of items that can be stored
  private int numberOfItems = 0;

  public Invoice(String id, Customer customer, int itemCapacity){

    this.id = id;
    this.customer = customer;
    this.itemCapacity = itemCapacity;    
    this.items = new Item[this.itemCapacity];
  }

  public Item[] getItems(){
    return items;
  }

  public boolean addAnItem(Item item){

    if(this.numberOfItems < this.itemCapacity){
      this.items[this.numberOfItems] = item;
      this.numberOfItems++;
      return true;
    }
    return false;
  }

  // get the total net price without taxes
  public double getNetPrice(){

    double totalNet = 0;
    for(int i=0; i<this.numberOfItems; i++){
      totalNet += this.items[i].getPrice();
    }
    return totalNet;
  }


  public double getTotalPrice(double totalNet, double gstTax, double pstTax){

    return totalNet + gstTax + pstTax;
  }

  public void printInvoice(){

    double totalNet = getNetPrice();
    double gstTax = Tax.calculateGstTax(totalNet);
    double pstTax = Tax.calculatePstTax(totalNet);
    double totalPrice = getTotalPrice(totalNet, gstTax, pstTax);

    // print invoid id
    System.out.println("Invoice id: " + this.id);

    // print customer information
    System.out.println(this.customer.toString());

    // print items
    for(int i=0; i<this.numberOfItems; i++){

      System.out.println(this.items[i].toString());
    }

    System.out.println("Total net price: " + totalNet);
    System.out.println("GST: " + gstTax);
    System.out.println("PST: " + pstTax);
    System.out.println("Total Price: " + totalPrice);

  }

}