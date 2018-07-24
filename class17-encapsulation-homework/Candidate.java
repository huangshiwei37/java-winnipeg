
public class Candidate{

  private int _id;
  private String _name;
  private int _numVotes = 0;

  public Candidate(int id, String name){

    _id = id;
    _name = name;
  }

  public int getNumVotes(){
    return _numVotes;
  }

  public String getName(){
    return _name;
  }

  public boolean addVotes(int amount){

    if (amount < 0){
      return false;
    }else{
      _numVotes += amount;
      return true;
    }    
  }

  public String toString(){
    return "ID: " + _id + ", Name: " + _name + ", Number of Votes: " + _numVotes;
  }

}