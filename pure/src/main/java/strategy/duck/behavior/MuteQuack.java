package strategy.duck.behavior;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("鳴きません");
  }
}
