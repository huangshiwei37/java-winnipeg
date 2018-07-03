
import java.util.Scanner;

public class ArrayPractice2{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int numberOfStudents;
    int numberOfGrades;
    int[][] grades;

    System.out.println("Enter the number of students: ");
    numberOfStudents = scanner.nextInt();

    System.out.println("Enter the number of grades for each student: ");
    numberOfGrades = scanner.nextInt();

    grades = new int[numberOfStudents][numberOfGrades];

    // read grades
    readGrades(grades);

    // print the average grade per student
    printAverageGradePerStudent(grades);

    // print the average grade for all students
    printAverageGradeForAllStudents(grades);
  }

  public static void readGrades(int[][] grades){

    Scanner scanner = new Scanner(System.in);

    for(int i=0; i<grades.length; i++){
      for(int j=0; j<grades[0].length; j++){
        System.out.println("Enter grade " + (j+1) + " for student " + (i+1));
        grades[i][j] = scanner.nextInt();
      }
    }
  }

  public static void printAverageGradePerStudent(int[][] grades){
    int totalGradePerStudent;
    int averageGradePerStudent;
    for(int i=0; i<grades.length; i++){
      totalGradePerStudent = 0;
      for(int j=0; j<grades[0].length; j++){
        totalGradePerStudent += grades[i][j];
      }
      averageGradePerStudent = totalGradePerStudent/grades[i].length;
      System.out.println("The average grade for student " + (i+1) + " is " + averageGradePerStudent);
    }    
  }

  public static void printAverageGradeForAllStudents(int[][] grades){
    int totalGrade = 0;
    int averageGrade;
    for(int i=0; i<grades.length; i++){
      for(int j=0; j<grades[0].length; j++){
        totalGrade += grades[i][j];
      }
    }
    averageGrade = totalGrade/(grades.length * grades[0].length);
    System.out.println("The average grade for all students is " + averageGrade);
  }

}