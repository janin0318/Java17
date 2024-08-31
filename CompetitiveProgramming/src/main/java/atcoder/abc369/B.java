package atcoder.abc369;

import java.util.Objects;
import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = 0;

    int leftPosition = 0;
    int rightPosition = 0;

    for (int i = 0; i < n; i++) {
      int position = sc.nextInt();
      String leftRight = sc.next();

      if (Objects.equals(leftRight, "L")) {
        if (leftPosition == 0) {
          leftPosition = position;
          continue;
        }
        result = result + Math.abs(leftPosition - position);
        leftPosition = position;
        continue;
      }

      if (rightPosition == 0) {
        rightPosition = position;
        continue;
      }

      result = result + Math.abs(rightPosition - position);
      rightPosition = position;
    }

    System.out.println(result);
  }

}
