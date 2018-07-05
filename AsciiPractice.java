
import java.util.Scanner;

public class AsciiPractice{

  public static void main(String[] args){

    String string;
    int[] numbers;

    string = readAString();
    numbers = convertAStringToAsciiValues(string);
    printAnIntegerArray(numbers);

  }

  public static String readAString(){
    Scanner scanner = new Scanner(System.in);
    String string;

    System.out.println("Enter a string: ");
    string = scanner.nextLine();
    return string;
  }

  public static int[] convertAStringToAsciiValues(String string){
    int[] numbers = new int[string.length()];

    for(int i=0; i<string.length(); i++){
      numbers[i] = (int) string.charAt(i);
    }

    return numbers;
  }

  public static void printAnIntegerArray(int[] numbers){ 
    System.out.println("Your ascii values are")      ;
    for(int i=0; i<numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }    
  }

}