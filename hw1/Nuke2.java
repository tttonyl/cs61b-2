import java.io.*;


class Nuke2 {
  /**
   * Write a program, Nuke2, whose main method reads a string from the keyboard
   * and prints the same string, with it's second char removed.
   *
   * Input:  skin
   * Output: sin
   *
   * Do not worry about strings that are less than 2 characters long.
   * Do not print a prompt for the user to enter a string.
   */
  public static void main(String[] args) throws Exception {
    BufferedReader keyboard;
    String input;
    String nuke2 = "";

    /* ask for input string */
    keyboard = new BufferedReader(new InputStreamReader(System.in));
    input = keyboard.readLine();

    /* remove the second char (index 1) */
    for(int i = 0; i < input.length(); i++) {
      if(i != 1) {
        nuke2 += input.charAt(i);
      }
    }

    /* print the string */
    System.out.println(nuke2);
  }

}
