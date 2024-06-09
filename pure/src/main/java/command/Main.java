package command;

import command.command.Command;
import command.controller.RemoteController;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;

public class Main {

  public static void main(String[] args) {
    RemoteController controller = new RemoteController();
    System.out.println(controller);

    Light livingRoomLight = new Light("リビング");

    // 普通にやる方法
    LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
    controller.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

    // ラムダを使った方法
    controller.setCommand(1, livingRoomLight::on, livingRoomLight::off);

    // インターフェイスを自分で実装した方法
    controller.setCommand(2, new Command() {
      @Override
      public void execute() {
        livingRoomLight.on();
      }
    }, new Command() {
      @Override
      public void execute() {
        livingRoomLight.off();
      }
    });

    System.out.println(controller);

    controller.onButtonWasPushed(0);
    controller.offButtonWasPushed(0);
  }

}
