package com.mycompany.designpatterns.command_pattern.robot.invoker;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.concrete_commands.NoCommand;

public class RobotControlSystem {

    protected Command[] commands;
    protected Command undoCommand;

    public RobotControlSystem() {
        this.commands=new Command[5];
        for (int i = 0; i < 5; i++) {
            commands[i] = new NoCommand();
        }
        this.undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command command) {
        this.commands[slot] = command;
    }

    public void pressButton(int slot) {
        this.commands[slot].execute();
    }

    public void pressUndoButton(int slot) {

        this.commands[slot].undo();
    }
}
