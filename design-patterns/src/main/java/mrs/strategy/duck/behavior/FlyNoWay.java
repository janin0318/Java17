package mrs.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("飛べません");
  }
}
