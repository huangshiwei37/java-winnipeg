
// read prices of all items in the shopping cart
// print prices with tax

import java.util.Scanner;

public class Problem02{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int numberOfItems;
    double[] prices;
    final double TAX_RATE = 0.13;

    System.out.println("Enter the number of items in your cart: ");
    numberOfItems = scanner.nextInt();

    prices = readPrices(numberOfItems);

    printPricesWithTax(prices, TAX_RATE);
  }

  public static double[] readPrices(int numberOfItems){
    Scanner scanner = new Scanner(System.in);
    double[] prices = new double[numberOfItems];

    for(int i=0; i<numberOfItems; i++){
      System.out.println("Enter the price for item " + (i+1) + ": $");
      prices[i] = scanner.nextDouble();
    }
    return prices;
  }

  public static void printPricesWithTax(double[] prices, double TAX_RATE){
    for(int i=0; i<prices.length; i++){
      System.out.println("The price with tax for item " + (i+1) + " is $" + prices[i]*(1.0+TAX_RATE));
    }
  }
}