package mrs.chapter1;

import java.util.Scanner;

public class A04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 9; i >= 0; i--) {
      int wari = (int) Math.pow(2, i);
      System.out.print((n / wari) % 2);
    }

    System.out.println("");
  }

}
