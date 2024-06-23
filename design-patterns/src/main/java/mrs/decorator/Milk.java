package mrs.decorator;

public class Milk extends CondimentDecorator {

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + "、ミルク";
  }

  public int cost() {
    return beverage.cost() + 50;
  }

}
