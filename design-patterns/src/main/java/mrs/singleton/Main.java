package mrs.singleton;

import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    System.out.println(Objects.isNull(chocolateBoiler));
    chocolateBoiler.fill();
  }

}
