package atcoder.abc365;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int y = sc.nextInt();

    if (y % 4 != 0) {
      System.out.println(365);
      return;
    }

    if (y % 4 == 0 && y % 100 != 0) {
      System.out.println(366);
      return;
    }

    if (y % 100 == 0 && y % 400 != 0) {
      System.out.println(365);
      return;
    }

    if (y % 400 == 0) {
      System.out.println(366);
    }
  }

}
