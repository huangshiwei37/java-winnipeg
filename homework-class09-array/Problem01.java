
// Problem 01: heights of students

import java.util.Scanner;

public class Problem01{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int numberOfStudents;
    double[] heights;
    double averageHeight;
    int numberAboveAverage; // number of students above average height
    int numberBelowAverage; // number of students below average height

    System.out.println("Enter the number of students: ");
    numberOfStudents = scanner.nextInt();

    heights = readHeightsOfStudents(numberOfStudents);
    averageHeight = calculateAverageHeight(heights);
    numberAboveAverage = calculateNumberAboveAverage(heights, averageHeight);
    numberBelowAverage = calculateNumberBelowAverage(heights, averageHeight);

    System.out.println("The average height for all students is " + averageHeight);
    System.out.println("The number of students above average height is " + numberAboveAverage);
    System.out.println("The number of students below average height is " + numberBelowAverage);
  }

  public static double[] readHeightsOfStudents(int numberOfStudents){
    Scanner scanner = new Scanner(System.in);
    double[] heights = new double[numberOfStudents];

    for(int i=0; i<numberOfStudents; i++){
      System.out.println("Enter the height for student " + (i+1));
      heights[i] = scanner.nextDouble();
    }

    return heights;
  }

  public static double calculateAverageHeight(double[] heights){
    double averageHeight;
    double totalHeight = 0;

    for(int i=0; i<heights.length; i++){
      totalHeight += heights[i];
    }
    averageHeight = totalHeight/heights.length;

    return averageHeight;
  }

  public static int calculateNumberAboveAverage(double[] heights, double averageHeight){
    int numberAboveAverage = 0;

    for(int i=0; i<heights.length; i++){
      if(heights[i] > averageHeight){
        numberAboveAverage++;
      }
    }

    return numberAboveAverage;
  }

  public static int calculateNumberBelowAverage(double[] heights, double averageHeight){
    int numberBelowAverage = 0;

    for(int i=0; i<heights.length; i++){
      if(heights[i] < averageHeight){
        numberBelowAverage++;
      }
    }

    return numberBelowAverage;
  }
}