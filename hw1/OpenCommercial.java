/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {
    int numberOfLines = 5; // number of lines to read off of the webpage

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    /* Get the name of the company */
    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Read in the website */
    URL u = new URL("http://www." + inputLine + ".com/");
    InputStream ins = u.openStream();
    InputStreamReader isr = new InputStreamReader(ins);
    BufferedReader website = new BufferedReader(isr);

    /* Store the first 5 lines in a string array */
    String[] websiteLines = new String[numberOfLines];
    for(int i = 0; i < websiteLines.length; i++) {
      websiteLines[i] = website.readLine();
    }

    /* Print out the 5 lines in reverse order */
    for(int j = websiteLines.length - 1; j >= 0; j--) {
      System.out.println(websiteLines[j]);
    }
  }
}
