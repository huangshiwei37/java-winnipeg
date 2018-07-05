
/* 
fix Problem 2: case-sensitive problem
i) What happens in this case? 
Answer: The name "Brenda" comes first than "bobby" when running the code in Problem 2
ii)  Why does this happen? 
Answer: This is because the ascii value of capital letter "B" is less than the one of lowercase letter "b"
iii) How would you fix the problem? 
Answer: convert these two names into the lowercase form before comparing them.
*/

import java.util.Scanner;

public class Problem3CompareTwoNames{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String secondName;
    String comeFirstName;

    System.out.println("Enter the first name: ");
    // firstName = scanner.next().toLowerCase();
    firstName = scanner.next();
    firstName = convertAStringToLowerCase(firstName);
    System.out.println("The first name in lowercase: " + firstName);

    System.out.println("Enter the second name: ");
    // secondName = scanner.next().toLowerCase();
    secondName = scanner.next();
    secondName = convertAStringToLowerCase(secondName);
    System.out.println("The second name in lowercase: " + secondName);

    // comeFirstName = (firstName.compareTo(secondName) <= 0)? firstName: secondName;
    comeFirstName = (compareTwoStrings(firstName, secondName) <= 0)? firstName: secondName;
    System.out.println("The name \""+ comeFirstName + "\" comes first!");
  }

  public static String convertAStringToLowerCase(String string){
    String lowerCaseString;
    char[] characters = new char[string.length()];

    for(int i=0; i<string.length(); i++){
      if( (int) string.charAt(i) >= 65 && (int) string.charAt(i) <= 90 ){
        characters[i] = (char) (string.charAt(i) + 32);
      }else{
        characters[i] = string.charAt(i);
      }
    }

    lowerCaseString = new String(characters);

    return lowerCaseString;
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