package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * The scanner lets you take user inputs into your code, which will decide make, model, etc. Use parseDouble in case of integer values.
 */

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double fuelEff;
    String userMake;
    String userModel;

    double gasInput;
    double driveInput;

    System.out.print("Enter a fuel efficiency: ");
    fuelEff = Double.parseDouble(scan.nextLine());
    System.out.print("Enter a make: ");
    userMake = scan.nextLine();
    System.out.print("Enter a model: ");
    userModel = scan.nextLine();

    Car picklecar = new Car(fuelEff, userMake, userModel);
    System.out.print("Enter amount of gas to add: ");

    gasInput = Double.parseDouble(scan.nextLine());
    picklecar.addGas( gasInput );

    System.out.print("Enter distance to drive: ");
    driveInput = Double.parseDouble(scan.nextLine());
    picklecar.drive( driveInput );

    System.out.println("Your " + userMake + " " + userModel + " currently has " + picklecar.getGasInTank() + " gallons of gas left in the tank");

    scan.close();
  }
  
  /**
   * Word1 and 2 are the words inputted into wordChanger, start and ends are of each word
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return Not sure what this second comment is for
   */

  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    String wordstring1;
    String wordstring2;

    wordstring1 = word1.substring(start1, end1 + 1);
    wordstring2 = word2.substring(start2, end2 + 1);

    return wordstring1 + wordstring2;
  }
}