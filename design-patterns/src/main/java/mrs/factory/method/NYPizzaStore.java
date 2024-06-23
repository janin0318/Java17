package mrs.factory.method;

import mrs.factory.pizza.NYPizza1;
import mrs.factory.pizza.NYPizza2;
import mrs.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


  @Override
  protected Pizza createPizza(String type) {
    if (type.equals("1")) {
      return new NYPizza1();
    }
    if (type.equals("2")) {
      return new NYPizza2();
    }
    return null;
  }
}
