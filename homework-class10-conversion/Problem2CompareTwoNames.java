
import java.util.Scanner;

public class Problem2CompareTwoNames{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String secondName;
    String comeFirstName;

    System.out.println("Enter the first name in all lowercase letters: ");
    firstName = scanner.next();

    System.out.println("Enter the second name in all lowercase letters: ");
    secondName = scanner.next();

    // comeFirstName = (firstName.compareTo(secondName) <= 0)? firstName: secondName;
    comeFirstName = (compareTwoStrings(firstName, secondName) <= 0)? firstName: secondName;
    System.out.println("The name \""+ comeFirstName + "\" comes first!");
  }

  public static int compareTwoStrings(String string1, String string2){
    int numberToCount;
    int substration = 0; // the substration of first different characters of string1 and string2
    int result;

    numberToCount = string1.length() <= string2.length()? string1.length(): string2.length();    

    for(int i=0; i<numberToCount; i++){
      if(string1.charAt(i) != string2.charAt(i)){
        substration = (int) string1.charAt(i) - (int) string2.charAt(i);
        break;
      }
    }

    // deal with strings with the same prefix, e.g., string1 = ab; string2 = abcd; 
    // they have the same prefix "ab"
    if (substration == 0){ 
      // same prefix: return the difference between string1's length and string2's length
      result = string1.length() - string2.length(); 
    }else{
      // different prefix: return the substration of first different characters of string1 and string2
      result = substration; 
    }

    return result;
  }

}