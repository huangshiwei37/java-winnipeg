
public class ElectionMain{

  public static void main(String[] args) {
    Candidate candidate1 = new Candidate(1, "AAA");
    Candidate candidate2 = new Candidate(2, "BBB");

    Election.printMenu(candidate1, candidate2);
    int choice = Election.getChoice();

    while(choice != 0){

      switch (choice){
        case 1:
          Election.addVotes(candidate1);
          break;
        case 2:
          Election.addVotes(candidate2);
          break;
        case 3:
          Candidate winner = Election.getWinner(candidate1, candidate2); 
          if (winner != null){
            System.out.println("The winner is " + winner.toString());
          }else{
            System.out.println("It is a tie!");
          }          
          break;
        case 4:
          Election.showVotes(candidate1, candidate2);
          break;
        default:
          System.out.println("Not a valid option!");
          break;
      }

      Election.printMenu(candidate1, candidate2);
      choice = Election.getChoice();      
    }

  }

}