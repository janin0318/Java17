package atcoder.abc368;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    BigDecimal result = new BigDecimal(0);

    for (int i = 0; i < n; i++) {
      BigDecimal num = new BigDecimal(sc.next());

      BigDecimal kougekikaisu = num.divide(new BigDecimal(3), RoundingMode.FLOOR);
      BigDecimal nokoriHp = kougekikaisu.remainder(new BigDecimal(3));

      result = result.add(kougekikaisu);

    }

    System.out.println(result);


  }

}
