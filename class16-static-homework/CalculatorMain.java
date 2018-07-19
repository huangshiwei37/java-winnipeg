
import java.util.Scanner;

public class CalculatorMain{

  public static void main(String[] args) {

    boolean quit = false;
    while(!quit){ 
      showMenu();
      System.out.print("Enter your option (1--6): ");
      Scanner scanner = new Scanner(System.in);
      int chosenOption = scanner.nextInt();

      switch (chosenOption){
        case 1: 
          add();                 
          break;
        case 2:
          subtract();
          break;
        case 3:
          multiply();
          break;
        case 4:
          divide();
          break;
        case 5:
          System.out.println();
          System.out.println("The last result is " + Calculator.getLastResult());
          break;
        case 6:
          quit = true;
          break;    
        default:
          System.out.println("Your input is invalid. Please Enter an integer between 1 and 6.");
          break;                                
      }
    }
    
  }

  public static void showMenu(){
    System.out.println();
    System.out.println("-------------------");
    System.out.println("1 - Add two numbers");
    System.out.println("2 - Subtract two numbers");
    System.out.println("3 - Multiply two numbers");
    System.out.println("4 - Divide two numbers");     
    System.out.println("5 - Show last result");  
    System.out.println("6 - Quit"); 
    System.out.println("-------------------"); 
    System.out.println();
  }



  public static void add(){
    double num1;
    double num2;

    Scanner scanner = new Scanner(System.in);

    System.out.println();

    System.out.print("Enter the first number to be added: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter the second number to be added: ");
    num2 = scanner.nextDouble();

    System.out.println("The sum of " + num1 + " and " + num2 + " is " + Calculator.add(num1, num2));

  }

  public static void subtract(){
    double num1;
    double num2;

    Scanner scanner = new Scanner(System.in);

    System.out.println();

    System.out.print("Enter the number that is to be subtracted from: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter the number that is to be subtracted: ");
    num2 = scanner.nextDouble();

    System.out.println("Subtracting " + num2 + " from " + num1 + " gets " + Calculator.subtract(num1, num2));

  }  

  public static void multiply(){
    double num1;
    double num2;

    Scanner scanner = new Scanner(System.in);

    System.out.println();

    System.out.print("Enter the number that is to be multiplied: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter the number by which another number is to be multiplied: ");
    num2 = scanner.nextDouble();

    System.out.println("Multiplying " + num1 + " by " + num2 + " gets " + Calculator.multiply(num1, num2));

  }

  public static void divide(){
    double num1;
    double num2;

    Scanner scanner = new Scanner(System.in);

    System.out.println();

    System.out.print("Enter the number that is to be divided by another number: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter the number by which another number is to be divided: ");
    num2 = scanner.nextDouble();

    System.out.println("Dividing" + num1 + " by " + num2 + " gets " + Calculator.divide(num1, num2));

  }

}