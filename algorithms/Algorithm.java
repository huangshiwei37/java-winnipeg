
class Algorithm{

  public static void main(String args[]){  

    int numberToCount = 10;
    int count = 0;
    int multiplier = 1;     

    while(count<numberToCount){
      count = count + 1;
      multiplier = multiplier * count;
      System.out.println("The current multiplier is " + multiplier);
    }
    
  }

}