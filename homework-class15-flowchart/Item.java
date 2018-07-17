
public class Item{

  private String id;
  private String name;
  private String description;
  private double price;

  public Item(String id, String name, String description, double price){

    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public double getPrice(){

    return price;
  }

  public String toString(){

    return "Item id: " + id + ", name: " + name 
      + ", description: " + description + ", price: " + price;
  }

}