package mrs.adapter;

public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("ゴロゴロ");
  }

  @Override
  public void fly() {
    System.out.println("短い距離を飛んでいます。");
  }
}
