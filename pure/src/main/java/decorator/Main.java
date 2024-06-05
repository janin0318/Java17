package decorator;

public class Main {

  /**
   * Decoratorのデメリットはクラスが多くなりすぎること
   *
   * @param args 引数
   */
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    beverage = new Mocha(beverage);
    System.out.println(beverage.getDescription());
    System.out.println(beverage.cost());

    beverage = new Milk(beverage);
    System.out.println(beverage.getDescription());
    System.out.println(beverage.cost());
  }

}
