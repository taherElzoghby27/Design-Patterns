package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class MoveBottomCommand implements Command {

    final Robot robot;

    public MoveBottomCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.moveBottom();
    }

    @Override
    public void undo() {
        robot.moveTop();
    }

}
