package mrs.chapter2;

import java.util.Scanner;

public class B06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] a = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    int[] winCount = new int[n + 1];
    int[] loseCount = new int[n + 1];

    for (int i = 1; i < n + 1; i++) {
      if (a[i] == 0) {
        winCount[i] = winCount[i - 1];
        loseCount[i] = loseCount[i - 1] + 1;
        continue;
      }
      winCount[i] += winCount[i - 1] + 1;
      loseCount[i] += loseCount[i - 1];
    }

    int q = sc.nextInt();

    for (int i = 1; i <= q; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      int countWin = winCount[end] - winCount[start - 1];
      int countLose = loseCount[end] - loseCount[start - 1];

      if (countWin == countLose) {
        System.out.println("draw");
        continue;
      }
      if (countWin > countLose) {
        System.out.println("win");
        continue;
      }
      System.out.println("lose");
    }
  }

}
