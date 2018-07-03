
// store phone numbers of contacts
// print the phone numbers of a particular contact 

import java.util.Scanner;

public class Problem03{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int numberOfContacts;
    int numberOfPhoneNumbers;
    int contactIndex;

    String[][] phoneNumbers;

    System.out.println("Enter the number of contacts: ");
    numberOfContacts = scanner.nextInt();

    System.out.println("Enter the number of phone numbers for each person: ");
    numberOfPhoneNumbers = scanner.nextInt();

    phoneNumbers = readPhoneNumbers(numberOfContacts, numberOfPhoneNumbers);

    System.out.println("Enter the contact index that you want to check: ");
    contactIndex = scanner.nextInt();

    printPhoneNumbersOfAContact(phoneNumbers, contactIndex);

  }

  public static String[][] readPhoneNumbers(int numberOfContacts, int numberOfPhoneNumbers){
    Scanner scanner = new Scanner(System.in);
    String[][] phoneNumbers = new String[numberOfContacts][numberOfPhoneNumbers];

    for(int i=0; i<numberOfContacts; i++){
      for(int j=0; j<numberOfPhoneNumbers; j++){
        System.out.println("Enter phone number " + (j+1) + " of contact " + (i+1) + ": ");
        phoneNumbers[i][j] = scanner.next();
      }
    }

    return phoneNumbers;
  }

  public static void printPhoneNumbersOfAContact(String[][] phoneNumbers, int contactIndex){
    for(int j=0; j<phoneNumbers[contactIndex-1].length; j++){
      System.out.println("Contact " + contactIndex + ", phone number " + (j+1) + ": " 
        + phoneNumbers[contactIndex-1][j]);
    }
  }
}