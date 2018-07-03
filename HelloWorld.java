
import java.util.Scanner;;

public class HelloWorld{
  public static void main(String[] args){

    int[] grades = new int[5];
    int sum = 0;
    double average;

    grades[0] = 10;
    grades[1] = 20;
    grades[2] = 30;
    grades[3] = 40;
    grades[4] = 50;

    for (int i=0; i<5; i++){
      sum += grades[i];
    }

    average = sum/5;

    System.out.println("The sum of grades is " + sum);
    System.out.println("The avarage grade is " + average);

  }// End main()
}