import java.io.*;

class SimpleIO {
  public static void main(String[] args) throws Exception {
    /*
     * InputStream objects (like System.in) read raw data from some source (like a keyboard)
     * but don't format the data.
     *
     * InputStreamReader objects compose the raw data into characters.
     *
     * BufferedReader objects compose the characters into entire lines of text.
     */
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(keyboard.readLine());
  }
}
