package mrs.command.command;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("NoCommand");
  }

  @Override
  public void undo() {
    System.out.println("NoUndoCommand");
  }

}
