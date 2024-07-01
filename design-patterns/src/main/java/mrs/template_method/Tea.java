package mrs.template_method;

public class Tea extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("紅茶を浸す");
  }

  @Override
  public void addCondiments() {
    System.out.println("レモンを追加する");
  }

}
