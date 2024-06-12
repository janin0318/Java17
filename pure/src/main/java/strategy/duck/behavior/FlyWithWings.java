package strategy.duck.behavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("飛びます");
  }
}
