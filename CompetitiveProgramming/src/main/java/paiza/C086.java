package paiza;

import java.util.Scanner;

public class C086 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++) {
      if (c[i] == 'a' || c[i] == 'A') {
        continue;
      }
      if (c[i] == 'i' || c[i] == 'I') {
        continue;
      }
      if (c[i] == 'u' || c[i] == 'U') {
        continue;
      }
      if (c[i] == 'e' || c[i] == 'E') {
        continue;
      }
      if (c[i] == 'o' || c[i] == 'O') {
        continue;
      }
      System.out.print(c[i]);
    }
  }

}
