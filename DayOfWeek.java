
import java.util.Scanner;;

public class DayOfWeek{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String dayOfWeek;

    // System.out.println("Please enter the day today: ");
    // dayOfWeek = scanner.next();
    // if (dayOfWeek.toLowerCase().equals("monday") 
    //   || dayOfWeek.toLowerCase().equals("wednesday")
    //   || dayOfWeek.toLowerCase().equals("thursday")){
    //   System.out.println("You have class today.");
    // }else if (dayOfWeek.toLowerCase().equals("tuesday")
    //   || dayOfWeek.toLowerCase().equals("friday")){
    //   System.out.println("You don't have class today.");
    // }else if (dayOfWeek.toLowerCase().equals("saturday")
    //   || dayOfWeek.toLowerCase().equals("sunday")){
    //   System.out.println("It is the weekend.");
    // }else{
    //   System.out.println("Your input is invalid.");
    // }

    // // for loop
    // for(int i=0; i<5; i++){
    //   System.out.println("Please enter in the day of the week: ");
    //   dayOfWeek = scanner.next();
    //   switch (dayOfWeek.toLowerCase()){
    //     case "monday":
    //     case "wednesday":
    //     case "thursday":
    //       System.out.println("You have class.");
    //       break;
    //     case "tuesday":
    //     case "friday":
    //       System.out.println("You don't have class.");
    //       break;
    //     case "saturday":
    //     case "sunday":
    //       System.out.println("It's the weekend.");
    //       break;
    //     default:
    //       System.out.println("NOT a valid input.");     
    //       break; 
    //   } // end switch      
    // } // end for

    // while loop
    System.out.println("Please enter in the day of the week
      or enter in \"Stop\" for stopping the program: ");
    dayOfWeek = scanner.next();   

    while(!dayOfWeek.toLowerCase().equals("stop")){
      
      switch (dayOfWeek.toLowerCase()) {
        case "monday":
        case "wednesday":
        case "thursday":
          System.out.println("You have class.");
          break;
        case "tuesday":
        case "friday":
          System.out.println("You don't have class.");
          break;
        case "saturday":
        case "sunday":
          System.out.println("It's the weekend.");
          break;
        default:
          System.out.println("NOT a valid input.");     
          break; 
      } // end switch  

      System.out.println("Please enter in the day of the week
        or enter in \"Stop\" for stopping the program: ");
      dayOfWeek = scanner.next();      
    }

  } // End Main
} // End DayOfWeek