package com.mycompany.designpatterns.command_pattern.book_ex.invoker;

import com.mycompany.designpatterns.command_pattern.book_ex.commands.Command;
import com.mycompany.designpatterns.command_pattern.book_ex.commands.NoCommand;

public class RemoteApiService {

    protected Command[] onCommands;
    protected Command[] offCommands;
    protected Command undoCommand;

    public RemoteApiService() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommands, Command offCommand) {
        this.onCommands[slot] = onCommands;
        this.offCommands[slot] = offCommand;

    }

    public void pressOnButton(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void pressOffButton(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void pressUndoButton() {
        this.undoCommand.undo();
    }

}
