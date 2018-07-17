
public class Tax{

  private static final double GST_RATE = 0.05;
  private static final double PST_RATE = 0.08;

  public static double calculateGstTax(double amount){
    return amount * GST_RATE;
  }

  public static double calculatePstTax(double amount){
    return amount * PST_RATE;
  }
}