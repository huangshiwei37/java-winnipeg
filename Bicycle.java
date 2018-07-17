public class Bicycle{

  private int _speed;

  public Bicycle(){
    this._speed = 0;
  }

  public Bicycle(int speed){
    this._speed = speed;
  }

  public int getSpeed(){
    return this._speed;
  }

  public void accelerate(int additionalSpeed){
    this._speed += additionalSpeed;
  }

}