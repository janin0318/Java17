package mrs.template_method;

public abstract class CaffeineBeverage {

  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  };

  public void boilWater() {
    System.out.println("お湯をわかす");
  }

  public void pourInCup() {
    System.out.println("カップに注ぐ");
  }

  public abstract void brew();

  public abstract void addCondiments();

}
