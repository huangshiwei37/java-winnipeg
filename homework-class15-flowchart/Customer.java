
public class Customer{

  private String _id;
  private String _name;
  private Invoice[] _invoices;
  private final int INVOICE_CAPACITY = 10; // how many invoices can we store
  private int _numberOfInvoices = 0;  

  public Customer(String id, String name){
    _id = id;    
    _name = name;
    _invoices = new Invoice[this.INVOICE_CAPACITY];
  }

  public boolean addAnInvoice(Invoice invoice){

    if (_numberOfInvoices < INVOICE_CAPACITY){
      _invoices[_numberOfInvoices] = invoice;
      _numberOfInvoices++;
      return true;
    }
    return false;
  }

  public String toString()
  {
    return "Customer id: " + _id + "\n" + "Customer name: " + _name;
  }

}