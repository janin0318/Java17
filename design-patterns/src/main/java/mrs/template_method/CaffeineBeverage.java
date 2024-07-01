package mrs.template_method;

public abstract class CaffeineBeverage {

  // サブクラスで使用できないようにfinalクラスとする
  final public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    // 具象クラスのcustomerWantsCondimentsがTrueの場合のみaddCondimentsを呼び出す。
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  ;

  void boilWater() {
    System.out.println("お湯をわかす");
  }

  void pourInCup() {
    System.out.println("カップに注ぐ");
  }

  abstract void brew();

  abstract void addCondiments();

  // hook
  boolean customerWantsCondiments() {
    return true;
  }

}
