
import java.util.Scanner;

public class ArrayPractice1{
  public static void main(String[] args){

    // Array is a class
    int[] grades = new int[5];
    int sumOfGrades = 0;
    double averageGrade;

    // // Practice1
    // grades[0] = 10;
    // grades[1] = 20;
    // grades[2] = 30;
    // grades[3] = 40;
    // grades[4] = 50;

    // System.out.println("print grades: " + grades);

    // for(int i=0; i<grades.length; i++){
    //   sumOfGrades += grades[i];
    // }
    // averageGrade = sumOfGrades/5;

    // System.out.println("The sum of grades is " + sumOfGrades);
    // System.out.println("The avarage grade is " + averageGrade);


    // Practice2
    for(int i=0; i<grades.length; i++){
      grades[i] = i*100 + 100;
    } 

    sumOfGrades = 0;
    for(int i=0; i<grades.length; i++){
      sumOfGrades += grades[i];
      System.out.println("The grade of student " + i + " is " + grades[i]);
    }
    averageGrade = sumOfGrades/5;
    System.out.println("The sum of grades is " + sumOfGrades);
    System.out.println("The avarage grade is " + averageGrade);

    // practice: matrix(5 students, 3 grades)
    int numberOfStudents = 5;
    int numberOfGrades = 3;

    int[][] studentsGrades = new int[numberOfStudents][numberOfGrades];
    int[] totalGradesForEachStudent = new int[numberOfStudents];
    int[] averageGradesForEachStudent = new int[numberOfStudents];

    for(int i=0; i<numberOfStudents; i++){
      for(int j=0; j<numberOfGrades; j++){
        studentsGrades[i][j] = (i+1) * (j+1) * 10;
      }
      totalGradesForEachStudent[i] = 0;
    }

    // calculate the total grade for each student
    for(int i=0; i<numberOfStudents; i++){
      for(int j=0; j<numberOfGrades; j++){
        totalGradesForEachStudent[i] += studentsGrades[i][j];
      }
    }

    // calculate the average grade for each student
    for(int i=0; i<numberOfStudents; i++){
      averageGradesForEachStudent[i] = totalGradesForEachStudent[i]/numberOfGrades;
    }

    // print the grades for all students
    for(int i=0; i<numberOfStudents; i++){
      System.out.print("\n");
      for(int j=0; j<numberOfGrades; j++){
        System.out.print(studentsGrades[i][j] + " ");
      }
    }

    // print the total grade for each student
    for(int i=0; i<numberOfStudents; i++){
      System.out.println("The total grade for student " + i + " is " + totalGradesForEachStudent[i]);
    }

    // print the average grade for each student
    for(int i=0; i<numberOfStudents; i++){
      System.out.println("The average grade for student " + i + " is " + averageGradesForEachStudent[i]);
    }

  }// End main()
}