package command;

import command.command.Command;
import command.command.MicroCommand;
import command.controller.RemoteController;
import command.fan.CeilingFan;
import command.fan.CeilingFanHighCommand;
import command.fan.CeilingFanLowCommand;
import command.fan.CeilingFanMediumCommand;
import command.fan.CeilingFanOffCommand;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;

public class Main {

  public static void main(String[] args) {
//    remoteController1();
//    remoteController2();
    remoteController3();
  }

  private static void remoteController1() {
    RemoteController controller = new RemoteController();
    System.out.println(controller);
    Light livingRoomLight = new Light("リビング");
    controller.setCommand(0, new LightOnCommand(livingRoomLight),
        new LightOffCommand(livingRoomLight));
    controller.setCommand(1, new LightOnCommand(livingRoomLight),
        new LightOffCommand(livingRoomLight));
    System.out.println(controller);
    controller.onButtonWasPushed(0);
    System.out.println(controller);
    controller.undoButtonWasPushed();
    controller.offButtonWasPushed(0);
    System.out.println(controller);
    controller.undoButtonWasPushed();
  }

  private static void remoteController2() {
    RemoteController remoteController = new RemoteController();
    CeilingFan ceilingFan = new CeilingFan("リビング");
    CeilingFanOffCommand cfOffCommand = new CeilingFanOffCommand(ceilingFan);
    CeilingFanLowCommand cfLowCommand = new CeilingFanLowCommand(ceilingFan);
    CeilingFanMediumCommand cfMediumCommand = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanHighCommand cfHighCommand = new CeilingFanHighCommand(ceilingFan);

    remoteController.setCommand(0, cfLowCommand, cfOffCommand);
    remoteController.setCommand(1, cfMediumCommand, cfOffCommand);
    remoteController.setCommand(2, cfHighCommand, cfOffCommand);
    System.out.println(remoteController);

    remoteController.onButtonWasPushed(0);
    remoteController.undoButtonWasPushed();
    remoteController.onButtonWasPushed(1);
    remoteController.undoButtonWasPushed();
  }

  private static void remoteController3() {

    RemoteController remoteController = new RemoteController();

    CeilingFan ceilingFan = new CeilingFan("リビング");
    CeilingFanLowCommand cfLowCommand = new CeilingFanLowCommand(ceilingFan);

    Light livingRoomLight = new Light("リビング");
    LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);

    CeilingFanOffCommand cfOffCommand = new CeilingFanOffCommand(ceilingFan);
    LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

    Command[] onCommands = new Command[]{cfLowCommand, lightOnCommand};
    Command[] offCommands = new Command[]{cfOffCommand, lightOffCommand};

    MicroCommand microOnCommand = new MicroCommand(onCommands);
    MicroCommand microOffCommand = new MicroCommand(offCommands);
    remoteController.setCommand(0, microOnCommand, microOffCommand);

    System.out.println(remoteController);

    remoteController.onButtonWasPushed(0);
    remoteController.offButtonWasPushed(0);
    remoteController.undoButtonWasPushed();
  }

}
