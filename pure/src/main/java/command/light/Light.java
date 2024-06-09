package command.light;

public class Light {

  private String name;

  public Light(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(this.name + " onコマンド");
  }

  public void off() {
    System.out.println(this.name + " offコマンド");
  }

}
