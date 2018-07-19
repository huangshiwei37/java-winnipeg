public class Bicycle{

  private static int _lastId = 0;
  private int _id;

  public Bicycle(){
    // Bicycle._lastId++;
    _lastId++;
    _id = _lastId;    
  }

  public int getId(){
    return _id;
  }

  public static int getLastId(){
    return _lastId;
  }

}