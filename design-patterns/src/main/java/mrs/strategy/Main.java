package mrs.strategy;

import mrs.strategy.duck.Duck;
import mrs.strategy.duck.Mallardduck;
import mrs.strategy.duck.behavior.FlyNoWay;
import mrs.strategy.duck.behavior.FlyWithWings;
import mrs.strategy.duck.behavior.MuteQuack;
import mrs.strategy.duck.behavior.Quack;

public class Main {

  public static void main(String[] args) {
    Duck duck = new Mallardduck();

    // ここのsetterでアルゴリズムを変更できる
    duck.setFlyBehavior(new FlyWithWings());
    duck.setQuackBehavior(new Quack());

    duck.display();
    duck.getFlyBehavior().fly();
    duck.getQuackBehavior().quack();

    duck.setFlyBehavior(new FlyNoWay());
    duck.setQuackBehavior(new MuteQuack());
    duck.getFlyBehavior().fly();
    duck.getQuackBehavior().quack();
  }
}
