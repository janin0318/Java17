package mrs.command.command;

import java.util.Stack;

public class MicroCommand implements Command {

  Command[] commands;
  Stack<Command[]> commandHistory;

  public MicroCommand(Command[] commands) {
    this.commands = commands;
    this.commandHistory = new Stack<>();
  }

  @Override
  public void execute() {
    for (Command command : commands) {
      command.execute();
      this.commandHistory.push(commands);
    }
  }

  @Override
  public void undo() {
    this.commandHistory.pop();
  }
}
