public class BicycleArray{

  public static void main(String[] args){

    Bicycle[] bicycles = new Bicycle[10];

    // create bicycles
    for (int i=0; i<bicycles.length; i++){
      bicycles[i] = new Bicycle(0);
    }

    // accelerate bicycles with odd indexes
    for (int i=1; i<bicycles.length; i+=2){
      bicycles[i].accelerate(10);
    }

    // print out the speeds of bicycles
    for(int i=0; i<bicycles.length; i++){
      System.out.println("Bicycle index " + (i) + ", speed " + bicycles[i].getSpeed());
    }

  }
}