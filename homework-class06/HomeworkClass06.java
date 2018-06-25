
/*
homework class06 of Shiwei Huang 
*/

import java.util.Scanner;

public class HomeworkClass06
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    // Question 1
    System.out.println("Hi, I already print sentences");

    // Question 2
    int intNum = 273;
    System.out.println("An int number: " + intNum);

    // Question 3
    float floatNum = 5.30f;
    System.out.println("A float number: " + floatNum);

    // Question 4
    int intNum1 = 1234;
    int intNum2 = 532;
    int sum = intNum1 + intNum2;
    System.out.println("The sum of 1234 and 532 is " + sum);

    // Question 5
    int subtraction = intNum1 - intNum2;
    System.out.println("The subtraction of 1234 and 532 is " + subtraction);

    // Question 6
    int multiplication = intNum1 * intNum2;
    System.out.println("The multiplication of 1234 and 532 is " + multiplication);

    // Question 7
    float division = 1234.0f / 532.0f;
    System.out.println("The division of 1234 and 532 is " + division); 

    // Question 8
    for(int i=1; i<=3; i++)      
    {
      System.out.println(i);
    }

    // Question 9
    for(int i=1; i<=9; i++)      
    {
      System.out.println(i);
    }

    // Question 10
    for(int i=1; i<=10000; i++)      
    {
      System.out.println(i);
    }    

    // Question 11
    for(int i=5; i<=10; i++)      
    {
      System.out.println(i);
    }    

    // Question 12
    for(int i=5; i<=15; i++)      
    {
      System.out.println(i);
    }    

      // Question 13
    for(int i=5; i<=15000; i++)      
    {
      System.out.println(i);
    }      

    // Question 14
    for(int i=0; i<200; i++)      
    {
      System.out.println("hello");
    }        

    // Question 15
    for(int i=1; i<31; i++)      
    {
      System.out.println(i*i);
    }    

    // Question 16
    int inputInteger;
    int sumQuestion16 = 0;
    try{
      System.out.println("Please enter an integer: ");
      inputInteger = in.nextInt();
      for (int i=inputInteger+1; i<=inputInteger+100; i++)
      {
        sumQuestion16 += i;
      } 
      System.out.println("The sum of next integers after " + inputInteger + " is " + sumQuestion16);
    }catch(Exception e){
      System.out.println("Exception when inputing an integer: " + e);
    }

    // Qustion 17
    float moneyCAD;
    float moneyUSD;
    Scanner inMoney = new Scanner(System.in);
    try{
      System.out.println("Please enter the amount of money in CAD you want to convert: ");
      moneyCAD = inMoney.nextFloat();
      moneyUSD = moneyCAD * 0.75f;
      System.out.println("The equivalent amount of money in USD is " + moneyUSD);
    }catch(Exception e){
      System.out.println("Exception when inputing a float number: " + e);
    }    

    // Question 18
    Scanner inQuestion18 = new Scanner(System.in);
    float floatNum1; 
    float floatNum2;
    float largestNum;
    float smallestNum;

    System.out.print("Please enter the first number: ");
    floatNum1 = inQuestion18.nextFloat();
    System.out.print("Please enter the second number: ");
    floatNum2 = inQuestion18.nextFloat();

    if (floatNum1 >= floatNum2){
      largestNum = floatNum1;
      smallestNum = floatNum2;
    }else{
      largestNum = floatNum2;
      smallestNum = floatNum1;
    }

    System.out.println("The largest number is " + largestNum
      + "\nThe smallest number is " + smallestNum);

    // Question 19
    int N = 9;
    double A = 10.0;
    char C = 's';
    System.out.println("N + A = " + (N + A));
    System.out.println("A - N = " + (A - N));

    // Question 20
    int B = -1;
    if (B >= 0){
      System.out.println(B + " is positive");
    }else{
      System.out.println(B + " is negative");
    }

    // Question 21
    int MAT = 1; // enrollment
    float CAL1 = 6.0f; // grade 1
    float CAL2 = 6.0f; // grade 2
    float CAL3 = 6.0f; // grade 3
    float CAL4 = 6.0f; // grade 4
    float CAL5 = 6.0f; // grade 5
    float average;
    average = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5)/5;
    System.out.println("The student enrollment no. is " + MAT);
    System.out.println("The student average is " + average);
    if (average > 6.0f){
      System.out.println("The student application is approved");
    }else{
      System.out.println("The student application is NOT approved");
    }

    // Question 22
    float salary = 1500.0f;
    float newSalary;
    if (salary < 1000.0f){
      newSalary = salary * 1.15f;
    }else{
      newSalary = salary * 1.12f;
    }
    System.out.println("The new salary is " + newSalary);

    // Question 23: 10 multiplication tables
    // print the table header: first line   
    System.out.print(" *" + " | ");
    for (int j = 1; j <= 10; j++){
      System.out.printf("%2d ", j);
    }
    System.out.print("\n");
    // table header: second line
    System.out.print("-- | ");
    for (int j = 1; j <= 10; j++){
      System.out.print("-- ");
    }
    System.out.print("\n");
    // table
    for(int i = 1; i <= 10; i++){
      System.out.printf("%2d | ", i);
      for(int j = 1; j <= 10; j++){
        System.out.printf("%2d ", i*j);
      }
      System.out.print('\n');
    }

    // Question 24: calculator
    float num1;
    float num2;
    float result;
    char operation;
    Scanner inQuestion24 = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    num1 = inQuestion24.nextFloat();
    System.out.println("Enter your operation: '+' for addition, '-' for subtraction, '*' for multiplication, and '/' for division ");
    operation = inQuestion24.next().charAt(0);
    System.out.println("Enter your second number: ");
    num2 = inQuestion24.nextFloat();
    switch (operation){
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;      
      case '*':
        result = num1 * num2;
        break;      
      case '/':
        result = num1 / num2;
        break; 
      default:
        result = 0;
        System.out.println("The operation is invalid.");
        break;
    }
    System.out.println("The result is " + result);

    // Question 25
    float salaryQ25 = 1500.0f;
    float newSalaryQ25;
    if (salaryQ25 < 1000.0f){
      newSalaryQ25 = salaryQ25 * 1.15f;
    }else{
      newSalaryQ25 = salaryQ25 * 1.12f;
    }
    System.out.println("The new salary is " + newSalaryQ25);

    // Question 26
    int numberOfWorkers;
    System.out.println("Please enter the number of workers: ");
    numberOfWorkers = in.nextInt();
    float[] salaries = new float[numberOfWorkers];    
    for (int i=0; i<numberOfWorkers; i++){
      System.out.println("Please enter the salary of worker " + (i+1));
      salaries[i] = in.nextFloat();
    }
    float highestSalary;
    int workerWithHighestSalary;
    highestSalary = salaries[0];
    workerWithHighestSalary = 1;
    for (int i=0; i<numberOfWorkers; i++){
      if (highestSalary < salaries[i]){
        highestSalary = salaries[i];
        workerWithHighestSalary = i + 1;
      }
    }
    System.out.println("The worker " + workerWithHighestSalary
       + " has the highest salary of " + highestSalary);

    // Question 27
    String string = String.valueOf(123);
    printAString(string);

    // Question 28
    float num1Q28 = 2.0f;
    float num2Q28 = 3.0f;
    add(num1Q28, num1Q28);

    // Question 29
    int sameName = 0;
    testTheSameName();

    // Question 30
    String password = "abc123";
    String inputPassword;
    Boolean doesMatch;
    System.out.println("Please enter your password and you have three attempts.");
    for(int i=0; i<3; i++){
      inputPassword = in.next();
      doesMatch = inputPassword.equals(password);
      if (doesMatch){
        System.out.println("Your input password is correct.");
        break;
      }else{
        System.out.println("Sorry, your input password is NOT correct and please try again.");
      }
    }

  } // End main

  // sub-algorithm of Question 27, 
  public static void printAString(String string){
    System.out.println(string);
  }

  // sub-algorithm of Question 28
  public static void add(float num1, float num2){
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
  }

  // sub-algorithm of Question 29
  public static void testTheSameName(){
    int sameName = 2;
    System.out.println("The value is " + sameName)    ;
  }

}