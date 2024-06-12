package factory.method;

import factory.pizza.NYPizza1;
import factory.pizza.NYPizza2;
import factory.pizza.Pizza;

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
