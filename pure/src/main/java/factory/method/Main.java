package factory.method;

import factory.pizza.Pizza;

public class Main {

  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza("1");
    Pizza pizza2 = nyPizzaStore.orderPizza("2");

    System.out.println(pizza.getName());
    System.out.println(pizza2.getName());
  }
}
