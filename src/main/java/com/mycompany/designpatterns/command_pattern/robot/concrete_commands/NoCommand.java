package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }

}
