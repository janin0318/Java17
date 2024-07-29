package paiza;

import java.util.Scanner;

public class C016 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++) {
      if (c[i] == 'A') {
        c[i] = '4';
        continue;
      }
      if (c[i] == 'E') {
        c[i] = '3';
        continue;
      }
      if (c[i] == 'G') {
        c[i] = '6';
        continue;
      }
      if (c[i] == 'I') {
        c[i] = '1';
        continue;
      }
      if (c[i] == 'O') {
        c[i] = '0';
        continue;
      }
      if (c[i] == 'S') {
        c[i] = '5';
        continue;
      }
      if (c[i] == 'Z') {
        c[i] = '2';
      }
    }
    for (char cc : c) {
      System.out.print(cc);
    }
  }

}
