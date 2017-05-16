package headfirst.command.undo;

public class RemoteControlWithUndo
{
  Command[] onCommand;
  Command[] offCommand;
  Command undoCommand;
  public RemoteControlWithUndo()
  {
    onCommand= new Command[7];
    offCommand = new Command[7];
    //Null Object Pattern
    Command noCommand = new NoCommand();
    for (int i=0;i<7;i++)
    {
      onCommand[i]= noCommand;
      offCommand[i]=noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(int slot,Command c,Command oc)
  {
    onCommand[slot]=c;
    offCommand[slot]=oc;
  }
  public void onbuttonWasPressed(int slot)
  {
    onCommand[slot].execute();
    undoCommand = onCommand[slot];
  }
  public void offButtonWasPushed(int slot) {
    offCommand[slot].execute();
    undoCommand = offCommand[slot];
  }
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
}