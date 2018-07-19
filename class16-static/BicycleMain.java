
public class BicycleMain{

  public static void main(String[] args){

    Bicycle[] bicycles = new Bicycle[5];


    for (int i=0; i<5; i++){
      bicycles[i] = new Bicycle();
      System.out.println("Bicycle id: " + bicycles[i].getId());
    }

    System.out.println();
    System.out.println("The last id: " + Bicycle.getLastId());
  }

}