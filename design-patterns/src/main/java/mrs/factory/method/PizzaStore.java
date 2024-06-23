package mrs.factory.method;

import mrs.factory.pizza.Pizza;

public abstract class PizzaStore {

  public Pizza orderPizza(String type) {

    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    System.out.println("-----------------------");

    return pizza;
  }

  protected abstract Pizza createPizza(String type);
}
