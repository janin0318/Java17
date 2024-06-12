package strategy;

import strategy.duck.Duck;
import strategy.duck.Mallardduck;
import strategy.duck.behavior.FlyNoWay;
import strategy.duck.behavior.FlyWithWings;
import strategy.duck.behavior.MuteQuack;
import strategy.duck.behavior.Quack;

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
