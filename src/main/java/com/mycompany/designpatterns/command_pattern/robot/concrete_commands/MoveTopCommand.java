package com.mycompany.designpatterns.command_pattern.robot.concrete_commands;

import com.mycompany.designpatterns.command_pattern.robot.commands.Command;
import com.mycompany.designpatterns.command_pattern.robot.receiver.Robot;

public class MoveTopCommand implements Command {

    final Robot robot;

    public MoveTopCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.moveTop();
    }

    @Override
    public void undo() {
        robot.moveBottom();
    }

}
