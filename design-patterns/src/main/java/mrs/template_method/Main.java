package mrs.template_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    CaffeineBeverage coffee = new Coffee();
    coffee.prepareRecipe();
    CaffeineBeverage tea = new Tea();
    tea.prepareRecipe();

    Duck[] ducks = {
        new Duck("ダーフィー", 2),
        new Duck("デューイ", 4),
        new Duck("ハワード", 7)
    };
    for (Duck d : ducks) {
      System.out.println(d);
    }
    Arrays.sort(ducks);
    for (Duck d : ducks) {
      System.out.println(d);
    }
  }

}
