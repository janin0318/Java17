package atcoder.abc369;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int result = 0;

    if (a > b) {
      result = a - b;
    } else if (b > a) {
      result = b -a;
    } else {
      System.out.println(1);
      return;
    }

    if (result % 2 == 1) {
      System.out.println(2);
      return;
    }

    System.out.println(3);
  }

}
