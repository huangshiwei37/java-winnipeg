
public class HomeworkClass08{
  public static void main(String[] a){

    // Question 01
    int intNum = 5;
    printAnInteger(intNum);

    // Question 02
    double num1 = 5.1;
    double num2 = 4.9;
    double sum = add(num1, num2);
    System.out.println("The sum of 5.1 and 4.9 is " + sum);

    // Question 03
    String sameVariableName = "Main ALgorithm";
    System.out.println("The name in the main algorithm is " + sameVariableName);    
    testSameVariableName();
  
  }

  public static void printAnInteger(int intNum){
    System.out.println(intNum);
  }

  public static double add(double num1, double num2){
    return num1 + num2;
  }

  public static void testSameVariableName(){
    String sameVariableName = "subalgorithm";
    System.out.println("The name in the subalgorithm is " + sameVariableName);
  }
}