package adapter;

public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("ガーガー");
  }

  @Override
  public void fly() {
    System.out.println("飛んでいます。");
  }
}
