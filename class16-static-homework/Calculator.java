public class Calculator{

  private static double _lastResult = 0;

  public Calculator(){

  }

  public static double getLastResult(){
    
    return _lastResult;
  }

  public static double add(double num1, double num2){

    _lastResult = num1 + num2;
    return _lastResult;
  }

  public static double subtract(double num1, double num2){

    _lastResult = num1 - num2;
    return _lastResult;
  }

  public static double multiply(double num1, double num2){

    _lastResult = num1 * num2;
    return _lastResult;
  }

  public static double divide(double num1, double num2){

    _lastResult = num1 / num2;
    return _lastResult;
  }    

}