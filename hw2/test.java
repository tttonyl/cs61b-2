import java.util.*;

class test {
  public static void main(String[] args) {
    String date = "05/18/1989";
    String[] dateSplit = date.split("/");
    for(String s: dateSplit) {
      System.out.println(s);
    }
  }
}
