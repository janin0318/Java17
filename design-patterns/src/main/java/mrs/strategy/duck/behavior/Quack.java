package mrs.strategy.duck.behavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("グァーグァー");
  }

}
