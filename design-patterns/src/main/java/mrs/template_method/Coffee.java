package mrs.template_method;

public class Coffee extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("フィルターでコーヒーをドリップする");
  }

  @Override
  public void addCondiments() {
    System.out.println("砂糖とミルクを追加する");
  }

}
