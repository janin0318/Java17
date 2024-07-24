package mrs.chapter1;

import java.util.Scanner;

public class A05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int answer = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int target = k - i - j;
        if (target >= 1 && target <= n) {
          answer++;
        }
      }
    }

    System.out.println(answer);
  }

}
