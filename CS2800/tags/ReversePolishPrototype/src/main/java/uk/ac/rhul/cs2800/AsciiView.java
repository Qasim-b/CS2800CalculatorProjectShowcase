package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * Prototype AsciiView.
 *
 * @author qasim
 *
 */
public class AsciiView {
  public static void main(String[] args) {
    CalcModel calculator = new CalcModel();
    Scanner userInput = new Scanner(System.in); // need to put a space after every character
    System.out.println("Enter a reverse polish equation");
    String rpinput = userInput.nextLine();
    System.out.println(calculator.evaluate(rpinput));
  }
}
