
import java.util.Scanner;

public class Election{

  static Scanner scanner = new Scanner(System.in);

  public static int inputAmount(){

    System.out.print("Enter the amount: ");
    int amount = scanner.nextInt();

    while (amount < 0){
      System.out.println("Invalid input. The number of votes should not be negative");
      System.out.print("Enter the number of votes: ");
      amount = scanner.nextInt();      
    }

    return amount;
  }

  public static void addVotes(Candidate candidate){   

    int amount = inputAmount();
    
    boolean successful = candidate.addVotes(amount);

    if (successful){
      System.out.println("Successfully added " + amount + " votes for " + candidate.getName());
    }else{
      System.out.println("Invalid amount of votes!");
    }
  }

  public static Candidate getWinner(Candidate candidate1, Candidate candidate2){

    if (candidate1.getNumVotes() > candidate2.getNumVotes()){
      return candidate1;      
    }else if (candidate1.getNumVotes() < candidate2.getNumVotes()){
      return candidate2;
    }else {
      return null;
    }   
  }

  public static void showVotes(Candidate candidate1, Candidate candidate2){

    System.out.println();
    System.out.println(candidate1);
    
    System.out.println();
    System.out.println(candidate2);
  }

  public static void printMenu(Candidate candiate1, Candidate candiate2){

    System.out.println();
    System.out.println("**************");
    System.out.println();

    System.out.println("Available options");
    System.out.println("0 - Quit");
    System.out.println("1 - Vote for candiate " + candiate1.getName());
    System.out.println("2 - Vote for candiate " + candiate2.getName());
    System.out.println("3 - Show the winner ");
    System.out.println("4 - Show votes ");
  }

  public static int getChoice(){
    
    System.out.println();
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    return choice;
  }

}